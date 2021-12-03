package exercises;

public class MethodSamples {
    public static void main(String[] args) {
        MethodSamples ms1 = new MethodSamples();
        int intResult = ms1.add(10, 20);
        System.out.println("Addition Result = " + intResult);
        float floatResult = ms1.multiply(10, intResult);
        System.out.println("Multiplication Result = " + floatResult);
        double markResult = ms1.multiplyTwoNum(686, floatResult);
        System.out.println("Multiplication of two numbers = " + markResult);
        long longResult = ms1.addition(1000000960900000L, 2330074565000000L);
        System.out.println("Addition of two double value = " + longResult);

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
