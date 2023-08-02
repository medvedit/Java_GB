/**
 *  Поразрядная сортировка (Radix Sort)
 *  Его вычислительная сложность O(k * n), где k количество проходов по массиву.
 *  Если n достаточно велико, а k наоборот очень мало, то данный алгоритм выигрывает у O(n * Log n).
 *  Суть сортировки в том, что при каждом проходе числа делятся на разряды слева на право и сортируются вначале по
 *  единицам, затем по десяткам, далее если число содержит сотни, то и по сотням и т.д. Конечно для этого вначале нужно
 *  найти максимальное число, что бы знать максимальную разрядность чисел при их дальнейшей сортировке. И для того,
 *  что бы к числам с недостающей разрядностью до максимального числа, добавить нули перед числом, в количестве
 *  недостающей разрядности.
 *  Почитать можно тут -> <>https://ru.wikibrief.org/wiki/Radix_sort</>
 *  Видео глянуть тут -> <>https://www.youtube.com/watch?v=qmiLYhyMq1M</>
 */

package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.HomeWork;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {

        int[] arr = {171, 45, 75, 90, 802, 248, 2, 66};
        int n = arr.length;
        System.out.printf("Начальный массив -> " + Arrays.toString(arr)+ "\n");

        radixSortMethod(arr, n);
        System.out.printf("Отсортированный массив -> " + Arrays.toString(arr));

    }

    public static void radixSortMethod(int[] arr, int n) {
        int m = getMax(arr, n); // Поиск максимального числа, что бы знать количество цифр в максимальном числе.

        for (int digitPlace = 1; m / digitPlace > 0; digitPlace *= 10) // Делаем сортировку подсчетом для каждой
                            // цифры. Обратите внимание, что цикл завершит работу после прохода по всем разрядом
                            // максимального числа.
            countSort(arr, n, digitPlace);
    }

    public static void countSort(int[] arr, int n, int exp) {
        int[] output = new int[n]; // Конечный массив по размеру входящего в метод.
        int i;
        int[] count = new int[10]; // Массив счетчиков.
        Arrays.fill(count, 0); // Массив заполнен нулями.

        // Сохранить количество вхождений в count[].
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++; // Индекс массива count соответствует числу, которое участвует в сортировке

        // Изменяем count[i] так, чтобы count[i] теперь содержал фактическую позицию этой цифры в output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Формируем конечный массив.
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = output[i]; // Копируем отсортированный массив из output[] в arr[]. Далее массив arr[] снова
                                // запустится в сортировку по следующему разряду числа.
    }

    public static int getMax(int[] arr, int n) { // Метод поиска максимального числа.
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

}
