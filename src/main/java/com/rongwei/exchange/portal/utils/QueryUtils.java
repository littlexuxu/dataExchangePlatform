package com.rongwei.exchange.portal.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

public class QueryUtils {

	public static Map<String, Object> getQueryParamMap(String queryParam) {
		Map<String, Object> searchParams = new HashMap<String, Object>();
		try {
			if (!(StringUtils.isBlank(queryParam))) {
				ObjectMapper mapper = new ObjectMapper();
				Map<?, ?> map = mapper.readValue(queryParam, Map.class);
				System.out.println("参数有：" + map.size() + "个");
				Iterator<?> iterator = map.keySet().iterator();
				int count = 1;
				while(iterator.hasNext()){ 
					Object key = iterator.next();
					String name = key.toString();
					String value = map.get(key).toString();
					if (StringUtils.isBlank(name) || StringUtils.isBlank(value)) {
						continue;
					}

					// 拆分operator与filedAttribute
					String[] names = StringUtils.split(name, "_");
					if (names.length != 2) {
						throw new IllegalArgumentException(name + " is not a valid search filter name");
					}
					String filedName = names[0];
					String operator = names[1];
					count = count + 1;
					if ("like".equals(operator)) {
						searchParams.put(filedName, "%" + String.valueOf(value) + "%");
					} else {
						try {
							searchParams.put(filedName, Integer.valueOf(value));
						} catch (Exception e) {
							try {
								searchParams.put(filedName, Double.valueOf(value));
							} catch (Exception e1) {
								searchParams.put(filedName, value);
							}
						}	
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return searchParams;
	}
	
	public static String getSqlByQueryParam(String queryParam, StringBuffer sql) {
		try {
			if (!(StringUtils.isBlank(queryParam))) {
				ObjectMapper mapper = new ObjectMapper();
				Map<?, ?> map = mapper.readValue(queryParam, Map.class);
				Iterator<?> iterator = map.keySet().iterator();
				while(iterator.hasNext()){ 
					Object key = iterator.next();
					String name = key.toString();
					String value = map.get(key).toString();
					if (StringUtils.isBlank(name) || StringUtils.isBlank(value)) {
						continue;
					}
					// 拆分operator与filedAttribute
					String[] names = StringUtils.split(name, "_");
					if (names.length != 2) {
						throw new IllegalArgumentException(name + " is not a valid search filter name");
					}
					String filedName = names[0];
					String operator = names[1];
					if ("in".equals(operator) || "not in".equals(operator)) {
						sql.append(" AND t.").append(filedName).append(" ").append(operator).append(" ").append(convertInOrNotinParams(value));
					} else if ("like".equals(operator)) {
						sql.append(" AND t.").append(filedName).append(" ").append(operator).append(" '%").append(value).append("%'");
					} else {
						try {
							Integer val = Integer.valueOf(value);
							sql.append(" AND t.").append(filedName).append(" ").append(operator).append(" ").append(val);
						} catch (Exception e) {
							sql.append(" AND t.").append(filedName).append(" ").append(operator).append(" '").append(value).append("'");
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sql.toString();
	}
	
	public static String convertInOrNotinParams(String params) {
		if (!(StringUtils.isBlank(params))) {
			String[] paramArr = params.split(",");
			StringBuffer queryParam = new StringBuffer("(");
			try {
				for (String param : paramArr) {
					queryParam.append(Integer.valueOf(param)).append(",");
				}
			} catch (Exception e) {
				for (String param : paramArr) {
					queryParam.append("'").append(param).append("'").append(",");
				}
			}
			queryParam.deleteCharAt(queryParam.length()-1);
			queryParam.append(")");
			return queryParam.toString();
		}
		return "";
	}
	
}
