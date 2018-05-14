package com.algorithm.bj.progress.step8.done.Q2292;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/2292
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리 : 11008 KB
// 시간 : 88 MS
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        System.out.println(solve(T));
    }

    static int solve(int input) {
        if (input == 1) {
            return 1;
        }

        boolean repeat = true;
        int init = 1;
        int ascent = 1;
        while (repeat) {
            init += 6 * ascent;
            ascent++;
            if (init >= input) {
                repeat = false;
            }
        }
        return ascent;
    }
}
