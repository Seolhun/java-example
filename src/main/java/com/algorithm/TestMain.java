package com.algorithm;

public class TestMain {
    public static void main(String args[]) {
        System.out.println(sum(10));
        System.out.println(recursiveSum(10));
    }

    static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    static int recursiveSum(int n) {
        System.out.println(n);
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }
}
