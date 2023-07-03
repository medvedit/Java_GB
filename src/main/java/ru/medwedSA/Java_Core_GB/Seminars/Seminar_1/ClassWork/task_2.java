package ru.medwedSA.Java_Core_GB.Seminars.Seminar_1.ClassWork;

/*
 * Задание №2
Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0],
вывести максимальное количество подряд идущих 1.

 */

public class   task_2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0 };

        int count = 0;
        int maxCount = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.printf("Максимальное количество идущих подряд чисел 1 ровно %d раз(a)", maxCount);
    }
}
