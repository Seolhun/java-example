package com.algorithm.bj.progress.step7.done.a1152;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/1152
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern pattern = Pattern.compile("^[A-z]*");

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String Q = bf.readLine();
        String[] questions = Q.split(" ");
        System.out.println(solve(questions));
    }

    static int solve(String[] questions) {
        int count = 0;
        for (String question : questions) {
            if(question.length() < 1) {
                continue;
            }
            Matcher matcher = pattern.matcher(question);
            if (matcher.matches()) {
                count++;
            }
        }
        return count;
    }
}


//class Main{
//    public static void main(String args[]) throws IOException{
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(input.readLine());
//        System.out.println(st.countTokens());
//    }
//}