package com.api.thread.ch1;

public class MainClass {

	public static void main(String[] args) {
		ThreadExample2 threadExamplte1 = new ThreadExample2();
        //[1]Runnable 구현한 클래스를 객체화
        
        Thread t = new Thread(threadExamplte1);
	}
}
