/*
 *  Интерфейс Queue -> однонаправленная очередь.
 *
 *  Очереди представляют структуру данных, работающую по принципу FIFO (first in - first out).
 *  То есть чем раньше был добавлен элемент в коллекцию, тем раньше он из нее удаляется.
 *
 *  Это стандартная модель однонаправленной очереди.
 *  Обобщенный интерфейс Queue<E> расширяет базовый интерфейс Collection и
 *  определяет поведение класса в качестве однонаправленной очереди.
 *  Свою функциональность он раскрывает через следующие методы:
 *
 *  E element() -> возвращает, но не удаляет, элемент из начала очереди.
 *                 Если очередь пуста, генерирует исключение NoSuchElementException
 *
 *  boolean offer(E obj) -> добавляет элемент obj в конец очереди.
 *                          Если элемент удачно добавлен, возвращает true, иначе - false
 *
 *  E peek() -> возвращает без удаления элемент из начала очереди.
 *              Если очередь пуста, возвращает значение null
 *
 *  E poll() -> возвращает с удалением элемент из начала очереди.
 *              Если очередь пуста, возвращает значение null
 *
 *  E remove() -> возвращает с удалением элемент из начала очереди.
 *                Если очередь пуста, генерирует исключение NoSuchElementException
 *
 */

package ru.medwedSA.Java_Core_GB.Lectures.Lecture_4;


import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();  // создание Queue<Integer> queue
        queue.add(1); // добавление элементов
        queue.add(21);
        queue.add(3);
        queue.add(8);
        queue.add(4);
        System.out.println(queue); // [1, 21, 3, 8, 4] печать созданной очереди
        int item = queue.remove(); // При удалении элемента методом remove() - сохранили его в item переменную.
        System.out.println(item);  // 1 -> удаляется элемент добавленный ранее всех, первый добавленный.
                                   // Вывел в консоль удаленное число.
        System.out.println(queue); // [21, 3, 8, 4] -> Вывод в консоль оставшихся значений в очереди.
        queue.offer(2809); // Добавили элемент в конец очереди.
        item = queue.remove(); // Вновь удаление элемента с перезаписью значения в item.
        System.out.println(item); // Вывод удаленного в консоль 21
        System.out.println(queue); // Осталось в очереди -> [3, 8, 4, 2809]
        item = queue.remove(); // Вновь удаление из очереди и перезапись item.
        System.out.println(queue); // Осталось в очереди -> [8, 4, 2809]
        item = queue.remove(); // Вновь удаление из очереди и перезапись item.

        /* Методы представленные ниже очень просты. Достаточно прочитать описание по ним. */

        queue.poll();
        System.out.println(queue); // [2809]
        System.out.println(queue.peek()); // 2809
        System.out.println(queue.element()); // 2809
        queue.remove();
        System.out.println(queue.poll()); // null
        System.out.println(queue.element()); // NoSuchElementException -> нет такого элемента, очередь пуста.
    }
}
