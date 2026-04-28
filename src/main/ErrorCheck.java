package main;

public class ErrorCheck {
    static int x = 100;
    static String show(){
        System.out.println("Hello");
        return "";
    }

    public static void main(String[] args) {
        ErrorCheck ec = null;
        System.err.println(x);
        ec.show();
    }
}
