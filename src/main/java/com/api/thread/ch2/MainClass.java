package com.api.thread.ch2;

import com.common.out.ThreadColor;


/**
 * @author SeolHun
 * The type Main class.
 */
public class MainClass {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        System.out.println(ThreadColor.ANSI_PURPLE+"Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("Another Thread");
        anotherThread.start();

        new Thread(() -> System.out.println(ThreadColor.ANSI_GREEN+"Hello from the anonymous class thread")).start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
           @Override
           public void run() {
               System.out.println(ThreadColor.ANSI_RED+"Hello from the anonymous class's implementation of run()");
           }
        });
        myRunnableThread.start();

        Thread myRunnableThread2 = new Thread(new MyRunnable());
        myRunnableThread2.start();

        System.out.println(ThreadColor.ANSI_PURPLE+"Hello again from the main thread");
    }
}
