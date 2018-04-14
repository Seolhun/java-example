package com.algorithm.programmers.done.level3.ncm;

/*
    배열의 값을 2개씩 순차적으로 비교하여, 최소공약수를 찾아나간다.
    ## 해당 프로세스 조건
    1. A / B == 0 이면 A가 최소공약수
    2. A / B != 0 이면 A * B가 최소공약수
 */
class NLCM {
    public long nlcm(int[] num) {
        long answer = num[0], compareValue;

        //최초값을 기준점으로 선정하여 1부터 시작
        for (int i = 1; i < num.length; i++) {
            compareValue = getNlcm(answer, num[i]);
            answer = compareValue * (answer / compareValue) * (num[i] / compareValue);
        }
        System.out.println(answer);
        return answer;
    }

    public long getNlcm(long answer, long compareValue) {
        //큰 값을 작은 값으로 나머지가 없다면 최소공배수는 큰 값이 된다.
        if (answer > compareValue)
            return (answer % compareValue == 0) ? compareValue : getNlcm(compareValue, answer % compareValue);
        else
            return (compareValue % answer == 0) ? answer : getNlcm(answer, compareValue % answer);
    }

    public static void main(String[] args) {
        NLCM c = new NLCM();
        int[] ex = {2, 6, 8, 14};
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.nlcm(ex));
    }
}