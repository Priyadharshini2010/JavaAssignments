package com.assingment4;

public class StaticMethod2 {
    static void employee2() {
        StaticMethod2 sM1 = new StaticMethod2();
        sM1.employee1();
        System.out.println("Static Method");
        float salary = 200000;
        int id = 2;
        String name = "BBB";
        System.out.println("Emp ID: " + id + " " + ",Name: " + name + " " + ",Salary: " + salary);
    }

    void employee1() {
        System.out.println("Instance Method");
        float salary = 100000;
        int id = 1;
        String name = "AAA";
        System.out.println("Emp ID: " + id + " " + ",Name: " + name + " " + ",Salary: " + salary);
    }

    public static void main(String[] args) {
        employee2();
    }
}
