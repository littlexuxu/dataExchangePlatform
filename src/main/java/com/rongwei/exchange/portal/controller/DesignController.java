package com.rongwei.exchange.portal.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajie.wechat.util.JtConstant;
import com.ajie.wechat.util.PageQuery;
import com.rongwei.exchange.portal.model.SgProjectBase;
import com.rongwei.exchange.portal.service.ConstructionService;

@Controller
@RequestMapping(value = "/design")
public class DesignController {

	private final Log logger = LogFactory.getLog(ConstructionController.class);

	@Autowired
	private ConstructionService constructionService;

	/** 跳转至施工项目列表页 */
	@RequestMapping(value = "/listConstructionBaseProject", method = RequestMethod.GET)
	public String ConstructionMarketIndexPage(Model model) {
		return "construction/ConstructionMarketList";
	}

	/** 跳转至施工项目维护页 */
	@RequestMapping(value = "/updateConstructionBaseProject", method = RequestMethod.GET)
	public String ConstructionMarketFormPage(Model model) {
		return "construction/ConstructionMarketForm";
	}

	/** 跳转至施工合同列表页 */
	@RequestMapping(value = "/listConstructionContract", method = RequestMethod.GET)
	public String ConstructionContractIndexPage(Model model) {
		return "construction/ConstructionContractList";
	}

	/** 跳转至施工合同维护页 */
	@RequestMapping(value = "/updateConstructionContract", method = RequestMethod.GET)
	public String ConstructionContractFormPage(Model model) {
		return "construction/ConstructionContractForm";
	}

	/**
	 * 施工项目保存
	 * 
	 * @param sgProjectBase
	 * @return
	 */
	@RequestMapping(value = "/saveConstructionBaseProject", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> saveConstructionBaseProject(SgProjectBase sgProjectBase) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			constructionService.saveSgProjectBase(sgProjectBase);
			map.put("returnMsg", JtConstant.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			map.put("returnMsg", JtConstant.FAILURE);
		}
		return map;
	}

	/**
	 * 查询施工项目列表
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/queryConstructionBaseProjectList")
	public @ResponseBody String getConstructionBaseProjectList(HttpServletRequest request) {
		StringBuffer sb = new StringBuffer("{\"total\":");
		try {
			String queryParam = request.getParameter("params");
			System.out.println("参数：" + queryParam);
			PageQuery pagequery = new PageQuery();
			pagequery.setPageIndex(Integer.valueOf(request.getParameter("page")));
			pagequery.setPageSize(Integer.valueOf(request.getParameter("rows")));
			String SgProjectBases = constructionService.getSgProjectBaseList(queryParam, pagequery);
			Long total = constructionService.getSgProjectBaseCount(queryParam);
			sb.append(total).append(",\"rows\":").append(SgProjectBases).append("}");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public @ResponseBody Map<String, Object> getConstructionContractList(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			String queryParam = request.getParameter("params");
			System.out.println("参数：" + queryParam);
			PageQuery pagequery = new PageQuery();
			pagequery.setPageIndex(Integer.valueOf(request.getParameter("page")));
			pagequery.setPageSize(Integer.valueOf(request.getParameter("rows")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

}
