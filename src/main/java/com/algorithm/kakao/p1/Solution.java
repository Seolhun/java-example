package com.algorithm.kakao.p1;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] temp1 = new String[n];
        String[] temp2 = new String[n];
        for (int i = 0; i < n; i++) {
            temp1[i] = decoder(arr1[i], n);
            temp2[i] = decoder(arr2[i], n);
        }

        for (int i = 0; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (temp1[i].charAt(j) == ' ' && temp2[i].charAt(j) == ' ') {
                    temp.append(" ");
                } else if (temp1[i].charAt(j) == '#' || temp2[i].charAt(j) == '#') {
                    temp.append("#");
                }
            }
            answer[i] = temp.toString();
        }

        return answer;
    }

    String decoder(int param, int n) {
        String strBin = Integer.toBinaryString(param);
        int re = n - strBin.length();

        StringBuilder temp = new StringBuilder();
        if (re > 0) {
            for (int k = 0; k < re; k++) {
                temp.append("0");
            }
            temp.append(strBin);
        } else {
            temp = new StringBuilder(strBin);
        }
        strBin = temp.toString();

        strBin = strBin.replace("1", "#");
        strBin = strBin.replace("0", " ");
        return strBin;
    }
}
