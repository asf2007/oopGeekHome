package srp;

public class Employee {
    private String name;
    private Date dob;
//    private int baseSalary;
    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
//        this.baseSalary = baseSalary;
    }
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
//    public int calculateNetSalary() {
//        int tax = (int) (baseSalary * 0.25);//calculate in otherway
//        return baseSalary - tax;
//    }
}
