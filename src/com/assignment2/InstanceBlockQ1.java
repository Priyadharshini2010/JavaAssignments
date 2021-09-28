package com.assignment2;

public class InstanceBlockQ1 {
    static float salary;    //Static Variable
    String name;            //Instance Variable

    {                                       //Instance Block
        System.out.println("Instance Block");
        int id = 12;
        name = "AAA";
        salary = 100000;
        System.out.println("EMPLOYEE ID = " + id);
    }

    InstanceBlockQ1() {                      //Constructor
        System.out.println("Constructor");
    }

    static void empl() {                     //Static Method
        System.out.println("Static Method");
        System.out.println("SALARY = " + salary);
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        InstanceBlockQ1 iBq1 = new InstanceBlockQ1();
        iBq1.employee();
        InstanceBlockQ1.empl();
    }

    void employee() {                   //Instance Method
        System.out.println("Instance Method");
        System.out.println("NAME = " + name);
    }
}

