package com.algorithm.sort;

import java.util.Arrays;

public class MergeSort {
    private static int[] unsorted_array = {2, 1390, 425, 1122, 1208, 1443, 462, 1155, 849, 455, 1053, 1155, 318, 79, 788};
    private int[] numbers;
    private int[] helper;

    public static void main(String args[]) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(unsorted_array);
    }

    public void sort(int[] values) {
        this.numbers = values;
        int size = values.length;
        this.helper = new int[size];
        mergesort(0, size - 1);
    }

    private void mergesort(int low, int high) {
        if (low < high) {
            int middle = low + ((high - low) / 2);
            mergesort(low, middle);
            mergesort(middle + 1, high);
            merge(low, middle, high);
            System.out.println(Arrays.toString(unsorted_array));
        }
    }

    private void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int l1 = low;
        int mid = middle + 1;
        int l2 = low;
        while (l1 <= middle && mid <= high) {
            if (helper[l1] <= helper[mid]) {
                numbers[l2] = helper[l1];
                l1++;
            } else {
                numbers[l2] = helper[mid];
                mid++;
            }
            l2++;
        }
        while (l1 <= middle) {
            numbers[l2] = helper[l1];
            l2++;
            l1++;
        }

    }
}