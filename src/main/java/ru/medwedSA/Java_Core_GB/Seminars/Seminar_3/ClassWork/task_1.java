package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.ClassWork;

/*
    Заполнить список десятью случайными числами.
    Отсортировать список методом sort() и вывести его в консоль.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class task_1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // Объявили коллекцию Integer.
        Random random = new Random(); // объявили Random
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(-100, 100)); // создали список 10 чисел, заполненных Random.
        }

//        System.out.println(list);

        for (int i : list) {
            System.out.print(i + " "); // вывел значения i начального списка в консоль через пробел
        }
        System.out.println("\n"); // пропуск строки в консоли

        Collections.sort(list); // сортировка по возрастанию встроенным методом.

        for (int i : list) {
            System.out.print(i + " "); // вывод в консоль отсортированного списка.
        }
        System.out.println(); // просто отступ пустой строки от вывода строки в консоли.

//        System.out.println(list);

    }

}
