package exercises.assignments;

public class NumberEx4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                break;
            }
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }

        }
    }
}
