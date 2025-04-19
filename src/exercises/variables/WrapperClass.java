package exercises.variables;

public class WrapperClass {
    public static void main(String[] args) {
        WrapperClass wc1 = new WrapperClass();
        wc1.employee1();
        wc1.employee2();

    }
//Object -- Integer,Character
    void employee1() {
        Integer empId = null;
        Character empTeam = 'A';
        Float salary = 50000f; // for float f should be given as suffix else compliation error would occur.
        String empName = "aaaa";
        Double emppremium = 20083.9898; // d can be given as suffix, even if not given no issues
        System.out.println("Employee Id : " + empId + " " + "Employee Name : " + empName);
        System.out.println("Employee Team : " + empTeam + " " + "Salary : " + salary);
    }
//Datatypes -- int,char
    void employee2() {
        int empId = 0;
        if (empId == 0) {
            empId = 50;
        }
        char empTeam = 'B';
        float salary = 60000f;
        String empName = "bbbb";
        System.out.println("Employee Id : " + empId + " " + "Employee Name : " + empName);
        System.out.println("Employee Team : " + empTeam + " " + "Salary : " + salary);
    }
}
