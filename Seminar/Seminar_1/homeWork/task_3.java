/*
 * Реализовать простой калькулятор
 */

package Java_GB.Seminar.Seminar_1.homeWork;

import java.util.Scanner;

public class task_3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

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
        System.out.println("Введите число:");
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
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();// рекурсия
            operation = getOperation();
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
        } else {
            double c;
            double x = a;
            double y = b;
            c = x / y;
            System.out.printf("%.0f / %.0f = %.2f\n", x, y, c);
        }
    }

}
