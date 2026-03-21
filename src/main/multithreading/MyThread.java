package main.multithreading;

public class MyThread  extends Thread {
    public void run(){
        System.out.println("Thread is running..");
        System.out.println("Child thread: " + Thread.currentThread().getName());
        System.out.println("Child thread: " + Thread.activeCount());
    }

    public static void main(String[] args) {
        System.out.println("Main thread: " + Thread.currentThread().getName());
        System.out.println("Main thread: " + Thread.activeCount());
        MyThread t = new MyThread();
        t.start();
        System.out.println("Main thread again: " + Thread.currentThread().getName());
        System.out.println("Main thread again: " + Thread.activeCount());
    }
}

