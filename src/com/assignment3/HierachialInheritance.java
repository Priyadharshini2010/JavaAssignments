package com.assignment3;

class A {

    String name;          //Instance Variable
    static float salary;   //Static Variable

    static{     //Static Block
        System.out.println("Class A Static Block");
    }

    {           //Instance Block
        System.out.println("Class A Instance Block");
    }

    A()
    {

        System.out.println("Class A Constructor");
    }

    void employee1()          //Instance Method
    {
        int id = 1;         //Local Variable
        name = "AAA";
        salary = 100000;
        System.out.println("Class A Instance Method");
        System.out.println("Employee 1 : ");
        System.out.println("ID : " + id + " " + ",NAME : " + name + " " + ",SALARY : " + salary);
    }

    static void employee2()      //Static Method
    {
        A emp1 = new A();
        int id = 2;
        emp1.name = "BBB";
        salary = 200000;
        System.out.println("Class A Static Method");
        System.out.println("Employee 2 : ");
        System.out.println("ID : " + id + " " + ",NAME : " + emp1.name + " " + ",SALARY : " + salary);
    }
}

class B extends A {

    String name;          //Instance Variable
    static float salary;   //Static Variable

    static{     //Static Block
        System.out.println("Class B Static Block");
    }

    void employee3()          //Instance Method
    {
        int id = 3;
        name = "CCC";
        salary = 300000;
        System.out.println("Class B Instance Method");
        System.out.println("Employee 3 : ");
        System.out.println("ID : " + id + " " + ",NAME : " + name + " " + ",SALARY : " + salary);
    }

    static void employee4()      //Static Method
    {
        B emp2 = new B();
        int id = 4;
        emp2.name = "DDD";
        salary = 400000;
        System.out.println("Class B Static Method");
        System.out.println("Employee 4 : ");
        System.out.println("ID : " + id + " " + ",NAME : " + emp2.name + " " + ",SALARY : " + salary);
    }

    {           //Instance Block
        System.out.println("Class B Instance Block");
    }


    B() {
        System.out.println("Class B Constructor");
    }
}

class C extends A {

    String name;          //Instance Variable
    static float salary;   //Static Variable


    static{     //Static Block
        System.out.println("Class C Static Block");
    }

    {           //Instance Block
        System.out.println("Class C Instance Block");
    }


    void employee5()          //Instance Method
    {
        int id = 5;
        name = "EEE";
        salary = 500000;
        System.out.println("Class C Instance Method");
        System.out.println("Employee 5 : ");
        System.out.println("ID : " + id + " " + ",NAME : " + name + " " + ",SALARY : " + salary);
    }

    static void employee6()      //Static Method
    {
        C emp3 = new C();
        int id = 6;
        emp3.name = "FFF";
        salary = 600000;
        System.out.println("Class C Static Method");
        System.out.println("Employee 6 : ");
        System.out.println("ID : " + id + " " + ",NAME : " + emp3.name + " " + ",SALARY : " + salary);
    }

    C()         //Constructor
    {
        System.out.println("Class C Constructor");
    }
}

public class HierachialInheritance {

    public static void main(String[] args) {
        A emp1 = new A();
        B emp2 = new B();
        C emp3 = new C();

        emp1.employee1();
        A.employee2();

        emp2.employee1();
        B.employee2();
        emp2.employee3();
        B.employee4();

        emp3.employee1();
        C.employee2();
        emp3.employee5();
        C.employee6();

    }
}
