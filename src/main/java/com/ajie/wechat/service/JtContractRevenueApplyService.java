package com.ajie.wechat.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ajie.wechat.dao.JtContractRevenueApplyDao;
import com.ajie.wechat.model.JtContractRevenueApply;
import com.ajie.wechat.util.JtConstant;

import cn.ccccltd.webservice.construction.monthreport.GhxmzxfdVO;
import cn.ccccltd.webservice.construction.monthreport.VoSupport;
import cn.ccccltd.webservice.design.monthreport.SjxmzxfdVO;
import cn.ccccltd.webservice.other.monthreport.QtxmzxVO;


@Service
@Transactional
public class JtContractRevenueApplyService {
	
	@Autowired
    private JtContractRevenueApplyDao jtcontractrevenueapplydao;
	
	/**
	 * 施工月报数据初始化
	 * @param vos
	 */
	public int sgMonthReportInit(List<VoSupport> vos,String jtrecid,int mainKey, String contractkey, String contractDeptId){
		int keyIndex = mainKey;
		if(vos != null && vos.size()>0){
			List<JtContractRevenueApply> list = new ArrayList<JtContractRevenueApply>();
			for (VoSupport vo : vos) {
				keyIndex = keyIndex + 1;
				JtContractRevenueApply jtrevenue = new JtContractRevenueApply();
				jtrevenue.setContractrevenueapplyid(keyIndex);
				GhxmzxfdVO ghvo = (GhxmzxfdVO) vo;
				jtrevenue.setJtrecid(ghvo.getRecid());
				jtrevenue.setContractid(contractkey);
				jtrevenue.setContractbelongdeptid(contractDeptId);
				// 施工月报字段映射
				//jtrevenue.setContractid(ghvo.getGhxmzx001001f());// 这是服务端合同ID，后面需要转换为contractid
				//月报类型
				jtrevenue.setJtdatatype(JtConstant.CONSTRUCTION_PROJECT_TYPE);
				//时间
				String jtDatatime = ghvo.getDatatime();
				jtrevenue.setApplyyear(jtDatatime.substring(0, 4));
				jtrevenue.setApplymonth(Integer.valueOf(jtDatatime.substring(jtDatatime.length()-2)).toString());
				
				// 集团月营业额
				jtrevenue.setJtrevenuemonth((numberChange(ghvo.getGhxmzx001009f())));
				// 集团年营业额
				jtrevenue.setJtrevenuetotalyear(numberChange(ghvo.getGhxmzx001010f()));
				// 集团累计营业额
				jtrevenue.setJtrevenuetotal(numberChange(ghvo.getGhxmzx001011f()));
				// 集团月产值
				jtrevenue.setJtoutputmonth(numberChange(ghvo.getGhxmzx001053f()));
				// 集团年产值
				jtrevenue.setJtoutputtotalyear(numberChange(ghvo.getGhxmzx001054f()));
				// 集团累计产值
				jtrevenue.setJtoutputtotal(numberChange(ghvo.getGhxmzx001055f()));
				// 集团月利润
				jtrevenue.setJtprofilemonth(numberChange(ghvo.getGhxmzx001016f()));
				// 集团年利润
				jtrevenue.setJtprofiletotalyear(numberChange(ghvo.getGhxmzx001036f()));
				// 集团累计利润
				jtrevenue.setJtprofiletotal(numberChange(ghvo.getGhxmzx001039f()));
				jtrevenue.setJthistorydata("1");
				list.add(jtrevenue);
			}
			//批量存储
			jtcontractrevenueapplydao.save(list);
		}
		return keyIndex;
	}
	
	/**
	 * 设计月报数据初始化
	 * @param vos
	 */
	public int sjMonthReportInit(List<cn.ccccltd.webservice.design.monthreport.VoSupport> vos,String jtrecid,int mainKey, String contractkey, String contractDeptId){
		int keyIndex = mainKey;
		if(vos != null && vos.size()>0){
			List<JtContractRevenueApply> list = new ArrayList<JtContractRevenueApply>();
			for (cn.ccccltd.webservice.design.monthreport.VoSupport vo : vos) {
				keyIndex = keyIndex + 1;
				JtContractRevenueApply jtrevenue = new JtContractRevenueApply();
				jtrevenue.setContractrevenueapplyid(keyIndex);
				SjxmzxfdVO sjvo = (SjxmzxfdVO) vo;
				jtrevenue.setJtrecid(sjvo.getRecid());
				jtrevenue.setContractid(contractkey);
				jtrevenue.setContractbelongdeptid(contractDeptId);
				// 施工月报字段映射
				//jtrevenue.setContractid(sjvo.getSjxmzx001001f());// 这是服务端合同ID，后面需要转换为contractid
				//月报类型
				jtrevenue.setJtdatatype(JtConstant.DESIGN_PROJECT_TYPE);
				//时间
				String jtDatatime = sjvo.getDatatime();
				jtrevenue.setApplyyear(jtDatatime.substring(0, 4));
				if ((jtDatatime.substring(jtDatatime.length()-2)).indexOf("0") > -1) {
					jtrevenue.setApplymonth(jtDatatime.substring(jtDatatime.length()-1));
				} else {
					jtrevenue.setApplymonth(jtDatatime.substring(jtDatatime.length()-2));
				}
				// 集团月营业额
				jtrevenue.setJtrevenuemonth(numberChange(sjvo.getSjxmzx001008f()));
				// 集团年营业额
				jtrevenue.setJtrevenuetotalyear(numberChange(sjvo.getSjxmzx001009f()));
				// 集团累计营业额
				jtrevenue.setJtrevenuetotal(numberChange(sjvo.getSjxmzx001010f()));
				// 集团月产值
				jtrevenue.setJtoutputmonth(numberChange(sjvo.getSjxmzx001049f()));
				// 集团年产值
				jtrevenue.setJtoutputtotalyear(numberChange(sjvo.getSjxmzx001050f()));
				// 集团累计产值
				jtrevenue.setJtoutputtotal(numberChange(sjvo.getSjxmzx001051f()));
				// 集团月利润
				jtrevenue.setJtprofilemonth(numberChange(sjvo.getSjxmzx001015f()));
				// 集团年利润
				jtrevenue.setJtprofiletotalyear(numberChange(sjvo.getSjxmzx001039f()));
				// 集团累计利润
				jtrevenue.setJtprofiletotal(numberChange(sjvo.getSjxmzx001040f()));
				jtrevenue.setJthistorydata("1");
				list.add(jtrevenue);
			}
			//批量存储
			jtcontractrevenueapplydao.save(list);
		}
		return keyIndex;
	}
	
	/**
	 * 其它月报数据初始化
	 * @param vos
	 */
	public int qtMonthReportInit(List<cn.ccccltd.webservice.other.monthreport.VoSupport> vos,String jtrecid,int mainKey, String contractkey, String contractDeptId){
		int keyIndex = mainKey;
		if(vos != null && vos.size()>0){
			List<JtContractRevenueApply> list = new ArrayList<JtContractRevenueApply>();
			for (cn.ccccltd.webservice.other.monthreport.VoSupport vo : vos) {
				keyIndex = keyIndex + 1;
				JtContractRevenueApply jtrevenue = new JtContractRevenueApply();
				jtrevenue.setContractrevenueapplyid(keyIndex);
				QtxmzxVO qtvo = (QtxmzxVO) vo;
				jtrevenue.setJtrecid(qtvo.getRecid());
				jtrevenue.setContractid(contractkey);
				jtrevenue.setContractbelongdeptid(contractDeptId);
				// 施工月报字段映射
				//jtrevenue.setContractid(qtvo.getQtxmzx001076f());// 这是服务端合同ID，后面需要转换为contractid
				//月报类型
				jtrevenue.setJtdatatype(JtConstant.OTHER_PROJECT_TYPE);
				//时间
				String jtDatatime = qtvo.getDatatime();
				jtrevenue.setApplyyear(jtDatatime.substring(0, 4));
				if ((jtDatatime.substring(jtDatatime.length()-2)).indexOf("0") > -1) {
					jtrevenue.setApplymonth(jtDatatime.substring(jtDatatime.length()-1));
				} else {
					jtrevenue.setApplymonth(jtDatatime.substring(jtDatatime.length()-2));
				}
				// 集团月营业额
				jtrevenue.setJtrevenuemonth(numberChange(qtvo.getQtxmzx001009f()));
				// 集团年营业额
				jtrevenue.setJtrevenuetotalyear(numberChange(qtvo.getQtxmzx001010f()));
				// 集团累计营业额
				jtrevenue.setJtrevenuetotal(numberChange(qtvo.getQtxmzx001011f()));
				// 集团月产值
				jtrevenue.setJtoutputmonth(numberChange(qtvo.getQtxmzx001053f()));
				// 集团年产值
				jtrevenue.setJtoutputtotalyear(numberChange(qtvo.getQtxmzx001054f()));
				// 集团累计产值
				jtrevenue.setJtoutputtotal(numberChange(qtvo.getQtxmzx001055f()));
				// 集团月利润
				jtrevenue.setJtprofilemonth(numberChange(qtvo.getQtxmzx001016f()));
				// 集团年利润
				jtrevenue.setJtprofiletotalyear(numberChange(qtvo.getQtxmzx001036f()));
				// 集团累计利润
				jtrevenue.setJtprofiletotal(numberChange(qtvo.getQtxmzx001039f()));
				jtrevenue.setJthistorydata("1");
				list.add(jtrevenue);
			}
			//批量存储
			jtcontractrevenueapplydao.save(list);
		}
		return keyIndex;
	}
	
	/**
	 * 金额除以10000
	 * @param num
	 * @return
	 */
	private String numberChange(double num){
		BigDecimal numdec = new BigDecimal(num);
		BigDecimal divnum = new BigDecimal(10000);
		BigDecimal resultnum = numdec.divide(divnum).setScale(6,BigDecimal.ROUND_DOWN);
		return resultnum.toString();
	}
}
