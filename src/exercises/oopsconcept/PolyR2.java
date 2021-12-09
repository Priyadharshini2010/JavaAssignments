package exercises.oopsconcept;

class PolyR2A {
    int m1() {
        System.out.println("Overridden method");
        return 10;
    }
}

public class PolyR2 extends PolyR2A {
    public static void main(String[] args) {
        new PolyR2().m1();
    }

    int m1() {
        System.out.println("Overriding method");
        return 20;
    }

}
