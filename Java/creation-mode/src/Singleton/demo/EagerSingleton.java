package Singleton.demo;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        if (instance != null){
            throw new RuntimeException("Only one instance allowed");
        }
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
