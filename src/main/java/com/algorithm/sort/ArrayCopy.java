package com.algorithm.sort;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String args[]) {
        // 원본 배열(복사 할), 복사 시작점, 복사본 배열(붙여넣기 할), 붙여넣기 할 시작지점, 붙여넣기 할 길이
        int[] unsorted_array = {1, 2, 3, 4, 5, 6};
        System.arraycopy(unsorted_array, 3, unsorted_array, 1, 3);
        System.out.println(Arrays.toString(unsorted_array));
        // 1, 2, 3, 4, 5, 6
        // 1, 4, 5, 6, 5, 6


        int[] unsorted_array2 = {1, 2, 3, 4, 5, 6};
        System.arraycopy(unsorted_array2, 0, unsorted_array2, 3, 3);
        System.out.println(Arrays.toString(unsorted_array2));
        // 1, 2, 3, 4, 5, 6
        // 1, 2, 3, 1, 2, 3

        int[] unsorted_array3 = {1, 2, 3, 4, 5, 6};
        System.arraycopy(unsorted_array3, 2, unsorted_array3, 4, 2);
        System.out.println(Arrays.toString(unsorted_array3));
        // 1, 2, 3, 4, 5, 6
        // 1, 2, 3, 4, 3, 4
    }
}
