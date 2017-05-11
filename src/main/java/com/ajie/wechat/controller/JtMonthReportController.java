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
@RequestMapping(value = "/monthreport")
public class JtMonthReportController {
	
	@RequestMapping(value = "/monthreportkettle/{grouptype}/{jtcontractid}/{applyYear}/{applyMonth}/{actiontype}",method = RequestMethod.GET)
	public @ResponseBody String monthReportKettleIntegrate(@PathVariable String grouptype,@PathVariable String jtcontractid,@PathVariable String applyYear,
			@PathVariable String applyMonth,@PathVariable String actiontype){
		//返回结果
		String resultstr = "1";
		String jobpath = "";
		//集团数据同步，kettle调用
		if(grouptype.equals("1")){//设计类月报
			if("add".equals(actiontype)){//增加
				jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sjsyncmonthreportjobpath_add");
			}else{//更新
				jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sjsyncmonthreportjobpath_update");
			}
		}else if(grouptype.equals("2")){//施工类月报
			if("add".equals(actiontype)){//增加
				jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sgsyncmonthreportjobpath_add");
			}else{//更新
				jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sgsyncmonthreportjobpath_update");
			}
		}else if(grouptype.equals("4")){//其它类月报
			if("add".equals(actiontype)){//增加
				jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "qtsyncmonthreportjobpath_add");
			}else{//更新
				jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "qtsyncmonthreportjobpath_update");
			}
		}
		
		//kettle执行的参数
		try {			
			Map<String,String> paramap = new HashMap<String,String>();
			paramap.put("jtcontractid", jtcontractid);
			paramap.put("applyYear", applyYear);
			paramap.put("applyMonth", applyMonth);
			paramap.put("sendTime",KettleUtil.getDate());
			KettleUtil.runJob(jobpath, paramap);
		} catch (Exception e) {
			resultstr = "2";
			e.printStackTrace();
		}
		return resultstr;
	}
	
}
