package com.algorithm.bj.progress.step7.done.a2675;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/2675
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
            String[] Q = bf.readLine().split(" ");
            int v = Integer.parseInt(Q[0]);
            String q = Q[1];

            sb.setLength(0);
            for (int j = 0; j < q.length(); j++) {
                for (int k = 0; k < v; k++) {
                    sb.append(q.charAt(j));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
