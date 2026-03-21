package main.multithreading;

import java.util.Map;

public class mainRunner {
public static void main(String[] args){

    Thread t = new Thread(() -> {
        try { Thread.sleep(2000); } catch (Exception e) {}
    });

    t.start();

/*    // Print all threads
    Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();

    for (Thread thread : map.keySet()) {
        System.out.println("Thread Name: " + thread.getName());
    }*/

    Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();

    for (Thread thread : map.keySet()) {
        System.out.println("=================================");
        System.out.println("Name      : " + thread.getName());
        System.out.println("State     : " + thread.getState());
        System.out.println("Priority  : " + thread.getPriority());
        System.out.println("Daemon    : " + thread.isDaemon());
    }
 }
}

