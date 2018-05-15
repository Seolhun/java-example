package com.algorithm.bj.progress.step8.done.Q1475;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/1157
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리 : 10912 KB
// 시간 : 88 MS
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine().replace('9', '6');

        int[] numbers = new int[10];
        for (int i = 0; i < N.length(); i++) {
            numbers[N.charAt(i) - 48]++;
        }

        // 4, 3개 일때 2세트 필요, 2, 1개일때 1세트 필요
        numbers[6] = numbers[6] / 2 + numbers[6] % 2;
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
