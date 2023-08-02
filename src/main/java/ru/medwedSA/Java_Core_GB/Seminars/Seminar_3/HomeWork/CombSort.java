/*
 *  Сортировка расческой — алгоритм сортировки, являющийся усовершенствованным вариантом
 *  сортировки пузырьком.
 *  Видео смотрим тут -> https://www.youtube.com/watch?v=ywGK-_3znMw
 *  Идея метода состоит в сравнении элементов, стоящих не только рядом, но
 *  и на определённом расстоянии друг от друга.
 *  Иными словами — это сортировка пузырьком с предварительными «грубыми» проходами.
 *  Википедия -> https://ru.wikipedia.org/wiki/
 *  Затраты памяти: O(1)
 *  Лучшее время: O(n log n)
 *  Среднее время: Omega (n^2/2^p)
 *  Худшее время: O(n^2)
 */

package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.HomeWork;

import java.util.Arrays;
import java.util.Random;

public class CombSort {

    public static void main(String[] args) {

        int[] array = randomArray();
        System.out.println(Arrays.toString(array));
        int[] arraySort = combSort(array);
        System.out.println(Arrays.toString(arraySort));

    }

    public static int[] combSort(int[] array){

        int gap = array.length; // Изначально задано, что геп между двумя сравниваемыми числами будет
                                // равен длине массива.
        boolean isSorted = false; // Объявлено как лож, для запуска цикла while.
        while ((!isSorted || gap != 1)) { // Цикл запустится пока условия выполняются.

            if (gap > 1) { // Если гпе больше 1, то
                gap = gap * 10 / 13;  // Геп уменьшаем по оптимальной формуле. https://ru.wikipedia.org/wiki/
            } else { // иначе..
                gap = 1; // Геп присваиваем 1 и выходим из сортировки. Цикл while не запустится.
            }

            for (int i = gap; i < array.length; i++) { // i вначале цикла будет равен gap.
                if (array[i - gap] > array[i]) { // Сравниваем элементы находящиеся друг от друга на расстоянии gap.
                                                 // Если условие выполняется, то...
                    int tmp = array[i]; // Меняем элементы местами.
                    array[i] = array[i - gap];
                    array[i - gap] = tmp;

                    isSorted = false; // Если элементы менялись местами, isSorted станет false и цикл while вновь запустится.
                } else { // иначе...
                    isSorted = true; // Массив отсортирован, выход из цикла while.
                }
            }
        }
        return array; // По завершении сортировки вернется отсортированный массив.
    }

    public static int[] randomArray(){
        Random random = new Random();
        int[] numArray = new int[3];
        for (int i = 0; i < numArray.length ; i++) {
            numArray[i] = 1 + random.nextInt(100);
        }
        return numArray;
    }
}
