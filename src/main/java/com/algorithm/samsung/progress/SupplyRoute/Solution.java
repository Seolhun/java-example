package com.algorithm.samsung.progress.SupplyRoute;

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

    static Graph start;
    static Graph goal;

    static final int[] DX = {0, 1};
    static final int[] DY = {1, 0};

    static Queue<Graph> queue;
    static int min;

    static class Graph {
        int x;
        int y;
        int time;

        Graph(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }

        @Override
        public String toString() {
            return "Graph{" +
                    "x=" + x +
                    ", y=" + y +
                    ", time=" + time +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(bf.readLine());
        for (int t = 1; t <= T; t++) {
            N = Integer.parseInt(bf.readLine());
            map = new int[N][N];
            for (int j = 0; j < map.length; j++) {
                V = bf.readLine();
                for (int k = 0; k < map[j].length; k++) {
                    map[j][k] = V.charAt(k) - 48;
                }
            }

            start = new Graph(0, 0, 0);
            goal = new Graph(N - 1, N - 1, 0);
            queue = new LinkedList<>();
            queue.offer(start);
            min = 100;

            while (!queue.isEmpty()) {
                Graph graph = queue.poll();
                if (graph.x == goal.x && graph.y == goal.y) {
                    if (min > graph.time) {
                        min = graph.time;
                    }
                }
                getTime(graph);
            }
            printResult(sb, t, min);
        }
        bf.close();
    }

    // 둘 중에 작은 값 선택하기.
    static void getTime(Graph graph) {
        for (int i = 0; i < 2; i++) {
            int movedX = graph.x + DX[i];
            int movedY = graph.y + DY[i];
            if (movedX < N && movedY < N) {
                queue.offer(new Graph(movedX, movedY, graph.time + map[movedY][movedX]));
            }
        }
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