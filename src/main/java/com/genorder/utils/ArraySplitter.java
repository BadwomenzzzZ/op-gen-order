package com.genorder.utils;

import java.util.ArrayList;
import java.util.List;

public class ArraySplitter {


    public static List<String>[] splitArray(List<String> arr, double ratio) {
        int totalElements = arr.size();
        int splitPoint = (int) (totalElements * ratio);

        List<String> firstPart = arr.subList(0, splitPoint);
        List<String> secondPart = arr.subList(splitPoint, totalElements);

        List<String>[] result = new List[2];
        result[0] = firstPart;
        result[1] = secondPart;
        return result;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        List<String>[] lists = splitArray(list, 0);
        System.out.println(lists[0]);
        System.out.println(lists[1]);
    }

}
