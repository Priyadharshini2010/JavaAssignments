package projects;

public class ConstThis {
    ConstThis() {
        this(10);
        System.out.println("0 arg");
    }

    ConstThis(int x) {
        this(1, 2);
        System.out.println("1-arg");
    }

    ConstThis(int x, int y) {
        System.out.println("2-arg");
    }

    public static void main(String[] args) {
        new ConstThis();
    }
}
