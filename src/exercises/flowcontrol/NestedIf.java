package exercises.flowcontrol;


public class NestedIf {
    public static void main(String[] args) {
        int chemistryMark = 86;
        int physicsMark = 84;
        int mathsMark = 70;
        if (chemistryMark > 80) {
            if (physicsMark > 85 && physicsMark < 95) {
                if (mathsMark > 90) {
                    int totalMark = mathsMark + physicsMark + chemistryMark; //270
                    System.out.println(totalMark / 3); //90
                } else {
                    int totalMark = mathsMark + physicsMark + chemistryMark;
                    System.out.println((totalMark + 10) / 3);
                }
            } else {
                int totalMark = physicsMark + chemistryMark;
                System.out.println((totalMark + 10) / 2);
            }
        } else {
            System.out.println("Student not allowed for course");
        }

    }
}
