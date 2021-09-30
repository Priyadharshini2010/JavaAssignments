package com.assignment2;

public class StaticBlockQ2 {
    static float mark = 90;                       //Static Variable

    static {                                  //Static Block
        System.out.println("Static Block");
        int id = 10;                          //Local Variable
        StaticBlockQ2 sBq1 = new StaticBlockQ2();
        sBq1.student();
        StaticBlockQ2.stud();
        System.out.println("STUDENT ID = " + id);
        System.out.println("NAME = " + sBq1.name);
        System.out.println("MARK = " + mark);
    }

    String name = "BBB";                              //Instance Variable


    StaticBlockQ2() {                      //Constructor
        System.out.println("Constructor");
    }

    static void stud() {                         //Static Method
        System.out.println("Static Method");
    }

    public static void main(String[] args) {

        System.out.println("Welcome");
    }

    void student() {                               //Instance Method
        System.out.println("Instance Method");

    }

}
