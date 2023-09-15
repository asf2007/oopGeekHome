import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);

        Student s11 = new Student("Антон", 25);
        Student s22 = new Student("Игорь", 23);


        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s11);
        listStud2.add(s22);

        Student s111 = new Student("Антон", 25);
        Student s222 = new Student("Игорь", 23);
        Student s333 = new Student("Армен", 23);
        Student s444 = new Student("Армен", 23);


        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s111);
        listStud3.add(s222);
        listStud3.add(s333);
        listStud3.add(s444);

        Student s1111 = new Student("Антон", 25);
        Student s2222 = new Student("Игорь", 23);
        Student s3333 = new Student("Армен", 23);
        Student s4444 = new Student("Армен", 23);


        List<Student> listStud4 = new ArrayList<Student>();
        listStud4.add(s1111);
        listStud4.add(s2222);
        listStud4.add(s3333);
        listStud4.add(s4444);



        StudentGroup group4580 = new StudentGroup(listStud1, 4580);
        StudentGroup group4680 = new StudentGroup(listStud2, 4680);
        StudentGroup group4380 = new StudentGroup(listStud3, 4380);
        StudentGroup group4280 = new StudentGroup(listStud4, 4280);
        System.out.println(group4580);

        for(Student std : group4580)
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for(Student std: group4580.getGroup())
        {
            System.out.println(std);
        }
        List <StudentGroup> listGroup = new ArrayList<>();
        listGroup.add(group4580);
        listGroup.add(group4680);
        listGroup.add(group4380);
        listGroup.add(group4280);
        StudentSteam steam1 = new StudentSteam(listGroup, 1);



        for (StudentGroup group: steam1.getSteam() ){
            System.out.println(group);
        }
        Collections.sort(steam1.getSteam());

        System.out.println("=========================================================");
        for (StudentGroup group: steam1.getSteam() ){
            System.out.println(group);
        }
    }
}