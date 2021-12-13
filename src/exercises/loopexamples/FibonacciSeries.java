package exercises.loopexamples;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10, number1 = 0, number2 = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(number1 + ", ");
            int nextNumber = number1 + number2;
            number1 = number2;
            number2 = nextNumber;
        }
    }
}
