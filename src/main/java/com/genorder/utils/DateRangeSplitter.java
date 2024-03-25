package com.genorder.utils;

import cn.hutool.core.date.DateUtil;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateRangeSplitter {

    public static List<Date[]> splitDateRange(Date bTime, Date eTime) {
        List<Date[]> dateRanges = new ArrayList<>();

        Calendar startCal = Calendar.getInstance();
        startCal.setTime(bTime);
        Calendar endCal = Calendar.getInstance();
        endCal.setTime(eTime);

        while (startCal.getTime().before(eTime)) {
            Calendar endOfDay = (Calendar) startCal.clone();
            endOfDay.set(Calendar.HOUR_OF_DAY, 23);
            endOfDay.set(Calendar.MINUTE, 59);
            endOfDay.set(Calendar.SECOND, 59);
            endOfDay.set(Calendar.MILLISECOND, 999);

            if (endOfDay.getTime().after(eTime)) {
                endOfDay.setTime(eTime);
            }

            Date[] range = new Date[2];
            range[0] = startCal.getTime();
            range[1] = endOfDay.getTime();
            dateRanges.add(range);

            startCal.add(Calendar.DAY_OF_MONTH, 1);
            startCal.set(Calendar.HOUR_OF_DAY, 0);
            startCal.set(Calendar.MINUTE, 0);
            startCal.set(Calendar.SECOND, 0);
            startCal.set(Calendar.MILLISECOND, 0);
        }

        return dateRanges;
    }


    public static void main(String[] args) {
        Date startDate = DateUtil.parse("2024-03-25 12:11:32", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Date endDate = DateUtil.parse("2024-03-27 10:20:21", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        List<Date[]> dateRanges = splitDateRange(startDate, endDate);

        for (Date[] range : dateRanges) {
            System.out.println("[" + range[0] + " , " + range[1] + "]");
        }
    }
}


