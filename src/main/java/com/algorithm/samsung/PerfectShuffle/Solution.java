package com.algorithm.samsung.PerfectShuffle;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class Solution {
    public static void main(String arg[]) {
        solution();
    }

    static void solution() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int length = sc.nextInt();
            String[] questions = new String[length];
            for (int j = 0; j < length; j++) {
                questions[j] = sc.next();
            }
            printResult(sb, i + 1, getResult(questions));
        }
    }

    static List<String> getResult(String[] questions) {
        List<String> results = new ArrayList<>();
        int mid = (int) Math.ceil((double) questions.length / 2);

        Queue<String> left = new LinkedBlockingQueue<>();
        for (int i = 0; i < mid; i++) {
            left.offer(questions[i]);
        }
        Queue<String> right = new LinkedBlockingQueue<>();
        for (int i = mid; i < questions.length; i++) {
            right.offer(questions[i]);
        }

        for (int i = 0; i < mid; i++) {
            if (!left.isEmpty()) {
                results.add(left.poll());
            }
            if (!right.isEmpty()) {
                results.add(right.poll());
            }
        }
        return results;
    }

    static void printResult(StringBuilder sb, int index, List<String> results) {
        sb.setLength(0);
        sb.append("#");
        sb.append(index);
        sb.append(" ");
        for (int i = 0; i < results.size(); i++) {

            sb.append(results.get(i));
            if (i != results.size() - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}