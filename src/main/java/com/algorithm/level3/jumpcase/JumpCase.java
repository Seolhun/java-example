package com.algorithm.level3.jumpcase;

class JumpCase {

    public int jumpCase(int num) {
        int answer = 0;
        //함수를 입력하시오
        System.out.println(num / 2);
        int start = 1;
        for (int i = 0; i < num; i++) {
            //홀수 짝수 구분하기
            if(i % 2 == 0){
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 9;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }
}