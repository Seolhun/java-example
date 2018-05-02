package com.algorithm.samsung.progress.Hamberger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String arg[]) throws IOException {
        solution();
    }

    // 맨 위 줄에 테스트케이스의 개수가 주어진다.
    private static int T;
    // 각 테스트케이스 별로 순서대로 첫째 줄에 두 개의 정수 N, M (1 ≤ N ≤ 20, 0 ≤ M ≤ 400)이 주어진다.
    private static int N;
    private static int M;


    static void solution() throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            String firstLine = br.readLine();
            N = Integer.parseInt(firstLine.split(" ")[0]);
            M = Integer.parseInt(firstLine.split(" ")[1]);
            int notCombination[][] = new int[M][2];
            for (int j = 0; j < M; j++) {
                String secondLine = br.readLine();
                notCombination[j][0] = Integer.parseInt(secondLine.split(" ")[0]);
                notCombination[j][1] = Integer.parseInt(secondLine.split(" ")[1]);
            }
            printResult(sb, i, getResult(notCombination));
        }
        br.close();
    }

    static long getResult(int[][] notCombinations) {
        int allValue = 2 ^ notCombinations.length;

        for (int i = 0; i < notCombinations.length; i++) {
            for (int j = 0; j < notCombinations[i].length; j++) {

            }
        }
        return allValue;
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