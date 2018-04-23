package com.algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();

        scan = new Scanner(System.in);
        System.out.println("Insert Array Size");
        int size = scan.nextInt();
        int[] list = new int[size];
        setIntNotDuplication(list);

        int[] quickList = new int[list.length];
        System.arraycopy(list, 0, quickList, 0, quickList.length);
        int[] mergeList = new int[list.length];
        System.arraycopy(list, 0, mergeList, 0, quickList.length);

        long start = System.currentTimeMillis();
        System.out.println("Start Quick Sort");
        quickSort.sort(quickList, 0, list.length - 1);
        long end = System.currentTimeMillis();
        System.out.println("End Quick Sorted time : " + (end - start));


        long start2 = System.currentTimeMillis();
        System.out.println("Start Merge Sort");
        mergeSort.sort(mergeList);
        long end2 = System.currentTimeMillis();
        System.out.println("End Merge Sorted time : " + (end2 - start2));
    }

    private static void setIntNotDuplication(int[] list) {
        for (int i = 0; i < list.length; ++i) {
            list[i] = setRnadomSize(list.length);
            for (int j = 0; j < list.length; ++j) {
                if (list[j] == list[i]) {
                    list[i] = setRnadomSize(list.length);
                }
            }
        }
        System.out.println("Ramdom Array is Created : " + Arrays.toString(list));
    }

    private static int setRnadomSize(int size) {
        return (int) (Math.random() * (double) (size * 100) + 1.0D);
    }
}
