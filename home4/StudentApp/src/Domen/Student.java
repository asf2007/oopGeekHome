package Domen;


public class Student extends Person implements Comparable<Student> {
    /**
     * класс описывающий студента
     */
    private int id;
    private static int generalId;
    /**
     *
     * @param name - имя студента
     * @param age - возраст студента
     */
    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }


    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }
    /**
     *
     * метод сравнения студентов по возрасту для сортировки внутри группы
     */
    @Override
    public int compareTo(Student o) {

        System.out.println(super.getName()+" - "+o.getName());
        if(super.getAge()==o.getAge())
        {
            if(id==o.id)return 0 ;
            if(id>o.id)return 1;
            else return -1;
            //return 0;
        }

        if(super.getAge()>o.getAge())
        return 1;
        else
        return -1;        
    }


    
    
    
}


