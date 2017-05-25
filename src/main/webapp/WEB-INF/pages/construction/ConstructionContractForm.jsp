<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>项目及合同信息</title>
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
		$("#divParent" ).css("display", "none");  
    	$("#divParent1" ).css("display", "none");
    	/* $("#ID").parent().css("display", "none"); */
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
    	

		
		//设置form表单为只读
		readonlyForm("sgBaseProjectInfo",true);
		
		
		
		$('#cxmid').combogrid({
		    url:'<%=path %>/select/queryProject?projectType=sg',
		    idField:'sgbaseid',
		    textField:'stdname',
		    columns:[[    
		        {field:'sgbaseid',title:'sgbaseid',width:'20%'},    
		        {field:'stdname',title:'stdname',width:'30%'},    
		        {field:'xmmcyw',title:'xmmcyw',width:'30%'} 
		    ]],
		    fitColumns: true,
		    onSelect:function(index,row,value){
		    	//console.log(row);
		    	console.log(row.ssyw);//所属业务
		    	console.log(row.xmmcyw);//项目名称
		    	console.log(row.xmbd);//项目标段
		    	//$("#ssyw").setValue(row.ssyw);
		    	console.log(row);
		    	var record = allPrpos(row,'sgBaseProjectInfo');
		    	/* $("#xmmcyw").textbox("setValue",row.xmmcyw);
		    	$("#xmbd").textbox("setValue",row.xmbd);
		    	$('#ssyw').combobox('setValue',4); */
		    	//$('#ssyw').combobox('setText',row.ssywdtname);
		    	$("#sgBaseProjectInfo").form("load",record);

		    }
		});
	});
	
	
	function allPrpos(obj,formId) { 
		var returnMess = {};
		for (var p in obj){ 
			if(obj[p] != null || obj[p] != "null" || obj[p] != "" || obj[p] != undefined) {
				returnMess[formId+'.' + p] = obj[p];
			}
		} 
		return returnMess;
	}
	
	function saveSgProjectContract() {
    	
    	if($('#jtsgProjectandContract').form('validate')){
    		var sgcontract = $("#jtsgProjectandContract").serializeJson();
    		$.ajax({
        		url:'<%=path %>/construction/saveSgProjectContract',
        		type:'POST',
        		data:{'sgcontract':JSON.stringify(sgcontract),'sgbaseid':$("#sgbaseid").textbox("getValue")},
      			success:function(result){
      				console.log(result)
      				if(result.returnMsg == 'Success'){
      					sgContract_dialog.dialog('destroy');
      					sgContractDataGrid.datagrid('reload');
      				}
    	  			else{
    	  				$.messager.alert(result.returnMsg);
    	  			}
      			}
        	});		
    	} 
    }
	
	var sgContract_dialog;
	//显示弹出窗口 新增：row为空 编辑:row有值
	function doUpdate(row) {
		var _url = "<%=request.getContextPath() %>/construction/updateConstructionContract";
		if (row != undefined && row.id) {
			//_url = ctx+"/userAction/toUpdate/"+row.id;
		}
	    //弹出对话窗口
	    sgContract_dialog = $('<div/>').dialog({
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
	            	$('#sgProjectBaseForm').form('load', row);
	            } else {
	            	
	            }

	        },
	        buttons: [
	            {
	                text: '保存',
	                iconCls: 'icon-save',
	                handler: function () {
	                	$('#sgProjectBaseForm').submit();
	                }
	            },
	            {
	                text: '关闭',
	                iconCls: 'icon-cancel',
	                handler: function () {
	                	sgContract_dialog.dialog('destroy');
	                }
	            }
	        ],
	        onClose: function () {
	        	sgContract_dialog.dialog('destroy');
	        }
	    });
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
		<div id="tt" class="easyui-tabs" style="width:auto;height:auto;">   
    	<div title="施工类项目及合同信息" style="padding:20px;display:none;">   
		<fieldset class="easyui-panel" style="width:100%;margin:0 auto;">
			<div>
			<legend></legend>
			<legend align="center" ></legend>
			<form id="sgBaseProjectInfo">
			  		<div id="divParent"style="margin:10px 0;">  
							<input id="sgbaseid" class="easyui-textbox" name="sgBaseProjectInfo.sgbaseid" > </div> 
                     <table style="table-layout:fixed;width:100%" align="center" border="1" cellspacing="0" bordercolor="#a0c6e5" style="border-collapse:collapse;">
                      <tr>
                            <td colspan="6"><font size="5" style="color:red">注：本表单金额为（元/折合美元）</font>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="6" style="background-color:#ECECFF"><font size="3" style="font-weight:bold;" face="黑体">项目基本信息</font>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">中标项目名称（*）</td>
                            <td colspan="5">
                                <input name="sgBaseProjectInfo.cxmid" id="cxmid" enabled="false" style="width:100%" />
                                <%-- data-options="prompt:'请输入中标项目名称',required:true, url:'<%=path %>/select/queryProject/queryProjectNoContract?projectType=sg',panelHeight:'auto'"  /> --%> 
                            </td>
                        </tr>
                     	<tr>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">项目名称</td>
                            <td colspan="5">
                                <input id="xmmcyw" name="sgBaseProjectInfo.xmmcyw" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">项目标段</td>
                            <td colspan="5">
                                <input id="xmbd" name="sgBaseProjectInfo.bdmc" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">所属业务</td>
                            <td colspan="2"><input name="sgBaseProjectInfo.ssyw" id="ssyw" class="easyui-combobox" style="width: 100%" data-options="prompt:'请输入所属业务',required:true,
	                        url:'<%=path %>/select/queryDict?dictTypeId=SYB',
							method:'get',
							valueField:'dictid',
							textField:'dictname',
							panelHeight:'auto'" ></td>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">中交行业分类</td>
                            <td colspan="2">
                                <input name="sgBaseProjectInfo.zjhyflx" class="easyui-combotree" id="zjhyflx" data-options="prompt:'请输入中交行业分类',required:true, 
								url:'<%=path %>/select/queryDictTree?dictTypeId=ZJHYFL'"
							 style="width: 100%" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">项目类型</td>
                            <td colspan="2">
                                <input name="sgBaseProjectInfo.xmlx" data-options="prompt:'请输入项目类型',required:true, 
							url:'<%=path %>/select/queryDictTree?dictTypeId=XMLX'"
							class="easyui-combotree" style="width: 100%">
                            </td>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">国家行业类别</td>
                            <td colspan="2">
                                <input name="sgBaseProjectInfo.gjhylb" class="easyui-combotree"
						data-options="prompt:'请输入行业分类',required:true, 
							url:'<%=path %>/select/queryDictTree?dictTypeId=GCLB',"
							style="width: 100%" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">项目所在地</td>
                            <td colspan="2">
                                <input name="sgBaseProjectInfo.xmszd"
							data-options="prompt:'请输入项目所在地',required:true, 
							url:'<%=path %>/select/queryDictTree?dictTypeId=XMDY'"
							class="easyui-combotree" style="width: 100%">
                            </td>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">投资来源</td>
                            <td colspan="2">
                                <input name="sgBaseProjectInfo.tzly" class="easyui-combotree"
						data-options="prompt:'请输入投资来源',required:true, 
							url:'<%=path  %>/select/queryDictTree?dictTypeId=TZLY',"
							style="width: 100%">
                            </td>
                        </tr>
                        <!-- <tr>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">所属区域</td>
                            <td colspan="2">
                                <input name="sgBaseProjectInfo.ssqy" class="easyui-textbox" enabled="false" style="width:100%;"/>
                            </td>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">区域中心</td>
                            <td colspan="2">
                                <input name="sgBaseProjectInfo.qyzx" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr> -->
                        <!-- <tr>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">项目阶段</td>
                            <td colspan="2">
                                <input name="sgBaseProjectInfo.qyzx" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="3">
                                <input class="easyui-textbox" enabled="false"  style="background-color:#ECECFF" type="hidden"/>
                            </td>
                        </tr> -->
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">业主单位</td>
                            <td colspan="4">
                            <input name="sgBaseProjectInfo.yzdw" data-options="prompt:'请输入业主单位',required:true,
					                        url:'<%=path %>/select/queryDict?dictTypeId=GHYZ',
											method:'get',
											valueField:'dictid',
											textField:'dictname',
											panelHeight:'auto'"
											class="easyui-combobox" style="width: 100%">
                            </td>
                            <td colspan="1">
                                <a href="javascript:void(0);" class="easyui-linkbutton"
							iconCls="icon-search" plain="true" onclick="">详细信息</a>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">设计单位</td>
                            <td colspan="4">
                                <input name="sgBaseProjectInfo.sjdw" data-options="prompt:'请输入设计单位',required:true,
				                        url:'<%=path %>/select/queryDict?dictTypeId=GHSJDW',
										method:'get',
										valueField:'dictid',
										textField:'dictname',
										panelHeight:'auto'"
										class="easyui-combobox" style="width: 100%">
                            </td>
                            <td colspan="1">
                                <a href="javascript:void(0);" class="easyui-linkbutton"
							iconCls="icon-search" plain="true" onclick="">详细信息</a>
                            </td>
                        </tr>
                      </table>
                    </form>
			<!--分割线-->
			<form id="jtsgProjectandContract">
							<div id="divParent1"style="margin:10px 0;">  
							<input id="sgcontractid" class="easyui-textbox" name="jtsgProjectandContract.sgcontractid" > </div> 
                <table  style="table-layout:fixed;width:100%" align="center" border="1" cellspacing="0" bordercolor="#a0c6e5" style="border-collapse:collapse;">
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">监理单位</td>
                            <td colspan="5">
                                <input name="jtsgProjectandContract.jldw" class="easyui-textbox"  data-options="required:true" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">监理单位联系人</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.jldwlxr" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">监理单位联系电话</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.jldwlxdh" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">实际开工日期（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.sjkgrq" class="easyui-datebox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">是否关联投资项目（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.sfgltzxm" class="easyui-combobox" enabled="false" style="width:100%;" 
                                data-options="prompt:'请输入是否关联投资项目',required:true,
	                                url:'<%=path %>/select/queryDict?dictTypeId=SF',
						        	method:'get',	valueField:'dictid',
							        textField:'dictname',
							        panelHeight:'auto'" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">关联投资项目公司</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.gltzxmgs" class="easyui-combotree" 
                                data-options="prompt:'请输入关联投资项目公司',required:true,
	                                url:'<%=path %>/select/queryDictTree?dictTypeId=gltzxmgs'"
                                enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">投资类型</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.tzxmlx" class="easyui-combobox" enabled="false" style="width:100%;" 
                                data-options="prompt:'请输入投资类型',required:true,
	                                url:'<%=path %>/select/queryDict?dictTypeId=TZLY',
						        	method:'get',	valueField:'dictid',
							        textField:'dictname',
							        panelHeight:'auto'" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">项目概况及规模</td>
                            <td colspan="5">
                                <input name="jtsgProjectandContract.xmgkjgm" class="easyui-textbox" data-options="multiline:true" enabled="false" style="width:100%;height:40px"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">项目特点,亮点</td>
                            <td colspan="5">
                                <input name="jtsgProjectandContract.xmld" class="easyui-textbox" data-options="multiline:true" enabled="false" style="width:100%;height:40px"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">主体工程结构及特点</td>
                            <td colspan="5">
                                <input name="jtsgProjectandContract.ztgcjg" class="easyui-textbox" data-options="multiline:true" enabled="false" style="width:100%;height:40px"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="6" style="background-color:#ECECFF"><font style="font-weight:bold;" size="3" face="黑体">主要工程量</font>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">钢材</td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.gc" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">吨</td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">水泥</td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.sn" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">吨</td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">木材</td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.mc" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">立方米</td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">混凝土量</td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.hntl" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">立方米</td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">土方量</td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.tfl" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">立方米</td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">石方量</td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.sfl" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">立方米</td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">其他</td>
                            <td colspan="5">
                                <input name="jtsgProjectandContract.qt" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="6" style="background-color:#ECECFF"><font  style="font-weight:bold;" size="3" face="黑体">合同信息</font>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">是否未签约已实施（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.wqyyss" class="easyui-combobox" enabled="false" style="width:100%;" 
                                data-options="prompt:'请输入是否未签约已实施',required:true,
	                                url:'<%=path %>/select/queryDict?dictTypeId=SF',
						        	method:'get',	valueField:'dictid',
							        textField:'dictname',
							        panelHeight:'auto'" />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">纳入系统管理时间（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.tjgsyf" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">合同名称（*）</td>
                            <td colspan="5">
                                <input name="jtsgProjectandContract.htmc" class="easyui-textbox" data-options="required:true"  enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">合同编号</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.htbh" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">海外重点监控（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.dwqypp" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">合同签订方式（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.htqdfs" class="easyui-combotree" enabled="false" style="width:100%;" 
                                data-options="prompt:'请输入合同签订方式',required:true,
	                                url:'<%=request.getContextPath() %>/select/queryDictTree?dictTypeId=htqdfs'" />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">合同签订日期（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.htqdrq" class="easyui-datebox" enabled="false" style="width:100%;" 
                                data-options="prompt:'请输入合同签订日期'" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">合同甲方（*）</td>
                            <td colspan="5">
                                <input name="jtsgProjectandContract.htjf" class="easyui-textbox"  enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr> 
                            <td colspan="1" style="background-color:#ECECFF" align="right">合同乙方（*）</td>
                            <td colspan="5">
                                <input name="jtsgProjectandContract.htyfid" class="easyui-combotree"  enabled="false" style="width:100%;" 
                                data-options="prompt:'请输入合同乙方',method:'POST',required:true,onlyLeafCheck:true,
	                                url:'<%=request.getContextPath() %>/select/queryOrgTree'" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">合同额及币种（*）</td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.htewy" class="easyui-textbox" data-options="required:true" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.hetdw" class="easyui-combobox" enabled="false" style="width:100%;" 
                                data-options="prompt:'折合美元',
	                                url:'<%=path %>/select/queryDict?dictTypeId=JSJEDW',
						        	method:'get',	valueField:'dictid',
							        textField:'dictname',
							        panelHeight:'auto'"   />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">其中：自主承担合同额（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.zzcdhte" class="easyui-textbox" data-options="required:true" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                       <%--  <tr>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">变更后合同额及币种（*）</td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.hte" class="easyui-textbox" data-options="required:true" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.jedw" class="easyui-combobox" enabled="false" style="width:100%;" 
                                data-options="prompt:'折合美元',
	                                url:'<%=path %>/select/queryDict?dictTypeId=JSJEDW',
						        	method:'get',	valueField:'dictid',
							        textField:'dictname',
							        panelHeight:'auto'"   />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">合同额（人民币）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.zzcdhte" class="easyui-textbox" data-options="required:true" enabled="false" style="width:100%;"  />
                            </td>
                        </tr> --%>
                        <%-- <tr>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">变更后自主承担合同额及币种（*）</td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.hte" class="easyui-textbox" data-options="required:true" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.jedw" class="easyui-combobox" enabled="false" style="width:100%;" 
                                data-options="prompt:'折合美元',
	                                url:'<%=path %>/select/queryDict?dictTypeId=JSJEDW',
						        	method:'get',	valueField:'dictid',
							        textField:'dictname',
							        panelHeight:'auto'"   />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">自主承担合同额（人民币）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.zzcdhte" class="easyui-textbox" data-options="required:true" enabled="false" style="width:100%;"  />
                            </td>
                        </tr> --%>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">合同工期（月）（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.htgq" class="easyui-textbox" data-options="required:true" enabled="false" style="width:100%;"  />
                            </td>
                            <!-- <td colspan="1" style="background-color:#ECECFF;color:darkgrey;color:darkgrey" align="right">变更后合同工期（月）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.bghtgq" class="easyui-textbox" enabled="false" style="width:100%;" />
                            </td> -->
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">合同开工日期（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.htkgrq" class="easyui-datebox" enabled="false" style="width:100%;" 
                                data-options="prompt:'请输入合同开工日期'" />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">合同交（竣）工日期（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.htjgrq" class="easyui-datebox" enabled="false" style="width:100%;" 
                                data-options="prompt:'请输入合同完工日期'" />
                            </td>
                        </tr>
                        <tr>
                            <!-- <td colspan="1" style="background-color:#ECECFF" align="right">合同扫描件</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.sjwgrq" class="easyui-textbox" data-options="required:true" enabled="false" style="width:100%;"  />
                            </td> -->
                            <td colspan="1" style="background-color:#ECECFF" align="right">是否分包给集团内其他二级单位（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.sffb" class="easyui-combobox" enabled="false" style="width:100%;" 
                                data-options="prompt:'请输入是否分包给集团内其他二级单位',required:true,
	                                url:'<%=path %>/select/queryDict?dictTypeId=SF',
						        	method:'get',	valueField:'dictid',
							        textField:'dictname',
							        panelHeight:'auto'" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">对外签约品牌（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.dwqypp" class="easyui-combobox" enabled="false" style="width:100%;" 
                                data-options="prompt:'请输入对外签约品牌',required:true,
	                                url:'<%=path %>/select/queryDict?dictTypeId=DWQYPP',
						        	method:'get',	valueField:'dictid',
							        textField:'dictname',
							        panelHeight:'auto'" />
                            </td>
                            <td colspan="3">
                                <input class="easyui-textbox" enabled="false" type="hidden"  style="background-color:#ECECFF"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">签约单位（资质）名称（*）</td>
                            <td colspan="5">
                                <input name="jtsgProjectandContract.jtpp" class="easyui-textbox"  enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">实施单位名称（*）</td>
                            <td colspan="5">
                                <input name="jtsgProjectandContract.ssdwmc" class="easyui-textbox"  enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">预付款比例（%）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.ysyfkbl" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">合同约定工程进度款支付比例（%）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.ysjdkzfbl" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">质保金比例（%）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.yszbjbl" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">质保金期限（年）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.yszbjqx" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">履约保证方式</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.yslybzfs" class="easyui-combobox" enabled="false" style="width:100%;" 
                                data-options="prompt:'请输入对外签约品牌',required:true,
	                                url:'<%=path %>/select/queryDict?dictTypeId=DWQYPP',
						        	method:'get',	valueField:'dictid',
							        textField:'dictname',
							        panelHeight:'auto'" />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">履约保证金额及币种（*）</td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.yslybzje" class="easyui-textbox" data-options="required:true" enabled="false" style="width:100%;"  />
                            </td>
                            <%-- <td colspan="1">
                                <input name="jtsgProjectandContract.jedw" class="easyui-combobox" enabled="false" style="width:100%;" 
                                data-options="prompt:'折合美元',
	                                url:'<%=path %>/select/queryDict?dictTypeId=JSJEDW',
						        	method:'get',	valueField:'dictid',
							        textField:'dictname',
							        panelHeight:'auto'"   />
                            </td> --%>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">主要条款描述</td>
                            <td colspan="5">
                                <input name="jtsgProjectandContract.zytkmsbz" class="easyui-textbox" data-options="multiline:true" enabled="false" style="width:100%;"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="6" style="background-color:#ECECFF"><font  style="font-weight:bold;" size="3" face="黑体">项目经理部联系信息</font>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">项目部经理</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.xmjl" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">项目部经理联系电话</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.xmjldh" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">总工</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.zg" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">总工联系电话</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.zglxdh" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">邮政编码</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.yzbm" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">办公司电话</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.bgsdh" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">项目详细通讯地址</td>
                            <td colspan="5">
                                <input name="jtsgProjectandContract.xmxxtxdz" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="6" style="background-color:#ECECFF"><font  style="font-weight:bold;" size="3" face="黑体">海外项目补充信息</font>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">项目所在地GPS坐标</td>
                            <td colspan="5">
                                <input name="jtsgProjectandContract.gpszb" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">设计采用规范（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.sjgf" class="easyui-combobox" enabled="false" style="width:100%;" 
                                data-options="prompt:'请输入对外签约品牌',required:true,
	                                url:'<%=path %>/select/queryDict?dictTypeId=sjgf',
						        	method:'get',	valueField:'dictid',
							        textField:'dictname',
							        panelHeight:'auto'" />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF;color:darkgrey" align="right">施工采用规范（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.sggf" class="easyui-combobox" enabled="false" style="width:100%;" 
                                data-options="prompt:'折合美元',
	                                url:'<%=path %>/select/queryDict?dictTypeId=sggf',
						        	method:'get',	valueField:'dictid',
							        textField:'dictname',
							        panelHeight:'auto'"   />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">项目合同语言（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.xmhtyy" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">项目交流语言（*）</td>
                            <td colspan="2">
                                <input name="jtsgProjectandContract.xmjlyy" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">预付款比例（*）</td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.yfkbl" class="easyui-textbox" data-options="required:true" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">%</td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">项目预付款（*）</td>
                            <td colspan="1">
                                <input name="jtsgProjectandContract.xmyfk" class="easyui-textbox" data-options="required:true" enabled="false" style="width:100%;"  />
                            </td>
                            <td colspan="1" style="background-color:#ECECFF" align="right">美元</td>
                        </tr>
                        <!-- <tr>
                            <td colspan="1" style="background-color:#ECECFF" align="right">合同文件中译本</td>
                            <td colspan="5">
                                <input name="jtsgProjectandContract.xmszd" class="easyui-textbox" enabled="false" style="width:100%;"  />
                            </td>
                        </tr> -->
                    </table>
            </from>
			</div>	
		</fieldset>
		</div>
        	   <div title="附表1合同变更信息" data-options="closable:false" style="overflow:auto;padding:20px;display:none;">   
                    <div style="width:100%; overflow:auto;">
                    <table id="contractChangeInfo" class="easyui-datagrid" style="width:95%;height:610px"
							data-options="
							iconCls: 'icon-edit',
							singleSelect: true,
							method:'get',
							rownumbers:true,
							fitColumns:true,
							toolbar:'#toolbar' ">
							<thead>
						<tr>
							<th data-options="field:'otherbidid',width:'auto',hidden:true"></th>
							<th data-options="field:'nrsj',width:'auto',editor:'textbox'">纳入系统管理时间</th>
							<th data-options="field:'bgrq',width:'auto',align:'right',editor:'textbox'">变更日期</th> 
							<th data-options="field:'yhte',width:'auto',align:'right',editor:'textbox'">原合同额</th>
							<th data-options="field:'bgzjhte',width:'auto',editor:'textbox'">变更增减合同额</th>
							<th data-options="field:'bgzhte',width:'auto',align:'center',editor:'textbox'">变更后总合同额</th>
							<th data-options="field:'zzzhte',width:'auto',align:'center',editor:'textbox'">其中：自主承担合同额</th>
							<th data-options="field:'bgzjzzcdhte',width:'auto',align:'center',editor:'textbox'">变更增减自主承担合同额</th>
							<th data-options="field:'bghzzhte',width:'auto',align:'center',editor:'textbox'">变更后自主承担合同额</th>
							<th data-options="field:'yhtgq',width:'auto',align:'center',editor:'textbox'">原合同工期</th>
							<th data-options="field:'bghhtgq',width:'auto',align:'center',editor:'textbox'">变更后合同工期</th>
							<th data-options="field:'zybgtk',width:'auto',align:'center',editor:'textbox'">主要变更条款</th>
							<th data-options="field:'bgyy',width:'auto',align:'center',editor:'textbox'">变更原因</th>
							<th data-options="field:'htbz',width:'auto',align:'center',editor:'textbox'">备注</th>
						</tr>
					</thead>
					</table>
    	</div>  
    </div>
</div>

</body>
</html>
