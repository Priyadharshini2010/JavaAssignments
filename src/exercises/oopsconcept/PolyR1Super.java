package exercises.oopsconcept;

class PolyA1 {
    void method1() {
        System.out.println("Parent Overridden");
    }
}

public class PolyR1Super extends PolyA1 {
    public static void main(String[] args) {
        new PolyR1Super().method1();

    }

    void method1() {
        super.method1();
        System.out.println("Child Class Overriding");
    }
}

