package com.algorithm.samsung.ArrestThief;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private static int N; // 지하 터널 지도의 세로 크기 N
    private static int M; // 지하 터널 지도의 가로 크기 M
    private static int R; // 맨홀 뚜껑이 위치한 장소의 세로 위치 R
    private static int C; // 맨홀 뚜껑이 위치한 장소의 가로 위치 C
    private static int L; // 탈출 후 소요시간 L

    // 방향 값 만들기 : 위 우 아래 좌
    private static final int DX[] = {0, 1, 0, -1};
    private static final int DY[] = {1, 0, -1, 0};

    private static final int ROAD_TYPE[][] = {{0, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 1, 0}, {0, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 1, 1}, {1, 0, 0, 1}};

    // Map 그리기
    private static int map[][];
    // 방문한 주소
    private static boolean visit[][];
    // 방문한 주소 담기용
    private static Queue<Graph> queue;

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
            queue = new LinkedList<>();

            // 지도 만들기
            for (int i = 0; i < N; i++) {
                String[] str = br.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    map[i][j] = Integer.parseInt(str[j]);
                }
            }

            // 시작점
            visit[R][C] = true;
            queue.offer(new Graph(C, R));
            move();

            int result = 0;
            for (boolean[] aVisit : visit) {
                for (boolean anAVisit : aVisit) {
                    if (anAVisit) {
                        result++;
                    }
                }
            }
            for (boolean[] aVisit : visit) {
                System.out.println(Arrays.toString(aVisit));
            }
            printResult(sb, t, result);
        }
        br.close();
    }

    private static boolean isConnected(int i, int[] fromDir, int[] toDir) {
        if (fromDir[i] != 1) {
            return false;
        }
        switch (i) {
            case 0:
                return toDir[2] == 1;
            case 1:
                return toDir[3] == 1;
            case 2:
                return toDir[0] == 1;
            case 3:
                return toDir[1] == 1;
            default:
                return false;
        }
    }

    private static void move() {
        while (!queue.isEmpty()) {
            Graph graph = queue.poll();
            int fromType = map[graph.y][graph.x];
            int[] from = ROAD_TYPE[fromType];
            for (int j = 0; j < 4; j++) {
                moveRoad(graph, from, j);
            }
        }
    }

    private static void moveRoad(Graph graph, int[] from, int index) {
        int x = graph.x + DX[index];
        int y = graph.y + DY[index];
        if (x >= 0 && y >= 0 && x < N && y < M && map[y][x] != 0) {
            int toType = map[y][x];
            int[] to = ROAD_TYPE[toType];
            if (isConnected(index, from, to)) {
                if (!visit[y][x]) {
                    visit[y][x] = true;
                    queue.offer(new Graph(x, y));
                }
            }
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

    private static class Graph {
        int x, y;

        Graph(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}