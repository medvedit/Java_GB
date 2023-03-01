package Java_GB.Seminar.Seminar_4.classWork;

import java.util.LinkedList;

public class linkedList {


    public static void main(String[] args) {

        LinkedList<String> test = new LinkedList<>();

        test.add("a"); // добавил
        test.add("b"); // добавил
        test.add("m"); // добавил
        test.add("f"); // добавил

        System.out.println(test.get(3)); // вывел элемент с 3 позиции
        System.out.println(test); // вывел все элементы

        test.addFirst("r"); // добавил на первую позицию
        test.removeLast(); // удалил с последней позиции
        System.out.println(test); // вывел итог
    }

}
