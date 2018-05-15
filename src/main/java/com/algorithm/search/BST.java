package com.algorithm.search;

public class BST {
    private static int[] sorted_array = {228, 347, 575, 613, 775, 1035, 1346, 1437, 1532, 2163, 2316, 2412, 2245, 2432, 2403, 2549, 2574, 1050, 2680, 2691, 38, 2699, 827, 971, 2759, 921, 2759, 787, 1617, 2187};

    public static void main(String[] args) {
        BST bts = new BST();
        int a = bts.binarySearch(sorted_array, 1035);
        int b = bts.binarySearch(sorted_array, 2432);
        System.out.println(a);
        System.out.println(b);
    }

    private int binarySearch(int[] values, int value) {
        int mid;
        int min = 0;
        int max = values.length;

        while (min <= max) {
            mid = (int) Math.floor((min + max) / 2);
            int result = values[mid];
            if (result == value) {
                return mid;
            }

            if (result < value) {
                min = mid + 1;
            }
            if (result > value) {
                max = mid - 1;
            }
        }
        return -1;
    }
}
