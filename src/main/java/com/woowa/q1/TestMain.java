package com.woowa.q1;

public class TestMain {
    public static void main(String args[]) {
        TestMain t = new TestMain();
        System.out.println(t.solution("011100"));
    }

    int solution(String S) {
        // write your code in Java SE 8
        int question = Integer.parseInt(S, 2);
        return getStep(question, 0);
    }

    private int getStep(int question, int count) {
        if (question == 0) {
            return count;
        }

        count++;
        if (question % 2 == 0) {
            return getStep(question / 2, count);
        } else {
            return getStep(question - 1, count);
        }
    }
}
