package com.algorithm.bj.progress.Q14503;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/1157
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    static int N;
    static int M;

    static int r;
    static int c;
    static int d;

    static int[][] room;
    static int[][] cleanRoom;
    static Graph[] directions = new Graph[4];


    // Testcase
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String T[] = bf.readLine().split(" ");
        N = Integer.parseInt(T[0]);
        M = Integer.parseInt(T[1]);

        String rcd[] = bf.readLine().split(" ");
        r = Integer.parseInt(rcd[0]);
        c = Integer.parseInt(rcd[1]);
        d = Integer.parseInt(rcd[2]);

        room = new int[N][M];
        cleanRoom = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] positions = bf.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                room[i][j] = Integer.parseInt(positions[j]);
            }
        }
        System.out.println(solve());
    }

    static class Graph {
        int x;
        int y;

        Graph(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int solve() {
        int count = 1;
        cleanRoom[c][r] = 1;
        boolean isContinue = true;
        while (isContinue) {
            // 1. 앞으로 갈 방향 탐색
            Graph graph = checkDirection(d);
            if (graph.x == - 1 && graph.y == -1) {
                isContinue = false;
            } else {
                move(c + graph.y, r + graph.x);
                count = clearRoom(c, r, count);
            }

        }
        return count;
    }

    /*
    1. 현재 위치를 청소한다.
    2. 현재 위치에서 현재 방향을 기준으로 왼쪽방향부터 차례대로 탐색을 진행한다.
        1. 왼쪽 방향에 아직 청소하지 않은 공간이 존재한다면, 그 방향으로 회전한 다음 한 칸을 전진하고 1번부터 진행한다.
        2. 왼쪽 방향에 청소할 공간이 없다면, 그 방향으로 회전하고 2번으로 돌아간다.
        3. 네 방향 모두 청소가 이미 되어있거나 벽인 경우에는, 바라보는 방향을 유지한 채로 한 칸 후진을 하고 2번으로 돌아간다.
        4. 네 방향 모두 청소가 이미 되어있거나 벽이면서, 뒤쪽 방향이 벽이라 후진도 할 수 없는 경우에는 작동을 멈춘다.
    */
    static Graph checkDirection(int d) {
        // 0(북), 1(동), 2(남), 3(서)
        setDirection(d, 0);
        for (Graph direction : directions) {
            int Y = c + direction.y;
            int X = r + direction.x;
            if ((X < 0 || X >= N)) {
                continue;
            }
            if ((Y < 0 || Y >= M)) {
                continue;
            }
            if (room[Y][X] != 1) {
                return direction;
            }
        }
        if(room[directions[1].y][directions[1].x] == 1 || cleanRoom[directions[1].y][directions[1].x] == 1) {
            return new Graph(-1, -1);
        }
        return directions[1];
    }

    // 절대적인 것을 상대적인 것에 맞게 바꿔야 한다.
    static Graph[] setDirection(int direction, int loopCount) {
        if (loopCount == 4) {
            return directions;
        }
        if (direction == 0) {
            direction = 3;
        }
        switch (direction) {
            case 1:
                directions[loopCount] = new Graph(1, 0);
                break;
            case 2:
                directions[loopCount] = new Graph(0, 1);
                break;
            case 3:
                directions[loopCount] = new Graph(-1, 0);
                break;
            default:
                directions[loopCount] = new Graph(0, -1);
                break;
        }
        return setDirection(direction - 1, loopCount + 1);
    }

    static void move(int x, int y) {
        if (room[y][x] == 1) {
            return;
        }
        c = x;
        r = y;
    }

    static int clearRoom(int x, int y, int count) {
        if (cleanRoom[y][x] == 1) {
            return count;
        }
        cleanRoom[y][x] = 1;
        return count + 1;
    }
}
