package exercises;

class Apple {
    int interestRate = 6;
    int finalInterest;

    void interest() {
        int oldInterest = 2;
        finalInterest = interestRate - oldInterest;
    }
}

public class Sample extends Apple {
    public static void main(String[] args) {
        Sample ex1 = new Sample();
        ex1.interest();

    }

    void interest() {
        int oldInterest = 9;
        int newInterest = oldInterest + super.finalInterest;
        System.out.println(newInterest);
    }

}
