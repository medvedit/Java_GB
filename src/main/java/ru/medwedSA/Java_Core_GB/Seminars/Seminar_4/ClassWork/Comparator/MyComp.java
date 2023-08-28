/**
 *  В этом примере есть необходимость отсортировать данные хранящиеся в TreeSet<Employee>. Но как сортировать, по
 *  каким параметрам - это можно задать через Comparator. И так-как Comparator может принимать в себя дженерики, то
 *  закидываем в Comparator Employee -> implements Comparator<Employee>. В интерфейсе Comparator есть метод compare,
 *  который принимает в себя данные для сравнения. Логику сравнения прописываем в методе compare().
 */

package ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.ClassWork.Comparator;

import java.util.Comparator;

public class MyComp implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        //        if(o1.getAge() > o2.getAge()) { // Сортировка по возрасту.
        if (o1.getSalary() > o2.getSalary()) { // сортировка по заработной плате.
            return 1;
        } else {
            return -1;
        }
    }

}
