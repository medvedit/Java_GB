package ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.ClassWork.Comparator;


import java.util.Objects;

public class Employee {

    private int salary;
    private int age;
    private String name;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name=" + name +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, salary, age);
    }

}
