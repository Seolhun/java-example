package com.algorithm.bj.progress.step9.Q2108;
/**
 * @author SeolHun
 * @see https://www.acmicpc.net/problem/2108
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리 :
// 속도 :
public class Main {
    private static int T;
    private static int[] counts;
    private static int max = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(bf.readLine());
        int[] inputs = new int[T];

        for (int i = 0; i < T; i++) {
            inputs[i] = Integer.parseInt(bf.readLine());
        }
        // Print Answer
        solve(inputs);
    }

    static int findMaxValue(int[] values) {
        for (int value : values) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    static int[] countingSort(int[] arr) {
        int[] results = new int[arr.length + 1];
        counts = new int[max + 1];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        for (int value : arr) {
            counts[value] = counts[value] + 1;
        }

        // 누적수 구하기
        for (int i = 1; i < counts.length; i++) {
            counts[i] = counts[i] + counts[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            results[counts[arr[i]]] = arr[i];
            counts[arr[i]] = counts[arr[i]] - 1;
        }
        return results;
    }

    static int getAverage(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return Math.round(sum / arr.length);
    }

    static int getMidInArray(int[] arr) {
        int mid = (int) Math.floor(arr.length / 2);
        return arr[mid];
    }

    static int getRange(int[] arr, int max) {
        return arr[max - 1] = arr[0];
    }

    static int getMostFrequency() {
        int max = 0;
        int index = 0;
        for (int i = 0; i < counts.length; i++) {
            if(max < counts[i]) {
                max = counts[i];
                index = i;
            }
        }
        return index;
    }

    static void solve(int[] arr) {
        findMaxValue(arr);
        // Counting Sort
        arr = countingSort(arr);
        // Average
        System.out.println(getAverage(arr));
        // Mid
        System.out.println(getMidInArray(arr));
        // Frequency
        System.out.println(getMostFrequency());
        // Range
        System.out.println(getRange(arr, max));
    }
}
