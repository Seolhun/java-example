package com.algorithm.company.midas.done.Q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. 활성화 코드는 시리얼 번호에서 토큰을 삭제하는 방식으로 만들어집니다.
2. 토큰은 시리얼 번호에서 0개 이상 나타날 수 있으며, 삭제 순서에 따라서 남은 시리얼 번호가 달라집니다.
3. 이 중에서 가장 작은 자릿수의 시리얼 번호가 활성화 코드입니다.
*/

public class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String serial = Integer.toBinaryString(Integer.parseInt(bf.readLine()));
        String token = Integer.toBinaryString(Integer.parseInt(bf.readLine()));

        System.out.println(solve(serial, token).length());
    }

    static String solve(String serial, String token) {
        for (int i = serial.length() - 5; i >= 0; i--) {
            if (serial.substring(i, i + 4).equals(token)) {
                serial = serial.substring(0, i) + serial.substring(i + 4, serial.length());
                return solve(serial, token);
            }
        }
        return serial;
    }
}
