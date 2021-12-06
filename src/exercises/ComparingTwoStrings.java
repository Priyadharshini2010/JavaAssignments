package exercises;

public class ComparingTwoStrings {
    public static void main(String[] args) {
        String name = "aaaa";
        String fullName = "aAAA";
        String alteredName = "aaaa";
        System.out.println(name.equals(fullName)); //compares
        System.out.println(name.equalsIgnoreCase(fullName));

        System.out.println(name.equals(alteredName));
        System.out.println(name == fullName);
        System.out.println(name == alteredName);

    }

}
