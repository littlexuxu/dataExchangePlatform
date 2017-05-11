package com.rongwei.exchange.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ajie.wechat.util.PageQuery;
import com.rongwei.exchange.portal.dao.BaseDao;
import com.rongwei.exchange.portal.dao.ConstructionDao;
import com.rongwei.exchange.portal.model.SgProjectBase;
import com.rongwei.exchange.portal.utils.QueryUtils;

@Service
@Transactional
public class ConstructionService {

	@Autowired
	private ConstructionDao constructionDao;
	
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
		StringBuffer sql = new StringBuffer("SELECT t.* FROM (SELECT pb.stdname, pb.zjhyflx, pb.orgunit, pb.yzdwqt, pb.xmtszt "
				+ ", pb.ssyw, pb.sfcfwt, pt.ksgzsj ,dict.dict_name as zjhyflxdtname ,org.jt_org_name as orgunitdtname "
				+ " FROM jt_sg_project_base pb LEFT JOIN jt_sg_project_track pt ON pb.recid = pt.recid JOIN jt_dict dict ON pb.zjhyflx = dict.dict_id "
				+ " LEFT JOIN jt_org_mapping org ON pb.orgunit = org.jt_org_code "
				+ " where dict.dict_type_id = 'ZJHYFL' ) t WHERE 1 = 1 ");
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
		StringBuffer baseSql = new StringBuffer("SELECT count(1) FROM jt_sg_project_base t WHERE 1 = 1 ");
		String sql = QueryUtils.getSqlByQueryParam(queryParam, baseSql);
		return baseDao.getCountBySql(sql);
	}
	
	/**
	 * 保存项目基础信息
	 * @param sgProjectBase
	 */
	public void saveSgProjectBase(SgProjectBase sgProjectBase) {
		constructionDao.save(sgProjectBase);
	}
	
}
