package com.algorithm.sort;

import com.algorithm.AlgorithmUtils;

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
        list = AlgorithmUtils.buildRandomList(list);

        int[] quickList = new int[list.length];
        System.arraycopy(list, 0, quickList, 0, quickList.length);
        int[] mergeList = new int[list.length];
        System.arraycopy(list, 0, mergeList, 0, quickList.length);

        long start = System.currentTimeMillis();
        System.out.println("Start Quick Sort");
        quickSort.sort(quickList, 0, list.length - 1);
        System.out.println(Arrays.toString(quickList));
        long end = System.currentTimeMillis();
        System.out.println("End Quick Sorted time : " + (end - start));


        long start2 = System.currentTimeMillis();
        System.out.println("Start Merge Sort");
        mergeSort.sort(mergeList);
        System.out.println(Arrays.toString(mergeList));
        long end2 = System.currentTimeMillis();
        System.out.println("End Merge Sorted time : " + (end2 - start2));
    }
}
