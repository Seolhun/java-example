package com.api.thread.consumerProducer;

import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String args[])  {
        ArrayBlockingQueue<Tasks> queue = new ArrayBlockingQueue<>(1000);

        Thread consumer = new Thread(new Consumer(queue));
        Thread producer = new Thread(new Producer(queue));

        consumer.start();
        producer.start();
    }
}
