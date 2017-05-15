<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>项目及市场经营信息</title>
	<%@include file="/resources/common_lib.jsp"%>

	<style type="text/css">
		th{font-weight:bold;background:	#ECECFF;
			text-align: right;
			font-size: 10px;
			height: 30px;};
		td input{
				border:none;
				outline:none;
			}
			td{
				word-wrap:break-word;
				height: 30px;
			}
			span.textbox{
				border: 0;
			}
	</style>

</head>
<body>
<script type="text/javascript">

    $(function() {
    	sjhtChangeDataGrid = $('#sjhtChangeDataGrid').datagrid({
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
            },{
                width : '330',
                title : '变更合同名称',
                field : 'bghtmc',
            },{
                width : '330',
                title : '所属单位',
                field : 'orgunit',
            }, {
                width : '220',
                title : '是否纳入新签',
                field : 'zjhyflx',
            }, {
                width : '220',
                title : '纳入系统管理时间',
                field : 'tjgsyf',
            }, {
                width : '220',
                title : '变更日期',
                field : 'bgrq',
            }, {
                width : '220',
                title : '变更增减合同额',
                field : 'bgzjhte',
            },{
                width : '330',
                title : '变更增减自主承担合同额',
                field : 'bgzjzzcdhte',
            },{
                width : '330',
                title : '变更后合同工期',
                field : 'bghhtgq',
            },{
                width : '330',
                title : '主要变更条款',
                field : 'zybgtk',
            },{
                width : '330',
                title : '变更原因',
                field : 'bgyy',
            },{
                width : '330',
                title : '备注',
                field : 'htbz',
            }]],
            toolbar : '#tb'
        });		
	});

    
    function resize() {
    	$('#btn').linkbutton('resize', {
    		width: '100%',
    		height: 32
    	});

	}
    
    function saveSgProject() {
    	console.log($("#sgbase").serializeJson());
    	console.log($("#sgtrack").serializeJson());
    }
</script>	
<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'center',border:false" title="" style="overflow: auto;padding: 3px;">
    	<form name="marketMess">
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doAdd();">新增</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">修改</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doDelete();">删除</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doExport();">导出</a>
			<br>
			<span>组织机构</span>
			<input name="sgProjectBase.orgunit_=" class="easyui-combotree">
			<span>项目名称</span>
			<input name="sgProjectBase.stdname_like" class="easyui-textbox">
			<span>变更合同名称</span>
			<input name="sgProjectBase.htmc" class="easyui-textbox" >
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doSearch();">查询</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="resize();" id="btn">清空</a>
		</form>
		<fieldset class="easyui-panel" style="width:90%;margin:0 auto;">
			<div>
			<legend></legend>
			<legend align="center" ></legend>
			<form id="sgbase" method="post"  style="width:100%;margin:0 auto;">
				<table id="sjhtChangeDataGrid" class="easyui-datagrid" style="width:100%;height:610px"
			rownumbers="true" pagination="true">
		</table>
				</form>
			</div>	
		</fieldset>
        
    </div>
</div>
</body>
</html>