package com.algorithm.company.yanolja.done.Q3;

import java.util.Stack;

class Solution {
    public int solution(String S) {
        return solve(S, new Stack<>());
    }

    static int solve(String Q, Stack<Character> stack) {
        int result = 0;
        for (int i = 0; i < Q.length(); i++) {
            char q = Q.charAt(i);
            if (q == '(') {
                stack.add(q);
            } else {
                if (stack.isEmpty()) {
                    if (q == ')') {
                        result++;
                    }
                } else {
                    result++;
                    stack.pop();
                }
            }
        }
        return result;
    }
}