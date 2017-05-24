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
	
	(function($){  
        $.fn.serializeJson=function(){  
            var serializeObj={};  
            $(this.serializeArray()).each(function(){  
                serializeObj[(this.name).split(".")[1]]=this.value;  
            });  
            return serializeObj;  
        };  
    })(jQuery);
	
	var sgContractDataGrid;
	
	$(function() {
		sgContractDataGrid = $('#sgContractDataGrid').datagrid({
            url : '<%=path %>/construction/queryConstructionContrackProjectList',
            striped : true,
            rownumbers : false,
            pagination : true,
            singleSelect : true,
            width:'auto',
            pageSize : 15,
            pageList : [ 15, 30, 50, 100, 300, 500, 1000, 2000 ],
            columns : [ [ {
                width : '210',
                title : '项目名称',
                field : 'stdname',
            }, {
                width : '220',
                title : '合同签订方式',
                field : 'htqdfs',
            },{
                width : '330',
                title : '所属单位',
                field : 'orgunit',
            },{
                width : '330',
                title : '合同名称',
                field : 'htmc',
            },{
                width : '330',
                title : '所属区域',
                field : 'yzdwqt',
            },{
                width : '330',
                title : '项目类型',
                field : 'xmlx',
            },{
                width : '330',
                title : '中交行业分类',
                field : 'zjhyflx',
            },{
                width : '330',
                title : '项目所在地',
                field : 'xmszd',
            },{
                width : '330',
                title : '合同签订日期',
                field : 'htqdrq',
            },{
            	width:'120',
            	title:'对外签约品牌',
            	field:'dwqypp'
            },{
            	width:'120',
            	title:'合同额',
            	field:'htewy'
            },{
            	width:'120',
            	title:'监理单位',
            	field:'jldw'
            },{
            	width:'120',
            	title:'监理单位联系人',
            	field:'jldwlxr'
            },{
            	width:'120',
            	title:'监理单位联系电话',
            	field:'jldwlxdh'
            },{
            	width:'120',
            	title:'实际开工日期',
            	field:'sjkgrq'
            },{
            	width:'120',
            	title:'项目资金来源',
            	field:'zjlydx'
            },{
            	width:'120',
            	title:'业主单位',
            	field:'yzdw'
            },{
            	width:'120',
            	title:'设计单位',
            	field:'sjdw'
            }] ],
            toolbar : '#tb'
        });		
	});
	
	function doSearch() {
		var data = {'params' : JSON.stringify($("#searchSgContractForm").serializeJson())};
		console.log(data);
		sgContractDataGrid.datagrid('load', data);
	}
	
	
	var sgContract_dialog;
	//显示弹出窗口 新增：row为空 编辑:row有值
	//显示弹出窗口 新增：row为空 编辑:row有值
	function doUpdate(row) {
		var _url = "<%=request.getContextPath()%>/construction/updateConstructionContract";
		
	    //弹出对话窗口
	    sgContract_dialog = $('<div/>').dialog({
	    	title : "项目及合同信息",
			top: 0,
			width : 1000,
			height : '100%',
	        modal: true, 
	        minimizable: true,
	        maximizable: true,
	        href: _url,
	        onLoad: function () {
	        	if(row){
	        		$.ajax({
		        		url : "<%=request.getContextPath()%>/construction/getConstructionProjectBase/",
		    			type:"POST",
		    			data : {
		    				'id':row.sgbaseid,
		    			},
		    			async:false,
		    			
		    			success: function(h) {
		    				var data = eval('(' + h + ')');
		    				data = allPrpos(data,'sgbase');
		    				console.log(data);
		    				$("#sgbase").form('load',data);
		    				//$("#sgbase").fill(data);
		    			}
		    		});
	        		$.ajax({
		        		url : "<%=request.getContextPath()%>/construction/getConstructionProjectTrack/",
		    			type:"POST",
		    			data : {
		    				'id':row.sgbaseid,
		    			},
		    			async:false,
		    			success: function(h) {
		    				var data = eval('(' + h + ')');
		    				data = allPrpos1(data,'sgtrack');
		    				console.log(data);
		    				$("#sgtrack").form('load',data);
		    				//$("#sgbase").fill(data);
		    			}
		    		});
	        		$.ajax({
		        		url : "<%=request.getContextPath()%>/construction/getJtOtherCompnayBids/",
		    			type:"POST",
		    			data : {
		    				'id':row.sgbaseid,
		    			},
		    			async:false,
		    			success: function(h) {
		    				var data = eval('(' + h + ')');
		    				//data = allPrpos1(data,'sgtrack');
		    				console.log(data);
		    				//$("#dgOtherBid").datagrid('load',data);
		    				$('#dgOtherBid').datagrid({ data: data });
		    				//$("#sgbase").fill(data);
		    			}
		    		});
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
	                	sgContract_dialog.dialog('destroy');
	                }
	            }
	        ],
	        onClose: function () {
	        	sgContract_dialog.dialog('destroy');
	        }
	    });
	}

	//编辑
	function doEdit() {
		//选中的行（第一次选择的行）
		var row = $('#sgContractDataGrid').datagrid('getSelected');
		if (row) {
			doUpdate(row);
		} else {
			$.messager.alert("提示", "您未选择任何操作对象，请选择一行数据！");
		}
	}
	
	function doDelete(){ 
		var row = $('#sgContractDataGrid').datagrid('getSelected');
		if(row){
			$.messager.confirm('提示', '确定要删除吗?',function(r){ if(r){$.post("<%=request.getContextPath()%>/construction/deleteConstructionProjectBase",{"id":row.sgbaseid},
			  function(data){
				var obj = JSON.parse(data);
				$.messager.alert("提示",obj.returnMsg);
				sgContractDataGrid.datagrid('reload');
			  },
			  "text")}});//这里返回的类型有：json,html,xml,text
			}else{
			$.messager.alert("提示","请选择要删除的记录");
		}
	}
	//清空查询条件
    function clearfrom() {
        $('#searchSgContractForm').form('clear');
    }

	</script>
	<div id="tb" style="padding: 3px">
		<form id="searchSgContractForm">
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
	
	
	<table id="sgContractDataGrid" class="easyui-datagrid" style="width:95%;height:610px"
			rownumbers="true" pagination="true">
	</table>
</body>
</html>
