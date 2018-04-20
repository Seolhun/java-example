package com.algorithm.samsung.PossibleExamPoints;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private static int sum;
    private static int result;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            String[] questions = br.readLine().split(" ");

            sum = 0;
            result = 0;
            int[] points = new int[N];
            for (int j = 0; j < N; j++) {
                int point = Integer.parseInt(questions[j]);
                points[j] = point;
                sum += point;
            }
            printResult(sb, i + 1, getResult(points));
        }
        br.close();
    }

    private static int getResult(int[] questions) {
        boolean[] checks = new boolean[sum];
        checks[0] = true;
        checks[sum - 1] = true;

        for (int i = 0; i < questions.length; i++) {
            for (int j = 0; j < questions.length; j++) {
                checks[questions[j] + questions[i]] = true;
            }
        }
        for (boolean c : checks) {
            if (c) {
                result++;
            }
        }
        return result;
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
