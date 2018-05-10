package com.algorithm.samsung.progress.SupplyRoute;

/**
 * @author HunSeol
 * @see https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV15QRX6APsCFAYD
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static int T;
    static int N;
    static String V;
    static int map[][];
    static int times[][];

    static Graph start;
    static Graph goal;

    //상 우 하 좌
    static final int[] DY = {-1, 0, 1, 0};
    static final int[] DX = {0, 1, 0, -1};

    static Queue<Graph> queue;

    static class Graph {
        int x;
        int y;

        Graph(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(bf.readLine());
        for (int t = 1; t <= T; t++) {
            N = Integer.parseInt(bf.readLine());
            map = new int[N][N];
            times = new int[N][N];
            for (int j = 0; j < map.length; j++) {
                V = bf.readLine();
                for (int k = 0; k < map[j].length; k++) {
                    map[j][k] = V.charAt(k) - 48;
                    times[j][k] = 9999;
                }
            }

            // Basic Setting
            start = new Graph(0, 0);
            times[0][0] = 0;

            goal = new Graph(N - 1, N - 1);
            // Queue Setting
            queue = new LinkedList<>();
            queue.add(start);
            while (!queue.isEmpty()) {
                Graph graph = queue.remove();
                int x = graph.x;
                int y = graph.y;
                for (int i = 0; i < DX.length; i++) {
                    int moveX = x + DX[i];
                    int moveY = y + DY[i];
                    if (moveX < 0 || moveX >= N || moveY < 0 || moveY >= N) {
                        continue;
                    }
                    if (times[y][x] + map[moveY][moveX] < times[moveY][moveX]) {
                        times[moveY][moveX] = times[y][x] + map[moveY][moveX];
                        queue.add(new Graph(moveX, moveY));
                    }
                }
            }
            printResult(sb, t, times[N - 1][N - 1]);
        }
        bf.close();
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