package exercises.accessmodifiers.access1;

class Animal {

    private int animalCount = 40; //accessible within the class

    private void count() {
        System.out.println("Animal Count is : " + animalCount);
    }

    void animalCount() //default
    {
        Animal a2 = new Animal();
        a2.count();
        System.out.println("Hello");
    }

    protected void helloWorld() {
        System.out.println("Hello World.....");
    }
}

public class AccessModifiers extends Animals {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        AccessModifiers ac1 = new AccessModifiers();
        ac1.animalCount();
        a1.animalCount();
    }

}
