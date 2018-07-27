package com.hotsale.core.utils;

import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 时间操作工具类
 *
 * @author zwq
 *
 */
public class TimeFrameUtil {

    /**
     * 获取今天的时间范围
     * @return 返回长度为2的字符串集合，如：[2017-11-03 00:00:00, 2017-11-03 24:00:00]
     */
    public static List<String> getTodayRange() {
        List<String> dataList = new ArrayList<>(2);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(Calendar.DATE, 0);
        String today = dateFormat.format(calendar.getTime());
        dataList.add(today + " 00:00:00");
        dataList.add(today + " 24:00:00");
        return dataList;
    }

    /**
     * 获取昨天的时间范围
     * @return 返回长度为2的字符串集合，如：[2017-11-02 00:00:00, 2017-11-02 24:00:00]
     */
    public static List<String> getYesterdayRange() {
        List<String> dataList = new ArrayList<>(2);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(Calendar.DATE, -1);
        String yesterday = dateFormat.format(calendar.getTime());
        dataList.add(yesterday + " 00:00:00");
        dataList.add(yesterday + " 24:00:00");
        return dataList;
    }

    /**
     * 获取本周的时间范围
     * @return 返回长度为2的字符串集合，如：[2017-10-30 00:00:00, 2017-11-05 24:00:00]
     */
    public static List<String> getCurrentWeekRange() {
        List<String> dataList = new ArrayList<>(2);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);//设置周一为一周之内的第一天
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        String monday = dateFormat.format(calendar.getTime()) + " 00:00:00";
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        String sunday = dateFormat.format(calendar.getTime()) + " 24:00:00";
        dataList.add(monday);
        dataList.add(sunday);
        return dataList;
    }

    /**
     * 获取本周的时间范围(不带时分秒)
     * @return 返回长度为2的字符串集合，如：[2017-10-30, 2017-11-05]
     */
    public static List<String> getCurrentWeekRangeNoTime() {
        List<String> dataList = new ArrayList<>(2);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);//设置周一为一周之内的第一天
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        String monday = dateFormat.format(calendar.getTime());
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        String sunday = dateFormat.format(calendar.getTime());
        dataList.add(monday);
        dataList.add(sunday);
        return dataList;
    }

    /**
     * 获取本月的时间范围
     * @return 返回长度为2的字符串集合，如：[2017-11-01 00:00:00, 2017-11-30 24:00:00]
     */
    public static List<String> getCurrentMonthRange() {
        List<String> dataList = new ArrayList<>(2);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        String firstDayOfMonth = dateFormat.format(calendar.getTime()) + " 00:00:00";
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 0);
        String lastDayOfMonth = dateFormat.format(calendar.getTime()) + " 24:00:00";
        dataList.add(firstDayOfMonth);
        dataList.add(lastDayOfMonth);
        return dataList;
    }

    /**
     * 获取本年的时间范围
     * @return 返回长度为2的字符串集合，如：[2017-01-01 00:00:00, 2017-12-31 24:00:00]
     */
    public static List<String> getCurrentYearRange() {
        List<String> dataList = new ArrayList<>(2);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(Calendar.YEAR, 0);
        calendar.set(Calendar.DAY_OF_YEAR, 1);
        String firstDayOfYear = dateFormat.format(calendar.getTime()) + " 00:00:00";
        calendar.add(Calendar.YEAR, 1);
        calendar.set(Calendar.DAY_OF_YEAR, 0);
        String lastDayOfYear = dateFormat.format(calendar.getTime()) + " 24:00:00";
        dataList.add(firstDayOfYear);
        dataList.add(lastDayOfYear);
        return dataList;
    }

    /**
     * 获取最近几天的时间范围
     * @param lastFewDays 最近多少天
     * @return 返回长度为2的字符串集合，如：[2017-12-25 17:15:33, 2017-12-26 17:15:33]
     */
    public static List<String> getLastFewDaysRange(int lastFewDays) {
        List<String> dataList = new ArrayList<>(2);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        String endTime = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.DATE, -lastFewDays);
        String startTime = dateFormat.format(calendar.getTime());
        dataList.add(startTime);
        dataList.add(endTime);
        return dataList;
    }

    /**
     * 获取当前时间
     * @param pattern 指定返回当前时间的格式，例："yyyy-MM-dd HH:mm:ss"
     * @return 返回指定格式的当前时间，如："2018-01-25 10:14:30"
     */
    public static String getCurrentTime(String pattern) {
        String currentTime;
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        currentTime = dateFormat.format(calendar.getTime());
        return currentTime;
    }

    /***
     * 将指定时间偏移几小时
     * @param time 指定时间，精确到分，例："2018-01-25 10:48"
     * @param offset 偏移量：负数代表减几个小时，正数代表加几个小时，例：1
     * @return 返回偏移后的时间，如："2018-01-25 11：48"
     * @throws ParseException
     */
    public static String offsetHours(String time, int offset) throws ParseException {
        String offsetHours = null;
        if (StringUtils.hasText(time)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateFormat.parse(time));
            calendar.add(Calendar.MINUTE, offset);
            offsetHours = dateFormat.format(calendar.getTime());
        }
        return offsetHours;
    }

    /**
     * 将指定月份偏移几个月
     * @param month 指定月份
     * @param offset 偏移量：负数代表上几个月，正数代表下几个月
     * @return 返回偏移后的月份，如：2018-01
     * @throws ParseException
     */
    public static String offsetMonths(String month, int offset) throws ParseException {
        String offsetMonth = null;
        if (StringUtils.hasText(month)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateFormat.parse(month));
            calendar.add(Calendar.MONTH, offset);
            offsetMonth = dateFormat.format(calendar.getTime());
        }
        return offsetMonth;
    }

    /**
     * 获取指定日期是星期几（设置星期一为一周的开始）
     * @param day 指定日期
     * @return 返回星期几，如：1
     * @throws ParseException
     */
    public static int getDayOfWeek(String day) throws ParseException {
        int dayOfWeek = 0;
        if (StringUtils.hasText(day)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateFormat.parse(day));
            calendar.add(Calendar.DATE, -1); //在指定日期的基础上减一天，满足中国人的习惯
            dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        }
        return dayOfWeek;
    }

    /**
     * 获取指定月份有多少天
     * @param month 指定月份
     * @return 返回天数，如：31
     * @throws ParseException
     */
    public static int getDaysInMonth(String month) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateFormat.parse(month));
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 0);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }


    /**
     * 根据开始时间和结束时间返回时间段内的时间集合
     *
     * @param beginDate
     * @param endDate
     * @return List
     */
    public static List<Date> getDatesBetweenTwoDate(Date beginDate, Date endDate) {
        List<Date> lDate = new ArrayList<Date>();
        lDate.add(beginDate);// 把开始时间加入集合
        Calendar cal = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        cal.setTime(beginDate);
        boolean bContinue = true;
        while (bContinue) {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            cal.add(Calendar.DAY_OF_MONTH, 1);
            // 测试此日期是否在指定日期之后
            if (endDate.after(cal.getTime())) {
                lDate.add(cal.getTime());
            } else {
                break;
            }
        }
        lDate.add(endDate);// 把结束时间加入集合
        return lDate;
    }

}
