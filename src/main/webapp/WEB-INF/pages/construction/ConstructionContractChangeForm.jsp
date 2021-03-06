<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title></title>
		<%@include file="/resources/common_lib.jsp"%>

			<style type="text/css">
				th {
					font-weight: bold;
					background: #ECECFF;
					text-align: right;
					font-size: 10px;
					height: 30px;
				}

				;
				td input {
					border: none;
					outline: none;
				}

				td {
					word-wrap: break-word;
					height: 30px;
				}

				span.textbox {
					border: 0;
				}
			</style>

	</head>

	<body>
		<script type="text/javascript">
			$(function () {
				
				$("#bgzjhte").numberbox({
					"onChange":function(){
						var htewy = $("#htewy").numberbox("getValue");
						var bgzjhte = $("#bgzjhte").numberbox("getValue");
						$("#bghtewy").numberbox("setValue",getSum(htewy,bgzjhte));
					}
				});
				
				
				$("#bgzjzzcdhte").numberbox({
					"onChange":function(){
						var zzcdhte = $("#zzcdhte").numberbox("getValue");
						var bgzjzzcdhte = $("#bgzjzzcdhte").numberbox("getValue");
						$("#bgzzcdhte").numberbox("setValue",getSum(zzcdhte,bgzjzzcdhte));
					}
				});
				
				
				/* $("#ID").parent().css("display", "none"); */
				$.each($("input[class='easyui-combotree']"), function (i, val) {
					var combotree = $("input[name='" + val.name + "']");
					combotree.combotree({
						onBeforeSelect: function (node) {
							if (node.children) {
								return false;
							}
						}
					});
				});
			});
			 
			
			
			function getSum(cAmount,chgAmout){ 
				if(chgAmout.indexOf('-') >= 0){
					chgAmout = chgAmout.substring(1,chgAmout.length);
					return parseFloat(cAmount) - parseFloat(chgAmout);
				}else{
					return parseFloat(cAmount) + parseFloat(chgAmout);
				}
			}


			function saveSgProjectContratChg() {
				var sgcontract = $("#sgcontrackChange").serializeJsonContain("sgcontract");
				var sgcontrackChange = $("#sgcontrackChange").serializeJsonContain("sgcontrackChange");
				
				// $("form[name='form1']").children().not($('input[type="hidden"]')).serialize()
				/* $("form[name='form1']").not($("input[type='hidden']")).not($("input[class='flau_u_ro']")).serialize(); 
				$("form[name='sgcontrackChange']").children().not($('input[name^='sgcontract']')).serialize(); */
				//提交改变行数据，否则通过getChanges获取新增、或者修改行拿不到最后一次编辑的row
				console.log(sgcontract);
				console.log(sgcontrackChange);
				var sgcontract = $("#sgcontrackChange").serializeJsonContain("sgcontract");
				var sgcontrackChange = $("#sgcontrackChange").serializeJsonContain("sgcontrackChange");
				if ($('#sgcontrackChange').form('validate')) {
					$.ajax({
						url: '<%=path %>/construction/saveConstructionContractAndChg',
						type: 'POST',
						data: { 'sgcontract': JSON.stringify(sgcontract), 'sgcontractChg': JSON.stringify(sgcontrackChange)},
						success: function (result) {
							console.log(result)
							if (result.returnMsg == 'Success') {
								sgBase_dialog.dialog('destroy');
								sgBaseDataGrid.datagrid('reload');
							}
							else {
								$.messager.alert(result.returnMsg);
							}
						}
					});
				}
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
				<fieldset class="easyui-panel" style="width:100%;margin:0 auto;">
					<div>
						<legend></legend>
						<legend align="center"></legend>
						<!--分割线-->
						<form id="sgcontrackChange" name="form1" method="post" style="width:100%;margin:0 auto;">
						
							
								<input name="sgcontract.sgcontractid" type="hidden">
							<table align="center" border="collapse" bordercolor="#a0c6e5" cellspacing="0" style="width:100%;table-layout:fixed;">
								<tr style="background-color:#DDDDFF">
									<td colspan="6" align="center">
										<font style="font-weight:bold;" face="黑体" size="3">合同变更信息</font>
									</td>
								</tr>
								<tr>
									<th colspan="1"><label for="name">主合同名称</label></th>
									<td colspan="5" word-wrap:break-word;>
										<input class="easyui-textbox" name="sgcontract.htmc" data-options="required:true,readonly:true" style="width: 100%" ;>
								</tr>
								<tr>
									<th colspan="1"><label for="name">变更合同名称(*)</label></th>
									<td colspan="5" word-wrap:break-word;>
										<input class="easyui-textbox" name="sgcontrackChange.bghtmc" data-options="required:true" style="width: 100%" ;>
								</tr>

								<tr>
									<th colspan="1">纳入系统管理时间</th>
									<td colspan="2"><input class="easyui-datebox" style="width:100%;" id="tjgsyf" name="sgcontract.tjgsyf"></td>
									<th colspan="1">变更日期(*)</th>
									<td colspan="2"><input name="sgcontrackChange.bgrq" vtype="float" class="easyui-datebox" style="width: 100%" data-options="min:0,precision:2"
										/></td>
								</tr>
								<tr>
									<th colspan="1">变更增减合同额(*)</th>
									<td colspan="1"><input class="easyui-textbox" style="width:100%" id="bgzjhte" name="sgcontrackChange.bgzjhte"></td>
									<td colspan="1"><input name="sgcontract.hetdw" readonly='readonly' class="easyui-combobox" style="width:100%;" 
                                data-options="prompt:'折合美元',
	                                url:'<%=path %>/select/queryDict?dictTypeId=JSJEDW',
						        	method:'get',	valueField:'dictid',
							        textField:'dictname',
							        panelHeight:'auto'"   />
									<th colspan="1">变更增减自主承担合同额</th>
									<td colspan="2"><input name="sgcontrackChange.bgzjzzcdhte" id="bgzjzzcdhte" class="easyui-textbox" style="width: 100%"/></td>
								</tr>
								<tr>
									<th colspan="1">是否纳入新签</th>
									<td colspan="2"><input name="" readonly="readonly" class="easyui-combobox" style="width:100%;" 
                                data-options="prompt:'是否纳入新签',
	                                url:'<%=path %>/select/queryDict?dictTypeId=sF',
						        	method:'get',value=1,alueField:'dictid',
							        textField:'dictname',
							        panelHeight:'auto'"/></td>
									<th colspan="1"></th>
									<td colspan="2"></td>
								</tr>
								<tr>
									<th style="color:darkgrey">变更前合同额</th>
									<td colspan="2"><input name="sgcontract.htewy" id="htewy" vtype="float" class="easyui-numberbox" style="width: 100%" data-options="min:0,precision:4"
										/></td>
									<th style="color:darkgrey">变更后总合同额</th>
									<td colspan="2"><input name="sgcontract.bghtewy" id="bghtewy" vtype="float" class="easyui-numberbox" style="width: 100%" data-options="min:0,precision:4"
										/></td>
								</tr>
								<tr>
									<th style="color:darkgrey">其中：变更前自主承担合同额</th>
									<td colspan="2"><input name="sgcontract.zzcdhte" id="zzcdhte" vtype="float" class="easyui-numberbox" style="width: 100%" data-options="min:0,precision:4"
										/></td>

									<th style="color:darkgrey">变更后自主承担合同额</th>
									<td colspan="2"><input name="sgcontract.bgzzcdhte" id="bgzzcdhte" vtype="float" class="easyui-numberbox" style="width: 100%" data-options="min:0,precision:4"
										/></td>
								</tr>
								<tr>
									<th style="color:darkgrey">变更前合同工期</th>
									<td colspan="2"><input name="sgcontract.htgq" vtype="float" class="easyui-numberbox" style="width: 100%" data-options="min:0,precision:4"
										/></td>

									<th>变更后合同工期</th>
									<td colspan="2"><input name="sgcontrackChange.bghhtgq" vtype="float" class="easyui-numberbox" style="width: 100%" data-options="min:0,precision:4"
										/></td>
								</tr>
								<tr>
									<th colspan="1">主要变更补充条款</th>
									<td colspan="5">
										<input name="sgcontrackChange.zybgtk" class="easyui-textbox" data-options="multiline:true" enabled="false" style="width:100%;height:40px"
										/>
									</td>
								</tr>
								<tr>
									<th colspan="1">变更原因</th>
									<td colspan="5">
										<input name="sgcontrackChange.bgyy" class="easyui-textbox" data-options="multiline:true" enabled="false" style="width:100%;height:40px"
										/>
									</td>
								</tr>
								<tr>
									<th colspan="1">备注</th>
									<td colspan="5">
										<input name="sgcontrackChange.htbz" class="easyui-textbox" data-options="multiline:true" enabled="false" style="width:100%;height:40px"
										/>
									</td>
								</tr>
							</table>
						</form>
					</div>
				</fieldset>
			</div>
		</div>
	</body>

	</html>