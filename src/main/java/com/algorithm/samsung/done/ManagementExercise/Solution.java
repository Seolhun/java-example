package com.algorithm.samsung.done.ManagementExercise;

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
            int[] questions = new int[3];
            for (int j = 0; j < 3; j++) {
                 questions[j] = sc.nextInt();
            }
            printResult(sb, i + 1, getResult(questions));
        }
        sc.close();
    }

    static int getResult(int[] questions){
        if(questions[1] < questions[2]) {
            return -1;
        }

        if(questions[0] < questions[2]) {
            return 0;
        }

        return questions[0] - questions[2];
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