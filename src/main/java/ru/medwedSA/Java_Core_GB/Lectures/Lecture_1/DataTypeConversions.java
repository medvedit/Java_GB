/*
 *      Явные и не явные преобразования:
 *
 *                    char
 *                     ↓
 *     byte → short → int → long
 *                     ↓  ⤩  ↓
 *                   float  double
 */

package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

public class DataTypeConversions {
    public static void main(String[] args) {

        int i = 123;
        double d = i;
        System.out.println(i); // 123
        System.out.println(d); // 123.0

        i = (int)d;
        d = 3.1415;
        System.out.println(d); // 3.1415
        System.out.println(i); // 123

        d = 3.9415; i = (int)d;
        System.out.println(d); // 3.9415
        System.out.println(i); // 3

        d = Byte.parseByte("123");
        System.out.println(d); // 123.0
        // d = Byte.parseByte("1234"); // в byte 4 символа не войдет.
        // System.out.println(d); // NumberFormatException: Value out of range


        // Просто так массив int положить в массив double не получится, нужны костыли.
        // int[] a = new int[10];
        // double[] c = a;   // ИЗУЧАЕМ!!! ИНВАРИАНТЫ -> ковариантность и контравариантность

    }
}
