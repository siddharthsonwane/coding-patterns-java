package main.singleTone;

public class BasicSingletonLazyInitialization {
    private static BasicSingletonLazyInitialization instance;
    private BasicSingletonLazyInitialization(){}
    public static BasicSingletonLazyInitialization getInstance(){
        if (instance == null){
            instance = new BasicSingletonLazyInitialization();
        }
        return instance;
    }
}
