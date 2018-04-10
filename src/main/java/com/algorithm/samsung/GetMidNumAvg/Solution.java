package com.algorithm.samsung.GetMidNumAvg;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String arg[]) {
        solution();
    }

    static void solution() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int num[] = new int[10];
            for (int j = 0; j < num.length; j++) {
                num[j] = sc.nextInt();
            }
            printResult(sb, i + 1, getResult(num));
        }
    }

    static int getResult(int[] question) {
        int avg = 0;
        Arrays.sort(question);
        for (int i = 1; i < question.length - 1; i++) {
            avg += question[i];
        }
        return (int) Math.round((double) avg / 8);
    }

    static void printResult(StringBuilder sb, int index, int result) {
        sb.setLength(0);
        sb.append("#");
        sb.append(index);
        sb.append(" ");
        sb.append(result);
        System.out.println(sb.toString());
    }
}