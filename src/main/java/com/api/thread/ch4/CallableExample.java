package com.api.thread.ch4;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.*;

public class CallableExample implements Callable<List<String>> {
    /* Interface의 run method 구현하기. */
    @Override
    public List<String> call() throws Exception {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            String s = UUID.randomUUID().toString();
            strings.add(s);
            System.out.println("index : " + i);
            System.out.println("String : " + s);
            System.out.println("---------------");
        }
        return strings;
    }

    public static void main(String args[]) {
        /* Interface Instance */
        CallableExample callableExample = new CallableExample();

        //Defined ThreadPool
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService = Executors.newCachedThreadPool();
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;

        System.out.println("getActiveCount : " + threadPoolExecutor.getActiveCount());
        System.out.println("getCompletedTaskCount : " + threadPoolExecutor.getCompletedTaskCount());
        System.out.println("getCorePoolSize : " + threadPoolExecutor.getCorePoolSize());
        System.out.println("getKeepAliveTime : " + threadPoolExecutor.getKeepAliveTime(TimeUnit.DAYS));
        System.out.println("getLargestPoolSize : " + threadPoolExecutor.getLargestPoolSize());
        System.out.println("getMaximumPoolSize : " + threadPoolExecutor.getMaximumPoolSize());
        System.out.println("getQueue : " + threadPoolExecutor.getQueue());

        //Do ThreadPool
        threadPoolExecutor.submit(callableExample);

        try {
            System.out.println("Size : " + threadPoolExecutor.submit(callableExample).get().size());
            System.out.println("ToString : " + threadPoolExecutor.submit(callableExample).get().toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}