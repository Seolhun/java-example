package com.api.thread.ch5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The type Main class.
 */
public class MainClass {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        /*
        5개의 Pool을 Fix한다.
        */
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        System.out.println("AvailableProcessors : " + Runtime.getRuntime().availableProcessors());

        for (int i = 1; i <= 10; i++) {
            Runnable doThread = new GetNameRunnable("SleepThread" + i);
            executorService.execute(doThread);
        }

        /*
        ExecutorService의 모든 작업 이후 다른 thread 호출을 10초 동안 차단합니다.
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        */

        /*
        ExecutorService 종료
        */
        executorService.shutdown();

		/* ExecutorService 종료되었는지 확인. */
        while (!executorService.isTerminated()) {

        }
        System.out.println("모든 Thread가 종료되었습니다.");
    }
}