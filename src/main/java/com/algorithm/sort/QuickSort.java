package com.algorithm.sort;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class QuickSort {

    private static Scanner scan;

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        List<Integer> list = new ArrayList<>();
        scan = new Scanner(System.in);

        System.out.println("Insert Array Size");
        int size = scan.nextInt();

        System.out.println("Ramdom Array is Creating");
        quickSort.setIntNotDuplication(list, size);
        System.out.println("Ramdom Array is Created");

        Date date = new Date();
        System.out.println("Start Quick Sort");
        quickSort.quickSort(list, 0, list.size() - 1);
        System.out.println("End Quick Sorted List : " + list);
        System.out.println("End Quick Sort size : " + size);

        Date date2 = new Date();
        System.out.println("End Quick Sorted time : " + (date2.getTime() - date.getTime()));
    }

    private void quickSort(List<Integer> list, int lowest, int highest) {
        if (list == null || list.size() < 1) {
            return;
        } else if (lowest >= highest) {
            return;
        }

        int middle = lowest + ((highest - lowest) / 2);
        int pivot = list.get(middle);

        int i = lowest;
        int j = highest;

        while (i <= j) {
            while (list.get(i) < pivot) {
                i++;
            }

            while (list.get(j) > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                i++;
                j--;
            }
        }

        if (lowest < j)
            quickSort(list, lowest, j);

        if (highest > i)
            quickSort(list, i, highest);
    }


    //중복 없는 배열 만들기

    private void setIntNotDuplication(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(setRnadomSize(size));
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) == list.get(i)) {
                    list.set(i, setRnadomSize(size));
                    j = 0;
                }
            }
        }
        System.out.println("param : Random List : " + list);
    }

    // 랜덤 숫자 만들기

    private int setRnadomSize(int size) {
        return (int) ((Math.random() * (size * 100)) + 1);
    }
}

