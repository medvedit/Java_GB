/*
 *  Задание №2.1
        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.

    Задание №2.2 (если выполнено первое задание)
        Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.



 */

package Java_GB.Seminar.Seminar_3.classWork;

import java.util.*;

public class task_2 {

    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("Mars", "Earth", "Neptune", "Saturn", "Mars",
                "Mercury", "Saturn", "Venus", "Jupiter", "Jupiter", "Jupiter", "Uranus", "Venus"));
        Collections.sort(arrList); // отсортировали по возрастанию, алфавит.
        System.out.println(arrList);
        int count = 1;
        for (int i = 1; i < arrList.size(); i++) { // вывод всех элементов с количеством повторений.
            if (arrList.get(i - 1).equals(arrList.get(i))) {
                count++;
            } else {
                System.out.println(arrList.get(i - 1) + " " + count);
                count = 1;
            }
        }
        System.out.println(arrList.get(arrList.size() - 1) + " " + count);
        System.out.println();

        for (int i = 1; i < arrList.size(); i++) { // удалили повторяющиеся элементы.

            if (arrList.get(i-1).equals(arrList.get(i))){
                arrList.remove(i);
                i--;
            }
        }System.out.println(arrList);


        // Iterator<String> iter = arrList.iterator();

        // while (iter.hasNext()) { // полностью очистили список, не понял,
                                // что этим хотел сказать преподаватель и забрал на это 20мин урока.....
        //     iter.next();
        //     iter.remove();
        // }
        // System.out.println(arrList);

    }

}
