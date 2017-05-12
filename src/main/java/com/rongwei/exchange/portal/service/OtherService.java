package com.rongwei.exchange.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ajie.wechat.util.PageQuery;
import com.rongwei.exchange.portal.dao.BaseDao;
import com.rongwei.exchange.portal.utils.QueryUtils;

@Service
@Transactional
public class OtherService {

		@Autowired
		private BaseDao baseDao;
		
		public String getQtProjectBaseList(String queryParam, PageQuery pagequery) throws Exception {
			StringBuffer sql = new StringBuffer("SELECT t.* FROM (SELECT jq.stdname, jq.htbh, jq.xmlx, jq.gjhylb, jq.zjhyfl, jq.xmszd, jq.yzdw, jq.htqdrq, jq.hte, jq.zzcdhte"
					+", jq.sfwqyyss, jq.xmmcyw, jq.xmbd, jq.yzzjly, jq.sftzxm, jq.sffb, jq.jedw, jq.htmc, jq.dwqypp, jq.htqdfs, jq.htjf, jq.htjfnb, jq.htyfid, jq.qyzzmc, jq.htgq, jq.htkgrq, jq.htwgrq, jq.sjkgrq, jq.sjwgrq, jq.xmhzfs, jq.tzly "
					+ "FROM jt_qt_projectandcontract jq) t WHERE 1 = 1 ");
			String hSql = QueryUtils.getSqlByQueryParam(queryParam, sql);
			String sgProjectBases = baseDao.queryListJsonBySql(hSql, pagequery);
			return sgProjectBases;
		}
		
		public Long getQtProjectBaseCount(String queryParam) {
			StringBuffer baseSql = new StringBuffer("SELECT count(1) FROM jt_qt_projectandcontract q WHERE 1 = 1 ");
			String sql = QueryUtils.getSqlByQueryParam(queryParam, baseSql);
			return baseDao.getCountBySql(sql);
		}
		

}
