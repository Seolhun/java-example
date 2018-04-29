package com.algorithm.sort;

import java.util.Arrays;

public class CountingSort {
    private static int[] unsorted_array = {2, 139, 42, 112, 120, 144, 46, 115, 84, 45, 105, 115, 31, 79, 78};

    private int[] counts;

    public static void main(String args[]) {
        CountingSort countingSort = new CountingSort();
        System.out.println(Arrays.toString(countingSort.sort(unsorted_array)));
    }

    int[] sort(int[] values) {
        int[] results = new int[values.length + 1];


        int max = findMaxValue(values);
        counts = new int[max + 1];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        for (int value : values) {
            counts[value] = counts[value] + 1;
        }

        // 누적수 구하기
        for (int i = 1; i < counts.length; i++) {
            counts[i] = counts[i] + counts[i - 1];
        }

        for (int i = values.length - 1; i >= 0; i--) {
            results[counts[values[i]]] = values[i];
            counts[values[i]] = counts[values[i]] - 1;
            System.out.println(i + " : " + Arrays.toString(results));
        }
        return results;
    }

    private int findMaxValue(int[] values) {
        int max = 0;
        for (int value : values) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }
}
