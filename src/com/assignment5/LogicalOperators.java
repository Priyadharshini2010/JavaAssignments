package com.assignment5;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 10;
        System.out.println("AND Operator");
        if (a == b && a == c && c == a) {
            System.out.println("a =  " + a + " b = " + b + " c = " + c);
        } else {
            System.out.println("Not Equal");
        }
        int x = 10, y = 10, z = 90;
        System.out.println("OR Operator");
        if (x == y || y == z || z == x) {
            System.out.println("x =  " + x + " y = " + y + " z = " + z);
        } else {
            System.out.println("Not Equal");
        }
        int l = 11, m = 12;
        System.out.println("NOT Operator");
        if (!(l == m)) {
            System.out.println("l = " + l + " not equal to m = " + m);
        } else {
            System.out.println("Equal");
        }
    }

}
