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

        boolean needIteration = true; //заводим переменную "нужна итерация" и определяем ее как true,
                                      // поэтому, пока...

        while (needIteration) { // внешний цикл  while определен как true, он работает.
            needIteration = false; // сразу предположили, что
                                    // массив уже отсортирован и сменили значение needIteration на false.

            for (int i = 1; i < array.length; i++) { // Проход по всей длине массива, index 1.
                                                // При каждом заходе в цикл for начинаем с проверку с index 1.
	            if (array[i] < array[i - 1]) { // ТУТ ВАЖНО, если цикл НЕ НАЙДЕТ элементы верные не равенству, то массив
                                            //  отсортирован -> ВЫХОД. Если находим элемент массива верный не равенству, то...
                    swap(array, i, i-1); // вызываем метод swap.

                    needIteration = true; // вновь присваиваем true для needIteration, что бы цикл while вновь активировался.
                }
	        }
        }
        System.out.println(Arrays.toString(array));
    }
    private static void swap(int[] array, int ind1, int ind2) { // метод -> меняем местами соседние элементы.
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
