package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.HomeWork;

/*
 * Сортировка пузырьком — одна из самых простых и неэффективных сортировок.
 * Её ещё иногда называют "глупой сортировкой".
 * Сложность алгоритма O(n^2).
 * Видео сортировки + код на PYTHON -> https://www.youtube.com/watch?v=fGZktXucbNY
 */

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(bubbleSort(array)));

    }

    public static int[] bubbleSort(int[] array) {

        boolean needIteration = true; //заводим переменную "нужна итерация" и определяем ее как true,

        while (needIteration) { // Внешний цикл  while определен как true, он работает.

            needIteration = false; // Сразу предположили, что массив уже отсортирован и сменили
                                   // значение needIteration на false.

            for (int i = 1; i < array.length; i++) { // Проход по всей длине массива...

	            if (array[i] < array[i - 1]) { // ТУТ ВАЖНО, если неравенство верно, то запускаем метод swap(), иначе
                                               // массив отсортирован, переход в предыдущий цикл.
                    swap(array, i, i-1); // вызов метода swap().


                    needIteration = true; // вновь присваиваем true для needIteration, что бы цикл while вновь активировался.
                }
	        }
        }
        return array;
    }

    private static void swap(int[] array, int ind1, int ind2) { // метод -> меняем местами соседние элементы.
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
