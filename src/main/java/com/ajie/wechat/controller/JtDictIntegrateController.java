package com.ajie.wechat.controller;

import java.util.HashMap;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajie.wechat.dao.CommonDao;
import com.ajie.wechat.service.JtDictService;
import com.ajie.wechat.util.KettleUtil;

import cn.ccccltd.webservice.dict.ReturnMessage;
import cn.ccccltd.webservice.dict.ViewDictonaryWs;

@Controller
@RequestMapping(value = "/dict")
public class JtDictIntegrateController {
	
	private final Log logger = LogFactory.getLog(JtContractIntegrateController.class);
	
	@Autowired
	private JtDictService jtdictservice;
	
	@RequestMapping(value = "/getdict/{dictType}",method = RequestMethod.GET)
	public @ResponseBody String getDict(@PathVariable String dictType){
		logger.info("数据字典同步开始...");
		String resultstr = "2";
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:cxf-Security.xml");
		ViewDictonaryWs dictws = (ViewDictonaryWs)ctx.getBean("dictclient");
		
		Client client = ClientProxy.getClient(dictws);      
		HTTPConduit http = (HTTPConduit) client.getConduit();      
		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();      
		httpClientPolicy.setConnectionTimeout(1800000);      
		httpClientPolicy.setAllowChunking(false);      
		httpClientPolicy.setReceiveTimeout(1800000);      
		http.setClient(httpClientPolicy); 
		
//		((BindingProvider) dictws).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,serviceUrl); 
		
		ReturnMessage returnmessage = null;
		returnmessage = dictws.getDict(null, null, dictType);
		logger.info("数据字典同步开始...");
		//清除所有数据
		jtdictservice.deleteAll();
		//数据字典录入
		jtdictservice.getDict(returnmessage.getResultList());
		//kettle调用
		String jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "dictjobpath");
		//kettle执行
		try {
			Map<String, String> paramap = new HashMap<String, String>();
			paramap.put("sendTime",KettleUtil.getDate());
			KettleUtil.runTrans(jobpath, paramap);
			resultstr = "1";
		} catch (Exception e) {
			resultstr = "2";// 同步失败
			logger.error(e.getLocalizedMessage());
		}
		return resultstr;
	}
	
}
