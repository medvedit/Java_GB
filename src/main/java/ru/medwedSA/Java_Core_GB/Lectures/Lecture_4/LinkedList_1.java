/*
 *    LinkedList -> Представляет собой двусвязный список.
 *    Он наследуется от класса AbstractSequentialList и реализует интерфейсы List, Dequeue и Queue. То есть он
 *    соединяет функциональность работы со списком и функциональность очереди.
 *    Список –> гибкая структура данных, позволяющая легко менять свой размер.
 *    Элементы доступны для вставки или удаления в любой позиции.
 *    Список -> абстрактная структура данных. Это такая структура данных,
 *    для которой известно, что на текущем этапе и что на следующем этапе.
 *    LinkedList нужен для небольшого количества элементов,
 *    в которых операции добавления\удаления встречаются чаще операций чтения.
 *
 *    LinkedList содержит все те методы, которые определены в интерфейсах List, Queue, Deque. Некоторые из них:
 *    addFirst() / offerFirst(): добавляет элемент в начало списка
 *    addLast() / offerLast(): добавляет элемент в конец списка
 *    removeFirst() / pollFirst(): удаляет первый элемент из начала списка
 *    removeLast() / pollLast(): удаляет последний элемент из конца списка
 *    getFirst() / peekFirst(): получает первый элемент
 *    getLast() / peekLast(): получает последний элемент
*/

package ru.medwedSA.Java_Core_GB.Lectures.Lecture_4;

import java.util.LinkedList;

public class LinkedList_1 {

    public static void main(String[] args) {

        System.out.println(linkedListInteger());
        System.out.println(linkedListString());

    }

    public static LinkedList<Integer> linkedListInteger() {

        LinkedList<Integer> linList = new LinkedList<>();

        linList.add(1);
        linList.add(2);
        linList.add(3);
        linList.add(8);
        linList.add(5);
        linList.add(2, 10); // добавление по index
        linList.remove(); // Если не указать индекс для удаления элемента, то будет удален первый добавленный элемент.
        linList.remove(1); // удаление по index ... Все работает, как и для простого list
        return linList;
    }

    public static LinkedList<String> linkedListString() {

        String str1 = "Здравствуй, человек читающий этот код!";
        String str2 = "Меня зовут Иван.";
        String str3 = "Я пишу на Java.";
        String str4 = "С Россией можно только дружить!";
        String str5 = "Ибо все, взявшие меч, мечом погибнут (Евангелия от Матфея 26:52)";

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add(str1);
        linkedList.add(str2);
        linkedList.add(str4);
        linkedList.add(3,str3);
        linkedList.add(str5);
//        linkedList.remove(3); // Удаление по индексу
//        linkedList.remove(); // Удаление первого добавленного элемента в linkedList.
        return linkedList;
    }

}