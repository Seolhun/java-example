package com.algorithm.samsung.done.Dallant2;

import java.util.Scanner;

public class Solution {
    public static void main(String arg[]) {
        solution();
    }

    static void solution() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int dallant = sc.nextInt();
            int bundle = sc.nextInt();
            printResult(sb, i, getResult(dallant, bundle));
        }
        sc.close();
    }

    static long getResult(int dallant, int bundle) {
        int division = dallant / bundle;
        int rest = dallant % bundle;
        return (long) Math.pow(division, bundle - rest) * (long) Math.pow(division + 1, rest);
    }

    static void printResult(StringBuilder sb, int index, long result) {
        sb.setLength(0);
        sb.append("#");
        sb.append(index);
        sb.append(" ");
        sb.append(result);
        System.out.println(sb.toString());
    }
}