package com.ajie.wechat.util;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.ServletRequest;

import org.springframework.data.jpa.domain.Specification;


public class Servlets {
	
	/**
	 * 获取查询参数的name、value值
	 * @param request
	 * @param prefix
	 * @return
	 */
	public static Map<String,Object> getParametStartWith(ServletRequest request,String prefix){
		if(request == null){
			throw new NullPointerException("Request must not be null");
		}
		Map<String, Object> params = new TreeMap<String, Object>();
		Enumeration<String> paramNames = request.getParameterNames();
		if(prefix == null){
			prefix = "";
		}
		//遍历查询参数
		while(paramNames != null && paramNames.hasMoreElements()){
			String paramName = paramNames.nextElement();
			if("".equals(prefix) || paramName.startsWith(prefix)){
				String unprefixed = paramName.substring(prefix.length());
				String[] values = request.getParameterValues(paramName);
				
				if ((values == null) || (values.length == 0)) {
					// Do nothing, no values found at all.
				} else if (values.length > 1) {
					params.put(unprefixed, values);
				} else {
					params.put(unprefixed, values[0]);
				}
			}
			
		}
		return params;
	}
	
	public static <T> Specification<T> getQuerySpec(final Collection<CriteriaEntity> filters, final Class<T> entityClazz){
		
		return new Specification<T>(){

			@Override
			public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				if(filters != null && !filters.isEmpty()){
					
				}
				
				
				return null;
			}
			
		};
		
	}
	
}
