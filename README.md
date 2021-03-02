# EasyEvents
Made with only 60 lines of code (including spaces)


the purpose of this is just to have an extremely simple and lightweight event handler, that uses lambdas and reflection

# Usage

```java
public class Main {
  
    // create object
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        // make event manager object
        EventSystem eventSystem = new EventSystem();
        
        // register class
        eventSystem.register(this);
        
        // push string through event bus
        eventSystem.post("Hello world");
    }
    
    // listening for string events
    @EventListener
    public void onEvent(String s) {
        // printing out string sent through event bus
        System.out.println(s);
    }
}
```

# Adding to project (gradle)
add to repositories
```gradle
repositories {
	maven { url 'https://jitpack.io' }
}
```

add as a dependency
```gradle
dependencies {
	implementation 'com.github.Gav06:EasyEvents:1.0'
}
```

Read the jitpack.io page for maven, sbt, etc.
