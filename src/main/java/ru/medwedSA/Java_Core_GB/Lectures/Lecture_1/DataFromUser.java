/*
 * Получение данных из терминала, от пользователя:
 */

package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

import java.util.Scanner;

public class DataFromUser {
    public static void main(String[] args) {

        try (Scanner iScanner = new Scanner(System.in)) { // проверка на ввод валидных данных.
            System.out.print("Ваше имя: ");
            String name = iScanner.nextLine();
            System.out.printf("Привет, %s%n", name);
            // iScanner.close();

            Scanner scanner = new Scanner(System.in);
            System.out.print("int X =  ");
//             boolean flag = scanner.hasNextInt(); // проверка данных на валидность ввода.
//             System.out.println(flag); // проверка данных на валидность ввода.
            int x = scanner.nextInt();
            System.out.print("double Y =  ");
//             boolean flag2 = scanner.hasNext(); // проверка данных на валидность ввода.
//             System.out.println(flag2); // проверка данных на валидность ввода.
            double y = scanner.nextDouble();
            System.out.printf("Сумма двух чисел: %d + %f = %.3f%n", x, y, x + y);
            scanner.close();
        } catch (Exception e) { // исключение, при не допустимых введенных данных.
            System.out.println("Вы ввели не верное число или строку, будьте внимательнее.");
        }

    }

}
