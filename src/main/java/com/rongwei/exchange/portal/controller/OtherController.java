package com.rongwei.exchange.portal.controller;


import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajie.wechat.util.PageQuery;
import com.rongwei.exchange.portal.service.OtherService;

@Controller
@RequestMapping(value = "/other")
public class OtherController {

	private final Log logger = LogFactory.getLog(OtherController.class);

	@Autowired
	private OtherService otherService;

	/** 跳转至其他项目列表页 */
	@RequestMapping(value = "/listotherBaseProject", method = RequestMethod.GET)
	public String otherMarketIndexPage(Model model) {
		return "other/OtherContractList";
	}

	/** 跳转至其他项目维护页 */
	@RequestMapping(value = "/updateOtherBaseProject", method = RequestMethod.GET)
	public String OtherMarketFormPage(Model model) {
		return "other/OtherMarketForm";
	}

	/** 跳转至其他合同变更列表页 */
	@RequestMapping(value = "/listOtherContract", method = RequestMethod.GET)
	public String OtherContractIndexPage(Model model) {
		return "other/OtherMarketList";
	}

	/** 跳转至其他合同变更维护页 */
	@RequestMapping(value = "/updateOtherContract", method = RequestMethod.GET)
	public String OtherContractFormPage(Model model) {
		return "other/OtherChangeForm";
	}

	@RequestMapping(value = "/queryOtherBaseProjectList")
	public @ResponseBody String getOtherBaseProjectList(HttpServletRequest request) {
		StringBuffer sb = new StringBuffer("{\"total\":");
		try {
			String queryParam = request.getParameter("params");
			System.out.println("参数：" + queryParam);
			PageQuery pagequery = new PageQuery();
			pagequery.setPageIndex(Integer.valueOf(request.getParameter("page")));
			pagequery.setPageSize(Integer.valueOf(request.getParameter("rows")));
			String QtProjectBases = otherService.getQtProjectBaseList(queryParam, pagequery);
			Long total = otherService.getQtProjectBaseCount(queryParam);
			sb.append(total).append(",\"rows\":").append(QtProjectBases).append("}");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

}
