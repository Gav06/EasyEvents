package me.gavin.easyevent;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new Main();
        } catch (IOException ignored) {}
    }

    long startTime;

    public Main() throws IOException {
        EventSystem eventSystem = new EventSystem();
        eventSystem.register(this);
        eventSystem.register(this);
        //eventSystem.unregister(this);
        startTime = System.currentTimeMillis();

        //for (int i = 0; i < Integer.MAX_VALUE; i++)
        eventSystem.post(new Object());
        System.out.println(System.currentTimeMillis() - startTime + "ms");
    }

    @EventListener
    public void onEvent(Object o) { System.out.println(o); }
}
