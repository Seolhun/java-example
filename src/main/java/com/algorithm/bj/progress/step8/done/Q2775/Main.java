package com.algorithm.bj.progress.step8.done.Q2775;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/2775
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리 : 10816 KB
// 속도 : 92 MS
public class Main {
    private static int[] houses;

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int i = 0; i < t; i++) {
            // 층
            int k = Integer.parseInt(bf.readLine());
            // 호
            int n = Integer.parseInt(bf.readLine());
            houses = new int[n];
            for (int j = 0; j < n; j++) {
                houses[j] = j + 1;
            }
            System.out.println(solve(k, n, 0));
        }
    }

    static int solve(int k, int n, int index) {
        if (index == k) {
            return houses[n - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int sum = 0;
            for (int j = i; j >= 0; j--) {
                sum += houses[j];
            }
            houses[i] = sum;
        }
        return solve(k, n, index + 1);
    }
}
