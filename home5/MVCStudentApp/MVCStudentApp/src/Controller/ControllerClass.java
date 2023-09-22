package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassList;
import Model.Core.Student;
import View.ViewClass;


public class ControllerClass {

    private iGetModel model;
    private iGetView view;
    private String lang;
    private List<Student> students = new ArrayList<Student>();

    public ControllerClass(iGetModel model, iGetView view, String lang) {
        this.model = model;
        this.view = view;
        this.lang = lang; //выбор языка
    }

    private boolean testData(List<Student> studs)
    {
        if(studs.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update() {

        //MVP
        students = model.getStudents();

        if(testData(students))
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }


        // MVC
        //view.printAllStudent(model.getStudents());
    }


    public void run()
    {
        Command com = Command.NONE;
        boolean getNewIter = true;
        while(getNewIter)
        {
            if (this.lang.equals("rus")) {
                String command = view.prompt("Введите команду:");
                com = Command.valueOf(command.toUpperCase());
                switch (com) {
                    case EXIT:
                        getNewIter = false;
                        System.out.println("Выход из программы");
                        break;
                    case LIST:
                        view.printAllStudent(model.getStudents());
                        break;
                    case DELETE:
                        System.out.println("Введите номер студента: ");
                        Scanner scanner = new Scanner(System.in);
                        long id = Long.parseLong(scanner.next());
                        model.deleteStudent(id);
                        System.out.println("Студент удален");
                        break;
                }
            }
            if (this.lang.equals("eng")) {
                String command = view.prompt("Enter your command:");
                com = Command.valueOf(command.toUpperCase());
                switch (com) {
                    case EXIT:
                        getNewIter = false;
                        System.out.println("Exit program");
                        break;
                    case LIST:
                        view.printAllStudent(model.getStudents());
                        break;
                    case DELETE:
                        System.out.println("Enter id of student: ");
                        Scanner scanner = new Scanner(System.in);
                        long id = Long.parseLong(scanner.next());
                        model.deleteStudent(id);
                        System.out.println("Student is DELETED");
                        break;
                }
            }
        }

    }

}
