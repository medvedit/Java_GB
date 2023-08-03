/*
 * Задача 2
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */

package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class task_2 {

    public static void main(String[] args) {

        int[] randomArr = randomArray(); // Создали список простых чисел. Длина списка задана в методе.
        System.out.printf("Сформировали список из случайных чисел -> %s\n",Arrays.toString(randomArr));
        System.out.printf("Удалили все четные значения списка -> %s\n",removingEvenNumbers(randomArr));

    }

    public static int[] randomArray() { // Метод создания массива целых числ, Random.
        Random random = new Random();
        int[] rndArray = new int[10]; // Создали список длиной 10 элементов.

        for (int i = 0; i < rndArray.length; i++) { // Прошли в цикле от 0 элемента и по всей длине, и...
            rndArray[i] = random.nextInt(1, 100); // Заполнили массив с цифры 1 до 100.
        }
        return rndArray; // Вернули значение массива.
    }

    public static ArrayList<Integer> removingEvenNumbers(int[] arrayNumber) { // Метод удаления чётных чисел.

        ArrayList<Integer> listNumber = new ArrayList<>(arrayNumber.length); // Создали ArrayList по длине
        // входящего массива чисел. ArrayList в отличие от массива имеет возможность свободного удаления ми вставки
        // элементов во время прохода по списку.

        for (int i : arrayNumber) { // Прошли по всем элементов водящего в метод массива чисел, и...
            listNumber.add(i); // Занесли каждый элемент в список listNumber.
        }

        for (int i = 0; i < listNumber.size(); i++) { // Прошли от index 0 по всей длине listNumber.
            if(listNumber.get(i) % 2 == 0){ // Если число на index i делится без остатка на 2, то ...
                listNumber.remove(i); // Удаляем число на index i.
                i--; // Люблю прыгать в длину, укоротил ноги...))))
            }
        }
        return listNumber; // Вернул полученный результат.
    }
}
