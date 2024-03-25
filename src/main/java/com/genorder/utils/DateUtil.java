package com.genorder.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 日期工具类
 */
public class DateUtil {

    public static final String  PATTERN = "yyyy-MM-dd HH:mm:ss";


    // 将日期字符串按照指定格式转换为 Date 对象
    public static Date parseStringToDate(String dateString)  {

        SimpleDateFormat dateFormat = new SimpleDateFormat(PATTERN);
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    // 将 Date 对象格式化为字符串
    public static String formatDateToString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(PATTERN);
        return dateFormat.format(date);
    }

    public static Date randomDateBetweenTwoDates(Date bTime, Date eTime) {
        // 输入的两个Date对象
//        Date startDate = parseStringToDate("2024-03-25 12:11:32"); // 起始日期
//        Date endDate = parseStringToDate("2024-03-25 23:59:59");   // 结束日期

        // 获取两个Date对象的时间戳
        long startMillis = bTime.getTime();
        long endMillis = eTime.getTime();

        // 使用Random类生成一个介于startMillis和endMillis之间的随机时间戳
        Random random = new Random();
        long randomMillis = startMillis + (long) (random.nextDouble() * (endMillis - startMillis));

        // 将随机时间戳转换为Date对象
        Date randomDate = new Date(randomMillis);
        return randomDate;
    }

    public static void main(String[] args) {

        // 输入的两个Date对象
        Date startDate = parseStringToDate("2023-09-01 11:00:00"); // 起始日期
        Date endDate = parseStringToDate("2023-09-02 11:00:00");   // 结束日期

        System.out.println(DateUtil.randomDateBetweenTwoDates(startDate, endDate));
    }


}
