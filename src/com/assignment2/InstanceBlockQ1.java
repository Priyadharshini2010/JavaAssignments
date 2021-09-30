package com.assignment2;

public class InstanceBlockQ1 {
    static float salary = 100000;    //Static Variable
    String name = "AAA";            //Instance Variable

    {                                       //Instance Block
        System.out.println("Instance Block");
        int id = 12;
        System.out.println("EMPLOYEE ID = " + id);
        System.out.println("EMPLOYEE NAME = " + name);
        System.out.println("EMPLOYEE SALARY = " + salary);
        empl();
        employee();
    }

    InstanceBlockQ1() {                      //Constructor

        System.out.println("Constructor");
    }

    static void empl() {                     //Static Method
        System.out.println("Static Method");
    }

    void employee() {                   //Instance Method
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        InstanceBlockQ1 iBq1 = new InstanceBlockQ1();
    }
}

