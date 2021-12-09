package exercises.flowcontrol;

public class IfElseIfLadder {
    public static void main(String[] args) {
        int mark = 75;
        if (mark <= 100 && mark >= 91) {
            System.out.println("O");
        } else if (mark <= 90 && mark >= 81) {
            System.out.println("A+");
        } else if (mark <= 80 && mark >= 71) {
            System.out.println("A");
        } else if (mark <= 70 && mark >= 61) {
            System.out.println("B+");
        } else if (mark <= 60 && mark >= 51) {
            System.out.println("B");
        } else if (mark <= 50 && mark >= 0) {
            System.out.println("F");
        }
    }
}
