package com.assignment5;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                int c = i * j;
                System.out.println(i + " x " + j + " = " + c);
            }
            System.out.println();
        }
    }
}
