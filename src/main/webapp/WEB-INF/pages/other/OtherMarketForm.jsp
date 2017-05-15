<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>其他类项目基本信息</title>
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

        $('#qtProjectBaseForm').form({
            url : '<%=path %>/other/saveOtherBaseProject',
            onSubmit : function() {
                var isValid = $(this).form('validate');
                if (!isValid) {
                    progressClose();
                }
                return isValid;
            },
            success : function(result) {
                result = $.parseJSON(result);
                if (result.returnMqt == "Success") {
                	parent.doSearch();
                	qtBase_dialog.dialog('destroy');
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
    
    function saveQtProject() {
    	console.log($("#qtbase").serializeJson());
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
			<form id="qtbase" method="post"  style="width:90%;margin:0 auto;">
				
				<table align="center" border="collapse" bordercolor="#a0c6e5" cellspacing="0"  style="width:100%;table-layout:fixed;">
					<tr align="center"><td colspan="6"><font style="color: red;font-size:30px">注：本表金额单位为(元/折合美元)</font></td></tr>
					<tr style="background-color:#DDDDFF"><td colspan="6" align="center"><font style="font-weight:bold;" face="黑体" size="3">其他类项目基本项目信息</font></td></tr>
					<tr >
						<th colspan="1"><label for="name">项目名称(*)</label></th>
						<td colspan="5" word-wrap:break-word;>
						<input class="easyui-textbox" 
							name="qtbase.stdname" data-options="required:true" style="width: 100%";>
					<tr>
						<th colspan="1"><label for="name">项目名称（英文）</font></label></th>
						<td colspan="5">
						<input class="easyui-easyui-tooltip" id="dd" title="海外项目必填" 
							name="qtbase.xmmcyw" data-options="" style="width: 100%;border:none;
 				outline:none;"></td>
					</tr>
						<th colspan="1">项目标段</th>
						<td colspan="5"><input name="qtbase.xmbd"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">所属业务(*)</font></th>
						<td colspan="2"><input name="qtbase.ssyw" class="easyui-combobox" style="width: 100%" data-options="prompt:'请输入所属业务',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=SYB',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'" ></td>
							<th colspan="1">中交行业分类(*)</th>
						<td colspan="2"><input name="qtbase.zjhyflx" data-options="prompt:'请输入中交行业分类',required:true,
								url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=ZJHYFL'"
							class="easyui-combotree" style="width: 100%" /></td>
					</tr>
					<tr>
						<th colspan="1">项目类型(*)</th>
						<td colspan="2"><input name="qtbase.xmlx" data-options="prompt:'请输入项目类型',required:true,
							url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=XMLX'"
							class="easyui-combotree" style="width: 100%"></td>
						<th colspan="1">国家行业类别(*)</th>
						<td colspan="2"><input name="qtbase.gjhylb" class="easyui-combotree"
						data-options="prompt:'请输入行业类别',required:true,
							url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=GCLB'"
							style="width: 100%" /></td>
					</tr>
					<tr>
						<th colspan="1">项目合作方式(*)</th>
						<td  colspan="2"><input name="qtbase.xmhzfs" class="easyui-combotree" 
						data-options="prompt:'请输入项目合作方式',required:true,
								url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=XMHZFS'"
							style="width: 100%"></td>
						<th colspan="1">投资来源(*)</th>
						<td colspan="2"><input name="qtbase.tzly"  class="easyui-combotree"
						data-options="prompt:'请输入投资来源',required:true,
							url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=TZLY'"
							style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">项目所在地(*)</th>
						<td colspan="2"><input name="qtbase.xmszd"
							data-options="prompt:'请输入项目所在地',required:true,
							url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=XMDY'"
							class="easyui-combotree" style="width: 100%"></td>
						<th colspan="1" style="color:darkgrey">所属区域(*)</th>
						<td readonly="true" colspan="2"><input name="qtbase.ssqy"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1" style="color:darkgrey">区域中心(*)</th>
						<td readonly="true" colspan="2"><input name="qtbase.qyzx"
							class="easyui-textbox" style="width: 100%"></td>
						<th colspan="1">业主资金来源(*)</th>
						<td colspan="2"><input name="qtbase.yzzjly"
							data-options="prompt:'请输入资金来源',required:true,
							url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=HWZJLY'"
							class="easyui-combotree" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">业主单位(*)</th>
						<td readonly="true" colspan="5"><input name="qtbase.yzdw"
						data-options="required:true"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">是否未签约已实施（*）</font></th>
						<td colspan="2"><input name="qtbase.sfwqyyss" class="easyui-combobox" style="width: 100%" data-options="prompt:'请输入是否未签约已实施',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=SF',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'" ></td>
						<th colspan="1">是否调整项目（*）</font></th>
						<td colspan="2"><input name="qtbase.sftzxm" class="easyui-combobox" style="width: 100%" data-options="prompt:'请输入是否调整项目',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=SF',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'" ></td>
					</tr>
					<tr>
						<th colspan="1">是否分包给集团内其他二级单位（*）</font></th>
						<td colspan="2"><input name="qtbase.sffb" class="easyui-combobox" style="width: 100%" data-options="prompt:'请输入是否分包给集团内其他二级单位',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=SF',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'" ></td>
						<th colspan="1">金额单位</font></th>
						<td colspan="2"><input name="qtbase.jedw" class="easyui-combobox" style="width: 100%" data-options="prompt:'请输入金额单位',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=JSJEDW',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'" ></td>
					</tr>
					<tr>
						<th colspan="1">实际开工日期（*）</th>
						<td readonly="true" colspan="2"><input name="qtbase.htkgrq"
							class="easyui-datebox" style="width: 100%" data-options="prompt:'请输入实际开工日期',required:true" id="dd1" title="该指标为阶段性必填指标，实际开工后填写实际开工日期，未实际开工的请不要填写！" ></td>
					</tr>
					<tr style="background-color:#DDDDFF"><td colspan="6" align="center"><font style="font-weight:bold;" face="黑体" size="3">合同信息</font></td></tr>
					<tr>
						<th colspan="1">纳入系统管理时间（*）</th>
						<td colspan="2"><input name="qtbase.tjgsyf"  style="width: 100%" data-options="required:true"
							class="easyui-textbox"  editable="false"/></td>
					</tr>
					<tr>
						<th colspan="1">合同名称（*）</th>
						<td readonly="true" colspan="5"><input name="qtbase.htmc"
						data-options="required:true"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">合同编号</th>
						<td readonly="true" colspan="2"><input name="qtbase.htbh"
						data-options="required:true"
							class="easyui-textbox" style="width: 100%"></td>
						<th colspan="1">对外签约品牌（*）</font></th>
						<td colspan="2"><input name="qtbase.dwqypp" class="easyui-combobox" style="width: 100%" data-options="prompt:'请输入金额单位',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=DWQYPP',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'" ></td>
					</tr>
					<tr>
						<th colspan="1">合同签订方式（*）</th>
						<td colspan="2"><input name="qtbase.htqdfs"
							data-options="prompt:'请输入合同签订方式',required:true,
							url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=htqdfs'"
							class="easyui-combotree" style="width: 100%"></td>
						<th colspan="1">合同签订日期（*）</th>
						<td readonly="true" colspan="2"><input name="qtbase.htqdrq"
							class="easyui-datebox" style="width: 100%" data-options="prompt:'请输入合同签订日期',required:true"></td>
					</tr>
					<tr>
						<th colspan="1">合同甲方（*）</th>
						<td readonly="true" colspan="2"><input name="qtbase.htjf"
						data-options="required:true"
							class="easyui-textbox" style="width: 100%" editable="false"></td>
						<th colspan="1">合同乙方（*）</th>
						<td colspan="2"><input name="qtbase.htyfid"
							data-options="prompt:'请输入合同乙方',required:true,
							url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=MD_ORG'"
							class="easyui-combotree" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">签约资质名称</th>
						<td readonly="true" colspan="5"><input name="qtbase.qyzzmc"
						data-options="required:true"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">合同额（*）</th>
						<td readonly="true" colspan="1"><input name="qtbase.hte"
						data-options="required:true"
							class="easyui-textbox" style="width: 100%"></td>
						<td colspan="1"><input name="qtbase.jedw1" class="easyui-textbox" editable="false" style="width: 100%" data-options="required:true" ></td>
						<th colspan="1">自主承担合同额（*）</th>
						<td readonly="true" colspan="1"><input name="qtbase.zzcdhte"
						data-options="required:true"
							class="easyui-textbox" style="width: 100%"></td>
						<td colspan="1"><input name="qtbase.jedw2" class="easyui-textbox" editable="false" style="width: 100%" data-options="required:true"></td>
					</tr>
					<tr>
						<th colspan="1">变更后总合同额</th>
						<td colspan="1"><input name="qtbase.bghte"
						data-options="required:true" editable="false"
							class="easyui-textbox" style="width: 100%"></td>
						<td colspan="1"><input name="qtbase.jedw" editable="false" class="easyui-combobox" style="width: 100%" data-options="prompt:'请输入金额单位',required:true" ></td>
						<th colspan="1">变更后自主承担合同额</th>
						<td colspan="1"><input name="qtbase.bgzzcdhte"
						data-options="required:true" editable="false"
							class="easyui-textbox" style="width: 100%"></td>
						<td colspan="1"><input name="qtbase.jedw" editable="false" class="easyui-combobox" style="width: 100%" data-options="prompt:'请输入金额单位',required:true," ></td>
					</tr>
					<tr>
						<th colspan="1">变更后合同工期</th>
						<td readonly="true" colspan="2"><input name="qtbase.bghtgq"
						data-options="required:true" editable="false"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">合同工期（月）（*）</th>
						<td readonly="true" colspan="2"><input name="qtbase.htgq"
						data-options="required:true"
							class="easyui-textbox" style="width: 100%"></td>
						<th colspan="1">合同开工日期</th>
						<td readonly="true" colspan="2"><input name="qtbase.htkgrq"
							class="easyui-datebox" style="width: 100%" data-options="prompt:'请输入合同开工日期',required:true"></td>
					</tr>
					<tr>
						<th colspan="1">合同完工日期</th>
						<td readonly="true" colspan="2"><input name="qtbase.htwgrq"
							class="easyui-datebox" style="width: 100%" data-options="prompt:'请输入合同完工日期',required:true"></td>
						<th colspan="1">实际完工日期（*）</th>
						<td readonly="true" colspan="2"><input name="qtbase.sjwgrq"
							class="easyui-datebox" style="width: 100%" data-options="prompt:'请输入合同开工日期',required:true"></td>
					</tr>
					</table>
				</form>
			</div>	
		</fieldset>
        
    </div>
</div>
</body>
</html>