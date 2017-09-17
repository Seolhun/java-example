package com.algorithm.kakao.p2;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {

    }

    public int solution(String dartResult) {
        int answer = 0;
        answer = divideResult(dartResult);
        System.out.println("test : "+answer);
        return answer;
    }

    int divideResult(String datas) {
        int answer = 0;

        List<Integer> points = new ArrayList<>();
        for (int i = 0; i < datas.length(); i++) {
            String d = String.valueOf(datas.charAt(i));

            int point = number(datas, d, i);
            point = bonus(d, point);
            points.add(point);

            answer += prize(d, points);
        }
        return answer;
    }

    int number(String datas, String d, int index) {
        if (d.equals("1")) {
            if (index + 1 < datas.length()) {
                String s = String.valueOf(datas.charAt(index + 1));
                if (s.equals("0")) {
                    return 10;
                }
            }
        }

        try {
            return Integer.parseInt(d);
        } catch (Exception e) {
            return 0;
        }
    }

    int bonus(String d, int current) {
        d = d.toUpperCase();
        if (d.equals("S")) {
            return (int) Math.pow(current, 1);
        } else if (d.equals("D")) {
            return (int) Math.pow(current, 2);
        } else if (d.equals("T")) {
            return (int) Math.pow(current, 3);
        }
        return current;
    }

    int prize(String d, List<Integer> points) {
        System.out.println("points.size() : " + points.size());
        if (points.size() > 1) {
            if (d.equals("*"))
                return ((points.get(points.size() - 2) + points.get(points.size() - 1)) * 2) - (points.get(points.size() - 2));
            else if (d.equals("#"))
                return -(points.get(points.size() - 1));
        }
        return points.get(points.size() - 1);
    }
}