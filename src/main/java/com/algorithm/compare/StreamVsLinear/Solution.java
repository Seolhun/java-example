package com.algorithm.compare.StreamVsLinear;

import com.algorithm.AlgorithmUtils;

import java.util.Arrays;

public class Solution {

    public static void main(String args[]) {
        int N = 1000000;
        int[] tests = new int[N];
        tests = AlgorithmUtils.buildRandomList(tests);

        /**
         * Stream()
         */
        AlgorithmUtils.startMethod();
        int min = Arrays.stream(tests).min().getAsInt();
        System.out.println("stream() : " + min);
        AlgorithmUtils.finishMethod();

        System.out.println("====================================");
        System.out.println("====================================");
        /**
         * Linear()
         */
        AlgorithmUtils.startMethod();
        int min2 = 999999999;
        for (int i = 0; i < tests.length; i++) {
            min2 = min2 > tests[i] ? tests[i] : min2;
        }
        System.out.println("Linear() : " + min);
        AlgorithmUtils.finishMethod();
    }
}
