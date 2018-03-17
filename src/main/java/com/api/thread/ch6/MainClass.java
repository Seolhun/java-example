package com.api.thread.ch6;

import java.util.concurrent.*;

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
        ExecutorService executorService = Executors.newCachedThreadPool();
//        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1000, 2000, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(), new ThreadPoolExecutor.DiscardOldestPolicy());

        //CPU counts
        System.out.println("AvailableProcessors : " + Runtime.getRuntime().availableProcessors());
        for (int i = 1; i <= 10000; i++) {
            Runnable runnable = new GetNameRunnable("SleepThread" + i);
            threadPoolExecutor.submit(runnable);

            //Sleep대기 동안 맥시멈 개수 증가
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