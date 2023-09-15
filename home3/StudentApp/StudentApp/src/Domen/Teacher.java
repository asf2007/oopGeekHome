package Domen;

public class Teacher extends Person{
    /**
     * класс описывающий учителя
     */
    private String acadDegree;
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
}