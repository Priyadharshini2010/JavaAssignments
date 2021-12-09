package exercises.variables;

public class Variables {
    static int b = 20; //Static Variable
    int a = 10;//Instance Variable

    public static void main(String[] args) {
        int c = 30;//Local variable
        Variables v1 = new Variables();
        System.out.println("Instance Variable " + v1.a);
        System.out.println("Static Variable " + v1.b);//Obj Access
        System.out.println("Static Variable " + b);// Direct Access
        System.out.println("Static Variable " + Variables.b); //Class name
        System.out.println("Local Variable " + c);
    }
}
