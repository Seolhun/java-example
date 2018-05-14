package com.algorithm.bj.progress.step8.Q2775;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/2775
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1, 3, 6
1, 4, 10
1, 5, 15
1, 6, 21,
1, 7, 28
 */
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // Testcase
        int t = Integer.parseInt(bf.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(bf.readLine());
            int n = Integer.parseInt(bf.readLine());
            System.out.println(solve(k, n));
        }
    }

    static int solve(int k, int n) {
        if(n == 1) {
            return 1;
        }
        if (n == 2) {
            return k + 2;
        }
        if (n == 3) {
            int result = 6;
            int init = 4;
            for (int i = 1; i < k; i++) {
                result += init;
                init++;
            }
            return result;
        }
        return n;
    }
}
