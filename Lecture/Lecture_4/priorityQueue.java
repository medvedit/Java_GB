package Java_GB.Lecture.Lecture_4;

import java.util.PriorityQueue;

public class priorityQueue{

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq); // [1, 3, 13, 123]

        pq.forEach (item -> System.out.print(item + " ")); // 1 3 13 123
        System.out.println(); // необходимость для красивого вывода в консоли

        int sz = pq.size();
        System.out.println(sz); // 4 размер

        System.out.println(pq.poll()); // 1 вывел и удалил 
        System.out.println(pq.poll()); // 3 вывел и удалил
        System.out.println(pq.poll()); // 13 вывел и удалил
        System.out.println(pq.poll()); // 123 вывел и удалил
        System.out.println(pq.poll()); // null очередь пуста



        // PriorityQueue(Comparator<? super E> comparator)
        PriorityQueue<Integer> pq_1 = new PriorityQueue<Integer>((x, y) -> Integer.compare(y, x));
        pq_1.add(123);
        pq_1.add(3);
        pq_1.add(13);
        pq_1.add(1);
        System.out.println(pq_1); // [123, 3, 13, 1] вывод без приоритета, т.к. -> Integer.compare(y, x)

        pq_1.forEach (item -> System.out.print(item + " ")); // 123 3 13 1
        System.out.println();


        // PriorityQueue<Integer> pq_2 = new PriorityQueue<Integer>((x, y) -> Integer.compare(y, x));

        // pq_2.add(69);
        // pq_2.add(65);
        // pq_2.add(87);
        // pq_2.add(79);
        // pq_2.add(73);
        // pq_2.add(84);
        // pq_2.add(89);
        // pq_2.add(80);
        // pq_2.add(81);
        // pq_2.add(82);
        // pq_2.add(85);
        // pq_2.add(70);
        // while(pq_2.peek() != null){
        //     pq_2.forEach (item -> System.out.print(" " + pq_2.poll()));
        // }

        // Creating an empty PriorityQueue
        PriorityQueue<String> queue = new PriorityQueue<String>();

        // Use add() method to add elements into the Queue
        queue.add("Привет");
        queue.add("Если");
        queue.add("Завтра");
        queue.add("Азбука");
        queue.add("Завтра");

        // Displaying the PriorityQueue
        System.out.println("Начальная очередь приоритетов: " + queue);

        // Fetching and removing the element at the head of the queue
        System.out.println("Элемент во главе" + " очереди: " + queue.poll());

        // Displaying the Queue after the Operation
        System.out.println("Окончательная очередь приоритетов: " + queue);

    }

}