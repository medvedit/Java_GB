/**
 *  Сортировка слиянием (merge sort)
 *  Достоинства сортировки слиянием перед быстрой сортировкой:
 *  + Стабильность процесса сортировки относительно производительности.
 *  + Скорость сортировки не зависти ои входящих данных.
 *  + Удобно и целесообразно применять при получении данных для сортировки порциями. Получили один пакет
 *    данных ->  отсортировал. Через некоторое время получили следующий пакет данных. Полученные два пакета данных
 *    можно слить в один, общий, отсортированный при слиянии пакет. Затем получаем третью порцию данных и процесс
 *    слияния + сортировки повторяется. В итоге получим один большой, общий, отсортированный пакет данных.
 *  + Из этого следует еще одн преимущество сортировки слиянием -> нет необходимости получения всех данных для
 *    сортировки, а сортировать и соединять получаемые данные в процессе их получения.
 *    Пример: получения данных по сети, от приложения...
 *  Сложность данного алгоритма — логарифмическая. Записывается как O(n log n).


 *  О решении таким способом, о работе метода сортировки можно почитать тут -> <>https://habr.com/ru/articles/710620/</>
 */

package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.HomeWork;

import java.util.Arrays;

/*                  Пример сортировки слиянием с использованием массива и рекурсии. */


public class MergeSortForArray {
    public static void main(String[] args) {

        int[] inArray = randomArray();
        System.out.println(Arrays.toString(inArray));

        int[] sortedArray = mergeSort(inArray);
        System.out.println(Arrays.toString(sortedArray));

    }

    public static int[] mergeSort(int[] acceptedArray) {

        if (acceptedArray.length <= 1) {
            return acceptedArray;
        }
        int[] left = Arrays.copyOfRange(acceptedArray, 0, acceptedArray.length / 2);
        int[] right = Arrays.copyOfRange(acceptedArray, left.length, acceptedArray.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int resIn = 0;
        int leftIn = 0;
        int rightIn = 0;
        int[] result = new int[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length)
            if (left[leftIn] < right[rightIn])
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        while (resIn < result.length)
            if (leftIn != left.length)
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        return result;
    }











    private static int[] randomArray() {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
        }
        return array;
    }
}
