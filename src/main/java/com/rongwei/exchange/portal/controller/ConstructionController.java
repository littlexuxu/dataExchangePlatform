package com.rongwei.exchange.portal.controller;

import java.util.HashMap;
import java.util.List;
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

import com.ajie.wechat.dao.JtOtherCompanyBidDao;
import com.ajie.wechat.model.JtOtherCompanyBid;
import com.ajie.wechat.util.JtConstant;
import com.ajie.wechat.util.PageQuery;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rongwei.exchange.portal.dao.BaseDao;
import com.rongwei.exchange.portal.model.SgProjectBase;
import com.rongwei.exchange.portal.model.SgProjectTrack;
import com.rongwei.exchange.portal.service.ConstructionService;

@Controller
@RequestMapping(value = "/construction")
public class ConstructionController {

	private final Log logger = LogFactory.getLog(ConstructionController.class);

	@Autowired
	private ConstructionService constructionService;
	
	@Autowired
	private JtOtherCompanyBidDao otherCompandyBidService;
	

	/** 跳转至施工项目列表页 */
	@RequestMapping(value = "/listConstructionBaseProject", method = RequestMethod.GET)
	public String ConstructionMarketIndexPage(Model model) {
		return "construction/ConstructionMarketList";
	}


	/** 跳转至施工项目维护页 */
	@RequestMapping(value = "/updateConstructionBaseProject", method = RequestMethod.GET)
	public String ConstructionMarketFormPage(Model model) throws Exception {
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

	@RequestMapping(value = "/getConstructionProjectBase", produces = "text/html;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public String getConstructionProjectBase(HttpServletRequest request) throws Exception {
		String sgId = request.getParameter("id");
		SgProjectBase sgProjectBase = constructionService.getSgProjectBaseById(Integer.valueOf(sgId));
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonBase = objectMapper.writeValueAsString(sgProjectBase);
		return jsonBase;
	}

	/**
	 * 保存施工项目基本信息、市场信息
	 * 
	 * @param sgbase
	 * @param sgtrack
	 * @return returnMsg:Success/Failure
	 */
	@RequestMapping(value = "/deleteConstructionProjectBase", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> deleteConstructionProjectBase(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		String sgId = request.getParameter("id");
		try {
			constructionService.deleteSgProjectBase(sgId);
			map.put("returnMsg", JtConstant.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			map.put("returnMsg", JtConstant.FAILURE);
		}
		return map;
	}
	
	@RequestMapping(value = "/getConstructionProjectTrack", produces = "text/html;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public String getConstructionProjectTrack(HttpServletRequest request) throws Exception{
		return constructionService.getSgProjectTrackById(request.getParameter("id"));
	}

	/**
	 * 
	 * @param sgbase
	 * @param sgtrack
	 * @return
	 */
	@RequestMapping(value = "/saveConstructionBaseAndTrack", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> saveConstructionBaseAndTrack(String sgbase, String sgtrack,String otherbids) {
		Map<String, Object> map = new HashMap<String, Object>();
		ObjectMapper mapper = new ObjectMapper();
		try {
			SgProjectBase sgProjectBase = mapper.readValue(sgbase, SgProjectBase.class);
			SgProjectTrack sgProjectTrack = mapper.readValue(sgtrack, SgProjectTrack.class);
			List<JtOtherCompanyBid> list = mapper.readValue(otherbids, new TypeReference<List<JtOtherCompanyBid>>() {
			});
			SgProjectBase sgProjectBase1 = constructionService.saveSgProjectBase(sgProjectBase);
			sgProjectTrack.setBaserecid(sgProjectBase1.getSgbaseid());
			
			for (JtOtherCompanyBid jtOtherCompanyBid : list) {
				jtOtherCompanyBid.setBaserecid(sgProjectBase1.getSgbaseid());
			}
			otherCompandyBidService.save(list);
			constructionService.saveSgProjectTrack(sgProjectTrack);

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
	
	@ResponseBody
	@RequestMapping(value = "/getJtOtherCompnayBids",produces = "text/html;charset=UTF-8", method = RequestMethod.POST)
	public String getJtOtherCompnayBids(HttpServletRequest request) throws Exception{
		return constructionService.getJtOtherCompnayBidById(request.getParameter("id"));
	}

	/**
	 * 查询施工项目合同列表
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/queryConstructionContrackProjectList")
	public @ResponseBody String getConstructionContractList(HttpServletRequest request) {
		StringBuffer sb = new StringBuffer("{\"total\":");
		try {
			String queryParam = request.getParameter("params");
			System.out.println("参数：" + queryParam);
			PageQuery pagequery = new PageQuery();
			pagequery.setPageIndex(Integer.valueOf(request.getParameter("page")));
			pagequery.setPageSize(Integer.valueOf(request.getParameter("rows")));
			String SgProjectBases = constructionService.getSgProjectContractList(queryParam, pagequery);
			Long total = constructionService.getSgProjectContractCount(queryParam);
			sb.append(total).append(",\"rows\":").append(SgProjectBases).append("}");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

}
