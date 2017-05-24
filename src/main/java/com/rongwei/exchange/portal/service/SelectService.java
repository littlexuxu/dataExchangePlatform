package com.rongwei.exchange.portal.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ajie.wechat.model.JtDict;
import com.ajie.wechat.model.JtOrgMapping;
import com.rongwei.exchange.portal.dao.BaseDao;
import com.rongwei.exchange.portal.utils.QueryUtils;

@Service
@Transactional
public class SelectService {

	@SuppressWarnings("unused")
	private final Log logger = LogFactory.getLog(SelectService.class);

	@Autowired
	private BaseDao baseDao;

	@SuppressWarnings("unchecked")
	public List<JtDict> queryDict(String dictTypeId, String parentId) {
		StringBuffer sql = new StringBuffer("SELECT t FROM JtDict t WHERE 1 = 1 ");
		if (!(StringUtils.isBlank(dictTypeId))) {
			sql.append(" AND t.dicttypeid = '").append(dictTypeId).append("' ");
		}
		if (!(StringUtils.isBlank(parentId))) {
			sql.append(" AND t.dictparentid = '").append(parentId).append("' ");
		}
		sql.append(" ORDER BY dict_id ASC");
		List<JtDict> list = (List<JtDict>) baseDao.queryListPageByHsql(sql.toString(), null, null);
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<JtDict> queryDictInOrNotInFilter(String dictTypeId, String parentId, String filters, String operator) {
		StringBuffer sql = new StringBuffer("SELECT t FROM JtDict t WHERE 1 = 1 ");
		if (!(StringUtils.isBlank(dictTypeId))) {
			sql.append(" AND t.dicttypeid = '").append(dictTypeId).append("' ");
		}
		if (!(StringUtils.isBlank(parentId))) {
			sql.append(" AND t.dictparentid = '").append(parentId).append("' ");
		}
		if (!(StringUtils.isBlank(filters))) {
			String queryFilter = QueryUtils.convertInOrNotinParams(filters);
			sql.append(" ADN t.dictid ").append(operator).append(" ").append(queryFilter);
		}
		sql.append(" ORDER BY dict_id ASC");
		List<JtDict> list = (List<JtDict>) baseDao.queryListPageByHsql(sql.toString(), null, null);
		return list;
	}

	/**
	 * 查询没有合同的项目(施工类)
	 * 
	 * @return
	 * @throws Exception
	 */
	public String querySgProjectNotContract() throws Exception {
		StringBuffer sql = new StringBuffer(
				"SELECT t.* FROM jt_sg_project_base t WHERE sgbaseid NOT IN ( SELECT baserecid FROM jt_sg_project_contract) ");

		String json = baseDao.queryListJsonBySql(sql.toString(), null);

		return json;
	}

	/**
	 * 查询没有合同的项目(设计类)
	 * 
	 * @return
	 * @throws Exception
	 */
	public String querySjProjectNotContract() throws Exception {
		StringBuffer sql = new StringBuffer(
				"SELECT t.* FROM jt_sj_project_base t WHERE sjbaseid NOT IN(SELECT base_cxmid FROM jt_sj_project_contract) ");

		String json = baseDao.queryListJsonBySql(sql.toString(), null);

		return json;
	}

	@SuppressWarnings("unchecked")
	public List<JtOrgMapping> queryOrgMapping(String parentId) throws Exception {
		StringBuffer sql = new StringBuffer("select t from JtOrgMapping t");
		List<JtOrgMapping> list = (List<JtOrgMapping>) baseDao.queryListPageByHsql(sql.toString(), null,null);
		return list;
	}

}
