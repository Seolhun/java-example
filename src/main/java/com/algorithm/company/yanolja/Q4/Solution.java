package com.algorithm.company.yanolja.Q4;

public class Solution {
    public static void main(String args[]) {
        int[] A = new int[]{5, 2, 4, 6, 3, 7};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        return solve(0, A, 9999);
    }

    static int solve(int index, int[] A, int min) {
        if (index + 2 > A.length - 1) {
            return min;
        }
        int root = A[index];
        for (int i = index + 2; i < A.length; i++) {
            int tempMin = root + A[i];
            if (tempMin < min) {
                min = tempMin;
            }
        }
        return solve(index + 1, A, min);
    }
}
