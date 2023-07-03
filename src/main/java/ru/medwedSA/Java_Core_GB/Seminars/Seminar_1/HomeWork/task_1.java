package ru.medwedSA.Java_Core_GB.Seminars.Seminar_1.HomeWork;

/*
 * Задача 1
 * Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        long t = 0;
        long f = 1;
        try (Scanner scanNum = new Scanner(System.in)) {
            System.out.print("Введите число, длину треугольной последовательности: ");
            int tx = scanNum.nextInt();
            System.out.print("Введите число для вычисления факториала: ");
            int fx = scanNum.nextInt();
            if (tx < 0 || fx < 0) {
                System.out.println("Нужно вводить положительное число");
            } else {
                scanNum.close();
                for (int i = 1; i <= tx; i++) {
                    t = t + i;
                }
                System.out.printf("Треугольное число: %d = %d\n", tx, t);
                for (int i = 1; i <= fx; i++) {
                    f = f * i;
                }
                System.out.printf("Факториал: %d! = %d\n", fx, f);
            }
        } catch (Exception ex) {
            System.out.println("Вы ввели не целое число или строку, будьте внимательнее.");
        }
    }
}
