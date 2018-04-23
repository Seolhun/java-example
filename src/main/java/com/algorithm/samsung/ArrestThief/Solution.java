package com.algorithm.samsung.ArrestThief;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Solution {
    private static int N; // 지하 터널 지도의 세로 크기 N
    private static int M; // 지하 터널 지도의 가로 크기 M
    private static int R; // 맨홀 뚜껑이 위치한 장소의 세로 위치 R
    private static int C; // 맨홀 뚜껑이 위치한 장소의 가로 위치 C
    private static int L; // 탈출 후 소요시간 L

    // 방향 값 만들기 : 상 우 하 좌
    private static final int DX[] = {0, 1, 0, -1};
    private static final int DY[] = {1, 0, -1, 0};
    private static final boolean ROAD_TYPE[][] = {
            {false, false, false, false},   // 0
            {true, true, true, true},       // 1
            {true, false, true, false},     // 2
            {false, true, false, true},     // 3
            {true, true, false, false},     // 4
            {false, true, true, false},     // 5
            {false, false, true, true},     // 6
            {true, false, false, true}      // 7
    };

    private static int map[][];
    private static boolean visit[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            String firstLine = br.readLine();
            N = Integer.parseInt(firstLine.split(" ")[0]);
            M = Integer.parseInt(firstLine.split(" ")[1]);
            R = Integer.parseInt(firstLine.split(" ")[2]);
            C = Integer.parseInt(firstLine.split(" ")[3]);
            L = Integer.parseInt(firstLine.split(" ")[4]);

            map = new int[N][M];
            visit = new boolean[N][M];

            // 지도 만들기
            for (int i = 0; i < N; i++) {
                String[] str = br.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    map[i][j] = Integer.parseInt(str[j]);
                }
            }

            // 시작점
            visit[R][C] = true;
            for (int i = 0; i < 4; i++) {
                Stack<Graph> stack = new Stack<>();
                Graph root = new Graph(R, C);
                moveLine(i, root, stack);
                int time = L - 1;
                while (!stack.isEmpty() && time > 1) {
                    Graph child = stack.pop();
                    for (int j = 0; j < 4; j++) {
                        moveLine(j, child, stack);
                    }
                    time--;
                }
                // 시간 문제를 해결해야함.
            }


            int result = 0;
            for (boolean[] aVisit : visit) {
                for (boolean anAVisit : aVisit) {
                    if (anAVisit) {
                        result++;
                    }
                }
            }
            printResult(sb, t, result);
        }
        br.close();
    }

    private static void moveLine(int direction, Graph graph, Stack<Graph> stack) {
        for (boolean[] aVisit : visit) {
            System.out.println(Arrays.toString(aVisit));
        }
        System.out.println("#######################################");

        int fromType = map[graph.y][graph.x];
        boolean[] from = ROAD_TYPE[fromType];
        int x = graph.x + DX[direction];
        int y = graph.y + DY[direction];
        if (x >= 0 && y >= 0 && x < M && y < N && map[y][x] != 0 && !visit[y][x]) {
            int toType = map[y][x];
            boolean[] to = ROAD_TYPE[toType];
            if (isConnected(from, to)) {
                visit[y][x] = true;
                stack.add(new Graph(y, x));
            }
        }
    }

    private static boolean isConnected(boolean[] fromDir, boolean[] toDir) {
        return fromDir[0] && toDir[2] || fromDir[1] && fromDir[3];
    }

    private static class Graph {
        int x, y;

        Graph(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    private static void printResult(StringBuilder sb, int index, int result) {
        sb.setLength(0);
        sb.append("#");
        sb.append(index);
        sb.append(" ");
        sb.append(result);
        System.out.println(sb.toString());
    }
}