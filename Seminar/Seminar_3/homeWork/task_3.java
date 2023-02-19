/*
*   Задача 3*
*   Реализовать алгоритм сортировки слиянием.
*/

package Java_GB.Seminar.Seminar_3.homeWork;

import java.util.Random;
import java.util.Arrays;

public class task_3 {


    public static void main(String args[]) {
        int[] sortArr = randomArray();
        System.out.println(Arrays.toString(sortArr));
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] randomArray() { // метод создания массива целых числе, Random.
        Random random = new Random();
        int[] numArray = new int[10]; // создали список, длина 10 элементом.

        for (int i = 0; i < numArray.length; i++) { // прошли в цикле от 0 элемента и по всей длине, и...
            numArray[i] = 1 + random.nextInt(100); // заполнили массив с цифры 1 до 100.
        }
        return numArray; // вернули значение массива.
    }

    public static int[] mergeSort(int[] sortArr) {

        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);

        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {

        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        // слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;

        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;

    }
    

}
