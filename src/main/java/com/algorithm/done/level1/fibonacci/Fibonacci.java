package com.algorithm.done.level1.fibonacci;

import java.util.ArrayList;
import java.util.List;

class Fibonacci {
    public long fibonacci(int num) {
        List<Long> fibos = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            if (i == 0) {
                fibos.add((long) 0);
            } else if (i == 1) {
                fibos.add((long) 1);
            } else {
                fibos.add((fibos.get(i - 1) + fibos.get(i - 2)));
            }
            System.out.println(fibos.get(i));
        }
        return fibos.get(num);
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Fibonacci c = new Fibonacci();
        int testCase = 3;
        System.out.println(c.fibonacci(testCase));
    }
}
