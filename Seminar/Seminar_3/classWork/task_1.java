
/*
 *  Заполнить список десятью случайными числами.
    Отсортировать список методом sort() и вывести его на экран.

 */
package Java_GB.Seminar.Seminar_3.classWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class task_1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random(); // объявили Random
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(0, 100)); // создали список 10 чисел, заполненных Random.
        }
        for (int i : list) {
            System.out.print(i + " "); // вывел значения i начального списка в консоль через пробел
        }
        System.out.println('\n'); // пропуск строки в консоли

        Collections.sort(list); // сортировка по возрастанию встроенным методом.

        for (int i : list) {
            System.out.print(i + " "); // вывод в консоль отсортированного списка.
        }
        System.out.println(); // для красоты вывода в VScode

    }

}
