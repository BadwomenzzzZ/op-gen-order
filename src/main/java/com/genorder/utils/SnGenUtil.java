package com.genorder.utils;

import com.genorder.config.Constant;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 订单编号生成
 */
public class SnGenUtil {
    // 随机数字和字母部分
    private static final String RANDOM_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int RANDOM_LENGTH = 14;
    // 日期格式化字符串
    private static final String DATE_FORMAT = "yyyyMMdd";

    // 生成订单编号方法
    public static String generateOrderNumber(String sn) {
        // 生成当前日期的字符串
        String dateStr = getCurrentDateStr();
        // 生成自增数字的字符串
        String sequenceStr = extractAndIncrementSequence(sn);
        // 生成随机数字和字母的字符串
        String randomStr = getRandomStr();
        // 组合四个部分生成完整订单号
        return Constant.ORDER_PRE + dateStr + sequenceStr + randomStr;
    }

    public static String generateOrderNumber() {
        // 生成当前日期的字符串
        String dateStr = getCurrentDateStr();
        // 生成自增数字的字符串
        String sequenceStr = "000001";
        // 生成随机数字和字母的字符串
        String randomStr = getRandomStr();
        // 组合四个部分生成完整订单号
        return Constant.ORDER_PRE + dateStr + sequenceStr + randomStr;
    }

    // 获取当前日期的字符串
    private static String getCurrentDateStr() {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.format(new Date());
    }
    public static String extractAndIncrementSequence(String orderNumber) {
        String sequenceStr = orderNumber.substring(12, 18);
        Integer newStr = Integer.parseInt(sequenceStr) + 1;
        String oldStr = newStr.toString();
        for (int i = 0; i < 6 - newStr.toString().length(); i++) {
            oldStr = "0".concat(oldStr);
        }
        return oldStr;
    }

    // 获取随机数字和字母的字符串
    private static String getRandomStr() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < RANDOM_LENGTH; i++) {
            int index = random.nextInt(RANDOM_CHARS.length());
            sb.append(RANDOM_CHARS.charAt(index));
        }
        return sb.toString();
    }



    //设备订单号生成
    public static String generateDeliversNumber() {
        return "0001";
    }

    public static String generateDeliversNumber(String num) {
        int dec = Integer.parseInt(num, 16);
        dec++;
        if (dec == 10000) {
            return "0001";
        }
        String oldStr = Integer.toHexString(dec);
        String hexStr = oldStr;
        for (int i = 0; i < 4 - oldStr.length(); i++) {
            hexStr = "0".concat(hexStr);
        }
        return hexStr.toUpperCase();
    }

    //生成交易流水号
    public static String transNumber() {
        return "42000018".concat(generateRandomNumber(20));
    }


    public static String generateRandomNumber(int numDigits) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(numDigits);
        for (int i = 0; i < numDigits; i++) {
            int digit = random.nextInt(10); // 生成0到9的随机数字
            sb.append(digit);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // 生成订单号并输出
//        String orderNumber = generateOrderNumber();
        String orderNumber = generateDeliversNumber("0001");
        System.out.println("订单编号：" + orderNumber);
    }


}
