package exercises.loopexamples;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 2986, reversedNum = 0;
        while (num != 0) {
            int moduloNum = num % 10;
            reversedNum = reversedNum * 10 + moduloNum;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversedNum);
    }
}
