package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

/*
 *  Wrapper - обертка.
 *
 *      Примитив            Обертка
 *
 *      int                 Integer
 *      short               Short
 *      long                Long
 *      byte                Byte
 *      float               Float
 *      double              Double
 *      char                Character
 *      boolean             Boolean
 */

import static ru.medwedSA.Java_Core_GB.Lectures.Lecture_1.DataType.getType;

public class Wrapper {
    public static void main(String[] args) {
        int i = 1_231_231; // для удобной читаемости большие значения можно разделять нижним подчеркиванием.
        System.out.println(i); // 1231231 -> целое число.
        System.out.println(getType(i)); // Integer
        // обращение через обертку.
        System.out.printf("Максимальное значение переменной Integer = %d\n",Integer.MAX_VALUE); // вывод в консоль.
        System.out.printf("Минимальное значение переменной Integer = %d\n",Integer.MIN_VALUE); // вывод в консоль.
        String str = Integer.toString(i); //явное приведение Integer к String
        System.out.println(str); // 1231231 -> уже строка.
        System.out.println(getType(str)); // String
    }

}