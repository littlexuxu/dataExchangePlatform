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
    	sjxmhtDataGrid = $('#sjxmhtDataGrid').datagrid({
            url : '/dataExchangePlatform/construction/queryConstructionBaseProjectList',
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
                title : '所属单位',
                field : 'orgunit',
            },{
                width : '330',
                title : '合同名称',
                field : 'htmc',
            },{
                width : '330',
                title : '所属业务',
                field : 'ssyw',
            }, {
                width : '220',
                title : '中交行业分类',
                field : 'zjhyflx',
            }, {
                width : '220',
                title : '对外签约品牌',
                field : 'dwqypp',
            }, {
                width : '220',
                title : '合同签订日期',
                field : 'htqdrq',
            }, {
                width : '220',
                title : '纳入系统管理时间',
                field : 'tjgsyf',
            },{
                width : '330',
                title : '实际开工日期',
                field : 'sjkgrq',
            },{
                width : '330',
                title : '实际完工日期',
                field : 'sjwgrq',
            },{
                width : '330',
                title : '合同额',
                field : 'hte',
            },{
                width : '330',
                title : '变更后合同额',
                field : 'bgzjhte',
            },{
                width : '330',
                title : '自主承担合同额',
                field : 'zzcdhte',
            },{
                width : '330',
                title : '变更自主承担后合同额',
                field : 'bgzjzzcdhte',
            },{
                width : '330',
                title : '所属区域',
                field : 'sfcfwt',
            },{
                width : '330',
                title : '项目类型',
                field : 'xmlx',
            },{
                width : '330',
                title : '资金来源',
                field : 'zjlydx',
            },{
                width : '330',
                title : '国家行业类别',
                field : 'gjhylb',
            },{
                width : '330',
                title : '项目所在地',
                field : 'xmszd',
            },{
                width : '330',
                title : '海外重点监控',
                field : 'sfzdjkxm',
            },{
                width : '330',
                title : '项目阶段',
                field : 'ssyw',
            },{
                width : '330',
                title : '业主单位',
                field : 'yzdwqt',
            },{
                width : '330',
                title : '是否关联投资项目',
                field : 'sfgltzxm',
            },{
                width : '330',
                title : '投资项目类型',
                field : 'tzxmlx',
            },{
                width : '330',
                title : '关联投资项目公司',
                field : 'gltzxmgs',
            },{
                width : '330',
                title : '主要项目内容',
                field : 'zyxmnr',
            },{
                width : '330',
                title : '项目亮点',
                field : 'xmld',
            },{
                width : '330',
                title : '是否未签约已实施',
                field : 'wqyyss',
            },{
                width : '330',
                title : '合同编号',
                field : 'htbh',
            },{
                width : '330',
                title : '合同签订方式',
                field : 'htqdfs',
            },{
                width : '330',
                title : '合同甲方',
                field : 'htjf',
            },{
                width : '330',
                title : '合同甲方内部',
                field : 'htjfnb',
            },{
                width : '330',
                title : '合同乙方',
                field : 'htyfid',
            },{
                width : '330',
                title : '合同额币种',
                field : 'hetbz',
            },{
                width : '330',
                title : '合同工期(月)',
                field : 'htgq',
            },{
                width : '330',
                title : '变更后合同工期(月)',
                field : 'bghhtgq',
            },{
                width : '330',
                title : '合同开工日期',
                field : 'htkgrq',
            },{
                width : '330',
                title : '合同完工日期',
                field : 'htwgrq',
            },{
                width : '330',
                title : '是否分包给集团',
                field : 'sffb',
            },{
                width : '330',
                title : '具体品牌名称',
                field : 'jtpp',
            },{
                width : '330',
                title : '实施单位名称',
                field : 'ssdwmc',
            },{
                width : '330',
                title : '预付款比例(%)',
                field : 'ysyfkbl',
            },{
                width : '330',
                title : '合同约定工程进度款支付比例(%)',
                field : 'ysjdkzfbl',
            },{
                width : '330',
                title : '质保金比例(%)',
                field : 'yszbjbl',
            },{
                width : '330',
                title : '质何金期限(年)',
                field : 'yszbjqx',
            },{
                width : '330',
                title : '履约保证方式',
                field : 'yslybzfs',
            },{
                width : '330',
                title : '履约保证金额',
                field : 'yslybzje',
            },{
                width : '330',
                title : '主要条款描述',
                field : 'zytkms',
            },{
                width : '330',
                title : '项目所在地GPS坐标',
                field : 'gpszb',
            },{
                width : '330',
                title : '设计规范',
                field : 'sjgf',
            },{
                width : '330',
                title : '项目合同语言',
                field : 'xmhtyy',
            },{
                width : '330',
                title : '项目交流语言',
                field : 'xmjlyy',
            },{
                width : '330',
                title : '项目预付款',
                field : 'xmyfk',
            },{
                width : '330',
                title : '项目预付款比例(%)',
                field : 'xmyfkbl',
            },{
                width : '330',
                title : '创建人',
                field : 'xmtszt',
            },{
                width : '330',
                title : '创建时间',
                field : 'xmtszt',
            },{
                width : '330',
                title : '修改人',
                field : 'xmtszt',
            },{
                width : '330',
                title : '修改时间',
                field : 'xmtszt',
            },{
                width : '330',
                title : '合同上报状态',
                field : 'nyqypp',
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
    	<form name="ContractMess">
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doAdd();">新增</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">修改</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doDelete();">删除</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doExport();">导出</a>
			<br>
			<span>组织机构</span>
			<input name="sgProjectBase.orgunit_=" class="easyui-combotree">
			<span>中交行业分类</span>
			<input name="sgProjectBase.zjhyflx_=" class="easyui-combotree" data-options=" multiple:true">
			<span>项目所在地</span>
			<input name="sgProjectBase.xmszd_" class="easyui-combotree" data-options=" multiple:true">
			<span>项目名称</span>
			<input name="sgProjectBase.stdname_like" class="easyui-textbox">
			<br>
			<span>所属业务</span>
			<input name="sgProjectBase.ssyw" class="easyui-combobox" data-options=" multiple:true">
			<span>业主单位</span>
			<input name="sgProjectBase.yzdw" class="easyui-combobox">
			<span>项目阶段</span>
			<input name="sgProjectBase.stdname_like" class="easyui-combotree" data-options=" multiple:true">
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doSearch();">查询</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="resize();" id="btn">清空</a>
		</form>
		<fieldset class="easyui-panel" style="width:90%;margin:0 auto;">
			<div>
			<legend></legend>
			<legend align="center" ></legend>
			<form id="sjbase" method="post"  style="width:100%;margin:0 auto;">
				<table id="sjxmhtDataGrid" class="easyui-datagrid" style="width:100%;height:610px"
			rownumbers="true" pagination="true">
		</table>
				</form>
			</div>	
		</fieldset>
        
    </div>
</div>
</body>
</html>