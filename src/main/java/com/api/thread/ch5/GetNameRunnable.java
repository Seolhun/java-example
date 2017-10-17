package com.api.thread.ch5;

/**
 * The type Get name runnable.
 */
public class GetNameRunnable implements Runnable {
    private String threadName;

    /**
     * Instantiates a new Get name runnable.
     *
     * @param threadName the thread name
     */
    GetNameRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "의 " + threadName + "이 시작되었습니다.");
        sleepThread();
        System.out.println(Thread.currentThread().getName() + "가 종료되었습니다");
    }

    private void sleepThread() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.threadName;
    }
}
