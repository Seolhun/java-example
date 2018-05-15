package com.algorithm;

public class AlgorithmUtils {
    private static long startTime;

    public static void startMethod() {
        startTime = System.currentTimeMillis();
        System.out.println("test Start Time : " + startTime);
    }

    public static void finishMethod() {
        long finishTime = System.currentTimeMillis();
        System.out.println("test Finish Time : " + finishTime);
        System.out.println("test Time Taken : " + (System.currentTimeMillis() - startTime));
    }

    public static int[] buildRandomList(int[] list) {
        for (int i = 0; i < list.length; ++i) {
            list[i] = setRnadomSize(list.length);
        }
        System.out.println("Ramdom Array is Created, counts : " + list.length );
        return list;
    }

    private static int setRnadomSize(int size) {
        return (int) (Math.random() * (double) (size * 100) + 1.0D);
    }
}
