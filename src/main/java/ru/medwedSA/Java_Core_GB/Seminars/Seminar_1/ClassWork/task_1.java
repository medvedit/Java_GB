package ru.medwedSA.Java_Core_GB.Seminars.Seminar_1.ClassWork;

/*
 * Задание №1
Написать программу, которая запросит пользователя ввести <Имя> в консоли.
Получить введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

 * Задание №1*
В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

 */

import java.time.LocalTime;
import java.util.Scanner;

public class task_1 {

    // задание 1

    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) { // Scanner автоматически закроется.
            System.out.print("Введите имя: ");
            String userName = iScanner.nextLine();
            System.out.printf("Привет, %s\n", userName);

    // задание 1*

            int hour = LocalTime.now().getHour();

            if (hour >= 5 && hour < 12) {
                System.out.println("Доброе утро, " + userName);
            } else if (hour >= 12 && hour < 18) {
                System.out.println("Добрый день, " + userName);
            } else if (hour >= 18 && hour < 23) {
                System.out.println("Добрый вечер, " + userName);
            } else {
                System.out.println("Доброй ночи, " + userName);
            }
        } catch (Exception e) { // Обработка исключения, если возникло.
            e.printStackTrace();
        }
    }
}
