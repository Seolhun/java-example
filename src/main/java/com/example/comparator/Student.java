package com.example.comparator;

import java.util.Comparator;

/**
 * Created by HunSeol on 2017. 6. 3..
 */
public class Student implements Comparable<Student>, Comparator<Student> {
    private int no;
    private String name;

    //getter
    //setter

    public Student(){

    }

    public Student(int no, String name){
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student compareStudent) {
        int compareNo = compareStudent.getNo();

        return this.no - compareNo;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
