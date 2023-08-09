/**
 * Описание работы linkedList "под капотом" читаем тут -> https://habr.com/ru/articles/337558/
 */

package ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.ClassWork;

import java.util.LinkedList;

public class LinkedListExample {


    public static void main(String[] args) {

        LinkedList<String> test = new LinkedList<>();

        test.add("a"); // Добавил.
        test.add("b"); // Добавил.
        test.add("m"); // Добавил.
        test.add("f"); // Добавил.

        System.out.println(test.get(3)); // Вывел элемент с 3 индекса.
        System.out.println(test); // Вывел все элементы.

        test.addFirst("r"); // Добавил на первую позицию.
        test.removeLast(); // Удалил с последней позиции.
        System.out.println(test); // Вывел итог.
    }
}
