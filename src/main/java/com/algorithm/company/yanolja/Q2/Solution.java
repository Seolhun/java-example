package com.algorithm.company.yanolja.Q2;

class Solution {
    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5}));
    }

    public int solution(int[] A) {
        int result = 0;
        if (A[0] < 0) {
            return 1;
        }
        result = isValleay(0, A, result);
        result = isHill(A.length - 1, A, result);
        return result;
    }

    static int isValleay(int p, int[] A, int result) {
        if (p > A.length - 1) {
            return result;
        }
        if (p == 0) {
            if (A[p] < A[p + 1]) {
                return isValleay(p + 1, A, result + 1);
            } else {
                return isValleay(p + 1, A, result);
            }
        }
        if (p == A.length - 1) {
            if (A[p] < A[p - 1]) {
                return isValleay(p + 1, A, result + 1);
            } else {
                return isValleay(p + 1, A, result);
            }
        }

        if (A[p - 1] < A[p] || A[p + 1] < A[p]) {
            return isValleay(p + 1, A, result);
        }

        if (A[p] == A[p + 1]) {
            return isValleay(p + 1, A, result);
        }

        if (A[p - 1] == A[p] && A[p + 1] > A[p]) {
            return isValleay(p + 1, A, result + 1);
        } else if (A[p + 1] == A[p] && A[p - 1] > A[p]) {
            return isValleay(p + 1, A, result + 1);
        }

        return isValleay(p + 1, A, result);
    }

    static int isHill(int q, int[] A, int result) {
        if (q < 0) {
            return result;
        }
        if (q == A.length - 1) {
            if (A[q] > A[q - 1]) {
                return isHill(q - 1, A, result + 1);
            } else {
                return isHill(q - 1, A, result);
            }
        }
        if (q == 0) {
            if (A[q] > A[q + 1]) {
                return isHill(q - 1, A, result + 1);
            } else {
                return isHill(q - 1, A, result);
            }
        }

        if (A[q - 1] > A[q] || A[q + 1] > A[q]) {
            return isValleay(q - 1, A, result);
        }

        if (A[q] == A[q - 1]) {
            return isValleay(q - 1, A, result);
        }

        if (A[q - 1] == A[q] && A[q + 1] < A[q]) {
            return isValleay(q - 1, A, result + 1);
        } else if (A[q + 1] == A[q] && A[q - 1] < A[q]) {
            return isValleay(q - 1, A, result + 1);
        }

        return isHill(q - 1, A, result);
    }

}