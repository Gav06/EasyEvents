# EasyEvents

- Made with only 2 lines of code!
- The purpose of this is just to have an extremely simple and lightweight event handler, that uses lambdas and reflection.

## Usage

```java
public class Main { 
    //Create object
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //Make event manager object
        EventSystem eventSystem = new EventSystem();
        
        //Register class
        eventSystem.register(this);
        
        //Push string through event bus
        eventSystem.post("Hello world");
    }
    
    //Listening for string events
    @EventListener
    public void onEvent(String s) {
        // printing out string sent through event bus
        System.out.println(s);
    }
}
```

### Adding to project (gradle)
- Add to repositories
```gradle
repositories {
	maven { url 'https://jitpack.io' }
}
```

- Add as a dependency
```gradle
dependencies {
	compile 'com.github.Gav06:EasyEvents:1.2.1'
}
```

Read the jitpack.io page for maven, sbt, etc.
