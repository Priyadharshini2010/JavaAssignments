package projects;

class A {
    void emp1() {
        System.out.println("Base Class");
    }
}

class B extends A {
    void emp2() {
        System.out.println("Intermediate Class");
    }
}

public class MultilevelInh extends B {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        MultilevelInh m1 = new MultilevelInh();
        a1.emp1();
        b1.emp1();
        b1.emp2();
        m1.emp1();
        m1.emp2();
        m1.emp3();

    }

    void emp3() {
        System.out.println("Child Class");
    }
}
