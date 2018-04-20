package com.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {
    private static int[] unsorted_array = {10, 6, 4, 5, 1};

    public static void main(String args[]) {
        for (int i = 1; i <= unsorted_array.length; i++) {
            for (int j = 0; j < unsorted_array.length - i; j++) {
                if (unsorted_array[j] > unsorted_array[j + 1]) {
                    int temp = unsorted_array[j + 1];
                    unsorted_array[j + 1] = unsorted_array[j];
                    unsorted_array[j] = temp;
                    System.out.println(i + " Step is : " + Arrays.toString(unsorted_array));
                }
            }
        }
    }
    // 1 Step is : [6, 10, 4, 5, 1]
    // 1 Step is : [6, 4, 10, 5, 1]
    // 1 Step is : [6, 4, 5, 10, 1]
    // 1 Step is : [6, 4, 5, 1, 10]
    // 2 Step is : [4, 6, 5, 1, 10]
    // 2 Step is : [4, 5, 6, 1, 10]
    // 2 Step is : [4, 5, 1, 6, 10]
    // 3 Step is : [4, 1, 5, 6, 10]
    // 4 Step is : [1, 4, 5, 6, 10]
}
