package com.assingment4;

public class StaticMethod2 {
    static void employee2() {
        StaticMethod2 sM1 = new StaticMethod2();
        sM1.employee1();
        System.out.println("Static Method");
        float salary = 300000;
        int id = 3;
        String name = "CCC";
        System.out.println("Emp ID: " + id + " " + ",Name: " + name + " " + ",Salary: " + salary);
    }

    public static void main(String[] args) {

        employee2();
    }

    void employee1() {
        System.out.println("Instance Method");
        float salary = 400000;
        int id = 4;
        String name = "DDD";
        System.out.println("Emp ID: " + id + " " + ",Name: " + name + " " + ",Salary: " + salary);
    }
}
