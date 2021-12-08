package exercises;

class RBIBank {

    int diff;
    int oldInterest = 2;

    int interest(int interestRate) {
        System.out.println("RBI Bank Interest: " + interestRate);
        diff = interestRate - oldInterest;
        System.out.println("Increase in Interest Rate: " + diff);
        return diff;
    }
}

class SBIBank extends RBIBank {
    int oldInterest = 7;

    int interest(int interestRate) {
        return oldInterest + interestRate;
    }
}

class HDFCBank extends RBIBank {
    int oldInterest = 4;

    int interest(int interestRate) {
        return oldInterest + interestRate;
    }
}

public class Exercise1 extends RBIBank {
    int oldInterest = 5;

    public static void main(String[] args) {
        Exercise1 ex1 = new Exercise1();
        RBIBank rbi = new RBIBank();
        SBIBank sbi = new SBIBank();
        HDFCBank hdfc = new HDFCBank();
        int rbiDiff = rbi.interest(9);
        int canInterest = ex1.interest(rbiDiff);
        int sbiInterest = sbi.interest(rbiDiff);
        int hdfcInterest = hdfc.interest(rbiDiff);
        System.out.println("Canara Bank Interest: " + canInterest);
        System.out.println("SBI Bank Interest: " + sbiInterest);
        System.out.println("HDFC Bank Interest: " + hdfcInterest);

    }

    int interest(int interestRate) {
        return oldInterest + interestRate;
    }

}
