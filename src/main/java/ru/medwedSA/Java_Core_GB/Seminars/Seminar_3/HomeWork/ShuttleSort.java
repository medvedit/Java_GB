/**
 *  Челночная сортировка (Shuttle Sort).
 *  Сложность алгоритма O(n^2).
 *  Челночная сортировка - это модификация поразрядной сортировки, которая использует технику "челнока" для перемещения
 *  элементов в массиве. Он работает путем прохода по массиву несколько раз с помощью двух циклов for. При чем,
 *  по первому циклу for движение начинается с элемента под первым индексом и идет от начала массива вконец сравнивая
 *  последующий элемент с предыдущим. А во втором цикле for проход наминается с элемента предыдущего элементу из
 *  первого цикла for и движение цикла происходит в начало массива. Сравнение элементов, как и в первом цикле for,
 *  происходит с предыдущим элементом.
 */

package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.HomeWork;

import java.util.Arrays;
import java.util.Random;

public class ShuttleSort {

    public static void main(String[] args) {
        int[] array = randomArray(); // создали массив array с помощью метода Random.
        System.out.println(Arrays.toString(array)); // вывод в консоль начального массива.
        int[] arraySort = shuttleSortMethod(array); // запустили метод сортировки по массиву array и
                                                    // передали отсортированный массив в переменную arraySort.
        System.out.println(Arrays.toString(arraySort)); // вывод отсортированного массива.
    }

    public static int[] shuttleSortMethod(int[] arrayIn){
        // в первом цикле for от index 1 и до конца массива идет сравнение с предыдущим элементом (index 1 с index i-1),
        // если условие true, до делаем swap. Переход во второй цикл for...
        for (int i = 1; i < arrayIn.length; i++) {
            if (arrayIn[i] < arrayIn[i - 1]) {
                swap(arrayIn, i, i - 1);
                // Во втором цикле for идет присвоение index i-1 к index z.
                // То есть по факту мы сделали шаг назад в массиве, и вновь попали на то число,
                // которое только что было меньше предыдущего. И из-за которого был запущен первый swap.
                // Во втором цикле мы двигаемся назад по массиву, до первого элемента и запускаем swap ,
                // если число "стоящие перед нами" окажется больше того числа,
                // на котором находимся мы в данный момент array[z].
                // При этом, дойдя до начала массива, сработает условие (z - 1) >= 0,
                // второй цикл for прекратит работу и нас вновь перекинет на первый цикл for, на следующий index.
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (arrayIn[z] < arrayIn[z - 1]) { // Если условие выполнится, то...
                        swap(arrayIn, z, z - 1); // Запускаем метод swap().
                    } //else { // иначе...
//                        break; // Прерываем
//                    }
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

    public static int[] randomArray() { // метод создания массива целых чисел, Random.
        Random random = new Random();
        int[] numArray = new int[13]; // создали список, длина 10 элементом.

        for (int i = 0; i < numArray.length; i++) { // прошли в цикле от 0 элемента и по всей длине, и...
            numArray[i] = 1 + random.nextInt(100); // заполнили массив с цифры 1 до 100.
        }
        return numArray; // вернули значение массива.
    }
}
