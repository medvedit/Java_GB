/*
 *  Функции и методы — это технически одно и то же. Функции могут
 *  не принадлежать классам, а методы принадлежать.
 *  В java все функции являются методами.
 */

package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

public class FunctionsEndMethods {

    static void sayHi() { // создали метод.
        System.out.println("Hi"); // метод ничего не возвращает, только печатает в терминал.
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(int n) {
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
        int min = a < b ? a : b; // Звучит как -> Если условие a < b выполняется, то
                               // ВЕРНЕТСЯ часть до двоеточия, то есть в данном примере вернется a, иначе вернется b.
        System.out.println(min);
    }
    static String text(int a){
        switch (a) {
            case 1:
                return String.format("Доброе утро");
            case 2:
                return String.format("Добрый день");
            case 3:
                return String.format("Добрый вечер");
            default:
                return String.format("Что то поло не так...");
        }
    }
    static void text2(int a){
        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Как дела?");
                break; // В этом коде break обязателен!
            case 5:
                System.out.println("Чем занят?");
                break; // В этом коде break обязателен!
            case 6:
                System.out.println("Идем на футбол???");
                break; // В этом коде break обязателен!
            default: // Это не обязательная ветка.
                System.out.println("Разговор не задался...");
                break; // В этом коде break обязателен!
        }
    }

    public static void main(String[] args) {

        sayHi(); // Hi Это точка входа, старта Поэтому тут и запускаем созданный ниже метод.
        System.out.println(sum(3, 5)); // 8
        System.out.println(factor(5)); // 120.0
        System.out.println(assign(5, 8)); // 8.0
        assign2(10, 3); // 10.0
        ternary(); // 2
        System.out.println(text(2)); // Добрый день
        text2(2); // Как дела?
    }
}
