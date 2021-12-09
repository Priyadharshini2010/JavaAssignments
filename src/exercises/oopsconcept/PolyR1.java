package exercises.oopsconcept;

class PolyA {
    void method1() {
        System.out.println("Parent Overridden");
    }
}

public class PolyR1 extends PolyA {
    public static void main(String[] args) {
        new PolyR1().method1();

    }

    void method1() {
        System.out.println("Child Class Overriding");
    }
}
