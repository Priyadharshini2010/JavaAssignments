package projects;

public class LocalVariables {
    {
        int a = 25;
        System.out.println("Block Local Variable " + a);
    }

    LocalVariables() {
        int a = 15;
        System.out.println("Constructor Local Variable " + a);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        LocalVariables l1 = new LocalVariables();
        l1.locvar();
    }

    void locvar() {
        int a = 5;
        System.out.println("Method Local Variable " + a);
    }
}
