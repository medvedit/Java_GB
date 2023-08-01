/**
 *  Быстрая сортировка, также известная как Quick Sort или сортировка Хоара, является одним их самых эффективных
 *  алгоритмов. Она включает в себя три этапа:
 *  1) Из массива выбирается опорный элемент, чаще всего посередине массива.
 *  2) Другие элементы массива распределяются таким образом, чтобы меньшие размещались до него, а большие — после.
 *  3) Далее первые шаги рекурсивно применяются к подмассивам, которые разделились опорным элементом на две
 *     части — слева и справа от него.
 *  Видео -> <>https://www.youtube.com/watch?v=CeHJV4zu_Ts&list=RDCMUCAkz1bYTFyaNa9oTFtOscCg&index=1</>
 */

package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.HomeWork;

import java.util.Arrays;
import java.util.Random;

public class QuickSort2 {

    public static void main(String[] args) {

        int[] array = randomArray(); // Создал массив методом Random.
        System.out.printf("Начальный массив " + Arrays.toString(array) + "\n\n"); //Вывел его в консоль.
        quickSort(array, 0, array.length - 1); // Запустил метод быстрой сортировки.
        System.out.printf("Отсортированный  массив " + Arrays.toString(array) + "\n\n"); // Вывод отсортированного
                                                                                            // массива в консоль.

    }

    public static void quickSort(int[] arr, int from, int to) { // Метод быстрой сортировки.

        if (from < to) { // Пока индекс начального значения меньше предыдущего индекса. или другими словами:
                         // Пока массив содержит более одного элемента..

            int divideIndex = partition(arr, from, to); // Запускаем метод деления массива на две части. Значение
                       // индекса элемента относительно которого происходило деление массива на правую, и левую часть
                       // записывается в переменную divideIndex.

            eachSortingStepPrinting(arr, from, to, divideIndex); // Вывод в консоль каждого шага
                                                                       // деления и замены местами элементов в массиве.

            quickSort(arr, from, divideIndex - 1); // Рекурсивно запускается быстрая сортировка начального массива
            // с длинной от начала массива до индекса (не включая его) divideIndex на предыдущем шаге. Если в массиве
            // при запуске метода окажется только один элемент, то метод остановится и запустится метод сортировки ниже..

            quickSort(arr, divideIndex, to); // Рекурсивно запускается быстрая сортировка начального массива
            // с длинной от индекса (включительно) divideIndex на предыдущем шаге. Если в массиве при запуске метода
            // окажется только один элемент, то - массив отсортирован.
        }
    }

    private static int partition(int[] arr, int from, int to) { // метод деления массива на правую и левую часть
                                                                // относительно значения среднего элемента.
        int rightIndex = to; // правый индекс.
        int leftIndex = from; // левый индекс.

        int pivot = arr[from + (to - from) / 2]; // Значение элемента на середине массива.

        while (leftIndex <= rightIndex) { // пока левый индекс меньше или равен правому индексу...

            while (arr[leftIndex] < pivot) { // Пока значение элемента меньше значения pivot...
                leftIndex++; // Двигаемся на один шаг вперёд от начала массива к концу.
            }

            while (arr[rightIndex] > pivot) { // Пока значение элемента больше значения pivot...
                rightIndex--; // Двигаемся на один шаг вперёд от конца к началу массива.
            }

            if (leftIndex <= rightIndex) { // Если выполняется условие для индексов элементов, то ...
                swap(arr, rightIndex, leftIndex); // Запускаем метод swap();
                leftIndex++; // Переход на следующий элемент.
                rightIndex--; // Переход на следующий элемент.
            }
        }
        return leftIndex; // Вернули значение индекса элемента в массиве arr.
    }

    private static void swap(int[] array, int index1, int index2) { // Метод меняющий элементы местами.
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }


    private static void eachSortingStepPrinting(int[] arr, int from, int to, int partitionIndex) { // Метод печатающий
        // в консоль изменения в массиве arr, левую и правые части массива и значение элемента относительно которого
        // было последнее разделение в массиве arr. Печать на каждом шаге метода quickSort();
        /* ХОЧЕТСЯ ОТМЕТИТЬ, ЧТО ВСЕ ИЗМЕНЕНИЯ ПРОИСХОДЯТ В ЕДИНСТВЕННОМ МАССИВЕ arr. НОВЫХ МАССИВОВ НЕ СОДАЕТСЯ! */

        System.out.print(Arrays.toString(arr)); // Печать меняющегося массива.

        System.out.print("\nДелим по индексу: " + partitionIndex); // Печать индекса по которому происходило деление массива.

        System.out.print(", left: " + Arrays.toString(Arrays.copyOfRange
                (arr, from, partitionIndex))); // Печать левой части после последнего деления.

        System.out.println(", right: " + Arrays.toString(Arrays.copyOfRange
                (arr, partitionIndex, to + 1)) + "\n"); // Печать правой части после последнего деления.
    }


    public static int[] randomArray() { // метод создания массива целых чисел, Random.
        Random random = new Random();
        int[] numArray = new int[16]; // создали список, длина 10 элементом.

        for (int i = 0; i < numArray.length; i++) { // прошли в цикле от 0 элемента и по всей длине, и...
            numArray[i] = 1 + random.nextInt(100); // заполнили массив с цифры 1 до 100.
        }
        return numArray; // вернули значение массива.
    }
}
