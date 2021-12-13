package exercises.assignments;

public class NumberEx3 {
    public static void main(String[] args) {
        int number = 7;
        String words;
        switch (number) {
            case 1:
                words = "One";
                break;
            case 2:
                words = "Two";
                break;
            case 3:
                words = "Three";
                break;
            case 4:
                words = "Four";
                break;
            case 5:
                words = "Five";
                break;
            case 6:
                words = "Six";
                break;
            case 7:
                words = "Seven";
                break;
            case 8:
                words = "Eight";
                break;
            case 9:
                words = "Nine";
                break;
            case 10:
                words = "Ten";
                break;
            default:
                words = "Invalid";
        }
        System.out.println(words);
    }
}
