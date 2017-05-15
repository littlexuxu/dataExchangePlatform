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
    	
    	 //添加一行
        function append() {
            if (endEditing()) {
                $('#dg').datagrid('appendRow', {  });
                editIndex = $('#dg').datagrid('getRows').length - 1;
                $('#dg').datagrid('selectRow', editIndex)
                        .datagrid('beginEdit', editIndex);
            }
        }

        $('#sgProjectBaseForm').form({
            url : '<%=path %>/design/saveConstructionBaseProject',
            onSubmit : function() {
                var isValid = $(this).form('validate');
                if (!isValid) {
                    progressClose();
                }
                return isValid;
            },
            success : function(result) {
                result = $.parseJSON(result);
                if (result.returnMsg == "Success") {
                	parent.doSearch();
                	sgBase_dialog.dialog('destroy');
                } else {
                    parent.$.messager.alert('提示', result.msg, 'warning');
                }
            }
        });
        
		$.each($("input[class='easyui-combotree']"), function(i,val){	
			var combotree = $("input[name='"+val.name+"']");
			combotree.combotree({
				onBeforeSelect:function(node){
					if (node.children) {
						return false;	
					}
				}
			});
		});        
    });
    
    function saveSgProject() {
    	console.log($("#sgbase").serializeJson());
    	console.log($("#sgtrack").serializeJson());
    }
    
</script>	
<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'center',border:false" title="" style="overflow: auto;padding: 3px;">
		<table toolbar="#tb" align="center" style="text-align:left;width:100%;">
			<tr>
				<td>创建人：member</td>
				<td>创建时间：date</td>
				<td>修改人：member</td>
				<td>修改时间：date</td>
			</tr>
			<tr>
				<td>创建人固定电话：phone</td>
				<td>移动电话：mobile phone</td>
				<td>修改人固定电话：phone</td>
				<td>移动电话：mobile phone</td>
			</tr>
		</table>
		<fieldset class="easyui-panel" style="width:90%;margin:0 auto;">
			<div>
			<legend></legend>
			<legend align="center" ></legend>
			<form id="sgbase" method="post"  style="width:90%;margin:0 auto;">
				<table align="center" border="collapse" bordercolor="#a0c6e5" cellspacing="0"  style="width:100%;table-layout:fixed;">
					<tr align="center"><td colspan="6"><font style="color: red;font-size:30px">注：本表金额单位为(元/折合美元)</font></td></tr>
					<tr style="background-color:#DDDDFF"><td colspan="6" align="center"><font style="font-weight:bold;" face="黑体" size="3">基本项目信息</font></td></tr>
					<tr >
						<th colspan="1"><label for="name">项目名称(*)</label></th>
						<td colspan="5" word-wrap:break-word;>
						<input class="easyui-textbox" 
							name="sgbase.stdname" data-options="required:true" style="width: 100%";>
					<tr>
						<th colspan="1"><label for="name">项目名称（外文）(*)</font></label></th>
						<td colspan="5">
						<input class="easyui-easyui-tooltip" id="dd" title="海外项目必填" 
							name="sgbase.xmmcyw" data-options="" style="width: 100%;border:none;
 				outline:none;"></td>
					</tr>
						<th colspan="1">项目标段</th>
						<td colspan="5"><input name="sgbase.bdmc"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">所属业务(*)</font></th>
						<td colspan="2"><input name="sgbase.ssyw" class="easyui-combobox" style="width: 100%" data-options="prompt:'请输入所属业务',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=SYB',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'" ></td>
							<th colspan="1">中交行业分类(*)</th>
						<td colspan="2"><input name="sgbase.zjhyflx" data-options="prompt:'请输入中交行业分类',required:true,
								url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=ZJHYFL'"
							class="easyui-combotree" style="width: 100%" /></td>
					</tr>
					<tr>
						<th colspan="1" >业主计划总投资额</th>
						<td colspan="1"><input class="easyui-textbox" style="width: 80%" name="sgbase.yztze" ></td>
						<td colspan="1"><input name="sgbase.htedw" data-options="prompt:'请选择币种',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=JSJEDW',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'"
							class="easyui-combobox" style="width: 100%"></td>
							<th colspan="1">项目类型(*)</th>
						<td colspan="2"><input name="sgbase.xmlx" data-options="prompt:'请输入项目类型',required:true,
							url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=XMLX'"
							class="easyui-combotree" style="width: 100%"></td>
					</tr>
					
					<tr>
						<th colspan="1">项目合作方式(*)</th>
						<td  colspan="2"><input name="sgbase.xmhzfs" class="easyui-combobox" 
						data-options="prompt:'请输入项目合作方式',required:true,
								url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=XMHZFS'"
							style="width: 100%"></td>
							<th colspan="1">投资来源(*)</th>
						<td colspan="2"><input name="sgbase.tzly" 
						data-options="prompt:'请输入投资来源',required:true,
							url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=TZLY'"
							style="width: 100%" class="easyui-combobox" ></td>
					</tr>
					<tr>
						
						<th colspan="1">国家行业分类(*)</th>
						<td colspan="2"><input name="sgbase." class="easyui-combobox"
						data-options="prompt:'请输入行业分类',required:true,
							url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=GCLB'"
							style="width: 100%" /></td>
						<th colspan="1">商务部项目类型(*)</th>
						<td colspan="2"><input name="sgbase.tzly"
							data-options="prompt:'请输入行业分类',required:true,
							url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=SWBXMLX'"
							class="easyui-combotree" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">项目所在地(*)</th>
						<td colspan="2"><input name="sgbase.xmszd"
							data-options="prompt:'请输入项目所在地',required:true,
							url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=XMDY'"
							class="easyui-combotree" style="width: 100%"></td>
						<th colspan="1">项目资金来源(*)</th>
						<td colspan="2"><input name="sgbase.zjlydx"
							data-options="prompt:'请输入资金来源',required:true,
							url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=HWZJLY'"
							class="easyui-combotree" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1" style="color:darkgrey">所属区域(*)</th>
						<td readonly="true" colspan="2"><input name="sgbase.ssqy"
							class="easyui-textbox" style="width: 100%"></td>
							<th colspan="1" style="color:darkgrey">区域中心(*)</th>
						<td colspan="2"><input name="sgbase.qyzx"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1" style="color:darkgrey">项目阶段(*)</th>
						<td readonly="true" colspan="2"><input name="sgbase.xmjd"
							class="easyui-combotree" style="width: 100%"></td>
							<th colspan="1"></th>
						<!--<td style="width: 10%"  colspan="2"><input name="sgbase."
							class="easyui-combotree" style="width: 100%"></td>-->
					</tr>
					<tr>
						<th colspan="1">项目状态</th>
						<td readonly="true" colspan="2"><input name="sgbase.xmtszt"
						data-options="prompt:'请输入项目状态',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=XMTSZT',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'"
							class="easyui-combotree" style="width: 100%"></td>
							<th style="width: 10%;color:darkgrey" >是否海外重点监控项目</th>
						<td colspan="2"><input name="sgbase.sfzdjkxm"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th>暂停/中止原因说明</th>
						<td colspan="5"><input name="sgbase.tsztyysm"
							class="easyui-textbox" style="height: 80px; width: 100%" multiline="true"/></td>
					</tr>
					<tr>
						<th colspan="1">业主单位(*)</th>
						<td readonly="true" colspan="4"><input name="sgbase.yzdw"
						data-options="prompt:'请输入业主单位',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=GHYZ',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'"
							class="easyui-combobox" style="width: 100%"></td>
							<th colspan="1"><a href="javascript:void(0);" class="easyui-linkbutton"
							iconCls="icon-search" plain="true" onclick="">详细信息(可新建)</a></th>
						<!--<td style="width: 10%"  colspan="2"><input name="projectFundsSource"
							class="easyui-combotree" style="width: 100%"></td>-->
					</tr>
					<tr>
						<th colspan="1">业主单位<br>(选'其他'需填全称)</th>
						<td readonly="true" colspan="5"><input name="sgbase.yzdwqt"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">设计单位(主导)</th>
							<td readonly="true" colspan="4"><input name="sgbase.sjdw"
						data-options="prompt:'请输入设计单位',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=GHSJDW',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'"
							class="easyui-combobox" style="width: 100%"></td>
							<th colspan="1"><a href="javascript:void(0);" class="easyui-linkbutton"
							iconCls="icon-search" plain="true" onclick="">详细信息(可新建)</a></th>
					</tr>
					<tr>
						<th colspan="1">设计单位<br>(选'其他'需填全称)</th>
						<td readonly="true" colspan="5"><input name="sgbase.sjdwqt"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">主要工程内容</th>
						<td colspan="5"><input name="sgbase.zygcnr" title="中交疏浚(集团)股份有限公司下属单位需填写工程量说明;"
							class="easyui-tooltip" multiline='true' style="height: 80px; width: 100%" /></td>
					</tr>
					<tr>
						<th colspan="1">是否委托项目(*)</th>
						<td colspan="2"><input class="easyui-combobox" name="sgbase.sfcfwt"
							data-options="prompt:'委托项目指不需要通过招标手段获得的项目',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=SF',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'"
							value="0" style="width: 100%"/></td>
						<th colspan="1">是否计划内项目</th>
						<td colspan="2"><input class="easyui-textbox" name="sgbase.sfwjhnxm_gh"
							value="0" style="width: 100%"/></td>
						
					</tr>
					</table>
					</form>	
					<form id="sgtrack"  method="post"  style="width:90%;margin:0 auto;">
					<table align="center" border="collapse" bordercolor="#a0c6e5" cellspacing="0"  style="width:100%;table-layout:fixed;">
						<tr style="background-color:#DDDDFF"><td align="center" colspan="6"><font style="font-weight:bold;" face="黑体" size="3">跟踪阶段信息</font></td></tr>
						<tr>
							<th colspan="1">开始跟踪时间</th>
							<td colspan="2"><input  class="easyui-datetimebox"
							data-options="required:true,showSeconds:false"  value="" style="width: 100%"
							name="sgtrack.ksgzsj" /></td>
							<th colspan="1">拟用签约品牌</th>
							<td colspan="2"><input  name="sgtrack.nyqypp" class="easyui-combobox"
							data-options="prompt:'委托项目指不需要通过招标手段获得的项目',
	                        url:'<%=path %>/select/queryDict?dictTypeId=DWQYPP',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'"
							style="width: 100%"></td>
						</tr>
						<tr>
							<th colspan="1">拟用签约(资质)名称</th>
						<td colspan="5"><input name="sgtrack.nyqyzzmc"  class="easyui-textbox"
							style="width: 100%"></td>
						</tr>
						<tr>
						<th colspan="1">拟实施单位名称</th>
						<td colspan="5"><input name="sgtrack.nssdwmc"  class="easyui-textbox"
							style="width: 100%"></td>
						</tr>
						<tr>
						<th colspan="1">预测合同额及币种(*)</th>
						<td colspan="1"><input class="easyui-textbox" style="width:100%; "name="sgtrack.yjhte"></td>
						<td colspan="1"><input name="sgtrack.htermb"
							data-options="prompt:'请输入币种',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=JSJEDW',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'"
							class="easyui-combobox" style="width: 100%"></td>
						<th colspan="1">预计合同工期（月）</th>
						<td colspan="2"><input name="sgtrack.yjhtgq" vtype="float"  class="easyui-numberbox"
							style="width: 100%" data-options="min:0,precision:2" /></td>
					</tr>
					<tr>
						<th colspan="1">当期汇率</th>
						<td colspan="2"><input name="sgtrack." vtype="float" value="6.640600" class="easyui-numberbox" style="width: 100%" data-options="min:0,precision:4" /></td>
			<th style="color:darkgrey">预计合同额(人民币)</th>
			<td colspan="2"><input name="sgtrack.htermb" vtype="float"  class="easyui-numberbox" style="width: 100%" data-options="min:0,precision:4" /></td>
					</tr>
					<tr>
						<th colspan="1">合同签订方式</th>
						<td colspan="2"><input name="sgtrack.htqdfs" vtype="float" class="easyui-combotree" 
						data-options="prompt:'请输入合同签订方式',required:true,
							url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=HTQDFS'"
						 style="width: 100%" data-options="min:0,precision:4" /></td>
			<th colspan="1">是否为重点跟踪项目</th>
			<td colspan="2"><input name="sgtrack.sfzdgzxm" vtype="float"  class="easyui-combobox"
			data-options="prompt:'',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=SF',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'"
			 style="width: 100%" data-options="min:0,precision:4" /></td>
					</tr>
					<tr>
						<th colspan="1">市场进展状况</th>
						<td colspan="5"><input name="sgtrack.scjzqk"
							class="easyui-textbox" style="height: 80px; width: 100%" multiline="true"/></td>
					</tr>
			<tr align="center" style="background-color:	#DDDDFF"><td  colspan="6"><font style="font-weight:bold;" face="黑体" size="3">投标阶段信息</font></td></tr>
			<tr>
						<th colspan="1">资审日期</th>
						<td colspan="2"><input class="easyui-datetimebox"
							required="true" name="sgtrack.zsrq" style="width: 100%"
							data-options="required:true,showSeconds:false" value="" /></td>
						<th colspan="1">资审结果</th>
						<td colspan="2"><input
							name="sgtrack.zsjg" data-options="prompt:'',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=ZSJG',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'" style="width: 100%"
							class="easyui-combobox"  /></td>
			</tr>
			<tr>	
						<th colspan="1">招标日期</th>
						<td colspan="2"><input class="easyui-datetimebox"
							name="sgtrack.zbrqi" style="width: 100%"
							data-options="required:true,showSeconds:false" value="" /></td>
						<th colspan="1">招标截止日期</th>
						<td colspan="2"><input class="easyui-datetimebox"
							name="sgtrack.zbjzrq" style="width: 100%"
							data-options="required:true,showSeconds:false" value="" /></td>
					
			</tr>
			<tr>
				<th colspan="1">招标单位名称</th>
						<td colspan="5"><input class="easyui-textbox"
							name="sgtrack.zbdlmc" style="width: 100%"
							data-options="required:true,showSeconds:false" value="" /></td>
			</tr>
			<tr>
				<th colspan="1">招标单位联系人</th>
						<td colspan="2"><input name="sgtrack.zbdllxr" style="width: 100%"
							class="easyui-textbox" /></td>
						<th colspan="1">招标单位联系电话</th>
						<td colspan="2"><input name="sgtrack.zbdllxdh" style="width: 100%"
							 class="easyui-textbox" /></td>
			</tr>
			<tr>
				<th colspan="1">投标组织方式</th>
						<td colspan="2"><input name="sgtrack.zztbfs"
							class="easyui-combotree" style="width: 100%" /></td>
						<th colspan="1">牵、投标单位名称</th>
						<td colspan="2"><input id="sgtrack.qtd" style="width: 100%"
							name="sgtrack.qtdwmc" class="easyui-textbox" /></td>
			</tr>
			<tr>
				<th colspan="1">投标日期(*)</th>
						<td colspan="2"><input class="easyui-datetimebox" required="true"
							name="sgtrack.tbrq" style="width: 100%"
							data-options="required:true,showSeconds:false" value="" /></td>
						<th colspan="1">投标报价及币种(*)</th>
						<td colspan="1"><input id="bidamount"
							name="sgtrack.tbbj" required="true"
							class="easyui-numberbox" style="width: 100%" /></td>
							<td>
								<input class="easyui-combobox "  name="sgtrack.tbbjdw" style="width:100%;" data-options="prompt:'请输入币种',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=JSJEDW',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'">
							</td>
			</tr>
			<!--<tr>
				<th>是否中标(*)</th>
						<td colspan="2"><input class="easyui-combobox" required="true"
							name="sgtrack.tbrq" style="width: 100%"
							data-options="prompt:'',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=SF',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'" value="" /></td>
						<th>中标额及币种(*)</th>
						<td style="width: 10%" ><input id="bidamount"
							name="sgtrack.tbbj" required="true"
							class="easyui-numberbox" style="width: 100%" /></td>
							<td>
								<input class="easyui-combobox "  name="sgtrack.tbbjdw"
								data-options="prompt:'请输入币种',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=JSJEDW',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'">
							</td>
			</tr>-->
			<!---->
			<tr>
						<th colspan="1">中标/未中标原因说明</th>
						<td colspan="5"><input name="sgtrack.zbsm"
							class="easyui-textbox" style="height: 80px; width: 100%" multiline="true" /></td>
			</tr>
			<tr>
				<th colspan="1">资审文件</th>
						<td colspan="5"><input class="easyui-textbox"
							name="sgtrack.zswj" style="width: 100%"
							data-options="required:true,showSeconds:false" value="" /></td>
			</tr>
			<tr>
				<th colspan="1">招标文件</th>
						<td colspan="5"><input class="easyui-textbox"
							name="sgtrack.zbwj" style="width: 100%"
							data-options="required:true,showSeconds:false" value="" /></td>
			</tr>
			<tr>
				<th colspan="1">投标文件</th>
						<td colspan="5"><input class="easyui-textbox"
							name="sgtrack.tbwj" style="width: 100%"
							data-options="required:true,showSeconds:false" value="" /></td>
			</tr>
			
			
			<tr>
				<th style="color:darkgrey"><center>投标单位</center></th><th style="color:darkgrey"><center>投标资质单位(填全称)</center></th><th><center>投标报价</center></th><th><center>是否中标</center></th><th><center>中标额</center></th><th><center>金额单位</center></th>
			</tr>
			<tr>
				<td name="sgtrack.dwmcb" style="width:100%;text-align:center">本单位</td>
				<td ><input class="easyui-textbox" name="sgtrack.dwmcb" style="width:100%;text-align:center"></td>
				<td ><input class="easyui-textbox" name="sgtrack.tbbjb" style="width:100%;text-align:center"></td>
				<td><input class="easyui-combobox"  name="sgtrack.sfzb" style="width:100%;text-align:center"></td>
				<td ><input class="easyui-textbox" name="sgtrack.zbeb" style="width:100%;text-align:center"></td>
				<td ><input class="easyui-combobox" name="sgtrack.jedwb" style="width:100%;text-align:center"></td>
			</tr>
			<tr align="center" style="background-color:	#DDDDFF"><td  colspan="6"><font style="font-weight:bold;" face="黑体" size="3">其他单位投标情况</font></td></tr>
			
			<tr>
				<td colspan="6">
					<table align="center" border="collapse" bordercolor="#a0c6e5" cellspacing="0" style="width:100%;table-layout:fixed;">
					<th><center>序号</center></th><th><center>投标单位</center></th><th><center>投标资质单位(填全称)</center></th><th><center>投标报价</center></th><th><center>是否中标</center></th><th><center>中标额</center></th><th><center>金额单位</center></th>
					<tr>
				<td align="center"><input class="easyui-textbox" style="width:100%;">1</td>
				<td align="center"><input class="easyui-textbox" name="sgtrack.zbdlmc" style="width:100%;"></td>
				<td align="center"><input class="easyui-textbox" name="sgtrack.dwmcb" style="width:100%;"></td>
				<td align="center"><input class="easyui-textbox" name="sgtrack.tbbjb" style="width:100%;"></td>
				<td align="center"><input class="easyui-combobox"  name="sgtrack.sfzb" style="width:100%;"></td>
				<td align="center"><input class="easyui-textbox" name="sgtrack.zbeb" style="width:100%;"></td>
				<td align="center"><input class="easyui-combobox" name="sgtrack.jedwb" style="width:100%;" data-options="prompt:'请输入币种',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=JSJEDW',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto',
							panelWidth:'auto'"
							></td>
				</tr>
				<tr>
				<td align="center"><input class="easyui-textbox" style="width:100%;">2</td>
				<td align="center"><input class="easyui-textbox" name="sgtrack.zbdlmc" style="width:100%;"></td>
				<td align="center"><input class="easyui-textbox" name="sgtrack.dwmcb" style="width:100%;"></td>
				<td align="center"><input class="easyui-textbox" name="sgtrack.tbbjb" style="width:100%;"></td>
				<td align="center"><input class="easyui-combobox"  name="sgtrack.sfzb" style="width:100%;"></td>
				<td align="center"><input class="easyui-textbox" name="sgtrack.zbeb" style="width:100%;"></td>
				<td align="center"><input class="easyui-combobox" name="sgtrack.jedwb" style="width:100%;" data-options="prompt:'请输入币种',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=JSJEDW',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto',
							panelWidth:'auto'"
							></td>
				</tr>
				</table>
				</td>
				<tr>
				<td colspan="6"><a href="javascript:void(0);" class="easyui-linkbutton"
							iconCls="icon-search" plain="true" onclick="">显示竞争伙伴详细信息</a></td>
			</tr>
			</tr>
			<tr align="center" style="background-color:	#DDDDFF"><td  colspan="6"><font style="font-weight:bold;" face="黑体" size="3">投标阶段信息</font></td></tr>
			<tr>
				<th colspan="1">中标项目名称(*)</th>
						<td colspan="5"><input class="easyui-textbox" required="true"
							name="sgtrack.zbxmmc" style="width: 100%"
							data-options="required:true,showSeconds:false" value="" /></td>
			</tr>
			<tr>
				<th colspan="1" style="color:darkgrey">中标额(*)</th>
						<td ><input class="easyui-textbox" required="true"
							name="sgtrack.zbe" style="width: 100%"
							data-options="required:true,showSeconds:false" value="" /></td>
							<td style="width: 10%"><input name="sgtrack.zbedw" value="元"
							class="easyui-textbox" style="width: 100%"></td>
							<th>中标日期(*)</th>
						<td colspan="2"><input class="easyui-datetimebox" required="true"
							name="sgtrack.zbrq" style="width: 100%"
							data-options="required:true,showSeconds:false" value="" /></td>

			</tr>
			<tr>
				<th colspan="1" style="color:darkgrey">中标纳入系统管理时间</th>
						<td colspan="2"><input class="easyui-textbox" required="true"
							name="sgtrack.nrxtgljsj_zb" style="width: 100%"
							data-options="required:true,showSeconds:false" value="" /></td>
				<th></th>
						<td colspan="2"><input class="easyui-textbox" required="true"
							name="sgtrack." style="width: 100%"
							data-options="required:true,showSeconds:false" value="" /></td>
			</tr>
					</table>
				</form>
			</div>	
		</fieldset>
        
    </div>
</div>
</body>
</html>