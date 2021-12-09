package exercises;

public class NamelessApproach {
    NamelessApproach() {
        System.out.println("NLA 0-arg Const");
    }

    NamelessApproach(int a) {
        System.out.println("NLA 1-arg Const");
    }

    NamelessApproach(int a, int b) {
        System.out.println("NLA 2-arg Const");
    }

    public static void main(String[] args) {
        new NamelessApproach();
        new NamelessApproach(1);
        new NamelessApproach(1, 2);


    }
}
