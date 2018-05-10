package com.algorithm.bj.progress.step7.done.a10809;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/2675
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String Q = bf.readLine();

        int length = ('z' - 'a') + 1;
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < Q.length(); i++) {
            int q = Q.charAt(i) - 96 - 1;
            if (arr[q] == -1) {
                arr[q] = i;
            }
        }
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
    }
}
