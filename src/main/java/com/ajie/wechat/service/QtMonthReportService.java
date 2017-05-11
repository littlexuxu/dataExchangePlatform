package com.ajie.wechat.service;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ccccltd.webservice.construction.contract.GhxmjhtVO;
import cn.ccccltd.webservice.construction.monthreport.ScghybVO;
import cn.ccccltd.webservice.other.monthreport.QtxmzxVO;
import cn.ccccltd.webservice.other.monthreport.QtxmzxWs;
import cn.ccccltd.webservice.other.monthreport.ReturnMessage;
import cn.ccccltd.webservice.other.monthreport.ScqtybVO;
import cn.ccccltd.webservice.other.projectbaseinfo.QtlxmVO;
import net.sf.json.JSONObject;

import com.ajie.wechat.dao.CommonDao;

@Service
@Transactional
public class QtMonthReportService {
	
	@Autowired
    private CommonDao commondao;
	
	/**
	 * 设计月报信息接口同步
	 */
	public String qtMonthReportIntegrate(String recid,String actiontype,ApplicationContext ctx){
		String sql = "select * from jt_qt_monthreport where qtmonthreportid = '"+recid+"'";
		List<QtxmzxVO> qtmonthreport = (List<QtxmzxVO>) commondao.queryListEntity(sql, null, QtxmzxVO.class);
		List<ScqtybVO> scqtybVOs = (List<ScqtybVO>) commondao.queryListEntity(sql, null, ScqtybVO.class);
		
		QtxmzxWs  client = (QtxmzxWs)ctx.getBean("qtmonthreportclient");
		ReturnMessage returnmessage = null;
		if("add".equals(actiontype)){
			if(qtmonthreport != null && qtmonthreport.size()>0){
				QtxmzxVO monthReportInfo = qtmonthreport.get(0);
				if(scqtybVOs != null && scqtybVOs.size()>0){
					ScqtybVO scqtybVO = scqtybVOs.get(0);
					//服务端合同ID
//					String htsql = "select * from jt_qt_projectandcontract where cxmid="+scqtybVO.getChtid();
//					List<QtlxmVO> sjvos = (List<QtlxmVO>)commondao.queryListEntity(htsql, null, QtlxmVO.class);
//					if(sjvos != null && sjvos.size()>0){
//						scqtybVO.setHtid(sjvos.get(0).getRecid());
//					}
					scqtybVO.setHtid(monthReportInfo.getQtxmzx001076f());
					monthReportInfo.setScqtyb(scqtybVO);
				}
				returnmessage = client.addMonthReport(monthReportInfo);
			}
		}else if("update".equals(actiontype)){
			if(qtmonthreport != null && qtmonthreport.size()>0){
				QtxmzxVO monthReportInfo = qtmonthreport.get(0);
				if(scqtybVOs != null && scqtybVOs.size()>0){
					ScqtybVO scqtybVO = scqtybVOs.get(0);
					//服务端合同ID
//					String htsql = "select * from jt_qt_projectandcontract where cxmid="+scqtybVO.getChtid();
//					List<QtlxmVO> sjvos = (List<QtlxmVO>)commondao.queryListEntity(htsql, null, QtlxmVO.class);
//					if(sjvos != null && sjvos.size()>0){
//						scqtybVO.setHtid(sjvos.get(0).getRecid());
//						scqtybVO.setYbid(monthReportInfo.getRecid());
//					}
					scqtybVO.setHtid(monthReportInfo.getQtxmzx001076f());
					scqtybVO.setYbid(monthReportInfo.getRecid());
					monthReportInfo.setScqtyb(scqtybVO);
				}
				returnmessage = client.updateMonthReport(monthReportInfo);
			}
		}
		//得到的对象 存到返回数据里面 用于存到日志表
        returnmessage.setReturnInitData(qtmonthreport);
        System.out.println("message:"+returnmessage.getMessage());
        System.out.println("statuscod:"+returnmessage.getStatusCode());
        System.out.println("resultlist:"+returnmessage.getResultList());
        JSONObject jsonObject = JSONObject.fromObject(returnmessage);
		String resultstr = "";
        try {
        	resultstr = URLEncoder.encode(jsonObject.toString(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        return resultstr;
	}
}
