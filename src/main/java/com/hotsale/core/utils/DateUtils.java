package com.hotsale.core.utils;


import com.hotsale.core.constant.Global;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateUtils {
	
	public static final long DAY_MILLIS = 86400000; // 一天的毫秒数
	public static final long HOUR_MILLIS = 3600000; // 一小时的毫秒数
	public static final long MINUTE_MILLIS = 60000;

	public static final String DATE_YEAR_MONTH_FORMAT = "yyyy-MM";	//日期格式

	public static final  String DATE_YEAR_MONTH_DAT_FORMAT = "yyyy-MM-dd";	//日期格式

	public static final  String DATE_YEAR_MONTH_DAT_SLASH_FORMAT = "yyyy/MM/dd";	//日期格式


	public static final  String DATE_FORMAT ="yyyy-MM-dd HH:mm:ss";
	/**
	 * 获得当前系统时间
	 * 
	 * @return
	 */
	public static Date getNow() {
		return new Date();
	}
	
	/**
	 * 获得给定时间的00:00:00时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getBeginOfDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 获得给定时间的23:59:59时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getEndOfDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}
	
	/**
	 * 获得某月的第一天的时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getFirstDayOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		return getBeginOfDay(cal.getTime());
	}

	/**
	 * 获得某月的最后一天的时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getLastDayOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), 1);
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.DAY_OF_MONTH, -1);
		return getEndOfDay(cal.getTime());
	}

	/**
	 * 格式化:时间转化成字符串
	 * 
	 * @param date
	 * @param fmt
	 * @return
	 */
	public static String format(Date date, String fmt) {
		DateFormat formatter = new SimpleDateFormat(fmt);
		return formatter.format(date);
	}

	/**
	 * 格式化:字符串转化成时间
	 * 
	 * @param date
	 * @param fmt
	 * @return
	 * @throws ParseException
	 */
	public static Date format(String date, String fmt)  {
		try {
			DateFormat formatter = new SimpleDateFormat(fmt);
			return formatter.parse(date);
		}catch (Exception e){
			throw new RuntimeException(e);
		}

	}
	
	/**
	 * n天前或后 + -
	 * 
	 * @param date
	 * @param day
	 * @return
	 */
	public static Date addDay(Date date, int day) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, day);
		return new Date(cal.getTime().getTime());
	}
	
	/**
	 * n小时 + -
	 * 
	 * @param date
	 * @param hour
	 * @return
	 */
	public static Date addHour(Date date, int hour) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.HOUR_OF_DAY, hour);
		return new Date(cal.getTime().getTime());
	}
	
	/**
	 * n分钟 + -
	 * 
	 * @param date
	 * @param min
	 * @return
	 */
	public static Date addMinute(Date date, int min) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MINUTE, min);
		return new Date(cal.getTime().getTime());
	}
	/**
	 * n月 + -
	 *
	 * @param date
	 * @param min
	 * @return
	 */
	public static  Date addMonth(Date date, int min){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, min); // 目前時間加1個月
		return new Date(cal.getTime().getTime());
	}

	/**
	 * date类型转换为String类型
	 * @param data Date类型的时间
	 * @param formatType 格式为yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日 HH时mm分ss秒
	 * @return
	 */
	public static String dateToString(Date data, String formatType) {
		return new SimpleDateFormat(formatType).format(data);
	}

	/**
	 * long类型转换为String类型
	 * @param currentTime 要转换的long类型的时间
	 * @param formatType 要转换的string类型的时间格式
	 * @return
	 * @throws ParseException
	 */
	public static String longToString(long currentTime, String formatType)
			throws ParseException {
		Date date = longToDate(currentTime, formatType); // long类型转成Date类型
		String strTime = dateToString(date, formatType); // date类型转成String
		return strTime;
	}

	/**
	 * string类型转换为date类型
	 * @param strTime 要转换的string类型的时间
	 * @param formatType 要转换的格式yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日
	 * @return
	 * @throws ParseException
	 */
	public static Date stringToDate(String strTime, String formatType)
			throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat(formatType);
		Date date = null;
		date = formatter.parse(strTime);
		return date;
	}

	/**
	 * long转换为Date类型
	 * @param currentTime 要转换的long类型的时间
	 * @param formatType 要转换的时间格式yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日 HH时mm分ss秒
	 * @return
	 * @throws ParseException
	 */
	public static Date longToDate(long currentTime, String formatType)
			throws ParseException {
		Date dateOld = new Date(currentTime); // 根据long类型的毫秒数生命一个date类型的时间
		String sDateTime = dateToString(dateOld, formatType); // 把date类型的时间转换为string
		Date date = stringToDate(sDateTime, formatType); // 把String类型转换为Date类型
		return date;
	}


	/**
	 * string类型转换为long类型
	 * strTime的时间格式和formatType的时间格式必须相同
	 * @param strTime 要转换的String类型的时间
	 * @param formatType 时间格式
	 * @return
	 * @throws ParseException
	 */
	public static long stringToLong(String strTime, String formatType)
			throws ParseException {
		Date date = stringToDate(strTime, formatType); // String类型转成date类型
		if (date == null) {
			return 0;
		} else {
			long currentTime = dateToLong(date); // date类型转成long类型
			return currentTime;
		}
	}

	/**
	 * date类型转换为long类型
	 * date要转换的date类型的时间
	 * @param date
	 * @return
	 */
	public static long dateToLong(Date date) {
		return date.getTime();
	}

	/**
	 * date1 - date2 = 天数
	 * 格式：yyyy-MM-dd
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static Integer dateSubtract(Date date1, Date date2){
		try {
			date1 = getDateFromat(date1, Global.DATE_PATTERN);
			date2 = getDateFromat(date2,Global.DATE_PATTERN);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long m = date1.getTime() - date2.getTime();
        /* 根据你的需求进行单位转换 */
		//System.out.println("相差天数:"+ (m / (1000 * 60 * 60 * 24)) );

		return (int)(m / (1000 * 60 * 60 * 24));
	}


	/**
	 * 制定日期转换类型
	 * @param date
	 * @param fromat
	 * @return
	 */
	public static Date getDateFromat(Date date, String fromat) throws ParseException  {
		SimpleDateFormat formatter = new SimpleDateFormat(fromat);
		String dateString = formatter.format(date);
		Date currentTime = formatter.parse(dateString);
		return currentTime;
	}

	public static Set<Date> dateSplit(Date startDate, Date endDate)
			throws Exception {
		if (!startDate.before(endDate))
			throw new Exception("开始时间应该在结束时间之后");
		Long spi = endDate.getTime() - startDate.getTime();
		Long step = spi / (24 * 60 * 60 * 1000);// 相隔天数

		List<Date> dateList = new ArrayList<Date>();
		dateList.add(endDate);
		for (int i = 1; i <= step; i++) {
			dateList.add(new Date(dateList.get(i - 1).getTime()
					- (24 * 60 * 60 * 1000)));// 比上一天减一
		}
		Set<Date> dateSet = new HashSet<Date>();
		dateSet.addAll(dateList);

		return dateSet;
	}


	//判断选择的日期是否是本周
	public static boolean isThisWeek(long time)
	{
		Calendar calendar = Calendar.getInstance();
		int currentWeek = calendar.get(Calendar.WEEK_OF_YEAR);
		calendar.setTime(new Date(time));
		int paramWeek = calendar.get(Calendar.WEEK_OF_YEAR);
		if(paramWeek==currentWeek){
			return true;
		}
		return false;
	}
	//判断选择的日期是否是今天
	public static boolean isToday(long time)
	{
		return isThisTime(time,"yyyy-MM-dd");
	}
	//判断选择的日期是否是本月
	public static boolean isThisMonth(long time)
	{
		return isThisTime(time,"yyyy-MM");
	}
	private static boolean isThisTime(long time,String pattern) {
		Date date = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String param = sdf.format(date);//参数时间
		String now = sdf.format(new Date());//当前时间
		if(param.equals(now)){
			return true;
		}
		return false;
	}

	public static void main(String[] args)throws ParseException{
		System.out.print("========p 19 00:00:00 CST 2017===============");
		System.out.print(DateUtils.longToDate(1505923200000L, DATE_YEAR_MONTH_DAT_FORMAT));
		System.out.print(DateUtils.stringToDate("2017-09-20 12:20:30", DATE_FORMAT));
//		System.out.print(DateUtils.longToDate(1501032419632L, DATE_YEAR_MONTH_DAT_FORMAT));
	}

}
