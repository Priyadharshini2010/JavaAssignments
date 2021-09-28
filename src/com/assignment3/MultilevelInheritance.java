package com.assignment3;

class Display           //GP Class
{
    static int y;       //Static Variable
    int x;              //Instance Variable

    static void disp2()     //Static Method
    {
        Display d1 = new Display();
        int z = 30;         //Local Variable
        d1.x = 10;
        y = 20;
        System.out.println("Grand-Parent Class Instance Method");
    }

    void disp1()        //Instance Method
    {
        int z = 30;         //Local Variable
        x = 10;
        y = 20;
        System.out.println("Grand-Parent Class Instance Method");
    }
}

public class MultilevelInheritance {
}
