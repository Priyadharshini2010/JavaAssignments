package projects;

class Animals {
    void dog() {
        System.out.println("Base Class method");
    }
}

class Birds extends Animals {
    void dog() {
        super.dog();
        System.out.println("Intermediate class method-1");
    }

    void swan() {

        System.out.println("Intermediate Class");
    }
}

public class InheritanceKey extends Birds {
    public static void main(String[] args) {
        InheritanceKey ih1 = new InheritanceKey();
        Animals a1 = new Animals();
        Birds b1 = new Birds();
        ih1.dog();
        ih1.cat();
        ih1.swan();
        b1.dog();
        b1.swan();
        a1.dog();
    }

    void dog() {
        super.dog();
        System.out.println("Child Class method");
    }

    void cat() {
        System.out.println("Child Class");
    }
}
