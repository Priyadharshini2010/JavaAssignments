package com.assignment2;

public class StaticBlockQ2 {
    static float mark;                       //Static Variable

    static {                                  //Static Block
        System.out.println("Static Block");
        int id = 10;                          //Local Variable
        mark = 89;
        System.out.println("STUDENT ID = " + id);
        StaticBlockQ2 sBq1 = new StaticBlockQ2();
        sBq1.name = "BBB";
        sBq1.student();
        StaticBlockQ2.stud();
    }

    String name;                              //Instance Variable

    StaticBlockQ2() {                      //Constructor
        System.out.println("Constructor");
    }

    static void stud() {                         //Static Method
        System.out.println("Static Method");
        System.out.println("MARK = " + mark);
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
    }

    void student() {                               //Instance Method
        System.out.println("Instance Method");
        System.out.println("NAME = " + name);
    }
}
