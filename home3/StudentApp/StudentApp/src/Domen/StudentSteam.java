package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * класс описывающий поток студентов
 */

public class StudentSteam implements  Iterable<StudentGroup> {
    private List<StudentGroup> steam;
    private int idSteam;

    /**
     *
     * @param steam - поток (список групп студентов)
     * @param idSteam - номер потока
     */
    public StudentSteam(List<StudentGroup> steam, int idSteam) {
        this.steam = steam;
        this.idSteam = idSteam;
    }

    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    public void setIdSteam(int idSteam) {
        this.idSteam = idSteam;
    }

    public List<StudentGroup> getSteam() {
        return steam;
    }

    public int getIdSteam() {
        return idSteam;
    }
    @Override
    public String toString() {
        return "StudentSteam{" +
                ", idSteam=" + idSteam +
                ", size=" + steam.size() +
                ", steam=" + steam +
                '}';
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator(steam);
    }
}
