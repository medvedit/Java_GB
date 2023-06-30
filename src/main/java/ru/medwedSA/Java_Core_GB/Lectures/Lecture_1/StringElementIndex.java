package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

/*
 * String - ЭТО ССЫЛОЧНЫЙ ТИА ДАННЫХ!
 * Обращение к индексу на примере строки.
 */

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringElementIndex {
    public static void main(String[] args) {
        String str = "denote";
        str.charAt(1); // обращение к индексу строки.
        System.out.println(str.charAt(1)); // e -> вывод значения первого индекса строки.
        System.out.println(str.length()); // получение длины строки.
        System.out.println(Arrays.toString(str.getBytes(StandardCharsets.UTF_8))); // вывод в консоль
                                                                             // массива хеш кодов символов строки.
    }

}
