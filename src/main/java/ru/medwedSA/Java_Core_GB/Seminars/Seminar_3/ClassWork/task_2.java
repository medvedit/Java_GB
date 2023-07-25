package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.ClassWork;

/*
    Задание №2.1
        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.

    Задание №2.2 (если выполнено первое задание)
        Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class  task_2 {

    public static void main(String[] args) {

        ArrayList<String> planets = new ArrayList<>(Arrays.asList("Mars", "Earth", "Neptune", "Saturn", "Mars",
                "Mercury", "Saturn", "Venus", "Jupiter", "Jupiter", "Jupiter", "Uranus", "Venus"));
        Collections.sort(planets); // отсортировали по возрастанию, алфавит.
        System.out.printf("Список начальный, с повторениями слов : %s", planets);
        System.out.println("\n");
        System.out.println("Количество повторов каждого слова:");
        int count = 1;
        for (int i = 1; i < planets.size(); i++) { // вывод всех элементов с количеством повторений.
            if (planets.get(i - 1).equals(planets.get(i))) {
                count++;
            } else {
                System.out.println(planets.get(i - 1) + " -> " + count + " раз(а) повтор.");
                count = 1;
            }
        }
        System.out.println(planets.get(planets.size() - 1) + " -> " + count + " раз(а) повтор.");
        System.out.println();

        for (int i = 1; i < planets.size(); i++) { // удалили повторяющиеся элементы.

            if (planets.get(i-1).equals(planets.get(i))){
                planets.remove(i);
                i--;
            }
        }

        System.out.printf("Список слов после удаления повторов: %s", planets);
        System.out.println("\n");



        // Iterator<String> iter = planets.iterator();

        // while (iter.hasNext()) { // полностью очистили список, не понял,
                                // что этим хотел сказать преподаватель и забрал на это 20мин урока.....
        //     iter.next();
        //     iter.remove();
        // }
        // System.out.println(planets);

    }

}
