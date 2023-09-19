package Services;

import Domen.PersonComparator;
import Domen.PersonIterator;
import Domen.Student;
import Domen.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherService implements iPersonService<Teacher>, Iterable<Teacher>{

    private List<Teacher> teachers;
    private int count;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }
    @Override
    public List<Teacher> getAll() {
        return teachers ;
    }

    @Override
    public void create(String name, int age) {
        count++;
        Teacher teacher = new Teacher(name, age, "docent");
        teachers.add(teacher);

    }
    public void sortByFIO()
    {
        PersonComparator<Teacher> persComp = new PersonComparator<>();
        teachers.sort(persComp);
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new PersonIterator<>(teachers);
    }
    public void printTeachers(){

        for(Teacher tch: teachers)
        {
            System.out.println(tch);
        }
    }
}
