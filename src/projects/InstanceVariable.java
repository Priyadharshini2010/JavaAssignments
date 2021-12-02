package projects;

public class InstanceVariable {
    int b = 10;

    {
        System.out.println("Block Instance Variable " + b);
    }

    InstanceVariable() {
        System.out.println("Constructor Instance Variable " + b);
    }

    public static void main(String[] args) {
        InstanceVariable i1 = new InstanceVariable();
        i1.instvar();
    }

    void instvar() {
        System.out.println("Method Instance Variable " + b);
    }

}
