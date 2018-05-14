package com.algorithm.bj.progress.step8.Q1011;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/1011
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] movements = new int[]{-1, 0, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // Testcase
        int t = Integer.parseInt(bf.readLine());

        for (int i = 0; i < t; i++) {
            String[] Q = bf.readLine().split(" ");
            int x = Integer.parseInt(Q[0]);
            int y = Integer.parseInt(Q[1]);

            int[] starts = new int[]{-1, 0, 1};
            int min = move(x, y, starts);
            System.out.println();
        }
    }

    static int move(int x, int y, int[] starts) {
        for (int i = 0; i <starts.length ; i++) {
            if(starts[i] < 1) {
                starts[i] = starts[i] + 1;
                x += 1;
            }
        }
        if (x != y) {
            return move(x, y, starts);
        }
        return 0;
    }
}
