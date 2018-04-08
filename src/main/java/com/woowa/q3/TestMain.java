package com.woowa.q3;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestMain {
    public static void main(String args[]) {
        TestMain t = new TestMain();
        int[] A = {60, 80, 40};
        int[] B = {2, 3, 5};
        int M = 5;
        int X = 2;
        int Y = 200;
        System.out.println(t.solution(A, B, M, X, Y));
    }

    // 모든 사람의 체중 = A [K]
    // 대상 층 = B [K]
    // 존재하는 층수 = M
    // 엘리베이터의 최대 수용 인원 : X명
    // 무게 제한 : Y
    // (즉, A [0]과 B [0]은 대기열에있는 첫 번째 사람을 나타냅니다.)
    public int solution(int[] A, int[] B, int M, int X, int Y) {
        Queue<People> waitingQueue = new LinkedBlockingQueue<>();
        for (int i = 0; i < A.length; i++) {
            Map<String, Integer> map = new HashMap<>();
            waitingQueue.add(new People(A[i], B[i]));
        }
        return getInElv(waitingQueue, X, Y, 0);
    }

    private int getInElv(Queue<People> queue, int X, int Y, int count) {
        int xSum = 0;
        int ySum = 0;

        int floor = 1;

        while (!queue.isEmpty()) {
            for (People p : queue) {
                if (xSum + 1 <= X || ySum + p.getWeight() <= Y) {
                    xSum += 1;
                    ySum += p.getWeight();
                } else {
                    People getOffPeople = queue.poll();
                    if (floor != getOffPeople.getGoal()) {
                        floor = getOffPeople.getGoal();
                        count++;
                    }
                    xSum-=1;
                    if (xSum == 0) {
                        count++;
                    }
                    return getInElv(queue, X, Y, count);
                }
            }
        }
        return count;
    }

    public class People {
        private int weight;
        private int goal;

        public People(int weight, int goal) {
            this.weight = weight;
            this.goal = goal;
        }

        public int getWeight() {
            return weight;
        }

        public int getGoal() {
            return goal;
        }
    }
}
