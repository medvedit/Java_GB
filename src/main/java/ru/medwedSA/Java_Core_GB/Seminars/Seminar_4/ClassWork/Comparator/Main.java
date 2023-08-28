package ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.ClassWork.Comparator;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Employee> staff = new TreeSet<>(new MyComp()); /* Создаем  TreeSet с именем staff через
            конструктор класса Employee, при чем каждый добавленный сотрудник(staff) будет отсортирован методом
            описанном в классе MyComp. */

        staff.add(new Employee("Ivan",20, 20));
        staff.add(new Employee("Sergey",30, 25));
        staff.add(new Employee("Piter",10, 30));
        staff.add(new Employee("Denis",40, 35));

        System.out.println(staff);

    }
}
