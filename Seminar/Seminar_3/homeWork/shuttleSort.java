/*
 *  Челночная сортировка ((Shuttle Sort)) -> сложность алгоритма O(n^2).
 *
 */

package Java_GB.Seminar.Seminar_3.homeWork;

import java.util.Arrays;
import java.util.Random;

public class shuttleSort {

    public static void main(String[] args) {

        int[] array = randomArray(); // создали массив array с помошью метода Random.
        System.out.println(Arrays.toString(array)); // вывод в консоль начального массива.
        int[] arraySort = shuttleSortMethod(array); // запустили метод сортировки по массиву array и
                                                    // передали отсортированный массив в переменную arraySort.
        System.out.println(Arrays.toString(arraySort)); // вывод отсортированного массива.

    }
    public static int[] randomArray() { // метод создания массива целых числе, Random.
        Random random = new Random();
        int[] numArray = new int[5]; // создали список, длина 10 элементом.

        for (int i = 0; i < numArray.length; i++) { // прошли в цикле от 0 элемента и по всей длине, и...
            numArray[i] = 1 + random.nextInt(100); // заполнили массив с цифры 1 до 100.
        }
        return numArray; // вернули значение массива.
    }
    public static int[] shuttleSortMethod(int[] arrayIn){
        // в первом цикле for от index 1 и до конца массива идет сравнение рядом стоящих index 1 с index i-1,
        // если условие true, до делаем swap. Переход во второй цикл for.
        for (int i = 1; i < arrayIn.length; i++) {
            if (arrayIn[i] < arrayIn[i - 1]) {
                swap(arrayIn, i, i - 1);
                // Во втором цикле for идет присвоение index i-1 к index z,
                // те по факту мы сделали шаг назад в массиве, и вновь попали на то число,
                // которое только что было меньше предыдущего, и из за которого был запущен первый swap.
                // Во втором цикле мы двигаемся назад по массиву, до первого элемента и запускаем swap ,
                // если число "стоящие перед нами" окажется больше того числа,
                // на котором находимся мы в данный момент array[z].
                // При этом, дойдя до начала массива, сработает условие (z - 1) >= 0,
                // второй цикл for прекратит работу и нас вновь перекинет на первый цикл for, на следующий index.
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (arrayIn[z] < arrayIn[z - 1]) {
                        swap(arrayIn, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
        return arrayIn;

    }
    private static void swap(int[] arrayIn, int ind1, int ind2) { // метод -> меняем местами соседние элементы.
        int tmp = arrayIn[ind1];
        arrayIn[ind1] = arrayIn[ind2];
        arrayIn[ind2] = tmp;
    }


}
