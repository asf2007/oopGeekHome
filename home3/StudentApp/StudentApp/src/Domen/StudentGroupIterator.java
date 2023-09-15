package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<StudentGroup> {
    /**
     * класс для перебора студенческих групп внутри потока
     */
    private int counter;
    private List<StudentGroup> groups;

    public StudentGroupIterator(List<StudentGroup> groups) {
        this.counter = 0;
        this.groups = groups;
    }

    /**
     *
     * проверка существования следующей группы в потоке
     */
    @Override
    public boolean hasNext() {
        return counter<groups.size();
    }

    /**
     * возвращает группу потока
     *
     */
    @Override
    public StudentGroup next() {
        if(!hasNext()) {
            return null;
        }
        else {
            return groups.get(counter++);
        }
    }
}
