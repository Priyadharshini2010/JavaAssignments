package com.constructorsassignment;

public class ConstructorEx3 {
    static int c;               //Static Variable
    int b;                      //Instance Variable

    {                          //Instance Block
        System.out.println("Instance Block values");
        int a = 100;
        b = 200;
        c = 300;
        System.out.println("Instance Block a Value = " + a);
    }

    ConstructorEx3() {           //Constructor
        System.out.println("Constructor");
    }

    static void statMethod() {   //Static Method
        System.out.println("Static Method c value = " + c);
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        ConstructorEx3 cEx1 = new ConstructorEx3();
        cEx1.instMethod();
        cEx1.statMethod();
    }

    void instMethod() {          //Instance Method
        System.out.println("Instance Method b value = " + b);
    }
}
