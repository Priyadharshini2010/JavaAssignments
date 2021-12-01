package projects;

public class Methods {
    static void method2() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        Methods m1 = new Methods();
        m1.method1();
        method2();
    }

    void method1() {
        System.out.println("Instance Method");
    }
}
