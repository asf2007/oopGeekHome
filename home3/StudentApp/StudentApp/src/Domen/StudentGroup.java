package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    /**
     * класс описывающий группы студентов
     */
    private List<Student> group;
    private Integer idGroup;

    /**
     *
     * @param group - список студентов
     * @param idGroup - номер группы
     */

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                ", size=" + group.size() +
                ", idGroup=" + idGroup +
                ", group=" + group +
                '}';
    }


    /**
     *
     * метод для перебора студентов
     */
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);

    }

    /**
     *
     * метод сравнения групп студентов для их сортировки по по количеству человек внутри потока
     */
    @Override
    public int compareTo(StudentGroup o) {
        if(this.group.size()==o.group.size()){
            if(this.idGroup==o.idGroup)
            {
                return 0;
            }
            if (this.idGroup<o.idGroup) {
                return-1;
            }
            else {
                return  1;
            }
        }
        if (this.group.size()>o.group.size()) {
            return-1;
        }
        else {
            return  1;
            }

    }
}