package com.algorithm.samsung.done.BoardCover;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int T;
    static int H;
    static int W;
    static int[][] boardMap;

    // Y, X
    static final int[][][] coverType = {
            {{0, 0}, {1, 0}, {0, 1}},
            {{0, 0}, {0, 1}, {1, 1}},
            {{0, 0}, {1, 0}, {1, 1}},
            {{0, 0}, {1, 0}, {1, -1}},
    };

    /*
    3
    3 7
    #.....#
    #.....#
    ##...##
    3 7
    #.....#
    #.....#
    ##..###
    8 10
    ##########
    #........#
    #........#
    #........#
    #........#
    #........#
    #........#
    ##########
    */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= T; i++) {
            String N = bf.readLine();
            // 게임 판 높이
            H = Integer.parseInt(N.split(" ")[0]);
            // 게임 판 넓이
            W = Integer.parseInt(N.split(" ")[1]);

            // boardMap[y][x] = # = 1 이미 덮인 칸 혹은 검은 칸
            // boardMap[y][x] = . = 0 아직 덮이지 않은 칸
            boardMap = new int[H][W];
            for (int j = 0; j < boardMap.length; j++) {
                String width = bf.readLine();
                for (int k = 0; k < boardMap[j].length; k++) {
                    int v = 1;
                    if (width.charAt(k) == '.') {
                        v = 0;
                    }
                    boardMap[j][k] = v;
                }
            }
            printResult(sb, i, cover(boardMap));
        }
        bf.close();
    }

    // delta 값을 통해 채우기/치우기 둘 다 가능하게 만든다.
    static boolean set(int[][] boardMap, int y, int x, int type, int delta) {
        boolean result = true;
        for (int i = 0; i < coverType[0].length; i++) {
            int ny = y + coverType[type][i][0];
            int nx = x + coverType[type][i][1];
            if (ny < 0 || ny >= boardMap.length || nx < 0 || nx >= boardMap[0].length) {
                result = false;
            } else if ((boardMap[ny][nx] += delta) > 1) {
                result = false;
            }
        }
        return result;
    }

    static int cover(int[][] boardMap) {
        // 아직 채우지 못한 칸 중 가장 윗줄 왼쪽에 있는 칸을 찾는다.
        int y = -1, x = -1;
        for (int i = 0; i < boardMap.length; i++) {
            for (int j = 0; j < boardMap[i].length; j++) {
                if (boardMap[i][j] == 0) {
                    y = i;
                    x = j;
                    break;
                }
            }
            if (y != -1) {
                break;
            }
        }

        // 기저 사례 : 모든 칸을 채웠으면 1을 반환한다.
        if (y == -1) {
            return 1;
        }

        int result = 0;
        for (int type = 0; type < coverType.length; type++) {
            // 만약 board[y][x]를 type 형태로 덮을 수 있으면 재귀 호출한다.
            if (set(boardMap, y, x, type, 1)) {
                result += cover(boardMap);
            }
            // 덮었던 재귀하여 다시 이용해므로 블록을 치운다.
            set(boardMap, y, x, type, -1);
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