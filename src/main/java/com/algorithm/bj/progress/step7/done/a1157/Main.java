package com.algorithm.bj.progress.step7.done.a1157;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/1157
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String Q = bf.readLine();
        Q = Q.toUpperCase();

        int[] arr = new int[26];
        for (int i = 0; i < Q.length(); i++) {
            arr[Q.charAt(i) - 'A'] = arr[Q.charAt(i) - 'A'] + 1;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int result = 0;
        int dupl = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                result = i;
                dupl++;
            }
            if (dupl > 1) {
                break;
            }
        }
        System.out.println(dupl > 1 ? "?" : (char) (result + 'A'));
    }
}

