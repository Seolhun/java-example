package com.algorithm.bj.progress.step7.a1316;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/1316
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
3
happy
new
year
*/

public class Main {
    // Testcase
    static int T;

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(bf.readLine());

        int result = 0;
        for (int i = 0; i < T; i++) {
            String Q = bf.readLine();
            char[] arr = new char[Q.length()];
            for (int j = 0; j < Q.length(); j++) {
                arr[j] = Q.charAt(j);
            }
            System.out.println(result);
        }
    }
}
