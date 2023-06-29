/*
 * Создание одномерного массива заполненного нулями.
 * Положили значение 13 на 3 индекс и вывели в консоль.
 */

package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

import java.util.Arrays;

public class CreatingArrays {
    public static void main(String[] args) {

        /* Объявление массива с указанием его размера. Заполнение массива по указанному индексу. */
        int[] arr = new int[10]; // пустой массив с длиной 10 элементов.
        arr[3] = 13; // Указали на 3 индекс число 13.
        System.out.println(arr[3]); // 13 Напечатали в терминал.
        System.out.println(Arrays.toString(arr)); // Печать в консоль всех элементов массива.

        /* Объявление массива и заполнение его при объявлении. */
        int[] array = new int[] { 4, 5, 3, 6, 7, 8, 0 };

        System.out.printf("Общая длина массива составляет %d элементов %n", array.length); // вывели длину массива.
        System.out.println(Arrays.toString(array));// вывели на печать. [4, 5, 3, 6, 7, 8, 0]

        // Базовый функционал о массивах можно получить через: имяМассива. (имя массива + . )

        // Объявление двумерного массива:
        int[][] arr1 = new int[3][5];

        for (int[] line : arr1) {
            for (int item : line) {
                item--;
                System.out.printf("%d", item);
            }
            System.out.println();
        }
        System.out.println(); // Для разделения вывода.

        // Объявление двумерного массива или массива массивов:
        int[][] arr2 = new int[3][5];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%d", arr2[i][j]);
            }
            System.out.println();
        }

    }

}
