package exercises.stringsexamples;

public class StringExamples {
    public static void main(String[] args) {
        String name = "Priya";      //immutable
        System.out.println(name);
        name.concat("dharshini");   //concat-->predefined method
        System.out.println(name);

        name = name.concat("dharshini");
        System.out.println(name);

        System.out.println(name.substring(5));
        System.out.println(name.substring(0, 5));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        String message = "     Hello        World";
        System.out.println(message.trim());
        System.out.println(name.charAt(7));


    }

}
