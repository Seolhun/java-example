package com.algorithm.sort;

import java.util.Arrays;

public class InsertionSort {
    private static int[] unsorted_array = {10, 6, 4, 5, 1};

    public static void main(String args[]) {
        for (int i = 0; i < unsorted_array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (unsorted_array[i] < unsorted_array[j]) {
                    int temp = unsorted_array[i];
                    System.arraycopy(unsorted_array, j, unsorted_array, j + 1, i - j);
                    unsorted_array[j] = temp;
                    System.out.println(i + " Step is : " + Arrays.toString(unsorted_array));
                    break;
                }
            }
        }
    }
    // 1 Step is : [6, 10, 4, 5, 1]
    // 2 Step is : [4, 6, 10, 5, 1]
    // 3 Step is : [4, 5, 6, 10, 1]
    // 4 Step is : [1, 4, 5, 6, 10]
}
