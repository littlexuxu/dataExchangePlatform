<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>合同变更信息</title>
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
	
	var qtBaseDataGrid;
	
	$(function() {
		qtBaseDataGrid = $('#qtBaseDataGrid').datagrid({
            url : '<%=path %>/other/getOtherContractChangeList',
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
                field : 'xmmc',
            },{
                width : '220',
                title : '合同变更名称',
                field : 'bghtmc',
            },{
                width : '330',
                title : '所属单位',
                field : 'ssdw',
            },{
                width : '220',
                title : '是否纳入新签',
                field : 'sfnrxq',
                formatter:joinformatter,
            },{
                width : '220',
                title : '纳入系统管理时间',
                field : 'nrxtglsj',
            },{
                width : '220',
                title : '变更日期',
                field : 'bgrq',
            },{
                width : '220',
                title : '变更增减合同额',
                field : 'bgzjhte',
            },{
                width : '220',
                title : '变更增减自主承担合同额',
                field : 'bgzjzzcdhte',
            },{
                width : '220',
                title : '变更后合同工期',
                field : 'bghhtgq',
            },{
                width : '220',
                title : '主要变更条款',
                field : 'zybgtk',
            },{
                width : '220',
                title : '变更原因',
                field : 'bgyy',
            },{
                width : '220',
                title : '备注',
                field : 'htbz',
            }] ],
            toolbar : '#tb'
        });		
	});
	
	function doSearch() {
		var data = {'params' : JSON.stringify($("#searchQtBaseForm").serializeJson())};
		console.log(data);
		qtBaseDataGrid.datagrid('load', data);
	}
	
	function doUpdate() {
		window.location.href = "<%=request.getContextPath() %>/other/updateOtherContract";
	}
	
	var qtBase_dialog;
	//显示弹出窗口 新增：row为空 编辑:row有值
	function doUpdate(row) {
		var _url = "<%=request.getContextPath() %>/other/updateOtherContract";
		if (row != undefined && row.id) {
			//_url = ctx+"/userAction/toUpdate/"+row.id;
		}
	    //弹出对话窗口
	    qtBase_dialog = $('<div/>').dialog({
	    	title : "其他变更合同单据",
			top: 0,
			width : 1000,
			height : '100%',
	        modal: true,
	        minimizable: true,
	        maximizable: true,
	        href: _url,
	        onLoad: function () {
	            if (row) {
	            	$('#qtProjectBaseForm').form('load', row);
	            } else {
	            	
	            }

	        },
	        buttons: [
	            {
	                text: '保存',
	                iconCls: 'icon-save',
	                handler: function () {
	                	saveQtProject();
	                }
	            },
	            {
	                text: '关闭',
	                iconCls: 'icon-cancel',
	                handler: function () {
	                	qtBase_dialog.dialog('destroy');
	                }
	            }
	        ],
	        onClose: function () {
	        	qtBase_dialog.dialog('destroy');
	        }
	    });
	}
	
	</script>
	<div id="tb" style="padding:3px">
		<form id="searchQtBaseForm">
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">新增</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">修改</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">删除</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">导出</a>
			<br>
			<span>组织机构</span>
			<input name="qtProjectBase.orgunit_=" class="easyui-textbox">
			<span>中交行业分类</span>
			<input name="qtProjectBase.zjhyflx_=" class="easyui-textbox">
			<span>项目名称</span>
			<input name="qtProjectBase.stdname_like" class="easyui-textbox">
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doSearch();">查询</a>
		</form>
	</div>	
	<table id="qtBaseDataGrid" class="easyui-datagrid" style="width:95%;height:610px"
			rownumbers="true" pagination="true">
	</table>
</body>
</html>
