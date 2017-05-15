<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String pathEasyUI = request.getContextPath();
%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>主页面</title>
    <%@include file="/resources/common_lib.jsp"%>
    <link rel="stylesheet" type="text/css" href="<%=path %>/resources/zTree_v3-master/css/zTreeStyle/zTreeStyle.css">
    <script type="text/javascript" src="<%=path %>/resources/zTree_v3-master/js/jquery.ztree.core.min.js"></script>

	<SCRIPT type="text/javascript">
		var curMenu = null, zTree_Menu = null;
		var setting = {
			view: {
				showLine: false,
				showIcon: false,
				selectedMulti: false,
				dblClickExpand: false,
				addDiyDom: addDiyDom
			},
			data: {
				simpleData: {
					enable: true
				}
			},
			callback: {
				beforeClick: beforeClick,
				onClick: onClick
			}
		};

		var zNodes =[
			{ id:1, pId:0, name:"施工数据管理"},
			{ id:11, pId:1, name:"项目及市场信息", path:"/construction/listConstructionBaseProject"},
			{ id:12, pId:1, name:"项目及合同信息"},
			{ id:13, pId:1, name:"合同变更信息"},
			{ id:14, pId:1, name:"执行月报"},
			{ id:2, pId:0, name:"设计数据管理"},
			{ id:21, pId:2, name:"项目及市场信息",path:"/design/listDesignBaseProject"},
			{ id:22, pId:2, name:"项目及合同信息",path:"/design/listDesignMarListMain"},
			{ id:23, pId:2, name:"合同变更信息", path:"/design/listDesignContractChange"},
			{ id:24, pId:2, name:"执行月报"},
			{ id:3, pId:0, name:"其它数据管理"},
			{ id:31, pId:3, name:"项目及合同信息", path:"/other/listotherBaseProject"},
			{ id:32, pId:3, name:"合同变更信息", path:"/other/listOtherContract"},
			{ id:33, pId:3, name:"执行月报"},
			{ id:4, pId:0, name:"公共数据管理"},
			{ id:41, pId:4, name:"组织机构管理"},
			{ id:42, pId:4, name:"数据字典管理"},
			{ id:5, pId:0, name:"系统管理"},
			{ id:51, pId:5, name:"组织机构配置"},
			{ id:52, pId:5, name:"角色配置"}
		];

		function addDiyDom(treeId, treeNode) {
			var spaceWidth = 5;
			var switchObj = $("#" + treeNode.tId + "_switch"),
			icoObj = $("#" + treeNode.tId + "_ico");
			switchObj.remove();
			icoObj.before(switchObj);

			if (treeNode.level > 1) {
				var spaceStr = "<span style='display: inline-block;width:" + (spaceWidth * treeNode.level)+ "px'></span>";
				switchObj.before(spaceStr);
			}
		}

		function beforeClick(treeId, treeNode) {
			if (treeNode.level == 0 ) {
				var zTree = $.fn.zTree.getZTreeObj("treeDemo");
				zTree.expandNode(treeNode);
				return false;
			}
			return true;
		}
		
		function onClick(event, treeId, treeNode, clickFlag) {
			console.log(event);
			console.log(treeId);
			console.log(treeNode);
			document.getElementById("ifm").src='<%=path %>' + treeNode.path;
			console.log(clickFlag);
		}

		$(document).ready(function(){
			var treeObj = $("#treeDemo");
			$.fn.zTree.init(treeObj, setting, zNodes);
			zTree_Menu = $.fn.zTree.getZTreeObj("treeDemo");
			
			treeObj.hover(function () {
				if (!treeObj.hasClass("showIcon")) {
					treeObj.addClass("showIcon");
				}
			}, function() {
				treeObj.removeClass("showIcon");
			});
		});
	</SCRIPT>
	<style type="text/css">
.ztree * {font-size: 10pt;font-family:"Microsoft Yahei",Verdana,Simsun,"Segoe UI Web Light","Segoe UI Light","Segoe UI Web Regular","Segoe UI","Segoe UI Symbol","Helvetica Neue",Arial}
.ztree li ul{ margin:0; padding:0}
.ztree li {line-height:30px;}
.ztree li a {/*width:200px*/;height:30px;padding-top: 0px;}
.ztree li a:hover {text-decoration:none; background-color: #E7E7E7;}
.ztree li a span.button.switch {visibility:hidden}
.ztree.showIcon li a span.button.switch {visibility:visible}
.ztree li a.curSelectedNode {background-color:#D4D4D4;border:0;height:30px;}
.ztree li span {line-height:30px;}
.ztree li span.button {margin-top: -7px;}
.ztree li span.button.switch {width: 16px;height: 16px;}

.ztree li a.level0 span {font-size: 150%;font-weight: bold;}
.ztree li span.button {background-image:url("<%=path %>/resources/zTree_v3-master/demo/cn/super/left_menuForOutLook.png"); *background-image:url("<%=path %>/resources/zTree_v3-master/demo/cn/super/left_menuForOutLook.gif")}
.ztree li span.button.switch.level0 {width: 20px; height:20px}
.ztree li span.button.switch.level1 {width: 20px; height:20px}
.ztree li span.button.noline_open {background-position: 0 0;}
.ztree li span.button.noline_close {background-position: -18px 0;}
.ztree li span.button.noline_open.level0 {background-position: 0 -18px;}
.ztree li span.button.noline_close.level0 {background-position: -18px -18px;}
	</style>

</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:false" style="height:60px;background:#B3DFDA;padding:10px">
		页眉
	</div>
	<div data-options="region:'west',split:true,title:'功能列表'" style="width:190px;padding:0px;">
			<ul id="treeDemo" class="ztree"></ul>
	</div>
	<div data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px;">页脚</div>
	<div data-options="region:'center',title:'Center'">
	    <iframe frameborder="0" id="ifm" style="width:100%;height:100%;" src=""></iframe>
	</div>
	<SCRIPT type="text/javascript">
		
	</SCRIPT>
	<style type="text/css">
		
	</style>
</body>
</html>