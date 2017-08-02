package com.example.thread.ch2;

import com.common.out.ThreadColor;

/**
 * The type Another thread.
 */
public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE+"Hello from "+currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ThreadColor.ANSI_BLUE + "Another thread woke me up");
        }

        System.out.println(ThreadColor.ANSI_BLUE + "The seconds have passed and I'm awake");
    }
}
