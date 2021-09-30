package com.assignment2;

public class ConstructorQ3 {
    static int b = 20;     //Static Variable
    int a = 20;          //Instance Variable

    ConstructorQ3() {               //Constructor
        int c;
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        multiply();
        add();
    }

    static void multiply()         //Static Method
    {
        System.out.println("Static Method");

    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        ConstructorQ3 cQ1 = new ConstructorQ3();
    }

    void add()      //Instance Method
    {
        System.out.println("Instance Method");      //Local Variable

    }
}
