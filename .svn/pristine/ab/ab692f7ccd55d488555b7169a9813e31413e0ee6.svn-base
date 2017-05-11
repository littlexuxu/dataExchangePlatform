package com.ajie.wechat.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	public static void main(String[] args) {
//		String str = dateStringToOtherString("2005-6-1.0.0. 0. 0","yyyy-MM-dd.hh.mm. ss. SSSS","yyyy-MM-dd");
//		Date dNow = new Date();
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM月-yy hh:mm:ss a");  
//		System.out.println("It is " + formatter.format(dNow));
		
		System.out.println(getTjgsyf("dd-M月-yy hh.mm.ss.SSSS a"));
	}
	
	/**
	 * 获取纳入系统管理时间，若果是1号到6号就取上月，如果不是就取当前时间
	 * dateformatter :集团日期格式   dd-MM月-yy hh.mm.ss.SSSS a
	 * @return
	 */
	public static String getTjgsyf(String dateformatter){
		String datestr = "";
		Date dNow = new Date();
		//集团日期类型格式
		SimpleDateFormat formatter = new SimpleDateFormat(dateformatter);
		Calendar now = Calendar.getInstance();
		int day = now.get(Calendar.DAY_OF_MONTH);
		/*
		 * 如果当前时间为1号到6号，则取上月最后一天
		 * 如果不是1号到6号，则取当前时间
		 */
		if(day>0 && day<7){
			int month = now.get(Calendar.MONTH);
			now.set(Calendar.MONTH, month-1);
			now.set(Calendar.DAY_OF_MONTH,now.getActualMaximum(Calendar.DAY_OF_MONTH));  
			Date strDateTo = now.getTime();
			datestr=formatter.format(strDateTo);
		}else{
			datestr=formatter.format(dNow);
		}
		return datestr;
	}
	
	/**
	 * 两种字符串格式的日期转换
	 * @param datepar	日期（字符串类型）
	 * @param srcformat	源日期格式
	 * @param goalformat	需要转换的日期格式
	 * @return
	 */
	public static String dateStringToOtherString(String datepar,String srcformat,String goalformat){
		String goaldatestr = null;
		if(datepar != null && !"".equals(datepar)){
			//2005-6-1.0.0. 0. 0
			DateFormat formatgoal= new SimpleDateFormat(goalformat);
	    	DateFormat formatsrc= new SimpleDateFormat(srcformat);
	    	try {
				Date srcdate = formatsrc.parse(datepar);
				goaldatestr=formatgoal.format(srcdate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return goaldatestr;
	}
	
}
