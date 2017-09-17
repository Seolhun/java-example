package com.algorithm.level2.getminsum;

import java.util.Arrays;

class TryHelloWorld {
    public int getMinSum(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            int j = B.length - (i + 1);
            answer += A[i] + B[j];
            System.out.println(answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        TryHelloWorld test = new TryHelloWorld();
        int []A = {1,2};
        int []B = {3,4};
        System.out.println(test.getMinSum(A,B));
    }
}