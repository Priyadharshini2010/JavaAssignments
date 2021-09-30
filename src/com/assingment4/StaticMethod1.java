package com.assingment4;

public class StaticMethod1 {
    static int a;

    static void method1() {
        a = 30;
        System.out.println("Method 1 " + a);
    }

    static void method2() {
        method1();
        a = 40;
        System.out.println("Method 2 " + a);
    }

    public static void main(String[] args) {
        StaticMethod1.method2();
    }
}
