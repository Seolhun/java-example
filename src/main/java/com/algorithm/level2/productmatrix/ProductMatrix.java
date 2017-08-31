package com.algorithm.level2.productmatrix;

class ProductMatrix {
    public int[][] productMatrix(int[][] A, int[][] B) {
        //로우 * 열(행렬 곱의 기본 조건)
        int[][] answer = new int[A.length][B[0].length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                //A를 B에 곱하면 되기떄문에 A의 길이로만 곱셈을 구한다.
                for (int k = 0; k < A[0].length; k++) {
                    answer[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ProductMatrix c = new ProductMatrix();
        int[][] a = {{1, 2}, {2, 3}};
        int[][] b = {{3, 4}, {5, 6}};

        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("행렬의 곱셈 : " + c.productMatrix(a, b));
    }
}