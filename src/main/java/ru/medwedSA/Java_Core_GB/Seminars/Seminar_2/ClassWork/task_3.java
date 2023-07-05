package ru.medwedSA.Java_Core_GB.Seminars.Seminar_2.ClassWork;

/*
 * Напишите метод, который принимает на вход строку (String) и
 * определяет является ли строка палиндромом (возвращает boolean значение).
 */

public class task_3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("мадам"));
        System.out.println(isPalindrome2("мадам"));
        isPalindrome3("мадам");
        System.out.println(isPalindrome4("мадам"));
    }

    public static boolean isPalindrome(String str) { // Полный цикл переворачивания слова и затем сравнение.

        str = str.replaceAll("\\s", "");
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return str.equals(reverseStr);
    }


    static boolean isPalindrome2(String str) { // Проход в половину длинны слова
        char[] strX = str.toCharArray();
        int y = strX.length - 1;
        for (int i = 0; i < strX.length / 2; i++) {
            if (strX[i] != strX[y - i]) {
                return false;
            }
        }
        return true;
    }


    public static void isPalindrome3(String str) { // использование стандартного API
        StringBuilder invertString = new StringBuilder(str).reverse();
        if (str.contentEquals(invertString)) {
            System.out.printf("Строка %s - палиндром\n", str);
        } else {
            System.out.printf("Строка %s - не палиндром\n", str);
        }
    }


    public static boolean isPalindrome4(String str) { // использование стандартного API
        return (str.contentEquals(new StringBuilder(str).reverse()));
    }

}
