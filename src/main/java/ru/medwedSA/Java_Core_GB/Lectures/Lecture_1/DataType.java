package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

import java.util.Arrays;

/**
 * В языке Java типы данных делятся на две группы:
 *  1) Ссылочные
 *  2) Примитивные
 *  ниже в коде создание переменных с присвоением типа и значения. Вывод в консоль значения переменных.
 */
public class DataType {

    public static class referenceType { // класс ссылочных типов

        static String strFirst = "Как успехи в изучении"; // создал и присвоил значение.
        static String strSecond = strFirst + " языка Java?"; // Конкатенация. Изменил, а точнее создал новую строку.
        static int[] arrays = new int[]{1, 4, 6, 7};
    }

    public static class primitiveType { // класс примитивных типов

        static int intNumber = 1234567899;
        static short shortNumber = 12349;
        static float floatNumber = -19.99F; // У типа данных float при присвоении значения обязательное добавление
                                            // буквы F на конце значения.
        static double doubleNumber = 199999.99;
    }


    public static void main(String[] args) { // Метод main - точка входа, метод запуска кода.

        System.out.println(referenceType.strFirst);
        // Вывод начального значения строки. Класс referenceType, переменная strFirst
        System.out.println(referenceType.strSecond);
        // Вывод значения строки после конкатенации. Класс referenceType, переменная strSecond
        System.out.println(Arrays.toString(referenceType.arrays));
        // Вывод значений массива в консоль.

        System.out.println(primitiveType.intNumber);
        // Вывод значения int, переменной intNumber консоль. Класс primitiveType
        System.out.println(primitiveType.shortNumber);
        // Вывод значения short, переменной shortNumber консоль. Класс primitiveType
        System.out.println(primitiveType.floatNumber);
        // Вывод значения float, переменной shortNumber консоль. Класс primitiveType
        System.out.println(primitiveType.doubleNumber);
        // Вывод значения double, переменной shortNumber консоль. Класс primitiveType


        char cc = '1';
        System.out.println(Character.isDigit(cc)); // true // -> проверка на число в переменной cc.
        char cc1 = 'a';
        System.out.println(Character.isDigit(cc1)); // false // -> проверка на число в переменной cc1,

    }

}
