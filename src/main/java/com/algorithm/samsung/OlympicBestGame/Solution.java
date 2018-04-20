package com.algorithm.samsung.OlympicBestGame;

import java.util.Scanner;

public class Solution {
    public static void main(String arg[]) {
        solution();
    }

    static void solution() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        // 1. T라는 테스트케이스 개수 변수를 받는다.
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            // 2. N이라는 종목의 개수와, M이라는 조직위원회 명수를 받는다.
            // 3. 두개의 길이 만큼의 종목 값과 심사위원단 점수 값을 배열에 담는다.
            int N = sc.nextInt();
            int M = sc.nextInt();

            // 스포츠 경기 비용 // 앞 순서일수록 재미 높음
            int[] nList = new int[N];
            for (int j = 0; j < N; j++) {
                nList[j] = sc.nextInt();
            }
            // 허용 비용 최대 값
            int[] mList = new int[M];
            for (int j = 0; j < M; j++) {
                mList[j] = sc.nextInt();
            }
            // 4. 조직위원회 값에 가장 근접한 종목의 값을 고른다.
            printResult(sb, i + 1, getResult(nList, mList));
        }
        sc.close();
    }

    static int getResult(int[] nList, int[] mList) {
        int[] results = new int[mList.length];
        for (int m : mList) {
            for (int i = 0; i < nList.length; i++) {
                if (m > nList[i]) {
                    results[i] = i + 1;
                    break;
                }
            }
        }

        return 0;
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