package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.HomeWork;

/*
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
 */

                /* Пример сортировки слиянием с использованием типизированных списков и рекурсии. */


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSortForArrayList {

    public static void main(String[] args) {

        List<Integer> array = myNumbers();
        System.out.println(array);
        System.out.println(mergeSort(array));

    }

    private static List<Integer> myNumbers() { // метод создания списка Random.
        List<Integer> numList = new ArrayList<>(); // Объявили новый список для дальнейшего его заполнения.
        Random random = new Random();

        for (int i = 0; i < 16; i++) { // прошли в цикле, создавая список из 16 элементов.
            numList.add(random.nextInt(0, 100)); // range от 0 до 99
        }
        return numList; // Вернули из метода Random список целых чисел.
    }

    public static List<Integer> mergeSort(List<Integer> array) {
        if (array.size() < 2) { // базовый случай выхода из рекурсии, когда массив имеет 0 или 1 элемент.
            return array;
        } else {
            int delimiter = array.get(0); // число, относительно которого разделяем массивы на left и right
            List<Integer> left = new ArrayList<>(); // левая сторона
            List<Integer> right = new ArrayList<>(); // правая сторона

            for (int i = 1; i < array.size(); i++) {
                if (array.get(i) < delimiter) {
                    left.add(array.get(i)); // левая сторона - числа меньше delimiter
                } else {
                    right.add(array.get(i)); // правая сторона - числа больше delimiter
                }
            }
            return mergerArray(mergeSort(left), delimiter, mergeSort(right)); // вызываем  рекурсии
        }
    }

    private static List<Integer> mergerArray(List<Integer> left, int del, List<Integer> right) {
         left.add(del);
        left.addAll(right);
        return left;
    }
}
