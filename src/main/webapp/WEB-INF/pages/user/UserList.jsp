<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>用户列表</title>
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
		sgBaseDataGrid = $('#userGrid').datagrid({
            url : '<%=path %>/user/listUser',
            striped : true,
            rownumbers : false,
            pagination : true,
            singleSelect : true,
            idField : 'id',
            pageSize : 15,
            pageList : [ 15, 30, 50, 100, 300, 500, 1000, 2000 ],
            columns : [ [ {
                width : '210',
                title : '用户名',
                field : 'username',
            }, {
                width : '220',
                title : '邮箱',
                field : 'email',
            },{
                width : '330',
                title : '创建时间',
                field : 'create_date',
            },{
                width : '330',
                title : '是否锁定',
                field : 'locked',
            }] ],
            toolbar : '#tb'
        });		
	});
	
	function doSearch() {
		var data = {'params' : JSON.stringify($("#searchUserForm").serializeJson())};
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
	    	title : "用户信息",
			top: 0,
			width : 1000,
			height : '100%',
	        modal: true,
	        minimizable: true,
	        maximizable: true,
	        href: _url,
	        onLoad: function () {
	            if (row) {
	            	$('#userForm').form('load', row);
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
		<form id="searchUserForm">
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">新增</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">修改</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">删除</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">导出</a>
			<br>
			<span>登录名</span>
			<input name="user.orgunit_username" class="easyui-textbox">
			<span>邮箱</span>
			<input name="user.email_like" class="easyui-textbox">
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doSearch();">查询</a>
		</form>
	</div>	
	<table id="userGrid" class="easyui-datagrid" style="width:95%;height:610px"
			rownumbers="true" pagination="true">
	</table>
</body>
</html>
