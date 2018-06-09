package com.algorithm.bj.progress.Q14503;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/1157
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[][] room;
    private static int[][] cleanRoom;
    private static Graph[] directions = new Graph[4];

    private static int N;
    private static int M;

    private static int R;
    private static int C;
    private static int D;

    // Testcase
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String T[] = bf.readLine().split(" ");
        N = Integer.parseInt(T[0]);
        M = Integer.parseInt(T[1]);

        String rcd[] = bf.readLine().split(" ");
        R = Integer.parseInt(rcd[0]);
        C = Integer.parseInt(rcd[1]);
        D = Integer.parseInt(rcd[2]);

        room = new int[N][M];
        cleanRoom = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] positions = bf.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                room[i][j] = Integer.parseInt(positions[j]);
                cleanRoom[i][j] = Integer.parseInt(positions[j]);
            }
        }
        System.out.println(solve());
    }

    static class Graph {
        int x;
        int y;
        int d;

        Graph(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }

        @Override
        public String toString() {
            return "Graph{" +
                    "x=" + x +
                    ", y=" + y +
                    ", d=" + d +
                    '}';
        }
    }

    /*
    1. 현재 위치를 청소한다.
    2. 현재 위치에서 현재 방향을 기준으로 왼쪽방향부터 차례대로 탐색을 진행한다.
        1. 왼쪽 방향에 아직 청소하지 않은 공간이 존재한다면, 그 방향으로 회전한 다음 한 칸을 전진하고 1번부터 진행한다.
        2. 왼쪽 방향에 청소할 공간이 없다면, 그 방향으로 회전하고 2번으로 돌아간다.
        3. 네 방향 모두 청소가 이미 되어있거나 벽인 경우에는, 바라보는 방향을 유지한 채로 한 칸 후진을 하고 2번으로 돌아간다.
        4. 네 방향 모두 청소가 이미 되어있거나 벽이면서, 뒤쪽 방향이 벽이라 후진도 할 수 없는 경우에는 작동을 멈춘다.
    */
    static int solve() {
        int result = 0;
        result = cleaningRoom(R, C, result);
        boolean isContinue = true;
        while (isContinue) {
            Graph graph = checkRoom(R, C, D);
            if (graph.d == -1) {
                isContinue = false;
            } else {
                result = cleaningRoom(graph.y, graph.x, result);
                move(graph);
            }
        }

        return result;
    }

    static void move(Graph graph) {
        C = graph.x;
        R = graph.y;
        D = graph.d;
    }


    // 모든 과정은 `checkRoom`를 거쳐야지만 유효성 검사가 됨.
    static Graph checkRoom(int R, int C, int D) {
        Graph[] directions = setDirection(D, 0);
        for (Graph graph : directions) {
            int y = R + graph.y;
            int x = C + graph.x;
            int d = graph.d;

            if ((y < 0 || y >= N) && (x < 0 || x >= M)) {
                continue;
            }

            // 막히지 않고, 청소가 되지 않았으면 해당 공간으로 이동
            if (room[y][x] != 1 && cleanRoom[y][x] != 1) {
                return new Graph(x, y, d);
            }
        }


        // 모두 청소되거나 벽이지만, 후진할 수 있을때,
        Graph graph = directions[1];
        int y = R + graph.y;
        int x = C + graph.x;
        if ((y < 0 || y >= N) && (x < 0 || x >= M)) {
            int d = graph.d;
            if (room[y][x] != 1) {
                return new Graph(x, y, d);
            }
        }


        // 후진이 불가능하여 멈춰야 할 때
        System.out.println("######### Here 3");
        return new Graph(-1, -1, -1);
    }

    static int cleaningRoom(int y, int x, int result) {
        // 청소하기
        cleanRoom[y][x] = 1;
        return result + 1;
    }

    // 바라보는 방향에서 순서를 만드는 메소드
    static Graph[] setDirection(int direction, int loopCount) {
        if (loopCount == 4) {
            return directions;
        }

        if (direction == 0) {
            direction = 3;
        }
        switch (direction) {
            case 1:
                directions[loopCount] = new Graph(1, 0, 1);
                break;
            case 2:
                directions[loopCount] = new Graph(0, 1, 2);
                break;
            case 3:
                directions[loopCount] = new Graph(-1, 0, 3);
                break;
            default:
                directions[loopCount] = new Graph(0, -1, 0);
                break;
        }
        return setDirection(direction - 1, loopCount + 1);
    }
}
