/*
 * Реализовать простой калькулятор
 */

package Java_GB.Seminar.Seminar_1.homeWork;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.printf("Введите второе число: ");
            int num2 = scanner.nextInt();
            System.out.print("Введите знак операции: ");
            char a = (char) System.in.read();
            scanner.close();
            if (a == '+') {
                System.out.printf("%d + %d = %d\n", num1, num2, sum(num1, num2));
            } else if (a == '-') {
                System.out.printf("%d - %d = %d\n", num1, num2, difference(num1, num2));
            } else if (a == '*') {
                System.out.printf("%d * %d = %d\n", num1, num2, multiply(num1, num2));
            } else if (a == '/') {
                division(num1, num2);
            }

        } catch (Exception ex) {
            System.out.println("Вы ввели не целое число или строку, будьте внимательнее.");
        }

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
