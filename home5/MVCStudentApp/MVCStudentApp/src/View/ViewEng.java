package View;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

import java.util.List;
import java.util.Scanner;

public class ViewEng implements iGetView {
    @Override
    public void printAllStudent(List<Student> students) {
        System.out.println("----------- Student list -----------");
        for(Student s : students)
        {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
