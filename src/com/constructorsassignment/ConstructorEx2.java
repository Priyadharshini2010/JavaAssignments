package com.constructorsassignment;

public class ConstructorEx2 {
    int a;                      //Instance Variable
    int b;                      //Instance Variable

    ConstructorEx2() {           //Constructor
        a = 100;
        b = 400;
    }

    static void statMethod() {          //Static Method
        ConstructorEx2 cEx2 = new ConstructorEx2();
        System.out.println("Static Method =" + cEx2.b);
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        ConstructorEx2 cEx1 = new ConstructorEx2();
        cEx1.instanceMethod();
        cEx1.statMethod();
    }

    void instanceMethod() {          //Instance Method
        System.out.println("Instance Method = " + a);
    }
}
