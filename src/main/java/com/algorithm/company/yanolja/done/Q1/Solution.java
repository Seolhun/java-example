package com.algorithm.company.yanolja.done.Q1;

class Solution {
    public void solution(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.println(i % 3 == 0 || i % 5 == 0 || i % 7 == 0 ? getString(i) : i);
        }
    }

    static String getString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 3 == 0) {
            sb.append("Fizz");
        }
        if (n % 5 == 0) {
            sb.append("Buzz");
        }
        if (n % 7 == 0) {
            sb.append("Woof");
        }
        return sb.toString();
    }
}