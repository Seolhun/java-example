package com.api.thread.ch1;

public class ThreadExample2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("ThreadExamplte2 : " + i + "번이 실행되었습니다.");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException Catch");
            }
        }
        System.out.println("Thread Examplte1 종료");
    }
}


