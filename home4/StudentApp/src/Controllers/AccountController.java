package Controllers;

import java.util.List;

import Domen.Person;
import Domen.PersonIterator;
import Domen.Teacher;

public class AccountController  {
/**
 * метод для выплаты зарплаты
 */
    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    /**
     *
     * метод для подсчета среднего возраста списка персон
     */
    public static <T extends Person> double averageAge(List<T> persons)
    {
        double ageSum = 0;
        for(Person prs: persons)
        {
            ageSum += prs.getAge();
        }
        return ageSum/persons.size();
    }
}
