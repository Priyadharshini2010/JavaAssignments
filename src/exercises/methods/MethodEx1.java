package exercises.methods;

public class MethodEx1 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        MethodEx1 m1 = new MethodEx1();
        int result = m1.method1(num1, num2);
        System.out.println("Sum = " + result);
    }

    public int method1(int a, int b) {
        int sum = a + b;
        return sum;
    }

}