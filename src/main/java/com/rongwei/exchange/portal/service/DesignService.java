package com.rongwei.exchange.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ajie.wechat.util.PageQuery;
import com.rongwei.exchange.portal.dao.BaseDao;
import com.rongwei.exchange.portal.dao.DesignDao;
import com.rongwei.exchange.portal.model.JtSjProjectBase;
import com.rongwei.exchange.portal.utils.QueryUtils;

@Service
@Transactional
public class DesignService {

	@Autowired
	private DesignDao designDao;
	
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
		StringBuffer sql = new StringBuffer("SELECT t.* FROM (SELECT pb.stdname, pb.zjhyflx, pb.orgunit, pb.yzdwqt, pb.xmtszt"
				+ ", pb.ssyw, pb.sfcfwt, pt.ksgzsj "
				+ "FROM jt_sg_project_base pb LEFT JOIN jt_sg_project_track pt ON pb.recid = pt.recid ) t WHERE 1 = 1 ");
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
	public void saveJtSjProjectBase(JtSjProjectBase jtSjProjectBase) {
		designDao.save(jtSjProjectBase);
	}
	
}
