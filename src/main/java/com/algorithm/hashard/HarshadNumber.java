package com.algorithm.hashard;

public class HarshadNumber {
    private static int[] rows = {18, 133, 155, 132, 341, 431243};

    public boolean isHarshad(int num){
        System.out.println(num);
        int length = (int)(Math.log10(num)+1);
        System.out.println(length);
        int sum = 0;
        for(int i = 1; i <= length; i++){
            if(i==1){
                sum+= num % 10;
            } else {
                sum+= num % (int)Math.pow(10, i) / (int)Math.pow(10, i-1);
            }
        }
        System.out.println(sum);
        if(!(num % sum == 0)){
            return false;
        }
        return true;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        for (int i :rows) {
            System.out.println(sn.isHarshad(i));
        }

    }
}
