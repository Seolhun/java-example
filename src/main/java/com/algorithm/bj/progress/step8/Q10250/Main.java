package com.algorithm.bj.progress.step8.Q10250;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/10250
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 속도 12088 KB
// 속도 180 MS
public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // Testcase
        int t = Integer.parseInt(bf.readLine());
        for (int i = 0; i < t; i++) {
            String[] Q = bf.readLine().split(" ");
            int M = Integer.parseInt(Q[0]);
            int N = Integer.parseInt(Q[1]);
            int x = Integer.parseInt(Q[2]);
            int y = Integer.parseInt(Q[3]);
            System.out.println(kaing(M, N, x, y));
        }
    }

    static int kaing(int M, int N, int x, int y) {
        int temp = 0;
        int count = 1;

        if (M > N) {
            temp = N;
            N = M;
            M = temp;
            temp = x;
            x = y;
            y = temp;
        }

        int diffMN = Math.abs(M - N);
        int diffXY;
        if (x > y) {
            diffXY = (y + N) - x;
        } else {
            diffXY = y - x;
        }
        int temp1 = 1;
        int temp2 = 1;

        while (true) {
            if ((temp2 - temp1) == diffXY) {
                count += (x - 1);
                break;
            } else {
                if ((temp2 - diffMN) <= 0) {
                    temp2 = N + temp2 - diffMN;
                } else {
                    temp2 = temp2 - diffMN;
                }
                count += M;
            }

            if (temp2 == 1) {
                count = -1;
                break;
            }
        }
        return count;
    }

}