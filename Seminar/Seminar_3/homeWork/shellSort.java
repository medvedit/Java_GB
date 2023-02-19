/*
 *  Сортировка Шелла — алгоритм сортировки, являющийся усовершенствованным вариантом сортировки вставками.
 *  Идея метода Шелла состоит в сравнении элементов, стоящих не только рядом, но
 *  и на определённом расстоянии друг от друга.
 *  Иными словами — это сортировка вставками с предварительными «грубыми» проходами.
 *  Википедия -> https://ru.wikipedia.org/wiki/Сортировка_Шелла
 *  Затраты памяти: О(n) всего, O(1) дополнительно
 *  Лучшее время: O(n log2 n)
 *  Среднее время: зависит от выбранных шагов
 *  Структура данных: Массив
 *  Худшее время: O(n2)
 */

package Java_GB.Seminar.Seminar_3.homeWork;

import java.util.Arrays;
import java.util.Random;

public class shellSort {

    public static void main(String[] args) {

        int[] array = randomArray();
        System.out.println(Arrays.toString(array));
        int[] arraySort = shellSortMethod(array);
        System.out.println(Arrays.toString(arraySort));

    }
    public static int[] randomArray(){

        Random random = new Random();
        int[] numArray = new int[6];

        for (int i = 0; i < numArray.length ; i++) {
            numArray[i] = 1 + random.nextInt(100);
        }
        return numArray;
    }
    public static int[] shellSortMethod(int[] arrayIn){

        int gap = arrayIn.length / 2; // Высчитываем промежуток между проверяемыми элементами
        while (gap >= 1) { // Пока разница между элементами есть
            for (int right = 0; right < arrayIn.length; right++) {
            // Смещаем правый указатель, пока не сможем найти такой, что
            // между ним и элементом до него не будет нужного промежутка
                for (int c = right - gap; c >= 0; c -= gap) { // эта строка очень сложна для понимания)))
                    if (arrayIn[c] > arrayIn[c + gap]) {
                        swap(arrayIn, c, c + gap);
                    }
                }
            }
            gap = gap / 2; // Пересчитываем разрыв
        }
        return arrayIn;

    }
    private static void swap(int[] array, int ind1, int ind2) { // метод -> меняем местами соседние элементы.
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

}
