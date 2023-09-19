package Domen;

public abstract class Person {
    /**
     * абстрактный класс для создания в дальнейшем персон: учитель, студент и т.д.
     */
    private String name;
    private int age;
    /**
     *
     * @param name - имя персоны
     * @param age - возраст персоны
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
}
