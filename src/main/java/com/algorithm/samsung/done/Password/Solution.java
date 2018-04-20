package com.algorithm.samsung.done.Password;

import java.util.Scanner;

public class Solution {
    public static void main(String arg[]) {
        solution();
    }

    static void solution()  {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int lenth = sc.nextInt();
            String question = sc.next();
            printResult(sb, i + 1, getResult(sb, question));
        }
        sc.close();
    }

    static String getResult(StringBuilder sb, String question){
        sb.setLength(0);
        sb.append(question);
        for(int i = 0; i < question.length() - 1; i++) {
            if(question.charAt(i) == question.charAt(i+1)) {
                sb.deleteCharAt(i+1);
                sb.deleteCharAt(i);
                return getResult(sb, sb.toString());
            }
        }
        return sb.toString();
    }

    static void printResult(StringBuilder sb, int index, String result) {
        sb.setLength(0);
        sb.append("#");
        sb.append(index);
        sb.append(" ");
        sb.append(result);
        System.out.println(sb.toString());
    }
}