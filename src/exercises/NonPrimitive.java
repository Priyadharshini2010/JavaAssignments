package exercises;

public class NonPrimitive {
    public static void main(String[] args) {
        String str = "String Literals";
        String str1 = new String("String using new Key word");
        char[] ch1 = {'A', 'P', 'P', 'L', 'E'};
        String str2 = new String(ch1);
        StringBuffer str3 = new StringBuffer("String Buffer");
        StringBuilder str4 = new StringBuilder("String Builder");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }

}
