package com.assignment2;

public class MultiIB {
    {
        System.out.println("IB-1");
    }

    {
        System.out.println("IB-2");
    }

    {
        System.out.println("IB-3");
    }

    {
        System.out.println("IB-4");
    }

    {
        System.out.println("IB-5");
    }

    {
        System.out.println("IB-6");
    }

    {
        System.out.println("IB-7");
    }

    {
        System.out.println("IB-8");
    }

    {
        System.out.println("IB-9");
    }

    {
        System.out.println("IB-10");
    }

    MultiIB() {
        System.out.println("Constructor 0-arg");
    }

    MultiIB(int a) {
        System.out.println("Constructor 1-arg");
    }

    MultiIB(int a, int b) {
        System.out.println("Constructor 2-arg");
    }

    public static void main(String[] args) {
        MultiIB mib1 = new MultiIB();
        MultiIB mib2 = new MultiIB(1);
        MultiIB mib3 = new MultiIB(1, 2);

    }
}
