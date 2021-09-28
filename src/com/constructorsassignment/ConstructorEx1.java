package com.constructorsassignment;

public class ConstructorEx1 {
    static int z = 300;       //Static Variable
    int y = 200;              //Instance Variable

    ConstructorEx1() {       //Constructor
        int x = 100;          //Local Variable
        System.out.println("Local Variable = " + x + " " + "Instance Variable = " + y + " " + "Static Variable = " + z);
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        ConstructorEx1 cEx1 = new ConstructorEx1();
    }

}
