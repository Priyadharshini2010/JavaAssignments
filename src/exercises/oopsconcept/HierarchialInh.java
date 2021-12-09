package exercises.oopsconcept;

class Apple {
    void emp1() {

        System.out.println("Base Class");
    }
}

class Orange extends Apple {
    void emp2() {

        System.out.println("Child Class-1");
    }
}

class Citrus extends Apple {
    void emp3() {
        System.out.println("Child Class-2");
    }
}

public class HierarchialInh extends Apple {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        Orange o1 = new Orange();
        Citrus c1 = new Citrus();
        HierarchialInh h1 = new HierarchialInh();
        a1.emp1();
        o1.emp1();
        o1.emp2();
        c1.emp1();
        c1.emp3();
        h1.emp1();
        h1.emp4();


    }

    void emp4() {
        System.out.println("Child Class-3");
    }
}
