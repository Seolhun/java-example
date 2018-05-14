package com.algorithm.bj.progress.step8.done.Q1924;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/1924
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리 : 10992 KB
// 속도 : 88 MS

public class Main {
    private static int[] monthes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static String[] strDay = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = bf.readLine().split(" ");
        int month = Integer.parseInt(inputs[0]);
        int day = Integer.parseInt(inputs[1]);
        System.out.println(solve(month, day));
    }

    static String solve(int month, int day) {
        int days = 0;
        for (int i = 0; i < month - 1; i++) {
            days += monthes[i];
        }
        days = (days + day) % 7;
        return strDay[days];
    }
}
