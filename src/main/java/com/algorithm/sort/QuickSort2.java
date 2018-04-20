package com.algorithm.sort;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class QuickSort2 {
    public QuickSort2() {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        QuickSort2 quickSort = new QuickSort2();

        scan = new Scanner(System.in);
        System.out.println("Insert Array Size");
        int size = scan.nextInt();
        int[] list = new int[size];

        quickSort.setIntNotDuplication(list);

        Date start = new Date();
        System.out.println("Start Quick Sort");
        quickSort.quickSort(list, 0, list.length - 1);
        Date end = new Date();
        System.out.println("End Quick Sorted time : " + (start.getTime() - end.getTime()));
    }

    private void quickSort(int[] list, int lowest, int highest) {
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
        System.out.println(Arrays.toString(list));

        if (lowest < j) {
            quickSort(list, lowest, j);
        }

        if (highest > i) {
            quickSort(list, i, highest);

        }
    }

    private void setIntNotDuplication(int[] list) {
        for(int i = 0; i < list.length; ++i) {
            list[i] = this.setRnadomSize(list.length);
            for(int j = 0; j < list.length; ++j) {
                if (list[j] == list[i]) {
                    list[i] = this.setRnadomSize(list.length);
                }
            }
        }
        System.out.println("Ramdom Array is Created : " + Arrays.toString(list));
    }

    private int setRnadomSize(int size) {
        return (int)(Math.random() * (double)(size * 100) + 1.0D);
    }
}
