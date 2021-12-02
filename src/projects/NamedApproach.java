package projects;

public class NamedApproach {
    NamedApproach() {
        System.out.println("0-arg Const");
    }

    NamedApproach(int a) {
        System.out.println("1-arg Const");
    }

    NamedApproach(int a, int b) {
        System.out.println("2-arg Const");
    }

    public static void main(String[] args) {
        NamedApproach na1 = new NamedApproach();
        NamedApproach na2 = new NamedApproach(1);
        NamedApproach na3 = new NamedApproach(10, 20);

    }
}
