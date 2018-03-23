package com.api.thread.consumerProducer;

public class Message {
    private int id;
    private String content;

    public Message(int id, String content) {
        this.id = id;
        this.content = content;
    }

    @Override
    public String toString() {
        return "message: {" +
            "id:" + id +
            ", content:'" + content + '\'' +
        '}';
    }
}
