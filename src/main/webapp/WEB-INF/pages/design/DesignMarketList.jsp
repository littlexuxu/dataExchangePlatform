<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>设计项目列表</title>
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
	
	var sgBaseDataGrid;
	
	$(function() {
		sgBaseDataGrid = $('#sgBaseDataGrid').datagrid({
            url : '<%=path %>/design/queryConstructionBaseProjectList',
            striped : true,
            rownumbers : false,
            pagination : true,
            singleSelect : true,
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
            },{
                width : '330',
                title : '所属单位',
                field : 'orgunit',
            },{
                width : '330',
                title : '项目状态',
                field : 'xmtszt',
            },{
                width : '330',
                title : '所属业务',
                field : 'ssyw',
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
            }] ],
            toolbar : '#tb'
        });		
	});
	
	function doSearch() {
		var data = {'params' : JSON.stringify($("#searchSgBaseForm").serializeJson())};
		console.log(data);
		sgBaseDataGrid.datagrid('load', data);
	}
	
	function doUpdate() {
		window.location.href = "<%=request.getContextPath() %>/construction/updateConstructionBaseProject";
	}
	
	var sgBase_dialog;
	//显示弹出窗口 新增：row为空 编辑:row有值
	function doUpdate(row) {
		var _url = "<%=request.getContextPath() %>/construction/updateConstructionBaseProject";
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
	
	</script>
	<div id="tb" style="padding:3px">
		<form id="searchSgBaseForm">
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">新增</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">修改</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">删除</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">导出</a>
			<br>
			<span>组织机构</span>
			<input name="sgProjectBase.orgunit_=" class="easyui-textbox">
			<span>中交行业分类</span>
			<input name="sgProjectBase.zjhyflx_=" class="easyui-textbox">
			<span>项目名称</span>
			<input name="sgProjectBase.stdname_like" class="easyui-textbox">
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doSearch();">查询</a>
		</form>
	</div>	
	<table id="sgBaseDataGrid" class="easyui-datagrid" style="width:95%;height:610px"
			rownumbers="true" pagination="true">
	</table>
</body>
</html>
