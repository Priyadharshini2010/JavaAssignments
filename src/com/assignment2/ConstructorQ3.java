package com.assignment2;

public class ConstructorQ3 {
    static int b;     //Static Variable
    int a;          //Instance Variable

    ConstructorQ3() {               //Constructor
        a = 20;
        b = 30;
    }

    static void multiply()         //Static Method
    {
        int c;                      //Local Variable
        ConstructorQ3 cQ1 = new ConstructorQ3();
        c = cQ1.a * b;
        System.out.println("Multiplication = " + c);

    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        ConstructorQ3 cQ1 = new ConstructorQ3();
        cQ1.add();
        ConstructorQ3.multiply();
    }

    void add()      //Instance Method
    {
        int c;      //Local Variable
        c = a + b;
        System.out.println("Addition = " + c);
    }
}
