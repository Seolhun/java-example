package com.api.comparator.part1;

import com.api.comparator.common.Student;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorMain2 {
    public static void main(String[] agrs){
        String[] students = new String[]{"Ave","Steve","Jane","David","Shaw","Rooney","Ronaldo","Trial",};
        Student[] studentsList = new Student[students.length];
        for (int i = 0; i <students.length; i++) {
            studentsList[i] = new Student((int)(Math.random()*100), students[i]);
        }

        Arrays.sort(studentsList);
        System.out.println("----- No 기준 ----");
        for (Student tempStudent: studentsList) {
            System.out.println(tempStudent.toString()+" ");
        }


        Arrays.sort(studentsList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("----- Name 기준 ----");
        for (Student tempStudent: studentsList) {
            System.out.println(tempStudent.toString()+" ");
        }
    }
}
