package com.algorithm.bj.progress.step8.Q10250;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/10250
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Testcase
        int t = Integer.parseInt(bf.readLine());
        for (int i = 0; i < t; i++) {
            String[] Q = bf.readLine().split(" ");
            int H = Integer.parseInt(Q[0]);
            int W = Integer.parseInt(Q[1]);
            int N = Integer.parseInt(Q[2]);

            System.out.println(solve(H, W, N));
        }
    }

    static String solve(int H, int W, int N) {
        int XX = N % H == 0 ? H : N % H;
        int YY = N < H ? N : N % H == 0 ? W : N / H + 1;

        String strXX = String.valueOf(XX);
        String strH = String.valueOf(H);

        if (strH.length() != 1) {
            if (strXX.length() == 1) {
                strXX = "0" + strXX;
            }
        }

        String strYY = String.valueOf(YY);
        String strW = String.valueOf(W);

        if (strW.length() != 1) {
            if (strYY.length() == 1) {
                strYY = "0" + strYY;
            }
        }
        return strXX + strYY;
    }
}
