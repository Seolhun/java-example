package com.algorithm.bj.progress.step8.done.Q2438;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/2438
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // Testcase
    static int T;

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            sb.append("*");
            System.out.println(sb.toString());
        }
    }
}
