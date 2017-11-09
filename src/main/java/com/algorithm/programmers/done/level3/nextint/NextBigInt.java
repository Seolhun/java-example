package com.algorithm.done.level3.nextint;

public class NextBigInt {
    private static int[] questions = {658594, 351547, 317524, 458449, 8157};

    public int nextBigNumber(int n) {
        System.out.println("question : "+n);
        int answer = sum(n);

        boolean loop = true;
        while (loop){
            n++;
            int b = sum(n);
            if(b == answer){
                loop = false;
            }
        }
        System.out.println("NextBigInt : "+n);
        return n;
    }

    private int sum(int n){
        String a = Integer.toBinaryString(n);
        int b = 0;
        for (int i = 0; i < a.length(); i++) {
            b += a.charAt(i);
        }
        return b;
    }

    public static void main(String[] args) {
        NextBigInt test = new NextBigInt();
        for (int i = 0; i <questions.length ; i++) {
            test.nextBigNumber(questions[i]);
        }
    }
//  Another Answer
/*
    class TryHelloWorld {
        public int nextBigNumber(int n) {
            int postPattern = n & -n, smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
            return n + postPattern | smallPattern;
        }
        public static void main(String[] args) {
            int n = 78;
            System.out.println(new TryHelloWorld().nextBigNumber(n));
        }
    }
*/
}