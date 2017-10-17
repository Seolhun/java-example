package com.api.thread.ch1;

public class ThreadExample1 extends Thread {
    /* Thread의 run method 재정의하기. */
    @Override
    public void run() {
        /* 작업내용 */
    }

    public static void main(String args[]) {
        ThreadExample2 threadExntedsExample = new ThreadExample2();
        threadExntedsExample.start();
    }

}
