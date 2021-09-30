package com.assingment4;

public class InstanceMethod2 {
    static void staticmethod() {
        System.out.println("Static Method");
        int x = 120;
        int y = 30;
        int z;
        z = x + y;
        System.out.println(+x + "+" + y + " = " + z);
    }

    public static void main(String[] args) {
        InstanceMethod2 sM1 = new InstanceMethod2();
        sM1.instancemethod();
    }

    void instancemethod() {

        System.out.println("Instance Method");
        int x = 50;
        int y = 30;
        int z;
        z = x + y;
        System.out.println(+x + "+" + y + " = " + z);
        staticmethod();

    }
}
