package com.algorithm.samsung.ZigzagNumber;

import java.util.Scanner;
public class Solution {
    public static void main(String arg[]) {
        solution();
    }

    static void solution() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(i);
            sb.append(" ");
            int num = sc.nextInt();
            sb.append(getResult(num));
            System.out.println(sb.toString());
        }
    }

    static int getResult(int question){
        int sum = 0;
        for (int i = 1; i <= question; i++) {
            if(i%2 == 0) {
                sum -=i;
            } else {
                sum +=i;
            }
        }
        return sum;
    }
}
