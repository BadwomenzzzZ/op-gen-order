package com.genorder.utils;

import cn.hutool.core.collection.CollectionUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        int totalNum = 10;
        int num = 5;
        int totalAttempts = 3;
        int minPerDay = 1; // 默认为1

        for (int j = 0; j < 100; j++) {
            List<Integer> resultList = finalRandomList(totalNum, num, totalAttempts, minPerDay);
            int sum = 0;
            for (Integer i : resultList) {
                sum += i;
            }
            System.out.println("resultList = " + resultList);
            if (sum != totalNum)
            {
                System.out.println("Generated List: " + resultList);
                System.out.println("sum = " + sum);
            }
        }
    }

    public static List<Integer> finalRandomList(int totalNum, int num, int totalAttempts, int minPerDay){
        List<Integer> list = generateRandomList(totalNum, num, totalAttempts, minPerDay);
        if (CollectionUtil.isEmpty(list)) {
            return list;
        }
        for (Integer integer : list) {
            if (integer.intValue() < 0) {
                return new ArrayList<>();
            }
        }
        int maxNum = CollectionUtil.max(list);
        if (maxNum > num) {
            return finalRandomList(totalNum, num, totalAttempts, minPerDay);
        }
        return list;
    }

    public static List<Integer> generateRandomList(int totalNum, int num, int totalAttempts, int minPerDay) {
        List<Integer> resultList = new ArrayList<>();
        if (totalNum > num * totalAttempts) {
            return resultList;
        }

        Random random = new Random();

        int remainingTotal = totalNum;
        int remainingAttempts = totalAttempts;

        for (int i = 0; i < totalAttempts; i++) {
            if (remainingAttempts <= 0) {
                resultList.add(0);
            } else if (remainingAttempts == 1) {
                // Last attempt, fill with remaining total
                resultList.add(remainingTotal);
                remainingTotal = 0;
                remainingAttempts--;
            } else {
                int maxPossible = Math.min(num, remainingTotal - (remainingAttempts - 1) * minPerDay);
                int currentAttempt = 0;
                if (maxPossible >= minPerDay) {
                    currentAttempt = random.nextInt(maxPossible - minPerDay + 1) + minPerDay;
                } else {
                    currentAttempt = maxPossible;
                }
                resultList.add(currentAttempt);
                remainingTotal -= currentAttempt;
                remainingAttempts--;
            }
        }

        return resultList;
    }
}
