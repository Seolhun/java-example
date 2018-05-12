package com.algorithm.bj.progress.step8.Q1193;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/1157
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // Testcase
    static int T;

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(bf.readLine());

        int head = T / 10 + 1;
        int tail = (T % 10) == 0 ? 10 : T % 10;
        System.out.println(head + "/" + tail);
    }
}
