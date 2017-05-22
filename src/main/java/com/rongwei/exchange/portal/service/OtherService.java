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
		
		//start 获取项目及合同信息
		/**
		 * 
		 * @param queryParam
		 * @param pagequery
		 * @return
		 * @throws Exception
		 */
		public String getQtProjectBaseList(String queryParam, PageQuery pagequery) throws Exception {
			StringBuffer sql = new StringBuffer("SELECT t.* FROM (SELECT jq.stdname, jq.htbh, jq.xmlx, jq.gjhylb, jq.zjhyfl, jq.xmszd, jq.yzdw, jq.htqdrq, jq.hte, jq.zzcdhte"
					+", jq.sfwqyyss, jq.xmmcyw, jq.xmbd, jq.yzzjly, jq.sftzxm, jq.sffb, jq.jedw, jq.htmc, jq.dwqypp, jq.htqdfs, jq.htjf, jq.htjfnb, jq.htyfid, jq.qyzzmc, jq.htgq, jq.htkgrq, jq.htwgrq, jq.sjkgrq, jq.sjwgrq, jq.xmhzfs, jq.tzly "
					+ "FROM jt_qt_projectandcontract jq) t WHERE 1 = 1 ");
			String hSql = QueryUtils.getSqlByQueryParam(queryParam, sql);
			String sgProjectBases = baseDao.queryListJsonBySql(hSql, pagequery);
			return sgProjectBases;
		}
		
		/**
		 * 获取项目及合同信息总计路数
		 * @param queryParam
		 * @return
		 */
		public Long getQtProjectBaseCount(String queryParam) {
			StringBuffer baseSql = new StringBuffer("SELECT count(1) FROM jt_qt_projectandcontract q WHERE 1 = 1 ");
			String sql = QueryUtils.getSqlByQueryParam(queryParam, baseSql);
			return baseDao.getCountBySql(sql);
		}
		//end
		
		//start 获取其它合同变更
		
		/**
		 * 获取合同变更列表
		 * @param queryParam
		 * @param pagequery
		 * @return
		 * @throws Exception
		 */
		public String getQtContractChangeList(String queryParam, PageQuery pagequery) throws Exception {
			StringBuffer sql = new StringBuffer("SELECT t.* FROM jt_qt_contract_change t WHERE 1 = 1 ");
			String hSql = QueryUtils.getSqlByQueryParam(queryParam, sql);
			String sgProjectBases = baseDao.queryListJsonBySql(hSql, pagequery);
			return sgProjectBases;
		}
		
		/**
		 * 获取其它合同变更总记录数
		 * @param queryParam
		 * @return
		 */
		public Long getQtContractChangeCount(String queryParam) {
			StringBuffer baseSql = new StringBuffer("SELECT count(1) FROM jt_qt_contract_change q WHERE 1 = 1 ");
			String sql = QueryUtils.getSqlByQueryParam(queryParam, baseSql);
			return baseDao.getCountBySql(sql);
		}
		
		//end
		

}
