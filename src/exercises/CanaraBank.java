package exercises;

class RBIBank {
    int percentageIncrease = 3;
    int interest(int interestRate) {
        System.out.println("Increase in Interest Rate: " + percentageIncrease);
        int rbiInterest = percentageIncrease + interestRate;
        System.out.println("RBI Bank Interest: " + rbiInterest);
        return rbiInterest;
    }
}

class SBIBank extends RBIBank {

    int interest(int interestRate) {

        return super.percentageIncrease + interestRate;
    }
}

class HDFCBank extends RBIBank {

    int interest(int interestRate) {

        return super.percentageIncrease + interestRate;
    }
}

public class CanaraBank extends RBIBank {
    public static void main(String[] args) {

        CanaraBank canara = new CanaraBank();
        RBIBank rbi = new RBIBank();
        SBIBank sbi = new SBIBank();
        HDFCBank hdfc = new HDFCBank();
        rbi.interest(2);
        int canInterest = canara.interest(4);
        int sbiInterest = sbi.interest(6);
        int hdfcInterest = hdfc.interest(5);
        System.out.println("Canara Bank Interest: " + canInterest);
        System.out.println("SBI Bank Interest: " + sbiInterest);
        System.out.println("HDFC Bank Interest: " + hdfcInterest);
    }

    int interest(int interestRate) {

        return super.percentageIncrease + interestRate;
    }
}
