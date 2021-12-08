package projects;

public class Operators {
    public int num1 = 10, num2 = 100;

    public static void main(String[] args) {
        Operators obj = new Operators();
        obj.arithmeticOperators();
        obj.logicalOperators();
    }

    void arithmeticOperators() {

        int add = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + add);
        int subtract = num2 - num1;
        System.out.println(num1 + " - " + num2 + " = " + subtract);
        int multiply = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + multiply);
        int division = num2 / num1;
        System.out.println(num2 + " / " + num1 + " = " + division);
        int modulus = num2 % num1;
        System.out.println(num2 + " % " + num1 + " = " + modulus);
    }

    void logicalOperators() {
        int number1 = 100, number2 = 200, number3 = 100;
        if ((number1 > number2 || number1 < number2) && number1 == number3) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
