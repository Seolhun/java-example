package com.algorithm.programmers.progress.level3.jumpcase;

class JumpCase {
    public int jumpCase(int num) {
        int answer;
        if(num == 1) {
            return 1;
        } else if(num == 2) {
            return 2;
        }
        answer = jumpCase(num - 1) + jumpCase(num - 2);
        return answer;
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 5;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }
}