/*
 * Задача 1
 * Задан целочисленный список ArrayList.
 * Найти минимальное, максимальное и среднее арифметическое из этого списка.
 */

 package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task_1 {

    public static void main(String[] args) {

        List<Integer> myListNumbers = randomList(); // создали заполненный целыми числами список.
        System.out.printf("Данн массив -> %s\n", myListNumbers); // Вывод сформированного массива в консоль.
        maxMinAverage(myListNumbers); // нашли значение Max, значение Min и среднее арифметическое.

    }
    public static ArrayList<Integer> randomList(){ // метод создания списка Random.

        ArrayList<Integer> list = new ArrayList<>(); // создали новы список для заполнения.
        Random random = new Random();

        for (int i = 0; i < 11; i++) { // прошли в цикле, создавая список из 11 элементов.
            list.add(random.nextInt(-100, 100)); // range от -100 до 99
        }
        return list; // возврат в main заполненного списка.

    }

    private static void maxMinAverage(List<Integer> numList){ // метод поиска Max, Min и Average

        int numMax = numList.get(0); // создал три переменных
        int numMin = numList.get(0);             // каждую прировнял
        double sum = numList.get(0);                       // к элементу нулевого индекса.

        for (int i = 1; i < numList.size(); i++) { // проход с элемента с индексом 1
            sum = sum + numList.get(i); // общая сумма всех значений
            if (numList.get(i) > numMax) { // поиск Max
                numMax = numList.get(i); // сохранение Max
            } if (numList.get(i) < numMin) { // поиск Min
                numMin = numList.get(i); // сохранение Min
            }

        } System.out.printf("Максимальное число = %d, \nМинимальное число = %d, \nСреднее арифметическое = %.2f\n"
                                       ,numMax, numMin, sum/numList.size()); // вывод всех значений
    }
}
