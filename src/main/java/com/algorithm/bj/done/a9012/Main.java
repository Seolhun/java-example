package com.algorithm.bj.done.a9012;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/9012
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
6
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(
 */
public class Main {
    // Testcase
    static int T;
    static Stack<Character> stack;

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            String Q = bf.readLine();
            stack = new Stack<>();
            System.out.println(solve(Q, stack));
        }
    }

    static String solve(String Q, Stack<Character> stack) {
        for (int i = 0; i < Q.length(); i++) {
            char q = Q.charAt(i);
            if (q == '(') {
                stack.add(q);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
