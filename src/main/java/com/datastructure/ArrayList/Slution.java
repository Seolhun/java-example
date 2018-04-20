package com.datastructure.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Slution {
    public static void main(String args[]) {
        long startTime = System.currentTimeMillis();
        Integer[] array = new Integer[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = i;
        }
        long endTime = System.currentTimeMillis();
        printTime(startTime, endTime);

        long startTime2 = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long endTime2 = System.currentTimeMillis();
        printTime(startTime2, endTime2);

        long startTime3 = System.currentTimeMillis();
        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list2.add(i);
        }
        long endTime3 = System.currentTimeMillis();
        printTime(startTime3, endTime3);
    }


    static void printTime(long start, long end) {
        System.out.println("Runtime is : " + (end - start));
    }

    static void printList(Integer[] list) {
        for (Integer i : list) {
            System.out.printf(i + "\t");
        }
    }
}
