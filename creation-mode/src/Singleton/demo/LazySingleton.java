package Singleton.demo;

import java.util.Objects;

public class LazySingleton {
    // volatile 禁止指令重排
    private static volatile LazySingleton instance;

    private LazySingleton() {
        // 防止反射调用
        if(Objects.isNull(instance)){
            throw new RuntimeException("please use getInstance()");
        }
    }
    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
