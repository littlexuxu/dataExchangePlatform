<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>施工项目列表</title>
<%@include file="/resources/common_lib.jsp"%>
</head>
<body>
	<script>
	
	 var dict = {	
			 /*
			 getDictName: function(f, d) {
				debugger;
				var e = '';
				for (var g = 0, c = f.length; g < c; g++) {
					var
					h = f[g];
					if (h.dictid == d) { e = h.dictname }
				}
				return e;
			}, */
			getDictText: function(c, e) {
				var d = c;
				var f = "";
				$.ajax({
					url:  "${pageContext.request.contextPath}/select/queryDict",
					type:"POST",
					data : {
						'dictTypeId':c
					},
					async:false,
					success: function(h) {
						var g = h;
						for (var i = 0; i < h.length; i++) {
				            if (h[i].dictid == e) {
				                f = h[i].dictname;
				            }
				        }
					}
				});
				return f;
			}
	} 
	
	/**
	 * 
	 * 在后台查询出来数据字典对应的Text,例如:deptId，查询出来后命名为
	 * detIddtname，通过formatter来转换
	 * @param {any} value  当前值
	 * @param {any} row 当前行
	 * @param {any} index 当前行索引
	 * @returns 
	 */
	function joinformatter(value, row, index) {
		try {
			var name = this.field + 'dtname';
			if (row[name])
				return row[name];
			else
				return value;
		} catch (e) {
			console.log(e);
			return value;
		}
	}
	
	
	
	 /* function getArray(data, id) {
		    var dictName = "";
		    for (var i in data) {
		        //console.log('i',i);
		        //console.log('datai',data[i].children);
		        if (data[i].id == id) {
		            dictName = data[i].text;
		            break;
		        } else { 
		            getArray(data[i].children, id);
		        }
		    }
		} */

		/* function formatterDict(value, row, index) {
		    var dictText = "";
		    if (this.field == "ssyw") {
		        dictText = a.getDictText('SYB', row.ssyw);
		    }
		    if (this.field == "sfcfwt") {
		        dictText = a.getDictText('SF', row.sfcfwt);
		    }

		    return dictText;
		} 
	
	function formatter_XMTSZT(value,row,index){
		var dictText = "";
		dictText = getArray(XMTSZT,row.xmtszt);
		return dcitText;
	}
	
	*/
	
	
	/**
	 * 
	 * 
	 * dict.getDictText('dictTypeId',value)通过Ajax请求查询查询数据字典
	 * @param {any} value  当前值
	 * @param {any} row 当前行
	 * @param {any} index 当前行索引
	 * @returns 
	 */
	function formatterDict(value, row, index) {
	    var dictText = "";
	    if (this.field == "ssyw") {
	        dictText = dict.getDictText('SYB', row.ssyw);
	    }
	    if (this.field == "sfcfwt") {
	        dictText = dict.getDictText('SF', row.sfcfwt);
	    }
	    if(this.field == 'xmtszt'){
	    	dictText = dict.getDictText('XMTSZT',row.xmtszt)
	    }

	    return dictText;
	} 

	
	
	
	

	

	
	(function($){  
		
        $.fn.serializeJson=function(){  
            var serializeObj={};  
            $(this.serializeArray()).each(function(){  
                serializeObj[(this.name).split(".")[1]]=this.value;  
            });  
            return serializeObj;  
        };  
    })(jQuery);
	
	var sgBaseDataGrid;
	
	$(function() {
		sgBaseDataGrid = $('#sgBaseDataGrid').datagrid({
            url : '<%=path%>/construction/queryConstructionBaseProjectList',
            striped : true,
            rownumbers : false,
            pagination : true,
            singleSelect : true,
            width:'auto',
            idField : 'sjbaseid',
            pageSize : 15,
            pageList : [ 15, 30, 50, 100, 300, 500, 1000, 2000 ],
            columns : [ [ {
                width : '210',
                title : '项目名称',
                field : 'stdname',
            }, {
                width : '220',
                title : '中交行业分类',
                field : 'zjhyflx',
                formatter:joinformatter,
            },{
                width : '330',
                title : '所属单位',
                field : 'orgunit',
                formatter : joinformatter,
                
            },{
                width : '330',
                title : '项目状态',
                field : 'xmtszt',
                formatter: formatterDict,
            },{
                width : '330',
                title : '所属业务',
                field : 'ssyw',
                formatter: formatterDict,
            },{
                width : '330',
                title : '开始跟踪时间',
                field : 'ksgzsj',
            },{
                width : '330',
                title : '其它业主单位',
                field : 'yzdwqt',
            },{
                width : '330',
                title : '是否委托项目',
                field : 'sfcfwt',
                formatter:formatterDict,
            }] ],
            toolbar : '#tb'
        });		
	});
	
	function doSearch() {
		var data = {'params' : JSON.stringify($("#searchSgBaseForm").serializeJson())};
		sgBaseDataGrid.datagrid('load', data);
	}
	
	function doUpdate() {
		window.location.href = "<%=request.getContextPath()%>/construction/updateConstructionBaseProject";
	}
	
	var sgBase_dialog;
	//显示弹出窗口 新增：row为空 编辑:row有值
	function doUpdate(row) {
		var _url = "<%=request.getContextPath()%>/construction/updateConstructionBaseProject";
		if (row != undefined && row.id) {
			//_url = ctx+"/userAction/toUpdate/"+row.id;
		}
	    //弹出对话窗口
	    sgBase_dialog = $('<div/>').dialog({
	    	title : "项目及市场经营信息",
			top: 0,
			width : 1000,
			height : '100%',
	        modal: true,
	        minimizable: true,
	        maximizable: true,
	        href: _url,
	        onLoad: function () {
	            if (row) {
	            	$('#sgProjectBaseForm').form('load', row);
	            } else {
	            	
	            }

	        },
	        buttons: [
	            {
	                text: '保存',
	                iconCls: 'icon-save',
	                handler: function () {
	                	saveSgProject();
	                }
	            },
	            {
	                text: '关闭',
	                iconCls: 'icon-cancel',
	                handler: function () {
	                	sgBase_dialog.dialog('destroy');
	                }
	            }
	        ],
	        onClose: function () {
	        	sgBase_dialog.dialog('destroy');
	        }
	    });
	}
	//清空查询条件
    function clearfrom() {
        $('#searchSgBaseForm').form('clear');
    }
	</script>
	<div id="tb" style="padding: 3px">
		<form id="searchSgBaseForm">
			<a href="javascript:void(0);"
				data-options="iconCls:'icon-add',plain:true"
				class="easyui-linkbutton" onclick="doUpdate();">新增</a> <a
				href="javascript:void(0);"
				data-options="iconCls:'icon-edit',plain:true"
				class="easyui-linkbutton" onclick="doUpdate();">修改</a> <a
				href="javascript:void(0);"
				data-options="iconCls:'icon-remove',plain:true"
				class="easyui-linkbutton" onclick="doUpdate();">删除</a> <a
				href="javascript:void(0);"
				data-options="iconCls:'icon-cut',plain:true"
				class="easyui-linkbutton" onclick="doUpdate();">导出</a> <br> <span>组织机构</span>
			<input name="sgProjectBase.orgunit_=" class="easyui-textbox">
			<span>中交行业分类</span> <input name="sgProjectBase.zjhyflx_="
				data-options="prompt:'请输入中交行业分类',
								url:'<%=request.getContextPath()%>/select/queryDictTree?dictTypeId=ZJHYFL'"
				class="easyui-combotree" /> <span>项目名称</span> <input
				name="sgProjectBase.stdname_like" class="easyui-textbox"> 
				<span>所属行业</span> <input name="sgbase.ssyw_=" class="easyui-combobox"  data-options="prompt:'请输入所属业务',
	                        url:'<%=path %>/select/queryDict?dictTypeId=SYB',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'" ><a
				href="javascript:void(0);"
				data-options="iconCls:'icon-search',plain:true"
				class="easyui-linkbutton" onclick="doSearch();">查询</a> <a
				href="javascript:void(0);"
				data-options="iconCls:'icon-undo',plain:true"
				class="easyui-linkbutton" onclick="clearfrom();">清空</a>
		</form>
	</div>
	<table id="sgBaseDataGrid" class="easyui-datagrid"
		style="width: 95%; height: 610px" rownumbers="true" pagination="true">
	</table>
</body>
</html>
