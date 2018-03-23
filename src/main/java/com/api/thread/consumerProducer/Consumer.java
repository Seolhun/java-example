package com.api.thread.consumerProducer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<Tasks> queue;

    public Consumer(BlockingQueue<Tasks> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("Consumer Thread Run");
        try {
            while(true) {
                Tasks tasks = queue.take();

                System.out.println("================================");
                tasks.printTasks();
                System.out.println("================================");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}