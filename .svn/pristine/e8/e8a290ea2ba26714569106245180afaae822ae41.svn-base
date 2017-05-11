package com.ajie.wechat.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajie.wechat.service.JtContractRevenueApplyService;
import com.ajie.wechat.util.JtConstant;
import com.ajie.wechat.util.KettleUtil;

import cn.ccccltd.webservice.construction.monthreport.GhxmzxfdWs;
import cn.ccccltd.webservice.construction.monthreport.ReturnMessage;
import cn.ccccltd.webservice.design.monthreport.SjxmzxfdWs;
import cn.ccccltd.webservice.other.monthreport.QtxmzxWs;

@Controller
@RequestMapping(value = "/revenue")
public class JtContractRevenueApplyController {
	
	private final Log logger = LogFactory.getLog(JtContractIntegrateController.class);
	
	@Autowired
	private JtContractRevenueApplyService jtcontractrevenueapplyservice;
	
	/**
	 * 产值数据初始化
	 * @param zzjg
	 * @param datatime	如果值为0时表示初始化组织机构的所有产值
	 * @param contractrevunueapplyid
	 * @return
	 */
	@RequestMapping(value = "/revenueinit/{zzjg}/{jtRevenueId}/{contractkey}/{jtContractId}/{grouptype}/{contractrevunueapplyid}/{contractDeptId}",method = RequestMethod.GET)
	public @ResponseBody String contractRevenueInit(@PathVariable String zzjg,@PathVariable String jtRevenueId,@PathVariable String contractkey
			,@PathVariable String jtContractId,@PathVariable String grouptype,@PathVariable String contractrevunueapplyid
			,@PathVariable String contractDeptId){
		
		//加密认证配置化xml加载
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:cxf-Security.xml");
		//初始化返回值为2 同步失败
		String renturnstr = "2";
		try {
			//组织机构不能为空
			if(zzjg == null || "null".equals(zzjg)){
				zzjg = "";
			}
			if (jtRevenueId == null || "null".equals(jtRevenueId) || "0".equals(jtRevenueId)) {
				jtRevenueId = "";
			}
			if (jtContractId == null || "null".equals(jtContractId) || "0".equals(jtContractId)) {
				jtContractId = "";
			}
			if (contractDeptId == null || "null".equals(contractDeptId) || "0".equals(contractDeptId)) {
				contractDeptId = "";
			}
			int mainKey = Integer.valueOf(contractrevunueapplyid);
			if(JtConstant.DESIGN_PROJECT_TYPE.equals(grouptype)){//设计
				//设计月报产值初始化
				cn.ccccltd.webservice.design.monthreport.ReturnMessage sjmess = null;
				SjxmzxfdWs sjxm = (SjxmzxfdWs)ctx.getBean("sjmonthreportclient");
				sjmess = sjxm.queryMonthReportById(zzjg, jtRevenueId, jtContractId);
				System.out.println(sjmess.getMessage());
				//设计月报产值保存
				mainKey = jtcontractrevenueapplyservice.sjMonthReportInit(sjmess.getResultList(),jtRevenueId, mainKey, contractkey, contractDeptId);
			}
			if(JtConstant.CONSTRUCTION_PROJECT_TYPE.equals(grouptype)){//施工
				//施工月报产值初始化
				ReturnMessage sgmess = null;
				GhxmzxfdWs ghxm = (GhxmzxfdWs)ctx.getBean("sgmonthreportclient");
				sgmess = ghxm.queryMonthReportById(zzjg, jtRevenueId, jtContractId);
				//施工月报产值保存
				System.out.println(sgmess.getMessage());
				mainKey = jtcontractrevenueapplyservice.sgMonthReportInit(sgmess.getResultList(),jtRevenueId, mainKey, contractkey, contractDeptId);
			}
			if(JtConstant.OTHER_PROJECT_TYPE.equals(grouptype)){//其它
				//其它月报产值初始化
				cn.ccccltd.webservice.other.monthreport.ReturnMessage qtmess = null;
				QtxmzxWs qtxm = (QtxmzxWs)ctx.getBean("qtmonthreportclient");
				qtmess = qtxm.queryMonthReportById(zzjg, jtRevenueId, jtContractId);
				System.out.println(qtmess.getMessage());
				//其它月报产值保存
				mainKey = jtcontractrevenueapplyservice.qtMonthReportInit(qtmess.getResultList(),jtRevenueId, mainKey, contractkey, contractDeptId);
			}
			//产值数据保存到生产经营
			//kettle调用
			String jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "monthreportquery");
			//kettle执行
			Map<String, String> paramap = new HashMap<String, String>();
			paramap.put("minKey",contractrevunueapplyid);
			paramap.put("maxKey",mainKey + "");
			System.out.println("本次传输主键范围：" + contractrevunueapplyid + "至" + mainKey);
			paramap.put("sendTime",KettleUtil.getDate());
			KettleUtil.runJob(jobpath, paramap);
			renturnstr = "1," + mainKey;
			if (contractrevunueapplyid.equals(Integer.valueOf(mainKey).toString())) {
				renturnstr = "group_output_is_null";
			}
		} catch (Exception e) {
			renturnstr = "2," + e.getMessage();// 同步失败
			logger.error(e.getMessage());
		}
		return renturnstr;
	}
	
}
