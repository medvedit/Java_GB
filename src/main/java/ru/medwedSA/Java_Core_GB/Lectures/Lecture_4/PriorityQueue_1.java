/*
*  PriorityQueue:
*  Наивысший приоритет имеет «наименьший» элемент.
*
*  PriorityQueue — это очередь с приоритетом, которая по умолчанию размещает элементы согласно естественному порядку
*  сортировки. Для сортировки здесь используется Comparable и Comparator. Принцип здесь такой же, как и с
*  TreeSet или TreeMap — классов, которые следуют интерфейсу Comparable и имеют свой порядок сортировки.
*
*  PriorityQueue не является потокобезопасным , поэтому java предоставляет класс PriorityBlockingQueue который
*  реализует интерфейс BlockingQueue для использования в многопоточной среде java.
*
*  Реализация PriorityQueue обеспечивает время O (log (n)) для метода постановки и снятия очереди.
*
*/

package ru.medwedSA.Java_Core_GB.Lectures.Lecture_4;

import java.util.PriorityQueue;

public class PriorityQueue_1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Содали коллекцию PriorityQueue
        pq.add(123); // добавляем элементы
        pq.add(3); // ...
        pq.add(13); // ...
        pq.add(1); // ...
        System.out.println(pq); // [1, 3, 13, 123]
        /* Если распечатать созданную коллекцию, то элементы распечатаются
        о меньшего элемента до большего. Для цифр этот приоритет явно известен, а если в коллекции хранятся не
        числа, например животные, то приоритетность от меньшего к большему описывается самостоятельно с
        использованием Comparable и Comparator. */

        pq.forEach (item -> System.out.print(item + " ")); // 1 3 13 123
        System.out.println(); // необходимость для отделения вывода в консоли от следующего примера.

        int sz = pq.size(); // Запрос длины коллекции.
        System.out.println(sz); // 4

    /* Вывод следующего в очереди элемента по приоритету с последующим его удалением из коллекции. */
        System.out.println(pq.poll()); // 1 вывел и удалил 
        System.out.println(pq.poll()); // 3 вывел и удалил
        System.out.println(pq.poll()); // 13 вывел и удалил
        System.out.println(pq.poll()); // 123 вывел и удалил
        System.out.println(pq.poll()); // null очередь пуста



        // PriorityQueue(Comparator<? super E> comparator)
        PriorityQueue<Integer> pq_1 = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
        pq_1.add(123);
        pq_1.add(3);
        pq_1.add(13);
        pq_1.add(1);
        System.out.println(pq_1); // [123, 3, 13, 1] вывод без приоритета, т.к. -> Integer.compare(y, x)

        pq_1.forEach (item -> System.out.print(item + " ")); // 123 3 13 1
        System.out.println();


//         PriorityQueue<Integer> pq_2 = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
//
//         pq_2.add(69);
//         pq_2.add(65);
//         pq_2.add(87);
//         pq_2.add(79);
//         pq_2.add(73);
//         pq_2.add(84);
//         pq_2.add(89);
//         pq_2.add(80);
//         pq_2.add(81);
//         pq_2.add(82);
//         pq_2.add(85);
//         pq_2.add(70);
//         while(pq_2.peek() != null){
//             pq_2.forEach (item -> System.out.print(" " + pq_2.poll()));
//         }

        // Создание пустой PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Используйте метод add() для добавления элементов в очередь priorityQueue.
        priorityQueue.add("Привет");
        priorityQueue.add("Если");
        priorityQueue.add("Завтра");
        priorityQueue.add("Азбука");
        priorityQueue.add("Завтра");

        // Вывод всей очереди PriorityQueue.
        System.out.println("Начальная очередь приоритетов: " + priorityQueue);

        // Вывод и удаление первого элемента в очереди priorityQueue.
        System.out.println("Элемент во главе очереди: " + priorityQueue.poll());

        // Отображение очереди priorityQueue после операции poll().
        System.out.println("Окончательная очередь приоритетов: " + priorityQueue);

    }

}