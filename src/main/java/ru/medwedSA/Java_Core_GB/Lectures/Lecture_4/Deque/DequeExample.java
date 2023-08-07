/*
 *  Интерфейс Deque -> двунаправленная очередь. Deque расширяет интерфейс Queue и определяет поведение
 *  двунаправленной очереди, которая работает как обычная однонаправленная очередь, либо как стек.
 *
 *  Линейная коллекция, которая поддерживает вставку и удаление элементов на обоих концах.
 *  Действующий по принципу LIFO (последний вошел - первый вышел).
 *
 *
 *  Интерфейс Deque определяет следующие методы:
 *
 *  element(): Получает, но не удаляет, первый элемент этой двухсторонней очереди.
 *
 *  isEmpty(): true возвратит, если эта двухсторонняя очередь не содержит элементов.
 *
 *  void addFirst(E obj): добавляет элемент в начало очереди
 *
 *  void addLast(E obj): добавляет элемент obj в конец очереди
 *
 *  E getFirst(): возвращает без удаления элемент из головы очереди.
 *                Если очередь пуста, генерирует исключение NoSuchElementException
 *
 *  E getLast(): возвращает без удаления последний элемент очереди.
 *               Если очередь пуста, генерирует исключение NoSuchElementException
 *
 *  boolean offerFirst(E obj): добавляет элемент obj в самое начало очереди.
 *                             Если элемент удачно добавлен, возвращает true, иначе - false
 *
 *  boolean offerLast(E obj): добавляет элемент obj в конец очереди.
 *                            Если элемент удачно добавлен, возвращает true, иначе - false
 *
 *  E peekFirst(): возвращает без удаления элемент из начала очереди.
 *                 Если очередь пуста, возвращает значение null
 *
 *  E peekLast(): возвращает без удаления последний элемент очереди.
 *                Если очередь пуста, возвращает значение null
 *
 *  E pollFirst(): возвращает с удалением элемент из начала очереди.
 *                 Если очередь пуста, возвращает значение null
 *
 *  E pollLast(): возвращает с удалением последний элемент очереди.
 *                Если очередь пуста, возвращает значение null
 *
 *  E pop(): возвращает с удалением элемент из начала очереди.
 *           Если очередь пуста, генерирует исключение NoSuchElementException
 *
 *  void push(E element): добавляет элемент в самое начало очереди
 *
 *  E removeFirst(): возвращает с удалением элемент из начала очереди.
 *                   Если очередь пуста, генерирует исключение NoSuchElementException
 *
 *  E removeLast(): возвращает с удалением элемент из конца очереди.
 *                  Если очередь пуста, генерирует исключение NoSuchElementException
 *
 *  boolean removeFirstOccurrence(Object obj): удаляет первый встреченный элемент obj из очереди.
 *                                             Если удаление произошло, то возвращает true, иначе возвращает false.
 *
 *  boolean removeLastOccurrence(Object obj): удаляет последний встреченный элемент obj из очереди.
 *                                            Если удаление произошло, то возвращает true, иначе возвращает false.
 *
 *  Таким образом, наличие методов pop и push позволяет классам, реализующим этот элемент,
 *  действовать в качестве стека.
 *  В то же время имеющийся функционал также позволяет создавать двунаправленные очереди,
 *  что делает классы, применяющие данный интерфейс, довольно гибкими.
 *
 *
 *                  ============================ Класс ArrayDeque: =================================
 *
 *  В Java очереди представлены рядом классов. Одни из них - класс ArrayDeque<E>.
 *  Он поддерживает двустороннюю структуру данных очереди, что дает возможность вставлять и удалять элементы с обеих
 *  сторон. Также он — динамический массив, который может автоматически увеличивать свой размер.
 *
 *  В классе ArrayDeque определены следующие конструкторы:
 *
 *  ArrayDeque(): создает пустую очередь
 *
 *  ArrayDeque(Collection<? extends E> col): создает очередь, наполненную элементами из коллекции col
 *
 *  ArrayDeque(int capacity): создает очередь с начальной емкостью capacity.
 *                            Если мы явно не указываем начальную емкость, то емкость по умолчанию будет равна 16
 */


package ru.medwedSA.Java_Core_GB.Lectures.Lecture_4.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); // добавил элемент в начало.
        deque.addLast(2); // добавил элемент в конец.
        deque.addFirst(8); // добавил элемент в начало.
        System.out.println(deque); // [8, 1, 2]
        System.out.println(deque.getClass()); // class java.util.ArrayDeque
        System.out.println(deque.toString()); // [8, 1, 2]
        System.out.println(deque.size()); // 3 -> количество элементов.
        System.out.println(deque.isEmpty()); // false , тк deque не пустой.
        System.out.println(deque.element()); // 8  получил, но не удалил, первый элемент
        System.out.println(deque.getFirst()); // 8  получил, но не удалил, первый элемент
        int item = deque.getLast(); // в переменную item получил, без удаления, последний элемент
        System.out.println(item); // 2
        System.out.println(deque.offerFirst(312)); // Добавил элемент в начало. Операция вернула true
        System.out.println(deque.offerLast(9)); // // Добавил элемент в конец. Операция вернула true
        System.out.println(deque); // [312, 8, 1, 2, 9] вывел в консоль полученный результат после добавления
        int item_1 = deque.pop(); // Сохранил в переменную item_1 элемент из начала очереди, с удалением его из deque
        System.out.println(item_1); // 312
        deque.addFirst(1); // добавил в начало очереди значение 1
        System.out.println(deque); // [1, 8, 1, 2, 9]
        deque.push(item_1); // вернул в начало возвращенный и удаленный item_1
        System.out.println(deque); // [312, 1, 8, 1, 2, 9]
        deque.add(2); // добавил в коней очереди значение 2
        System.out.println(deque); // [312, 1, 8, 1, 2, 9, 2]
        System.out.println(deque.removeFirstOccurrence(1)); // удаляет по вхождению первый встретившийся элемент и
                                                               // возвращает true если всё ok.
        System.out.println(deque.removeLastOccurrence(2)); // удаляет по вхождению последний встретившийся элемент и
                                                              // возвращает true если всё ok.
        System.out.println(deque); // [312, 8, 1, 2, 9] после удаления элементов: первого встретившегося с начала и
                                   // первого встретившегося с конца.
        deque.removeLast(); // вернул и удалил первый элемент, иначе Exception
        deque.removeLast(); // вернул и удалил последний элемент, иначе Exception
        deque.pollFirst(); // вернул и удалил первый элемент, иначе null
        deque.pollLast();  // вернул и удалил последний элемент, иначе null
        System.out.println(deque); // [8] осталось в очереди
        deque.addFirst(1); // добавил в начало очереди элемент 1
        System.out.println(deque.getFirst()); // 1 вернул, но не удалил первый элемент, иначе Exception
        System.out.println(deque.getLast()); // 8 вернул, но не удалил последний элемент, иначе Exception
        deque.clear(); // очистил всю очередь
        System.out.println(deque.peekFirst()); // null  очередь пуста
        System.out.println(deque.peekLast()); // null  очередь пуста


        ArrayDeque<String> states = new ArrayDeque<>();
        // стандартное добавление элементов
        states.add("Germany");
        states.addFirst("France"); // добавляем элемент в самое начало
        states.push("Great Britain"); // добавляем элемент в самое начало
        states.addLast("Spain"); // добавляем элемент в конец коллекции
        states.add("Italy");

        // получаем первый элемент без удаления
        String sFirst = states.getFirst();
        System.out.println(sFirst);     // Great Britain
        // получаем последний элемент без удаления
        String sLast = states.getLast();
        System.out.println(sLast);      // Italy

        System.out.printf("Queue size: %d \n", states.size());  // 5 количество элементов в очереди

        // перебор коллекции
        while (states.peek() != null) { // пока очередь не пуста
            System.out.println(states.pop()); // Печать всех хранящихся в очереди элементов с первого до последнего.
        }


        ArrayDeque<Person> people = new ArrayDeque<>(); // Создали очередь из объектов Person
        people.addFirst(new Person("Tom")); // Записали в начало очереди people
        people.addLast(new Person("Nick"));
        // перебор без извлечения
        for (Person name : people) {
            System.out.println(name.getName()); // Печать всех хранящихся в очереди элементов с первого до последнего.

        }
    }
}
