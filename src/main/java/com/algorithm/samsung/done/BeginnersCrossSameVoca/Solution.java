package com.algorithm.samsung.done.BeginnersCrossSameVoca;

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
            String voca = sc.next();
            printResult(sb, i + 1, getResult(voca));
        }
        sc.close();
    }

    static int getResult(String voca) {
        if (voca.equals(new StringBuilder(voca).reverse().toString())) {
            return 1;
        }
        return 0;
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