package com.algorithm.sort;

public class MergeSort {
    private static int[] unsorted_array = {2, 1390, 425, 1122, 1208, 1443, 462, 1155, 849, 455, 1053, 1155, 318, 79, 788};

    private int[] numbers;
    private int[] helpers;

    public static void main(String args[]) {
        MergeSort merge = new MergeSort();
        merge.sort(unsorted_array);
    }

    void sort(int[] values) {
        numbers = values;
        int size = values.length;
        helpers = new int[size];
        mergeSort(0, size);
    }

    private void mergeSort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    private void merge(int low, int middle, int high) {
        System.arraycopy(numbers, low, helpers, low, high - low);
        int l = low;
        int l2 = low;
        int mid = middle + 1;
        while (l <= middle && mid < high) {
            if (helpers[l] <= helpers[mid]) {
                numbers[l2] = helpers[l];
                l++;
            } else {
                numbers[l2] = helpers[mid];
                mid++;
            }
            l2++;
        }
        while (l <= middle) {
            numbers[l2] = helpers[l];
            l2++;
            l++;
        }
    }
}

