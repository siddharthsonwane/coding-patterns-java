package main;
import java.util.concurrent.*;

public class MethodOverloading {
    void f1(Integer i){
        System.out.println("f1");
    }

    void f1(int i){
        System.out.println("f2");
    }

    public  void show(Object o){
        System.out.println("Object:");
    }

    public  void show(String s){
        System.out.println("String:");
    }

    public static void main(String[] args) {
     //   new MethodOverloading().f1(8);
       new MethodOverloading().show(null);
    }
}
