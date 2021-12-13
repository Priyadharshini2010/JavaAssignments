package exercises.loopexamples;

public class DoWhile1 {
    public static void main(String[] args) {
        int number = 15, sum = 0;
        do {
            sum += number;
            number--;
        }
        while (number > 5);
        System.out.println("Sum = " + sum);
    }
}
