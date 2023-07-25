package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.HomeWork;

/*
 *  Сортировка подсчётом (Counting Sort). Такая сортировка подходит только для сортировки чисел и требует большое
 *  количество памяти.
 *  Такую сортировку целесообразнее использовать при большой длине входящего на сортировку массива, но при не очень
 *  большом максимальном значении в массиве. (Массив из 10_000 элементов, но в диапазоне от 1 до 6)
 *  Линейная сложность O(n+k), где n — количество элементов, а k — максимальное значение элемента.
 *  Есть с алгоритмом одна незадача: нам нужно знать максимальное значение числа в массиве,
 *  который требуется отсортировать.
 *  Посмотреть можно тут -> https://www.youtube.com/watch?v=WBS8qlrry0U&t=155s
 */

import java.util.Arrays;
import java.util.Random;

public class CountingSort {

    public static void main(String[] args) {

        int[] array = randomArray();
        System.out.println("Начальный массив = " + Arrays.toString(array));
        int max = getMax(array);
        System.out.printf("Максимальное число в массиве = %d\n", getMax(array));
        System.out.println("Отсортированный массив = " + Arrays.toString(countingSortMethod(array, max)));

    }

    public static int[] randomArray() { // метод создания массива целых чисел, Random.
        Random random = new Random();
        int[] numArray = new int[10]; // создали список, длина 10 элементом.

        for (int i = 0; i < numArray.length; i++) { // прошли в цикле от 0 элемента и по всей длине, и...
            numArray[i] = 1 + random.nextInt(10); // заполнили массив с цифры 1 до 100.
        }
        return numArray; // вернули значение массива.
    }

    public static int[] countingSortMethod(int[] theArray, int maxValue) {
        // Массив со "счётчиками" размером от 0 до максимального значения
        int[] numCounts = new int[maxValue + 1]; // Создали массив длиной от 0 до максимального числа. +1, тк массив с ноля)
        for (int num : theArray) { // Проходим по всему массиву
            numCounts[num]++; // В соответствующей ячейке (индекс = значение) увеличиваем счётчик
            System.out.println(Arrays.toString(numCounts)); // наглядный вывод в консоль.
        }
        // Подготавливаем массив для отсортированного результата
        int[] sortedArray = new int[theArray.length]; // Создали новый массив по длине входящего в метод.
        int currentIndex = 0; // Текущий индекс.
        for (int n = 0; n < numCounts.length; n++) { // идём по массиву со "счётчиками" (индекс = значение).
            int count = numCounts[n]; // Присеваемом текущее значение в count.
//            System.out.println(count); // для себя. Наглядно изучал выводы в консоль.
            for (int k = 0; k < count; k++) { // Ходим в цикле пока k < count.
                sortedArray[currentIndex] = n; // добавили число n на позицию currentIndex.
                currentIndex++; // перешли на следующий индекс.
//                System.out.println(currentIndex);
//                System.out.println(Arrays.toString(sortedArray));
            }
        }
        return sortedArray;
    }
    public static int getMax(int[] inputArray) { // нахождение максимального значения в массиве из метода Random.
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

}
