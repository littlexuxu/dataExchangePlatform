<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>其他变更合同单据</title>
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

        $('#sgProjectBaseForm').form({
            url : '<%=path %>/construction/saveConstructionBaseProject',
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
			<form id="qtchange" method="post"  style="width:90%;margin:0 auto;">
				
				<table align="center" border="collapse" bordercolor="#a0c6e5" cellspacing="0"  style="width:100%;table-layout:fixed;">
					<tr style="background-color:#DDDDFF"><td colspan="6" align="center"><font style="font-weight:bold;" face="黑体" size="3">合同变更信息</font></td></tr>
					<tr >
						<th colspan="1"><label for="name">主合同名称</label></th>
						<td colspan="5" word-wrap:break-word;>
						<input class="easyui-textbox"  editable="false"
							name="qtchange.zhtmc" data-options="required:true" style="width: 100%";>
					<tr>
						<th colspan="1"><label for="name">变更合同名称（*）</font></label></th>
						<td colspan="5">
						<input class="easyui-easyui-tooltip"
							name="qtchange.bghtmc" data-options="" style="width: 100%;border:none;
 				outline:none;"></td>
					<tr>
						<th colspan="1">纳入系统管理时间（*）</th>
						<td colspan="2"><input name="qtchange.nrxtglsj"  editable="false" style="width: 100%" data-options="required:true"
							class="easyui-textbox"  editable="false"/></td>
					</tr>
					<tr>
						<th colspan="1">变更日期（*）</th>
						<td readonly="true" colspan="5"><input name="qtchange.bgrq"
						data-options="required:true"
							class="easyui-datebox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">是否纳入新签（*）</th>
						<td readonly="true" colspan="2"><input name="qtchange.sfnrxq"
						data-options="required:true" editable="false" value="是"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">变更增减合同额（*）</th>
						<td colspan="1"><input name="qtchange.bgzjhte"
							data-options="required:true" editable="false"
							class="easyui-textbox" style="width: 100%"></td>
						<td colspan="1"><input name="qtchange.ssyw1" editable="false" value="元"
							data-options="required:true"
							class="easyui-textbox" style="width: 100%"></td>
						<th colspan="1">变更增减自主承担合同额（*）</th>
						<td readonly="true" colspan="2"><input name="qtchange.bgzjzzcdhte" editable="false"
							class="easyui-datebox" style="width: 100%" data-options="required:true"></td>
					</tr>
					<tr>
						<th colspan="1">变更前合同额</th>
						<td readonly="true" colspan="2"><input name="qtchange.bgqhte"
						data-options="required:true"
							class="easyui-textbox" editable="false" style="width: 100%"></td>
						<th colspan="1">变更后总合同额</th>
						<td readonly="true" colspan="2"><input name="qtchange.bghzhte"
						data-options="required:true"
							class="easyui-textbox" editable="false" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">其中：变更前自主承担合同额</th>
						<td readonly="true" colspan="2"><input name="qtchange.bgqzzgdhte"
						data-options="required:true"
							class="easyui-textbox" editable="false" style="width: 100%"></td>
						<th colspan="1">变更后自主承担合同额</th>
						<td readonly="true" colspan="2"><input name="qtchange.bghzzcdhte"
						data-options="required:true"
							class="easyui-textbox" editable="false" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">变更前合同工期</th>
						<td readonly="true" colspan="2"><input name="qtchange.bgqhtgq"
						data-options="required:true" editable="false"
							class="easyui-textbox" style="width: 100%"></td>
						<th colspan="1">变更后合同工期（*）</th>
						<td readonly="true" colspan="2"><input name="qtchange.bghhtgq"
						data-options="required:true"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">主要变更条款</th>
						<td readonly="true" colspan="5"><input name="qtchange.zybgtk"
						data-options="required:true;multiline:true"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">变更原因</th>
						<td readonly="true" colspan="5"><input name="qtchange.bgyy"
						data-options="required:true;multiline:true"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">备注</th>
						<td readonly="true" colspan="5"><input name="qtchange.htbz"
						data-options="required:true;multiline:true"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					<tr>
						<th colspan="1">合同变更扫描件</th>
						<td readonly="true" colspan="5"><input name="qtchange.smj"
						data-options="required:true"
							class="easyui-textbox" style="width: 100%"></td>
					</tr>
					</table>
				</form>
			</div>	
		</fieldset>
        
    </div>
</div>
</body>
</html>