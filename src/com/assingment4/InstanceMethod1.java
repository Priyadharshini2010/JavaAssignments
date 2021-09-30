package com.assingment4;

public class InstanceMethod1 {
    int a;

    public static void main(String[] args) {
        InstanceMethod1 iM1 = new InstanceMethod1();
        iM1.method2();
    }

    void method1() {
        a = 10;
        System.out.println("Method 1 " + a);
    }

    void method2() {
        method1();
        a = 20;
        System.out.println("Method 2 " + a);
    }
}
