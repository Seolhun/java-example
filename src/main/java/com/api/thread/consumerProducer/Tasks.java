package com.api.thread.consumerProducer;

import java.util.Queue;

public class Tasks<T> {
    private Queue<T> taskQueue;

    public Tasks(Queue<T> taskQueue) {
        this.taskQueue = taskQueue;
    }

    public void printTasks() {
        System.out.println(taskQueue.toArray()[5000]);
    }
}
