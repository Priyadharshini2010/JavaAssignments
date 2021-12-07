package exercises;

class RBIBank {
    int oldInterest = 6;

    int interest(int interestRate) {
        return interestRate - oldInterest;
    }
}


public class Exercise1 extends RBIBank {
    int oldInterest = 9;

    public static void main(String[] args) {
        Exercise1 ex1 = new Exercise1();
        RBIBank rbi = new RBIBank();
        int rbiDiff = rbi.interest(9);
        int finalInterest = ex1.interest(rbiDiff);
        System.out.println(finalInterest);

    }

    int interest(int interestRate) {
        return oldInterest + interestRate;
    }

}
