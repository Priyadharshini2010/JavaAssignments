package projects;

public class PrimitiveDefault {
    int number;

    public static void main(String[] args) {
        PrimitiveDefault p1 = new PrimitiveDefault();
        int number1 = p1.DefaultMethod();
        System.out.println(number1);
    }

    int DefaultMethod() {
        return number;
    }
}
