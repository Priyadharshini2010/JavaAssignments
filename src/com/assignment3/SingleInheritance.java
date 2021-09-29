package com.assignment3;

class ParentClass                     //Parent Class
{
    int a=10;               //Instance Variable
    static int b=20;        //Static Variable

    void add()              //Instance Method
    {
        System.out.println("Parent Class Instance Method");
        int c;                 //Local Variable
        c=a+b;
        System.out.println("Parent Class Addition : ");
        System.out.println(a+ " + " +b+ " = "  +c);
    }

    static void multiply()     //Static Method
    {
        System.out.println("Parent Class Static Method");
        int c;
        ParentClass a1 = new ParentClass();
        c=a1.a*b;
        System.out.println("Parent Class Multiplication : ");
        System.out.println(a1.a+ " * " +b+ " = "  +c);
    }

    {                           //Instance Block
        System.out.println("Parent Class Instance Block");
    }

    static{             //Static Block
        System.out.println("Parent Class Static Block");
    }

    ParentClass()           //Parent Class Constructor
    {
        System.out.println("Parent Class Constructor");
    }
}


class ChildClass extends ParentClass       //Child Class
{
    int a=100;               //Instance Variable
    static int b=200;        //Static Variable

    void add1()              //Instance Method
    {
        super.add();
        System.out.println("Child Class Instance Method");
        int c;                 //Local Variable
        c=a+b;
        System.out.println("Child Class Addition : ");
        System.out.println(a+ "+" +b+ " = "  +c);

    }

    static void multiply1()     //Static Method
    {
        System.out.println("Child Class Static Method");
        int c;
        ChildClass a1 = new ChildClass();
        c=a1.a*b;
        System.out.println("Child Class Multiplication : ");
        System.out.println(a1.a+ " * " +b+ " = "  +c);
    }

    {                           //Instance Block
        System.out.println("Child Class Instance Block");
    }

    static{                     //Static Block
        System.out.println("Child Class Static Block");
    }

    ChildClass()                //Child Class Constructor
    {
        System.out.println("Child Class Constructor");
    }
}

public class SingleInheritance {

    public static void main(String[] args)
    {
        ChildClass c1 = new ChildClass();
        c1.add1();
        ChildClass.multiply1();
    }
}
