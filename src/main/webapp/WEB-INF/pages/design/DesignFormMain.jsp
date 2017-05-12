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

function joinformatter(value,row,index){
		
		row ={"zjhyflx":value,'dictname':'a'};
		if (row.zjhyflx != null){
			if(value=="1.4"){
				return row.dict_name;
			}
			return row.dict_name;
		} else {
			return row.dict_name.value;
		} 
	}


    $(function() {
    	sjBaseDataGrid = $('#sjBaseDataGrid').datagrid({
            url : '/dataExchangePlatform/design/queryDesignBaseProjectList',
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
                width : '220',
                title : '中交行业分类',
                field : 'zjhyflx',
                formatter:joinformatter,
            },{
                width : '330',
                title : '所属单位',
                field : 'orgunit',
            },{
                width : '330',
                title : '创建人',
                field : 'xmtszt',
            },{
                width : '330',
                title : '项目阶段',
                field : 'xmjd',
            },{
                width : '330',
                title : '项目状态',
                field : 'ksgzsj',
            },{
                width : '330',
                title : '海外重点监控',
                field : 'sfzdjkxm',
            },{
                width : '330',
                title : '所属业务',
                field : 'ssyw',
            },{
                width : '330',
                title : '项目所在地',
                field : 'xmszd',
            },{
                width : '330',
                title : '所属区域',
                field : 'sfcfwt',
            },{
                width : '330',
                title : '是否海外',
                field : 'sfzdjkxm',
            },{
                width : '330',
                title : '业主单位',
                field : 'yzdwqt',
            },{
                width : '330',
                title : '投标日期',
                field : 'tbrq',
            },{
                width : '330',
                title : '是否中标',
                field : 'sfzb',
            },{
                width : '330',
                title : '中标额',
                field : 'zbe',
            },{
                width : '330',
                title : '实际开工日期',
                field : 'sjkgrq',
            },{
                width : '330',
                title : '合同完工日期',
                field : 'htwgrq',
            },{
                width : '330',
                title : '项目名称(英文)',
                field : 'xmmcyw',
            },{
                width : '330',
                title : '项目标段',
                field : 'xmbd',
            },{
                width : '330',
                title : '业主计划总投资额',
                field : 'yztze',
            },{
                width : '330',
                title : '资金来源',
                field : 'zjlydx',
            },{
                width : '330',
                title : '项目类型',
                field : 'xmlx',
            },{
                width : '330',
                title : '国家行业类别',
                field : 'gjhylb',
            },{
                width : '330',
                title : '商务部项目类型',
                field : 'swbxmlx',
            },{
                width : '330',
                title : '特殊状态原因说明',
                field : 'tsztyysm',
            },{
                width : '330',
                title : '业主其他单位',
                field : 'yzdwqt',
            },{
                width : '330',
                title : '主要工程内容',
                field : 'zygcnr',
            },{
                width : '330',
                title : '开始跟踪时间',
                field : 'ksgzsj',
            },{
                width : '330',
                title : '拟用签约品牌',
                field : 'nyqypp',
            },{
                width : '330',
                title : '拟用签约资质名称',
                field : 'nyqyzzmc',
            },{
                width : '330',
                title : '预计合同额',
                field : 'yjhte',
            },{
                width : '330',
                title : '预计合同工期',
                field : 'yjhtgq',
            },{
                width : '330',
                title : '当期汇率',
                field : 'sfcfwt',
            },{
                width : '330',
                title : '预计合同额(人民币)',
                field : 'yjhte',
            },{
                width : '330',
                title : '合同签订方式',
                field : 'htqdfs',
            },{
                width : '330',
                title : '是否为重点跟踪',
                field : 'sfzdgzxm',
            },{
                width : '330',
                title : '跟踪进展状况',
                field : 'gzjzqk',
            },{
                width : '330',
                title : '投标组织方式',
                field : 'zztbfs',
            },{
                width : '330',
                title : '牵投单位名称',
                field : 'qtdwmc',
            },{
                width : '330',
                title : '牵投事业部',
                field : 'qtsyb',
            },{
                width : '330',
                title : '牵投区域总部',
                field : 'qtqyzb',
            },{
                width : '330',
                title : '投标报价',
                field : 'tbbj',
            },{
                width : '330',
                title : '投标报价币种',
                field : 'tbbjbz',
            },{
                width : '330',
                title : '纳入系统管理时间-中标',
                field : 'nrxtglsj_zb',
            },{
                width : '330',
                title : '原因说明',
                field : 'zbsm',
            },{
                width : '330',
                title : '中标标识',
                field : 'synstatus',
            }]],
            toolbar : '#tb'
        });		
	});

	function doUpdate() {
		window.location.href = "<%=request.getContextPath() %>/design/updateDesignBaseProject";
	}
	
	var sjBase_dialog;
	//显示弹出窗口 新增：row为空 编辑:row有值
	function doUpdate(row) {
		var _url = "<%=request.getContextPath() %>/design/updateDesignBaseProject";
		if (row != undefined && row.id) {
			//_url = ctx+"/userAction/toUpdate/"+row.id;
		}
	    //弹出对话窗口
	    sjBase_dialog = $('<div/>').dialog({
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
	            	$('#sjbase').form('load', row);
	            } else {
	            	
	            }

	        },
	        buttons: [
	            {
	                text: '保存',
	                iconCls: 'icon-save',
	                handler: function () {
	                	$('#sjbase').submit();
	                }
	            },
	            {
	                text: '关闭',
	                iconCls: 'icon-cancel',
	                handler: function () {
	                	sjBase_dialog.dialog('destroy');
	                }
	            }
	        ],
	        onClose: function () {
	        	sjBase_dialog.dialog('destroy');
	        }
	    });
	}
    function resize() {
    	$('#btn').linkbutton('resize', {
    		width: '100%',
    		height: 32
    	});

	}
    
    function saveSgProject() {
    	console.log($("#sjbase").serializeJson());
    	console.log($("#sjtrack").serializeJson());
    }
</script>	
<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'center',border:false" title="" style="overflow: auto;padding: 3px;">
    	<form name="marketMess">
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">新增</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doUpdate();">修改</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doDelete();">删除</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doExport();">导出</a>
			<br>
			<span>组织机构</span>
			<input name="sjProjectBase.orgunit_=" class="easyui-combotree">
			<span>中交行业分类</span>
			<input name="sjProjectBase.zjhyflx_=" class="easyui-combotree" data-options=" multiple:true">
			<span>项目所在地</span>
			<input name="sjProjectBase.xmszd_" class="easyui-combotree" data-options=" multiple:true">
			<span>项目名称</span>
			<input name="sjProjectBase.stdname_like" class="easyui-textbox">
			<br>
			<span>所属业务</span>
			<input name="sjProjectBase.ssyw" class="easyui-combobox" data-options=" multiple:true">
			<span>业主单位	</span>
			<input name="sjProjectBase.yzdw" class="easyui-combobox">
			<span>项目阶段</span>
			<input name="sjProjectBase.stdname_like" class="easyui-combotree" data-options=" multiple:true">
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doSearch();">查询</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="resize();" id="btn">清空</a>
		</form>
		<fieldset class="easyui-panel" style="width:90%;margin:0 auto;">
			<div>
			<legend></legend>
			<legend align="center" ></legend>
			<form id="sjbase" method="post"  style="width:100%;margin:0 auto;">
				<table id="sjBaseDataGrid" class="easyui-datagrid" style="width:100%;height:610px"
			rownumbers="true" pagination="true">
		</table>
				</form>
			</div>	
		</fieldset>
        
    </div>
</div>
</body>
</html>