package com.example.task2;

public class EventProcessor {

    public void processEvent(Event event) {
        if (event.getType() == "MOVED") {
            processMovedEvent(event);
        }
        if (event.getType() == "TURNED_ON") {
            processOnEvent(event);
        }
        if (event.getType() == "TURNED_OFF") {
            processOffEvent(event);
        }
        if (event.getType() == "CRASHED") {
            processCrashEvent(event);
        }
    }

    private void processCrashEvent(Event event) {

    }

    private void processOffEvent(Event event) {

    }

    private void processOnEvent(Event event) {

    }

    private void processMovedEvent(Event event) {

    }
}
