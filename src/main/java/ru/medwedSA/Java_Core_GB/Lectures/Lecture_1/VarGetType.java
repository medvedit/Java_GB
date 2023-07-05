package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

/*
 * Не явная типизация:
 * Что бы определить к какому типу данных приведено значение перемененной var (не явная типизация)
 * используется метод getType.
 */
public class VarGetType {
    public static void main(String[] args) {
        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456
        System.out.println(getType(a)); // Integer
        System.out.println(getType(d)); // Double
        d = 1022;
        System.out.println(d); // 1022.0
        // d = "mistake";
        // error: incompatible types:
        // String cannot be converted to double
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

}