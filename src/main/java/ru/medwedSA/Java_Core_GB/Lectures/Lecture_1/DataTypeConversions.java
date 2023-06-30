package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

/*
 *      Явные и не явные преобразования:
 *
 *                    char
 *                     ↓
 *     byte → short → int → long
 *                     ↓  ⤩  ↓
 *                   float  double
 */

public class DataTypeConversions {
    public static void main(String[] args) {

        int i = 123;
        double d = i;
        System.out.println(i); // 123
        System.out.println(d); // 123.0

        i = (int)d; // явное преобразование double в int.
        d = 3.1415;
        System.out.println(i); // 123
        System.out.println(d); // 3.1415

        d = 3.9415;
        i = (int)d; // явное преобразование double в int.
        System.out.println(d); // 3.9415
        System.out.println(i); // 3

        d = Byte.parseByte("123"); // Явное преобразование. Проверка строки - состоит из цифр, если да, то приводим
                                      // их в тип данных byte. Если цифры поменяются в byte, то явно приводим к
                                      // типу данных double.
        System.out.println(d); // 123.0
        // d = Byte.parseByte("1234"); // в byte 4 символа не войдет.
        // System.out.println(d); // NumberFormatException: Value out of range


        // Просто так массив int положить в массив double не получится, нужны костыли.
        // int[] a = new int[10];
        // double[] c = a;   // ИЗУЧАЕМ!!! ИНВАРИАНТЫ -> ковариантность и контравариантность
        // Посмотрел тут -> https://www.youtube.com/watch?v=2yeFSrcTQh8

    }
}
