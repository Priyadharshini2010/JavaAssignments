package exercises;

public class StringExamples {
    public static void main(String[] args) {
        String name = "Priya";      //immutable
        System.out.println(name);
        name.concat("dharshini");   //concat-->predefined method
        System.out.println(name);

        name = name.concat("dharshini");
        System.out.println(name);

        String fullName = "PriyaDharshini";
        System.out.println(name.equals(fullName)); //compares
        System.out.println(name.equalsIgnoreCase(fullName));

        String alteredName = "Priyadharshini";
        System.out.println(name.equals(alteredName));
    }
}
