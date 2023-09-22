package Model;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelClassHash implements iGetModel {
    Map <Long, Student>  studentMap = new HashMap<>();

    public ModelClassHash(Map<Long, Student> studentMap) {
        this.studentMap = studentMap;
    }

    @Override
    public List<Student> getStudents() {
        List <Student> students = new ArrayList<>();
        for (Map.Entry<Long, Student > entry : studentMap.entrySet()
             ) {
            students.add(entry.getValue());
        }
        return students;
    }
    public void deleteStudent(long id){
        studentMap.remove(id);
    }
    public void saveAllStudents(List <Student> students ){
        for (Student stud : students
             ) {
            studentMap.put((long)stud.getId(), stud);
        }
    }
}
