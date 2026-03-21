package main.singleTone;

public class ThreadSafeSingletonSynchronizedMethod {
    private static ThreadSafeSingletonSynchronizedMethod instance;
    private ThreadSafeSingletonSynchronizedMethod(){}
    public static synchronized ThreadSafeSingletonSynchronizedMethod getInstance(){
        if (instance == null){
            instance = new ThreadSafeSingletonSynchronizedMethod();
        }
        return instance;
    }
}
