package com.algorithm.samsung.done.SyncClock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int T;
    static final int INF = 9999;
    static final int SWITCHES = 10;
    static final int CLOCK = 16;

    // 현재 시계들의 상태
    static int[] clocks = new int[CLOCK];
    // 스위치와 연결된 시계상태
    static boolean[][] linked = {
            {true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false},
            {false, false, false, true, false, false, false, true, false, true, false, true, false, false, false, false},
            {false, false, false, false, true, false, false, false, false, false, true, false, false, false, true, true},
            {true, false, false, false, true, true, true, true, false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, true, true, true, false, true, true, false, false, false, false},
            {true, false, true, false, false, false, false, false, false, false, false, false, false, false, true, true},
            {false, false, false, true, false, false, false, false, false, false, false, false, false, false, true, true},
            {false, false, false, false, true, true, false, true, false, false, false, false, false, false, true, true},
            {false, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false},
            {false, false, false, true, true, true, false, false, false, true, false, false, false, true, false, false},
    };

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= T; i++) {
            String[] N = bf.readLine().split(" ");
            for (int j = 0; j < N.length; j++) {
                clocks[j] = Integer.parseInt(N[j]);
            }
            // 게임 판 높이
            printResult(sb, i, getResult(clocks, 0));
        }
        bf.close();
    }

    static boolean areSynced() {
        for (int clock : clocks) {
            if (clock != 12) {
                return false;
            }
        }
        return true;
    }

    static void passTime(int[] clocks, int swtch) {
        for (int clock = 0; clock < CLOCK; clock++) {
            if (linked[swtch][clock]) {
                clocks[clock] += 3;
                if (clocks[clock] == 15) {
                    clocks[clock] = 3;
                }
            }
        }
    }

    static int getResult(int[] clocks, int swtch) {
        if (swtch == SWITCHES) {
            return areSynced() ? 0 : INF;
        }
        int result = INF;
        for (int cnt = 0; cnt < 4; cnt++) {
            result = Math.min(result, cnt + getResult(clocks, swtch + 1));
            passTime(clocks, swtch);
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