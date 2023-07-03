package ru.medwedSA.Java_Core_GB.Seminars.Seminar_1.ClassWork;

/*
 * Задание №3
Дан массив num = [3, 2, 2, 3, 3, 2, 2, 2, 3, 2, 2] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

 */

import java.util.Arrays;

public class task_3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3, 3, 2, 2, 2, 3, 2, 2};
        int num = 3;
        int j = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

