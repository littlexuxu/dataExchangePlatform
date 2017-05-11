package com.rongwei.exchange.portal.dao;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.ajie.wechat.util.PageQuery;
import com.fasterxml.jackson.databind.ObjectMapper;

@Transactional
@Repository
public class BaseDao {
	
	private final Log logger = LogFactory.getLog(BaseDao.class);
	
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * * 查询数据集合
	 * 
	 * @param sql
	 *            查询sql sql中的参数用:name格式
	 * @param params
	 *            查询参数map格式，key对应参数中的:name
	 * @param clazz
	 *            实体类型为空则直接转换为map格式
	 * @return
	 */
	public List<?> queryListEntity(String sql, Map<String, Object> params, Class<?> clazz) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("entityManagerFactory");
//		EntityManager em = emf.createEntityManager();
		
		Session session = entityManager.unwrap(org.hibernate.Session.class);
		SQLQuery query = session.createSQLQuery(sql);
		if (params != null) {
			for (String key : params.keySet()) {
				query.setParameter(key, params.get(key));
			}
		}
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List<Map<String, Object>> result = query.list();
		if (clazz != null) {
			List<Object> entityList = convert(clazz, result);
			return entityList;
		}
		return result;
	}
	
	public List<?> queryListEntityPage(String sql, Map<String, Object> params, Class<?> clazz,PageQuery pagequery) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("entityManagerFactory");
//		EntityManager em = emf.createEntityManager();
		
		Session session = entityManager.unwrap(org.hibernate.Session.class);
		SQLQuery query = session.createSQLQuery(sql);
		if (params != null) {
			for (String key : params.keySet()) {
				query.setParameter(key, params.get(key));
			}
		}
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		//分页设置
		if(pagequery != null){
			query.setFirstResult(pagequery.getPageSize() * pagequery.getPageIndex());
			query.setMaxResults(pagequery.getPageSize()).list();
		}
		
		List<Map<String, Object>> result = query.list();
		if (clazz != null) {
			List<Object> entityList = convert(clazz, result);
			return entityList;
		}
		return result;
	}
	
	public List<Map<String, Object>> queryListBySql(String sql, PageQuery pagequery) {
		
		Session session = entityManager.unwrap(org.hibernate.Session.class);
		SQLQuery query = session.createSQLQuery(sql);
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		//分页设置
		if(pagequery != null){
			query.setFirstResult(pagequery.getPageIndex() - 1);
			query.setMaxResults(pagequery.getPageSize());
		}
		
		List<Map<String, Object>> result = query.list();
		return result;
	}
	
	
	@SuppressWarnings("unchecked")
	public String queryListJsonBySql(String sql, PageQuery pagequery) throws Exception  {
		
		Session session = entityManager.unwrap(org.hibernate.Session.class);
		SQLQuery query = session.createSQLQuery(sql);
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		//分页设置
		if(pagequery != null){
			query.setFirstResult(pagequery.getPageIndex() - 1);
			query.setMaxResults(pagequery.getPageSize());
		}
		
		List<Map<String, Object>> result = query.list();
		ObjectMapper objectMapper = new ObjectMapper();
		String listStr = objectMapper.writeValueAsString(result);
		return listStr;
	}

	/**
	 * 获取记录条数
	 * 
	 * @param sql
	 * @param params
	 * @return
	 */
	public Long getCountBySql(String sql) {
		
		Query query = entityManager.createNativeQuery(sql);
		BigInteger bigInteger = (BigInteger) query.getSingleResult();
		return bigInteger.longValue();
	}
	
	/**
	 * 执行sql语句
	 * @param sql
	 * @return
	 */
	public int excuteBySql(String sql){
		int result;
		Session session = entityManager.unwrap(org.hibernate.Session.class);
		SQLQuery query = session.createSQLQuery(sql);
		result = query.executeUpdate();
		return result;
	}
	
	private List<Object> convert(Class<?> clazz, List<Map<String, Object>> list) {
		List<Object> result;
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		result = new ArrayList<Object>();
		try {
			PropertyDescriptor[] props = Introspector.getBeanInfo(clazz).getPropertyDescriptors();
			for (Map<String, Object> map : list) {
				Object obj = clazz.newInstance();
				
				for (String key : map.keySet()) {
					String attrName = key.toLowerCase();
					
					for (PropertyDescriptor prop : props) {
						
						attrName = removeUnderLine(attrName);
						if (!attrName.equals(prop.getName())) {
							continue;
						}
						Method method = prop.getWriteMethod();
						Object value = map.get(key);
						if (value != null) {
							value = ConvertUtils.convert(value, prop.getPropertyType());
						}
						try {
							method.invoke(obj, value);
						} catch (Exception e) {
							logger.error(e.getMessage());
						}
					}
					
				}
				
				result.add(obj);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
//			e.printStackTrace();
		}
		return result;
	}

	private String removeUnderLine(String attrName) {
		// 去掉数据库字段的下划线
		if (attrName.contains("_")) {
			String[] names = attrName.split("_");
			String firstPart = names[0];
			String otherPart = "";
			for (int i = 1; i < names.length; i++) {
				String word = names[i].replaceFirst(names[i].substring(0, 1), names[i].substring(0, 1).toUpperCase());
				otherPart += word;
			}
			attrName = firstPart + otherPart;
		}
		return attrName;
	}

	/**
	 * 获取记录条数
	 * 
	 * @param sql
	 * @param params
	 * @return
	 */
	public Integer getCountBy(String sql, Map<String, Object> params) {
		Query query = entityManager.createNativeQuery(sql);
		if (params != null) {
			for (String key : params.keySet()) {
				query.setParameter(key, params.get(key));
			}
		}
		BigInteger bigInteger = (BigInteger) query.getSingleResult();
		return bigInteger.intValue();
	}

	/**
	 * 新增或者删除
	 * 
	 * @param sql
	 * @param params
	 * @return
	 */
	public Integer deleteOrUpDate(String sql, Map<String, Object> params) {
		Query query = entityManager.createNativeQuery(sql);
		if (params != null) {
			for (String key : params.keySet()) {
				query.setParameter(key, params.get(key));
			}
		}
		return query.executeUpdate();
	}
	
	public List<?> queryListPageByHsql(String sql, Map<String, Object> params, PageQuery pagequery) {
		
		Query query = entityManager.createQuery(sql);
		if (params != null) {
			int count = 1;
			for (String key : params.keySet()) {
				query.setParameter(count, params.get(key));
				count = count + 1;
			}
		}
		//分页设置
		if(pagequery != null){
			query.setFirstResult(pagequery.getPageIndex() - 1);
			query.setMaxResults(pagequery.getPageSize());
		}
		
		List<?> result = query.getResultList();
		return result;
	}

	/**
	 * 获取记录条数
	 * 
	 * @param sql
	 * @param params
	 * @return
	 */
	public Long getCountByHsql(String sql, Map<String, Object> params) {
		
		Query query = entityManager.createQuery(sql);
		if (params != null) {
			int count = 1;
			for (String key : params.keySet()) {
				query.setParameter(count, params.get(key));
				count = count + 1;
			}
		}
		
		Long bigInteger =  (Long) query.getSingleResult();
		return bigInteger;
	}
	
}
