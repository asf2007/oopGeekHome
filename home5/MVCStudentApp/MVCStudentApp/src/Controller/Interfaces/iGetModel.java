package Controller.Interfaces;

import java.util.List;

import Model.Core.Student;

public interface iGetModel {
    public List<Student> getStudents();
    public void deleteStudent(long id);
    public void saveAllStudents(List<Student> students);
}
