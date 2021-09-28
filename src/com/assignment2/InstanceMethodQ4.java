package com.assignment2;

public class InstanceMethodQ4 {
    static int b;               //Static Variable
    int a;                   //Instance Variable

    static void disp()              //Static Method
    {
        InstanceMethodQ4 iMq2 = new InstanceMethodQ4();
        iMq2.a = 10;
        b = 20;
        int c = 30;             //Local Variable
        System.out.println("Static Method Variable values");
        System.out.println("a = " + iMq2.a + " " + "b = " + b + " " + "c = " + c);

    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        InstanceMethodQ4 iMq1 = new InstanceMethodQ4();
        iMq1.display();
    }

    void display()              //Instance Method
    {
        a = 100;
        b = 200;
        int c = 300;          //Local Variable
        System.out.println("Instance Method Variable Values");
        System.out.println("a = " + a + " " + "b = " + b + " " + "c = " + c);
        InstanceMethodQ4.disp();
    }
}
