package projects;

class BaseClass {
    void student1() {
        System.out.println("Student 1");
        int Sno = 1;
        String name = "AAA";
        float marks = 89;
    }
}

class ChildClass extends BaseClass {
    public static void main(String[] args) {
        ChildClass ch1 = new ChildClass();
        BaseClass bc1 = new BaseClass();
        bc1.student1();
        ch1.student1();
        ch1.student2();

    }

    void student2() {
        this.student1();
        System.out.println("Student 2");
        int Sno = 2;
        String name = "BBB";
        float marks = 92;
    }

    public class SingleInh {

    }
}
