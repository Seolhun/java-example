package com.algorithm.compare.InstanceVsStatic;

import com.algorithm.AlgorithmUtils;

public class Solution {

    private static StringBuilder staticSb = new StringBuilder();

    public static void main(String args[]) {
        int N = 1000000;
        int[] tests = new int[N];
        tests = AlgorithmUtils.buildRandomList(tests);

        /**
         * Instance()
         */
        System.out.println("===================Instance=================");
        AlgorithmUtils.startMethod();
        for (int test : tests) {
            StringBuilder sb = new StringBuilder();
            sb.append(test);
        }
        AlgorithmUtils.finishMethod();

        System.out.println("====================================");
        System.out.println("====================================");
        /**
         * Static()
         */
        System.out.println("===================Static=================");
        AlgorithmUtils.startMethod();
        for (int test : tests) {
            staticSb.setLength(0);
            staticSb.append(test);
        }
        AlgorithmUtils.finishMethod();
    }
}
