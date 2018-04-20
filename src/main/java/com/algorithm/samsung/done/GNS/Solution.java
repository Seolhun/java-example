package com.algorithm.samsung.done.GNS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Integer.parseInt(br.readLine().split(" ")[1]);
            String[] questions = br.readLine().split(" ");
            printResult(sb, i + 1, getResult(questions));
        }
    }

    private static String[] getResult(String[] arr) {
        int[] results = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            results[i] = Number.valueOf(arr[i]).number;
        }
        Arrays.sort(results);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Number.printValue(results[i]);
        }
        return arr;
    }

    public enum Number {
        ZRO(0),
        ONE(1),
        TWO(2),
        THR(3),
        FOR(4),
        FIV(5),
        SIX(6),
        SVN(7),
        EGT(8),
        NIN(9);

        private int number;

        Number(int n) {
            this.number = n;
        }

        public static String printValue(int number) {
            for (Number n : Number.values()) {
                if (number == n.number) {
                    return n.name();
                }
            }
            return null;
        }
    }

    static void printResult(StringBuilder sb, int index, String[] result) {
        sb.setLength(0);
        sb.append("#");
        sb.append(index);
        sb.append(" ");
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
            if (i != result.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
