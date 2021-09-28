package com.assignment2;

public class StaticMethodQ5 {

    static int y;   //Static Variable
    int x;      //Instance Variable

    static void disp() {
        StaticMethodQ5 sMq2 = new StaticMethodQ5();
        sMq2.x = 10;
        y = 20;
        int z = 30;
        System.out.println("Static Method Variable values");
        System.out.println("x = " + sMq2.x + " " + "y = " + y + " " + "z = " + z);
        sMq2.display();

    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        StaticMethodQ5 sMq1 = new StaticMethodQ5();
        StaticMethodQ5.disp();
    }

    void display() {
        x = 400;
        y = 500;
        int z = 600;          //Local Variable
        System.out.println("Instance Method Variable Values");
        System.out.println("x = " + x + " " + "y = " + y + " " + "z = " + z);
    }
}

