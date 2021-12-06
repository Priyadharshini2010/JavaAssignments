package exercises;

public class StringBufferExamples {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.insert(5, "World");
        System.out.println(sb);

        sb.append("World");
        System.out.println(sb);

        sb.replace(10, 15, "Welcome");
        System.out.println(sb);

        sb.delete(10, 17);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
