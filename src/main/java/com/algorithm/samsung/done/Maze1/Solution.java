package com.algorithm.samsung.done.Maze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    // 최대 미로 사이즈
    static final int n = 16;
    // 위 우 아래 좌
    static final int dx[] = {0, 1, 0, -1};
    static final int dy[] = {1, 0, -1, 0};
    // Map 그리기
    static int map[][];
    // 방문한 주소 값
    static boolean visit[][];
    static boolean finish;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testcase = 10;
        Queue<Graph> queue;
        for (int t = 1; t <= testcase; t++) {
            int k = Integer.parseInt(bf.readLine());
            map = new int[n][n];
            visit = new boolean[n][n];
            queue = new LinkedList<>();
            finish = false;

            for (int i = 0; i < n; i++) {
                // 지도 값 받기
                String str = bf.readLine();
                for (int j = 0; j < n; j++) {
                     map[i][j] = str.charAt(j) - 48;
                     // 시작점
                    if (map[i][j] == 2) {
                        visit[i][j] = true;
                        queue.offer(new Graph(i, j));
                        break;
                    }
                }
            }

            while (!queue.isEmpty()) {
                // Queue에 방문한 곳 담기.
                Graph graph = queue.poll();
                if (map[graph.x][graph.y] == 3) {
                    finish = true;
                    break;
                }
                // 방향 값 가능여부 파악 및 이동하기.
                for (int i = 0; i < 4; i++) {
                    int x = graph.x + dx[i];
                    int y = graph.y + dy[i];
                    if (x >= 0 && y >= 0 && x < n && y < n && map[x][y] != 1) {
                        if (!visit[x][y]) {
                            visit[x][y] = true;
                            queue.offer(new Graph(x, y));
                        }
                    }
                }
            }
            if (finish) {
                printResult(sb, k, 1);
            } else {
                printResult(sb, k, 0);
            }
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

    static class Graph {
        int x, y;
        Graph(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}