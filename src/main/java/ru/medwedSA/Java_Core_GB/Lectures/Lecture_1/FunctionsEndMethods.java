package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

/*
 *  Функции и методы — это технически одно и то же. Функции могут
 *  не принадлежать классам, а методы принадлежать.
 *  В java все функции являются методами.
 */

public class FunctionsEndMethods {

    static void sayHi() { // создали метод.
        System.out.println("Hi"); // метод ничего не возвращает, только печатает в терминал.
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(int n) { // Рекурсия.
        if (n == 1)
            return 1;
        if (n == 0)
            return 1;
        return n * factor(n - 1);
    }

    static double assign(double a, double b) {
        double c;
        if (a > b) {
            c = a;
            return c;
        } else {
            c = b;
            return c;
        }
    }

    // сокращенный вариант предыдущего кода, НО он ничего не возвращает:
    static void assign2(double a, double b) {
        double c = 0;
        if (a > b) c = a;
        if (a < b) c = b;
        System.out.println(c);
    }

    // Тернарный оператор:
    static void ternary() {
        int a = 2;
        int b = 5;
        int min = a < b ? a : b; // Тернарный оператор. Звучит как -> Если условие a < b выполняется, то
                               // ВЕРНЕТСЯ часть до двоеточия, то есть в данном примере вернется a, иначе вернется b.
        System.out.println(min);
    }

    public static void main(String[] args) {

        sayHi(); // Hi Это точка входа, старта Поэтому тут и запускаем созданный ниже метод.
        System.out.println(sum(3, 5)); // 8
        System.out.println(factor(5)); // 120.0
        System.out.println(assign(5, 8)); // 8.0
        assign2(10, 3); // 10.0
        ternary(); // 2
    }
}
