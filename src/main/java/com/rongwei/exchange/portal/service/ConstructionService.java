package com.rongwei.exchange.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ajie.wechat.util.PageQuery;
import com.rongwei.exchange.portal.dao.BaseDao;
import com.rongwei.exchange.portal.dao.ConstructionDao;
import com.rongwei.exchange.portal.dao.SgProjectContractDao;
import com.rongwei.exchange.portal.dao.SgProjectTrackDao;
import com.rongwei.exchange.portal.model.JtSgProjectBase;
import com.rongwei.exchange.portal.model.JtSgProjectContract;
import com.rongwei.exchange.portal.model.JtSgProjectTrack;
import com.rongwei.exchange.portal.utils.QueryUtils;

@Service
@Transactional
public class ConstructionService {

	@Autowired
	private ConstructionDao constructionDao;
	
	@Autowired
	private SgProjectTrackDao projectTrackDao;
	
	@Autowired
	private SgProjectContractDao projectContractDao;
	
	@Autowired
	private BaseDao baseDao;
	
	/**
	 * 根据list页面查询条件获取施工项目基础信息列表
	 * @param queryParam
	 * @param pagequery
	 * @return
	 * @throws Exception
	 */
	public String getSgProjectBaseList(String queryParam, PageQuery pagequery) throws Exception {
		StringBuffer sql = new StringBuffer("SELECT t.* FROM (SELECT pb.sgbaseid,pb.stdname, pb.zjhyflx, pb.orgunit, pb.yzdwqt, pb.xmtszt "
				+ ", pb.ssyw, pb.sfcfwt, pt.ksgzsj ,dict.dict_name as zjhyflxdtname ,org.jt_org_name as orgunitdtname "
				+ " FROM jt_sg_project_base pb LEFT JOIN jt_sg_project_track pt ON pb.recid = pt.recid JOIN jt_dict dict ON pb.zjhyflx = dict.dict_id "
				+ " LEFT JOIN jt_org_mapping org ON pb.orgunit = org.jt_org_code "
				+ " where dict.dict_type_id = 'ZJHYFL' order by pb.sgbaseid desc) t WHERE 1 = 1 ");
		String hSql = QueryUtils.getSqlByQueryParam(queryParam, sql);
		String sgProjectBases = baseDao.queryListJsonBySql(hSql, pagequery);
		return sgProjectBases;
	} 
	
	/**
	 * 根据list页面查询条件获取施工项目基础信息总数
	 * @param queryParam
	 * @return
	 */
	public Long getSgProjectBaseCount(String queryParam) {
		StringBuffer baseSql = new StringBuffer("SELECT count(t.sgbaseid) FROM (SELECT pb.sgbaseid,pb.stdname, pb.zjhyflx, pb.orgunit, pb.yzdwqt, pb.xmtszt "
				+ ", pb.ssyw, pb.sfcfwt, pt.ksgzsj ,dict.dict_name as zjhyflxdtname ,org.jt_org_name as orgunitdtname "
				+ " FROM jt_sg_project_base pb LEFT JOIN jt_sg_project_track pt ON pb.recid = pt.recid JOIN jt_dict dict ON pb.zjhyflx = dict.dict_id "
				+ " LEFT JOIN jt_org_mapping org ON pb.orgunit = org.jt_org_code "
				+ " where dict.dict_type_id = 'ZJHYFL' order by pb.sgbaseid desc) t WHERE 1 = 1 ");
		String sql = QueryUtils.getSqlByQueryParam(queryParam, baseSql);
		return baseDao.getCountBySql(sql);
	}


	/**
	 * 根据list页面查询条件获取施工项目合同信息列表
	 * @param queryParam
	 * @param pagequery
	 * @return json格式Rows字符串
	 * @throws Exception
	 */
	
	public String getSgProjectContractList(String queryParam,PageQuery pagequery) throws Exception{
		StringBuffer sql = new StringBuffer("SELECT t.* FROM (SELECT contract.* ,dict.dict_name as zjhyflxdtname, org.jt_org_name as orgunitdtname"
				+ ", base.stdname,base.orgunit as orgunitbase,base.xmlx,base.zjhyflx,base.xmszd,base.bdmc,base.zjlydx,base.yzdw,base.sjdw "
				+ " FROM jt_sg_project_contract contract LEFT JOIN jt_sg_project_base base ON contract.baserecid = base.sgbaseid JOIN jt_dict dict ON base.zjhyflx = dict.dict_id "
				+ " LEFT JOIN jt_org_mapping org ON base.orgunit = org.jt_org_code "
				+ " where dict.dict_type_id = 'ZJHYFL') t WHERE 1 = 1 ");
		String hSql = QueryUtils.getSqlByQueryParam(queryParam,sql);	
		String sgProjectContracts = baseDao.queryListJsonBySql(hSql,pagequery);

		return sgProjectContracts;
	}


	/**
	 * 根据list页面查询条件获取施工项目合同信息总数
	 * @param queryParam
	 * @return 记录条数
	 */
	public Long getSgProjectContractCount(String queryParam) throws Exception{
		StringBuffer baseSql = new StringBuffer("SELECT count(1) FROM jt_sg_project_contract t WHERE 1 = 1 ");
		String sql = QueryUtils.getSqlByQueryParam(queryParam, baseSql);
		return baseDao.getCountBySql(sql);
	}
	
	/**
	 * 通过Id获取项目基本信息
	 * @param id
	 * @return
	 */
	public JtSgProjectBase getSgProjectBaseById(Integer id){
		return constructionDao.findOne(id);
	}
	
	/**
	 * 通过Id获取项目基本信息
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	/*public SgProjectTrack getSgProjectTrackById(String id) throws Exception{
		List<SgProjectTrack> sg = (List<SgProjectTrack>) projectTrackDao.findByBaserecid(Integer.valueOf(id));
		
		return sg.get(0);
	}*/
	
	public String getSgProjectTrackById(String id) throws Exception{
		String result = baseDao.queryListJsonBySql("select * from jt_sg_project_track where baserecid = "+id+" limit 0,1",null);
		//List<SgProjectTrack> sg = (List<SgProjectTrack>) projectTrackDao.findByBaserecid(Integer.valueOf(id));
		
		return result;
	}
	
	
	/**
	 * 查询其它公司投标信息
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	public String getJtOtherCompnayBidById(String baserecid) throws Exception{
		String result = baseDao.queryListJsonBySql("SELECT * FROM jt_other_company_bid where baserecid = "+baserecid, null);
		
		return result;
	}
	
	/**
	 * 保存项目基础信息
	 * @param sgProjectBase
	 */
	public JtSgProjectBase saveSgProjectBase(JtSgProjectBase sgProjectBase) {
		JtSgProjectBase sgProjectBase2 = constructionDao.saveAndFlush(sgProjectBase);
		return sgProjectBase2;
	}
	
	
	
	/**
	 * 保存项目市场信息
	 * @param sgProjectTrack
	 */
	public void saveSgProjectTrack(JtSgProjectTrack sgProjectTrack) {
		projectTrackDao.save(sgProjectTrack);
	}
	
	public void deleteSgProjectBase(String id) {
		constructionDao.delete(Integer.valueOf(id));
	}
	
	public void deleteSgProjectContractById(String id){
		projectContractDao.delete(Integer.valueOf(id));
	}

	public void saveSgProjectContract(JtSgProjectContract sgProjectContract) {
		// TODO Auto-generated method stub
		projectContractDao.save(sgProjectContract);
	}

	
	public JtSgProjectContract getSgProjectContract(Integer id){
		return projectContractDao.findOne(id);
	}

	
}
