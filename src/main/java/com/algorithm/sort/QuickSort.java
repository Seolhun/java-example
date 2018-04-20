package com.algorithm.sort;

import java.util.Arrays;

public class QuickSort {
    private static int[] unsorted_array = {10, 6, 4, 5, 1};

    public static void main(String args[]) {
        quickSort(unsorted_array, 0, unsorted_array.length - 1);
    }

    private static void quickSort(int[] list, int lowest, int highest) {
        if (lowest >= highest) {
            return;
        }

        int mid = lowest + ((highest - lowest) / 2);
        int pivot = list[mid];

        int i = lowest;
        int j = highest;

        while (i <= j) {
            while (list[i] < pivot) {
                i++;
            }

            while (list[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(unsorted_array));
        if (lowest < j) {
            quickSort(list, lowest, j);
        }

        if (highest > i) {
            quickSort(list, i, highest);

        }
    }
}

