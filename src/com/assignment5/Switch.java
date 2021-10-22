package com.assignment5;

public class Switch {
    public static void main(String[] args) {
        int n = 10;

        switch (n) {
            case 1:
                System.out.println("1");
                break;
            case 10:
                System.out.println("Value: 10");
                break;
            case 100:
                System.out.println("Value: 100");
                break;
            case 1000:
                System.out.println("Value: 1000");
                break;
            case 10000:
                System.out.println("Value: 10000");
                break;
            default:
                System.out.println("Integer Not Available");
        }
    }
}
