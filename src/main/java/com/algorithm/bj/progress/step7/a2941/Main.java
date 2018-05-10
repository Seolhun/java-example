package com.algorithm.bj.progress.step7.a2941;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/2941
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String Q = bf.readLine();
        System.out.println(solve(Q));
    }

    static int solve(String question) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < question.length(); j++) {
                String q = question.substring(j, question.length());
                if (q.contains(arr[i])) {
                    result++;
                }
            }
        }
        return result;
    }
}
