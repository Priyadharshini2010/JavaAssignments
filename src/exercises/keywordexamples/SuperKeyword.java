package exercises.keywordexamples;

class Test1 {
    int number = 100;

    void displayNumber() {
        System.out.println("Parent Class Method");
    }
}

class Test2 extends Test1 {
    int number = 150;

    void displayNumber() {
        super.displayNumber();

        System.out.println(this.number); //current class obj
        System.out.println(super.number); //parent class obj
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Test2 t1 = new Test2();
        t1.displayNumber();
    }

}
