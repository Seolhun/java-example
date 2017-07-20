package com.example.thread.part1;

public class MainClass {

	public static void main(String[] args) {
		ThreadExamplte1 threadExamplte1 = new ThreadExamplte1();
        //[1]Runnable 구현한 클래스를 객체화
        
        Thread t = new Thread(threadExamplte1);

	}

}
