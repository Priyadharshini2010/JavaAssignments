package exercises.loopexamples;

public class SwitchExp {
    public static void main(String[] args) {
        int dayNumber = 2;
        String days;
        switch (dayNumber) {
            case 1:
                days = "Monday";
                break;
            case 2:
                days = "Tuesday";
                break;
            case 3:
                days = "Wednesday";
                break;
            case 4:
                days = "Thursday";
                break;
            case 5:
                days = "Friday";
                break;
            case 6:
                days = "Saturday";
                break;
            case 7:
                days = "Sunday";
                break;
            default:
                days = "Invalid day";
        }
        System.out.println(days);
    }
}
