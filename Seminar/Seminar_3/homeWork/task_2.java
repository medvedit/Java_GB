/*
 * Задача 2
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */

package Java_GB.Seminar.Seminar_3.homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class task_2 {

    public static void main(String[] args) {

        int[] numRnd = randomArray(); // создали список простых чисел. длина списка задана в методе.
        System.out.printf("Сформировали список из 10ти случайных чисел -> %s%n",Arrays.toString(numRnd));
        System.out.printf("Удалили все четные значения списка -> %s%n",removingEvenNumbers(numRnd));

    }

    public static int[] randomArray() { // метод создания массива целых числе, Random.
        Random random = new Random();
        int[] numArray = new int[10]; // создали список, длина 10 элементом.

        for (int i = 0; i < numArray.length; i++) { // прошли в цикле от 0 элемента и по всей длине, и...
            numArray[i] = 1 + random.nextInt(100); // заполнили массив с цифры 1 до 100.
        }
        // System.out.println(Arrays.toString(numArray)); // вывод в консоль созданного массива чисел.
        return numArray; // вернули значение массива.
    }

    public static ArrayList<Integer> removingEvenNumbers(int[] arrayNumber) { // метод удаления четных чисел.

        ArrayList<Integer> listNumber = new ArrayList<>(arrayNumber.length); // создали ArrayList по
                                                                             // длине входящего массива чисел.

        for (int i : arrayNumber) { // прошли по всем элементов водящего в метод массива чисел, и...
            listNumber.add(Integer.valueOf(i)); // занесли каждый элемент в список listNumber.
        }

        for (int i = 0; i < listNumber.size(); i++) { // прошли от index 0 по всей длине listNumber.
            if(listNumber.get(i) % 2 == 0){ // если число на index i делится без остатка на 2, то ...
                listNumber.remove(i); // удаляем число на index i.
                i--; // люблю прыгать в длину, укоротил ноги...))))
            }
        }
        return listNumber; // вернул полученный результат.

    }

}
