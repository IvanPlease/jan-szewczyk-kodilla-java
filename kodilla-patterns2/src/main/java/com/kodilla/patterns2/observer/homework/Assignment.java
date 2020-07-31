package com.kodilla.patterns2.observer.homework;

public class Assignment {
    private final String topic;
    private final String type;
    private boolean isDone;

    public Assignment(String topic, String type) {
        this.topic = topic;
        this.type = type;
        isDone = false;
    }

    public String getTopic() {
        return topic;
    }

    public String getType() {
        return type;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
