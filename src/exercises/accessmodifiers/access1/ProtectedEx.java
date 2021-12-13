package exercises.accessmodifiers.access1;

class Apple {//within package subclass

    protected void display() {
        System.out.println("Class A");
    }
}

public class ProtectedEx extends Apple {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        a1.display();
    }

    protected void display() {
        System.out.println("Class C");
    }
}

