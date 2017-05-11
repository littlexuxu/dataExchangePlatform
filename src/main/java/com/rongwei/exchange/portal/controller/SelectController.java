package com.rongwei.exchange.portal.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajie.wechat.model.JtDict;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rongwei.exchange.portal.model.TreeObject;
import com.rongwei.exchange.portal.service.SelectService;
import com.rongwei.exchange.portal.utils.TreeUtils;

@Controller
@RequestMapping(value = "/select")
public class SelectController {
	
	private final Log logger = LogFactory.getLog(SelectController.class);

	@Autowired
	private SelectService selectService;
	
	@RequestMapping(value = "/queryDict")
	public @ResponseBody List<JtDict> queryDict(HttpServletRequest request){
		List<JtDict> dicts = new ArrayList<JtDict>();
		String dictTypeId = request.getParameter("dictTypeId");
		String parentId = request.getParameter("parentId");
		String filters = request.getParameter("filters");
		String operator = request.getParameter("operator");
		try {
			if (StringUtils.isBlank(dictTypeId)) {
				throw new Exception("dictTypeId 不能为空！！！");
			}
			if (!(StringUtils.isBlank(filters)) && !(StringUtils.isBlank(operator))) {
				dicts = selectService.queryDictInOrNotInFilter(dictTypeId, parentId, filters, operator);
			} else {
				dicts = selectService.queryDict(dictTypeId, parentId);
			}
			return dicts;
		} catch (Exception e) {
			logger.error("Class:SelectController,Method:queryDict,Params:");
			logger.error("dictTypeId:" + dictTypeId);
			logger.error("parentId:" + parentId);
			logger.error("filters:" + filters);
			logger.error("operator:" + operator);
			logger.error(e.getMessage());
		}
		return dicts;
	}
	
	@RequestMapping(value = "/queryDictTree")
	public @ResponseBody String queryDictTree(HttpServletRequest request){
		List<JtDict> dicts = new ArrayList<JtDict>();
		String dictTypeId = request.getParameter("dictTypeId");
		String parentId = request.getParameter("parentId");
		String filters = request.getParameter("filters");
		String operator = request.getParameter("operator");
		try {
			if (StringUtils.isBlank(dictTypeId)) {
				throw new Exception("dictTypeId 不能为空！！！");
			}
			if (!(StringUtils.isBlank(filters)) && !(StringUtils.isBlank(operator))) {
				dicts = selectService.queryDictInOrNotInFilter(dictTypeId, parentId, filters, operator);
			} else {
				dicts = selectService.queryDict(dictTypeId, parentId);
			}
			TreeUtils treeUtil = new TreeUtils();
			List<TreeObject> dictTree = treeUtil.getDictSelectTree(dicts);
			ObjectMapper objectMapper = new ObjectMapper();
			String listStr = objectMapper.writeValueAsString(dictTree);
			listStr = listStr.replaceAll(",\"state\":null", "");
			listStr = listStr.replaceAll(",\"children\":null", "");
			listStr = listStr.replaceAll(",\"children\":\\[\\]", "");
			listStr = listStr.replaceAll(",\"state\":\"closed\"}", "}");
			
			if (listStr.indexOf("吹填造地及陆域形成工程") > -1) {
				System.err.println(listStr);
			}
			return listStr;
		} catch (Exception e) {
			logger.error("Class:SelectController,Method:queryDict,Params:");
			logger.error("dictTypeId:" + dictTypeId);
			logger.error("parentId:" + parentId);
			logger.error("filters:" + filters);
			logger.error("operator:" + operator);
			logger.error(e.getMessage());
		}
		return null;
	}
	
}
