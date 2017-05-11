package com.ajie.wechat.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

public class CriteriaEntity {
	
	public enum Operator{
		EQ, LIKE, GT, LT, GTE, LTE
	}
	
	public String filedname;
	
	public Object value;
	
	public Operator operator;

	public CriteriaEntity(String filedname, Object value, Operator operator) {
		this.filedname = filedname;
		this.value = value;
		this.operator = operator;
	}
	
	/**
	 * searchParams中key的格式为OPERATOR_FIELDNAME
	 */
	public static Map<String, CriteriaEntity> parse(Map<String, Object> searchParams) {
		Map<String, CriteriaEntity> filters = new HashMap<String, CriteriaEntity>();

		for (Entry<String, Object> entry : searchParams.entrySet()) {
			// 过滤掉空值
			String key = entry.getKey();
			Object value = entry.getValue();
			if (StringUtils.isBlank((String) value)) {
				continue;
			}

			// 拆分operator与filedAttribute
			String[] names = StringUtils.split(key, "_");
			if (names.length != 2) {
				throw new IllegalArgumentException(key + " is not a valid search filter name");
			}
			String filedName = names[1];
			Operator operator = Operator.valueOf(names[0]);

			// 创建searchFilter
			CriteriaEntity filter = new CriteriaEntity(filedName, value, operator);
			filters.put(key, filter);
		}

		return filters;
	}
}
