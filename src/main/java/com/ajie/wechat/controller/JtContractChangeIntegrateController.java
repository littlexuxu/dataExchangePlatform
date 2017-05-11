package com.ajie.wechat.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajie.wechat.util.KettleUtil;

@Controller
@RequestMapping(value = "/contractchange")
public class JtContractChangeIntegrateController {
	
	@RequestMapping(value = "/kettlestart/{grouptype}/{contractaudit}/{jtcontractid}",method = RequestMethod.GET)
	public @ResponseBody String contractChangeKettleStart(@PathVariable String grouptype,@PathVariable String contractaudit
			,@PathVariable String jtcontractid){
		//返回结果
		String resultstr = "1";//成功
		String jobpath = "";
		String jobpathcontractupdate = "";
		if(grouptype.equals("1")){//设计类基本信息
			jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sjcontractchangejobpath");
			//设计类合同信息更新
			jobpathcontractupdate = KettleUtil.getPropertiesByName("kettle_file.properties", "sjsyncjobpath_update");
		}else if(grouptype.equals("2")){//施工类基本型
			jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sgcontractchangejobpath");
			//施工类合同信息更新
			jobpathcontractupdate = KettleUtil.getPropertiesByName("kettle_file.properties", "sgsyncjobpath_update");
		}else if(grouptype.equals("4")){//其它类基本信息
			jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "qtcontractchangejobpath");
			//其他类合同信息更新
			jobpathcontractupdate = KettleUtil.getPropertiesByName("kettle_file.properties", "qtsyncjobpath_update");
		}
		//kettle执行
		System.out.println(jobpath);
		try {	
			//合同信息更新
			Map<String,String> paramapcontract = new HashMap<String,String>();
			paramapcontract.put("jtcontractid", jtcontractid);
			paramapcontract.put("contractaudit", contractaudit);
			paramapcontract.put("sendTime",KettleUtil.getDate());
			KettleUtil.runJob(jobpathcontractupdate, paramapcontract);
			//合同额变更
			Map<String,String> paramap = new HashMap<String,String>();
			paramap.put("contractaudit", contractaudit);
			paramap.put("jtcontractid", jtcontractid);
			paramap.put("sendTime",KettleUtil.getDate());
			KettleUtil.runJob(jobpath, paramap);			
		} catch (Exception e) {
			resultstr = "2";// 同步失败
			e.printStackTrace();
		}
		return resultstr;
	}
	
}
