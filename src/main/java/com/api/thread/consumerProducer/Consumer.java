package com.api.thread.consumerProducer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<Tasks<Message>> queue;

    public Consumer(BlockingQueue<Tasks<Message>> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("Consumer Thread Run");
        try {
            while(true) {
                Tasks<Message> tasks = queue.take();

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