package com.example.comparator.part1;

import java.util.Arrays;

public class ComparatorMain1 {
    public static void main(String[] agrs){
        String[] students = new String[]{"Ave","Steve","Jane","David","Shaw","Rooney","Ronaldo","Trial",};

        Arrays.sort(students);
        for (String student: students) {
            System.out.print(student+" ");
        }
        //Ave David Jane Ronaldo Rooney Shaw Steve Trial
    }
}
