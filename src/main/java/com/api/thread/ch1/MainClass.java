package com.api.thread.ch1;

public class MainClass {

	public static void main(String[] args) {
		ThreadExample1 threadExample1 = new ThreadExample1();
		threadExample1.start();

		ThreadExample2 threadExamplte2 = new ThreadExample2();
		threadExamplte2.start();
	}
}
