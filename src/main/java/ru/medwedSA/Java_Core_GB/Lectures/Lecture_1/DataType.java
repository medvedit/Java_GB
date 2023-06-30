package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

import java.util.Arrays;


/**
 * В языке Java типы данных делятся на две группы:
 *  1) Ссылочные
 *  2) Примитивные
 *  ниже в коде создание переменных с присвоением типа и значения. Вывод в консоль значения переменных.
 */
public class DataType {

    public static String getType(Object o) { // метод определения типа данных.
        return o.getClass().getSimpleName();
    }

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

        int num = 1234567887;


        System.out.println(referenceType.strFirst);
        // Вывод начального значения строки. Класс referenceType, переменная strFirst
        System.out.println(referenceType.strSecond);
        // Вывод значения строки после конкатенации. Класс referenceType, переменная strSecond
        System.out.println(Arrays.toString(referenceType.arrays));
        // Вывод значений массива в консоль.

        System.out.println(primitiveType.intNumber - num); // При выводе посчитали арифметическое значение.
        // Вывод значения int, переменной intNumber консоль. Класс primitiveType
        System.out.println(getType(primitiveType.intNumber));
        // Вывод в консоль типа данных переменой intNumber
        System.out.println(primitiveType.shortNumber);
        // Вывод значения short, переменной shortNumber консоль. Класс primitiveType
        System.out.println(primitiveType.floatNumber);
        // Вывод значения float, переменной shortNumber консоль. Класс primitiveType
        System.out.println(primitiveType.doubleNumber);
        // Вывод значения double, переменной shortNumber консоль. Класс primitiveType

        /*
        * тип данных char - определяет один символ, указывается в одинарных кавычках.
        */
        char ch = 38; // Если в переменную char положить целое число, то тип данных char воспримет это число
                      // как хеш код и в таблице символов, по номеру этого хеш кода присвоит значение.
        System.out.println(ch); // вывод значения char по хеш коду 38.
        char ch1 = '1'; // создал и присвоил значение.
        System.out.println(Character.hashCode(ch1)); // можно посмотреть хеш код в таблице символов.
        System.out.println(Character.isDigit(ch1)); // true // -> проверка на число в переменной cc.
        char ch2 = 'a'; // создал и присвоил значение.
        System.out.println(Character.isDigit(ch2)); // false // -> проверка на число в переменной cc1,

    }

}
