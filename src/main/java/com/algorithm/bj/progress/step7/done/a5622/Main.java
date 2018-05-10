package com.algorithm.bj.progress.step7.done.a5622;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/5622
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String Q = bf.readLine();
        int result = 0;
        for (int i = 0; i < Q.length(); i++) {
            result += getTime(Q.charAt(i) - 'A');
        }
        System.out.println(result);
    }

    static int getTime(int value) {
        int[] arr = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
        return arr[value];
    }
}
