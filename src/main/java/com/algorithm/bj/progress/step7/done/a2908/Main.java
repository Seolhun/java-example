package com.algorithm.bj.progress.step7.done.a2908;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/2908
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int T;

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] Q = bf.readLine().split(" ");
        int a = Integer.parseInt(Q[0]);
        int b = Integer.parseInt(Q[1]);
        a = reverse(a);
        b = reverse(b);
        System.out.println(a > b ? a : b);
    }

    static int reverse(int value) {
        int rev = 0;
        while (value != 0) {
            rev = (rev * 10) + (value % 10);
            value = value / 10;
        }
        return rev;
    }
}
