package exercises;

class Animal {

    private int animalCount = 40; //accessible within the class

    private void count() {
        System.out.println("Animal Count is : " + animalCount);
    }

    void animalCount() //default
    {
        System.out.println("Hello");
    }

    protected void helloWorld() {
        System.out.println("Hello World.....");
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.animalCount();
    }

}
