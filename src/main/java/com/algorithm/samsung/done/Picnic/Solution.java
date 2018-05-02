package com.algorithm.samsung.done.Picnic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int n;
    static int m;
    static boolean[][] areFriends;
    static boolean[] taken;

    /*
     3
     2 1
     0 1
     4 6
     0 1 1 2 2 3 3 0 0 2 1 3
     6 10
     0 1 0 2 1 2 1 3 1 4 2 3 2 4 3 4 3 5 4 5
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= T; i++) {
            String N = bf.readLine();
            // 인원 수
            n = Integer.parseInt(N.split(" ")[0]);
            // 친구 쌍 수
            m = Integer.parseInt(N.split(" ")[1]);
            areFriends = new boolean[n][n];

            String[] F = bf.readLine().split(" ");
            // 친구 인지, 아닌지 확인하는 로직
            for (int j = 0; j < m * 2; j = j + 2) {
                int a = Integer.parseInt(F[j]);
                int b = Integer.parseInt(F[j + 1]);
                areFriends[a][b] = true;
                areFriends[b][a] = true;
            }
            // 짝으로 설정되었는지 안되었는지 확인하는 곳
            taken = new boolean[n];
            printResult(sb, i, countPairngs(taken));
        }
        bf.close();
    }

    static int countPairngs(boolean[] taken) {
        int firstFree = -1;
        for (int i = 0; i < n; i++) {
            if (!taken[i]) {
                firstFree = i;
                break;
            }
        }

        // 기저 사례 : 모든 학생이 짝을 찾았으면 한 가지 방법을 찾았으니 종료한다.
        if (firstFree == -1) {
            return 1;
        }

        int result = 0;
        // firstFree의 해당하는 친구 짝 구하는 로직
        for (int pair = firstFree + 1; pair < n; pair++) {
            // 친구로 정해져있지 않고, 친구이면 해당 조건문을 통과한다.
            if (!taken[pair] && areFriends[firstFree][pair]) {
                taken[firstFree] = taken[pair] = true;
                result += countPairngs(taken);
                // 짝을 맺은 뒤 다음 친구에서 다시 짝을 맺을 경우의 수를 구하기 위해 false로 변경함.
                taken[firstFree] = taken[pair] = false;
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