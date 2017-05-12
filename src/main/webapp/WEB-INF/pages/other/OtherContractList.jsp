<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>项目基本信息</title>
	<%@include file="/resources/common_lib.jsp"%>
</head>
<body>
	<script>
	
	function joinformatter(value,row,index){
		
		console.log("========"+value);
		console.log(row);
		console.log(index);
		/* if (row.user){
			return row.user.name;
		} else {
			return value;
		} */
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
	
	var qtContractDataGrid;
	
	$(function() {
		qtContractDataGrid = $('#qtContractDataGrid').datagrid({
            url : '<%=path %>/other/queryOtherBaseProjectList',
            striped : true,
            rownumbers : false,
            pagination : true,
            singleSelect : true,
            pageSize : 15,
            pageList : [ 15, 30, 50, 100, 300, 500, 1000, 2000 ],
            columns : [ [ {
                width : '210',
                title : '项目名称',
                field : 'stdname',
            },{
                width : '220',
                title : '合同编号',
                field : 'htbh',
            },{
                width : '330',
                title : '所属单位',
                field : 'ssdw',
            },{
                width : '220',
                title : '项目类型',
                field : 'xmlx',
                formatter:joinformatter
            },{
                width : '220',
                title : '国家行业类别',
                field : 'gjhylb',
            },{
                width : '220',
                title : '中交行业分类',
                field : 'zjhyfl',
            },{
                width : '220',
                title : '项目所在地',
                field : 'xmszd',
            },{
                width : '220',
                title : '所属区域',
                field : 'ssqy',
            },{
                width : '220',
                title : '业主单位',
                field : 'yzdw',
            },{
                width : '220',
                title : '合同签订日期',
                field : 'htqdrq',
            },{
                width : '220',
                title : '合同额',
                field : 'hte',
            },{
                width : '220',
                title : '变更后总合同额',
                field : 'bghzhte',
            },{
                width : '220',
                title : '自主承担合同额',
                field : 'zzcdhte',
            },{
                width : '220',
                title : '变更后自主承担合同额',
                field : 'bghzzcdhte',
            },{
                width : '220',
                title : '是否未签约已实施',
                field : 'sfwqyyss',
            },{
                width : '220',
                title : '项目名称（英文）',
                field : 'xmmcyw',
            },{
                width : '220',
                title : '项目标段',
                field : 'xmbd',
            },{
                width : '220',
                title : '是否海外',
                field : 'sfhw',
            },{
                width : '220',
                title : '业主资金来源',
                field : 'yzzjly',
            },{
                width : '220',
                title : '是否调整项目',
                field : 'sftzxm',
            },{
                width : '220',
                title : '是否分包给集团子公司',
                field : 'sffb',
            },{
                width : '220',
                title : '金额单位',
                field : 'jedw',
            },{
                width : '220',
                title : '统计归属月份',
                field : 'tjgsyf',
            },{
                width : '220',
                title : '合同名称',
                field : 'htmc',
            },{
                width : '220',
                title : '对外签约品牌',
                field : 'dwqypp',
            },{
                width : '220',
                title : '合同签订方式',
                field : 'htqdfs',
            },{
                width : '220',
                title : '合同甲方',
                field : 'htjf',
            },{
                width : '220',
                title : '合同甲方内部',
                field : 'htjfnb',
            },{
                width : '220',
                title : '合同乙方',
                field : 'htyfid',
            },{
                width : '220',
                title : '签约资质名称',
                field : 'qyzzmc',
            },{
                width : '220',
                title : '变更后合同工期',
                field : 'bghhtgq',
            },{
                width : '220',
                title : '合同工期',
                field : 'htgq',
            },{
                width : '220',
                title : '合同开工日期',
                field : 'htkgrq',
            },{
                width : '220',
                title : '合同完工日期',
                field : 'htwgrq',
            },{
                width : '220',
                title : '实际开工日期',
                field : 'sjkgrq',
            },{
                width : '220',
                title : '实际完工日期',
                field : 'sjwgrq',
            },{
                width : '220',
                title : '项目合作方式',
                field : 'xmhzfs',
            },{
                width : '220',
                title : '投资来源',
                field : 'tzly',
            },{
                width : '220',
                title : '创建人',
                field : 'cjr',
            },{
                width : '220',
                title : '创建时间',
                field : 'cjsj',
            },{
                width : '220',
                title : '修改人',
                field : 'xgr',
            },{
                width : '220',
                title : '修改时间',
                field : 'xgsj',
            }] ],
            toolbar : '#tb'
        });		
	});
	
	function doSearch() {
		var data = {'params' : JSON.stringify($("#searchQtBaseForm").serializeJson())};
		console.log(data);
		qtContractDataGrid.datagrid('load', data);
	}
	
	function doUpdate() {
		window.location.href = "<%=request.getContextPath() %>/other/updateOtherBaseProject";
	}
	
	var qtBase_dialog;
	//显示弹出窗口 新增：row为空 编辑:row有值
	function doUpdate(row) {
		var _url = "<%=request.getContextPath() %>/other/updateOtherBaseProject";
		if (row != undefined && row.id) {
			//_url = ctx+"/userAction/toUpdate/"+row.id;
		}
	    //弹出对话窗口
	    qtBase_dialog = $('<div/>').dialog({
	    	title : "其他类项目基本信息",
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
	                	$('#qtProjectBaseForm').submit();
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
			<span>项目ID</span>
			<input name="qtProjectBase.qtbaseid_=" class="easyui-textbox">
			<span>项目名称</span>
			<input name="qtProjectBase.stdname_like" class="easyui-textbox">
			<span>其他业主单位全称</span>
			<input name="qtProjectBase.yzdwqt_like" class="easyui-textbox">
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doSearch();">查询</a>
		</form>
	</div>	
	<table id="qtContractDataGrid" class="easyui-datagrid" style="width:95%;height:610px"
			rownumbers="true" pagination="true">
	</table>
</body>
</html>
