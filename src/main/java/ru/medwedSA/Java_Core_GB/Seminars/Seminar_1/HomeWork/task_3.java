package ru.medwedSA.Java_Core_GB.Seminars.Seminar_1.HomeWork;

/*
 * Реализовать простой калькулятор
 */

import java.util.Scanner;

public class task_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        calculator();

    }

    private static void calculator() {
        int num1 = getInt();
        int num2 = getInt();
        char a = getOperation();
        if (a == '+') {
            System.out.printf("%d + %d = %d\n", num1, num2, sum(num1, num2));
        } else if (a == '-') {
            System.out.printf("%d - %d = %d\n", num1, num2, difference(num1, num2));
        } else if (a == '*') {
            System.out.printf("%d * %d = %d\n", num1, num2, multiply(num1, num2));
        } else if (a == '/') {
            division(num1, num2);
        }
    }

    public static int getInt() {
        System.out.print("Введите число: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();// рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        char operation;
        System.out.print("Введите операцию: ");
        try {
            switch (scanner.next().charAt(0)) {
                case '+' -> {
                    operation = '+';
                    return operation;
                }
                case '-' -> {
                    operation = '-';
                    return operation;
                }
                case '*' -> {
                    operation = '*';
                    return operation;
                }
                case '/' -> {
                    operation = '/';
                    return operation;
                }
                default -> {
                    System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
                    operation = getOperation();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return operation;
    }

    static int sum(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    static int difference(int a, int b) {
        int c;
        c = a - b;
        return c;
    }

    static int multiply(int a, int b) {
        int c;
        c = a * b;
        return c;
    }

    static void division(int a, int b) {
        if (b == 0) {
            System.out.println("На ноль делить не стоит..");
            calculator();
        } else {
            double c;
            c = (double) a / (double) b;
            System.out.printf("%.0f / %.0f = %.2f\n", (double) a, (double) b, c);
        }
    }
}
