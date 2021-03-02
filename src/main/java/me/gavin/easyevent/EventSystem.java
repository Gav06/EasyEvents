package me.gavin.easyevent;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EventSystem {

    private final HashMap<Object, List<Method>> regMap = new HashMap<>();

    public void register(Object obj) {
        if (regMap.containsKey(obj))
            return;
        regMap.put(obj, Arrays.stream(obj.getClass().getDeclaredMethods()).filter(method -> method.isAnnotationPresent(EventListener.class)).collect(Collectors.toList()));
    }

    public void unregister(Object obj) {
        regMap.remove(obj, Arrays.asList(obj.getClass().getDeclaredMethods()));
    }

    public void post(Object object) {
        regMap.forEach((o, methods) -> methods.forEach(method -> {
            if (method.getParameterTypes()[0] == object.getClass()) {
                try {
                    method.invoke(o, object);
                } catch (IllegalAccessException | InvocationTargetException e) { e.printStackTrace(); }
            }
        }));
    }
}
