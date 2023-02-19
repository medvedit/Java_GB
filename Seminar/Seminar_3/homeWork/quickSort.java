/*
 *  Быстрая сортировка (Quick Sort) -> имеет алгоритмическую сложность, то есть мы имеем O(n log n).
 *  Один из самых известных алгоритмов.
 *  Данную сортировку ещё называют сортировкой Хоара.
 *  Интересно, что алгоритм был придуман Хоаром во время его пребывания в Советском Союзе,
 *  где он обучался в Московском университете компьютерному переводу и занимался разработкой
 *  русско-английского разговорника.
 *  А ещё данный алгоритм в более сложной реализации используется в Arrays.sort в Java.
 */

package Java_GB.Seminar.Seminar_3.homeWork;

import java.util.Arrays;
import java.util.Random;


public class quickSort {

    public static void main(String[] args) {

        int[] array = randomArray();
        System.out.println(Arrays.toString(array));
        int left = 0;
        int right = array.length - 1;
        quickSortMethod(array, left, right);
        System.out.println(Arrays.toString(array));



    }
    // Для входного массива int[] source выставляем два маркера, левый (L) и правый (R).
    // При первом вызове они соответствуют началу и концу массива.
    public static void quickSortMethod(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
            if (low < j)
            quickSortMethod(array, low, j);

        if (high > i)
                quickSortMethod(array, i, high);
        }
    }

    public static int[] randomArray() { // метод создания массива целых числе, Random.
        Random random = new Random();
        int[] numArray = new int[5]; // создали список, длина 10 элементом.

        for (int i = 0; i < numArray.length; i++) { // прошли в цикле от 0 элемента и по всей длине, и...
            numArray[i] = 1 + random.nextInt(100); // заполнили массив с цифры 1 до 100.
        }
        return numArray; // вернули значение массива.
    }

}
