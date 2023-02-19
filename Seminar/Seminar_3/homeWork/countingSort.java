/*
 *  Сортировка подсчётом (Counting Sort) -> сложность O(n+k), где n — количество элементов, а k — максимальное значение элемента.
 *  Есть с алгоритмом одна незадача: нам нужно знать минимальное.
 */

package Java_GB.Seminar.Seminar_3.homeWork;

import java.util.Arrays;
import java.util.Random;

public class countingSort {

    public static void main(String[] args) {

        int[] array = randomArray();
        System.out.println(Arrays.toString(array));
        int max = getMax(array);
        System.out.println(Arrays.toString(countingSortMethod(array, max)));

    }

    public static int[] randomArray() { // метод создания массива целых числе, Random.
        Random random = new Random();
        int[] numArray = new int[5]; // создали список, длина 10 элементом.

        for (int i = 0; i < numArray.length; i++) { // прошли в цикле от 0 элемента и по всей длине, и...
            numArray[i] = 1 + random.nextInt(100); // заполнили массив с цифры 1 до 100.
        }
        return numArray; // вернули значение массива.
    }

    public static int[] countingSortMethod(int[] theArray, int maxValue) {
        // Массив со "счётчиками" размером от 0 до максимального значения
        int numCounts[] = new int[maxValue + 1];
        // В соответствующей ячейке (индекс = значение) увеличиваем счётчик
        for (int num : theArray) {
            numCounts[num]++;
        }
        // Подготавливаем массив для отсортированного результата
        int[] sortedArray = new int[theArray.length];
        int currentSortedIndex = 0;
        // идём по массиву со "счётчиками"
        for (int n = 0; n < numCounts.length; n++) {
            int count = numCounts[n];
            // идём по количеству значений
            for (int k = 0; k < count; k++) {
                sortedArray[currentSortedIndex] = n;
                currentSortedIndex++;
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
