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

package Java_GB.Lecture.Lecture_4;


import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();  // создание Queue<Integer> queue
        queue.add(1); // добавление элементов
        queue.add(21);
        queue.add(3);
        queue.add(8);
        queue.add(4);
        System.out.println(queue); // [1, 21, 3, 8, 4] печать созданной очереди
        int item = queue.remove();
        System.out.println(item);  // 1 -> удаляется элемент добавленный ранее всех, первый добавленный,
                        // на вывод выходит именно то число (в данном коде про числа), которое было удалено.
        System.out.println(queue); // [2, 3, 8, 4]
        queue.offer(2809);
        item = queue.remove();
        System.out.println(item); // удалил 21
        System.out.println(queue); // [3, 8, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [8, 4, 2809]
        item = queue.remove();
        queue.poll();
        System.out.println(queue); // [2809]
        System.out.println(queue.peek()); // 2809
        System.out.println(queue.element()); // 2809
        queue.remove();
        System.out.println(queue.poll()); // null

        // Таким образом, у всех классов, которые реализуют данный интерфейс,
        // будет метод offer для добавления в очередь, метод poll для извлечения элемента из головы очереди,
        // и методы peek и element, позволяющие просто получить элемент из головы очереди.

    }

}
