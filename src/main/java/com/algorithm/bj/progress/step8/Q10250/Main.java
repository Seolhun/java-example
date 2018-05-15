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

        // Testcase
        int t = Integer.parseInt(bf.readLine());
        for (int i = 0; i < t; i++) {
            String[] Q = bf.readLine().split(" ");
            int H = Integer.parseInt(Q[0]);
            int W = Integer.parseInt(Q[1]);
            int N = Integer.parseInt(Q[2]);

            solve(H, W, N);
        }
    }

    static void solve(int H, int W, int N) {
        // 높이 (층)
        int floor = N % H == 0 ? H : N % H;
        // 넓이 (호)
        int ho = (int) Math.ceil((double) N / H);
        if(ho >= 10) {
            ho += 1;
        }

        String strFloor = "";
        if (H >= 10 && floor < 10) {
            strFloor = String.format("%02d", floor);
        }
        String strHo = "";
        if (W >= 10 && ho < 10) {
            strHo = String.format("%02d", ho);
        }
        System.out.print(strFloor.length() > 0 ? strFloor : floor);
        System.out.print(strHo.length() > 0 ? strHo : ho);
    }
}
