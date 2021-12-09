package exercises.flowcontrol;

public class VoteAge {
    int age = 34;

    public static void main(String[] args) {
        VoteAge va = new VoteAge();
        if (va.age > 18 || va.age == 18) {
            System.out.println("Can Vote");
        } else {
            System.out.println("Cannot Vote");
        }
    }

}
