package com.hotsale.core.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2018-04-09.
 */
public class Month {
    public static String getFirstOfMonth(String dataStr) throws ParseException {
        Calendar cal = Calendar.getInstance();

        cal.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(dataStr));

        cal.add(Calendar.MONTH, 0);
        cal.set(Calendar.DAY_OF_MONTH,1);
        // 所在月开始日期
        String data1 = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
        return data1;

    }

    public static String getLastOfMonth(String dataStr) throws ParseException {
        Calendar cal = Calendar.getInstance();

        cal.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(dataStr));

        cal.add(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH,0);
        // 所在月结束日期
        String data2 = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
        return data2;
    }
    public static void main(String[] args) {
        try {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(getLastOfMonth((formatter.format(date))));
        }catch (Exception e) {
            System.out.println("error");
        }

    }
}
