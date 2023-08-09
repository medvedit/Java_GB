/**
 *  Структуры данных в картинках. ArrayList -> https://habr.com/ru/articles/128269/
 */

package ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.ClassWork;

import java.util.ArrayList;
import java.util.Iterator;

class ArrayListRemoveFor {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<>();

        states.add("Франция");
        states.add("Франция");
        states.add("Германия");
        states.add("Португалия");
        states.add("Перу");

        System.out.println(states); //[Франция, Франция, Германия, Португалия, Перу]

        for (int i = 0; i < states.size(); i++) {
            if (states.get(i).equalsIgnoreCase("Франция")) {
                states.remove(i);
                // i--; // Не совсем хорошее решение. В примере ниже использован iterator.
                /* Если поставить шаг назад (i--) после удаления, то удалим всю встречающуюся Францию. Иначе удаляется
                   Франция с 0 индекса, далее происходит сдвиг списка на освободившееся позиции (Франция с индекса
                   1 передвинулась на индекс 0 и весь массив следом, на индекс назад), далее срабатывает итератор i++
                   в цикле for и "мы уже смотрим на индекс 1", поэтому ту Францию, которая после сдвига встала на
                   индекс 0 "мы пропустим" */
            }
        }
        System.out.println(states); // [Франция, Германия, Португалия, Перу]

    }
}

class ArrayListRemoveIterator {

    public static void main(String[] args) {


        ArrayList<String> states_1 = new ArrayList<>();

        states_1.add("Франция");
        states_1.add("Франция");
        states_1.add("Германия");
        states_1.add("Португалия");
        states_1.add("Канада");

        System.out.println(states_1); //[Франция, Франция, Германия, Португалия, Канада]

//        states_1.removeIf(list -> list.equalsIgnoreCase("Франция")); // Эта строка замещает
                                                                                 // создание Iterator и весь цикл while.

        Iterator<String> iterStates = states_1.iterator(); // Создал итератор.

        while (iterStates.hasNext()) { // Пока есть следующий элемент...
            if (iterStates.next().equalsIgnoreCase("Франция")) { // Если элемент == "Франция"...
                iterStates.remove(); // то удалить его.
            }
        }
        System.out.println(states_1); // Вывод обработанного списка.

    }
}