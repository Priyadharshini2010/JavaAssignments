package com.assignment3;

class Display           //GP Class
{
    static int y;       //Static Variable
    int x;              //Instance Variable

    void disp1()        //Instance Method
    {
        int z = 30;         //Local Variable
        x = 10;
        y = 20;
        System.out.println("Grand-Parent Class Instance Method");
        System.out.println("Instance Variable = " + x + " " + "Static Variable = " + y + " " + "Local Variable = " +z);
    }

    static void disp2()     //Static Method
    {
        Display d1 = new Display();
        int z = 60;         //Local Variable
        d1.x = 40;
        y = 50;
        System.out.println("Grand-Parent Class Static Method");
        System.out.println("Instance Variable = " + d1.x + " " + "Static Variable = " + y + " " + "Local Variable = " +z);
    }


    {               //Instance Block
        System.out.println("Grand-Parent Class Instance Block");
    }

    static{         //Static Block
        System.out.println("Grand-Parent Class Static Block");
    }

    Display()
    {
        System.out.println("Grand-Parent Class Constructor");
    }
}

class Display1 extends Display         //Parent Class
{
    static int y;       //Static Variable
    int x;              //Instance Variable

    void disp3()        //Instance Method
    {
        int z = 90;         //Local Variable
        x = 70;
        y = 80;
        System.out.println("Parent Class Instance Method");
        System.out.println("Instance Variable = " + x + " " + "Static Variable = " + y + " " + "Local Variable = " +z);
    }

    static void disp4()     //Static Method
    {
        Display1 d1 = new Display1();
        int z = 120;         //Local Variable
        d1.x = 100;
        y = 110;
        System.out.println("Parent Class Static Method");
        System.out.println("Instance Variable = " + d1.x + " " + "Static Variable = " + y + " " + "Local Variable = " +z);
    }

    {               //Instance Block
        System.out.println("Parent Class Instance Block");
    }

    static{         //Static Block
        System.out.println("Parent Class Static Block");
    }
    Display1()
    {
        System.out.println("Parent Class Constructor");
    }
}


public class MultilevelInheritance extends Display1 {
    public static void main(String[] args)
    {
        System.out.println("Welcome");
        Display d1 = new Display();
       Display1 d2 = new Display1();
       d1.disp1();
       Display.disp2();
       d2.disp3();
       Display1.disp4();


    }
}
