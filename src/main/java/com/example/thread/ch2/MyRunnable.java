package com.example.thread.ch2;

import com.common.out.ThreadColor;

/**
 * The type My runnable.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_RED+"Hello MyRunnable");
    }
}
