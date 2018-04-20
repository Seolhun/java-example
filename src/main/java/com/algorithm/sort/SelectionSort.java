package com.algorithm.sort;

import java.util.Arrays;

public class SelectionSort {
    private static int[] unsorted_array = {10, 6, 4, 5, 1};

    public static void main(String args[]) {
        for (int i = 0; i < unsorted_array.length; i++) {
            int min = unsorted_array[i];
            int min_index = i;
            for (int j = i; j < unsorted_array.length - 1; j++) {
                if (min > unsorted_array[j + 1]) {
                    min = unsorted_array[j + 1];
                    min_index = j + 1;
                }
            }

            // Re-arrange
            if (min < unsorted_array[i]) {
                for (int j = min_index; j > i; j--) {
                    unsorted_array[j] = unsorted_array[j - 1];
                }
                // System.arraycopy(unsorted_array, i, unsorted_array, i + 1, min_index - i);
                unsorted_array[i] = min;
                System.out.println(i + 1+ " Step is : " + Arrays.toString(unsorted_array));
            }
        }
    }

    // 0 Step is : [10, 6, 4, 5, 1]
    // 1 Step is : [1, 10, 6, 4, 5]
    // 2 Step is : [1, 4, 10, 6, 5]
    // 3 Step is : [1, 4, 5, 10, 6]
    // 4 Step is : [1, 4, 5, 6, 10]
}
