package com.algorithm.bj.progress.step8.done.Q1193;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/1193
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리 11016 KB
// 속도 : 88 MS
public class Main {
    // Testcase
    static int input;

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        input = Integer.parseInt(bf.readLine());

        boolean repeat = true;
        int init = 0;
        int accumulation = 0;
        while (repeat) {
            init += 1;
            accumulation += init;
            if (accumulation >= input) {
                repeat = false;
            }
        }
        printResult(init, accumulation);
    }

    static void printResult(int init, int accumulation) {
        int rest = accumulation - input;

        // 짝수
        int a = init - rest;
        int b = 1 + rest;
        System.out.println(init % 2 == 0 ? a + "/" + b : b + "/" + a);
    }
}
