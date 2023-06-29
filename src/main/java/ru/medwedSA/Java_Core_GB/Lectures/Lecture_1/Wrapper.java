/*
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
package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;


/**
 * wrapper - обертка.
 */
public class Wrapper {
    public static void main(String[] args) {
        int i = 1_231_456; // для удобной читаемости большие значения можно разделять нижним подчеркиванием.
        System.out.println(i); //123
        // обращение через обертку.
        System.out.println(Integer.MAX_VALUE); // 2147483647 -> запросили через Integer.MAX_VALUE максимально возможное значение int.
        System.out.println(Integer.MIN_VALUE); // -2147483648 -> так же с минимальным значением.
        System.out.println(Integer.toString(i)); // 123 -> уже строка.
    }

}