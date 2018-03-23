package com.api.thread.ch1;

public class ThreadExample1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadExample 1 : " + i + "번이 실행되었습니다.");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException Catch");
            }
        }
        System.out.println("Thread Example 1 종료");
    }
}
