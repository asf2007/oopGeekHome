package Domen;

public class Employee extends Person{

    /**
     * класс описывающий специалиста
     */
    private String special;
    public Employee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }
}