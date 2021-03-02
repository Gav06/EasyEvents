package me.gavin.easyevent;

public class EasyEvent {

    boolean cancelled = false;

    public void cancel() {
        cancelled = true;
    }

    public boolean isCancelled() {
        return cancelled;
    }
}
