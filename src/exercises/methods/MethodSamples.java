package exercises.methods;

public class MethodSamples {
    public static void main(String[] args) {
        MethodSamples ms1 = new MethodSamples();
        short dispNum = ms1.display((short) 10000);
        System.out.println("Display number(short) = " + dispNum);

        byte showNumber = 20;
        showNumber = ms1.displayNumber(showNumber);
        System.out.println("Display number(byte) = " + showNumber);

        boolean verify = ms1.verifyTrue(true);
        System.out.println("Verify true or false = " + verify);

        char alphabet = ms1.displayAlphabet('a');
        System.out.println("Concatenation of 2 Alphabets = " + alphabet);

        int intResult = ms1.add(10, 20);
        System.out.println("Addition Result = " + intResult);

        float floatResult = ms1.multiply(10f, intResult);
        System.out.println("Multiplication Result = " + floatResult);

        double markResult = ms1.multiplyTwoNum(686d, floatResult);
        System.out.println("Multiplication of two numbers = " + markResult);

        long longResult = ms1.addition(1000000960900000l, 2330074565000000l);
        System.out.println("Addition of two double value = " + longResult);

    }

    //Methods
    short display(short m1) {
        return m1;
    }

    byte displayNumber(byte num1) {
        return 100;
    }

    boolean verifyTrue(boolean result) {
        return result;
    }

    char displayAlphabet(char alpha1) {
        return alpha1;
    }

    int add(int num1, int num2) {
        return num1 + num2;
    }

    float multiply(float num3, float result) {
        return num3 * result;
    }

    double multiplyTwoNum(double mark1, double mark2) {
        return mark1 * mark2;
    }

    long addition(long first, long second) {
        return first + second;
    }
}
