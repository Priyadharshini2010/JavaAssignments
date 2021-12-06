package exercises;

public class StringExamples {
    public static void main(String[] args) {
        String name = "Priya";      //immutable
        System.out.println(name);
        name.concat("dharshini");   //concat-->predefined method
        System.out.println(name);

        name = name.concat("dharshini");
        System.out.println(name);


    }

}
