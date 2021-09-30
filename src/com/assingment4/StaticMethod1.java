package com.assingment4;

public class StaticMethod1 {
    static String a;
    static float salary;

    static void method1() {
        a = "AAA";
        salary = 100000;
        System.out.println("Method 1 ");
        System.out.println("Employee 1 Name : " + a + " " + ",Salary : " + salary);
    }

    static void method2() {
        method1();
        a = "BBB";
        salary = 200000;
        System.out.println("Method 2 ");
        System.out.println("Employee 2 Name : " + a + " " + ",Salary : " + salary);
    }

    public static void main(String[] args) {
        StaticMethod1.method2();
    }
}
