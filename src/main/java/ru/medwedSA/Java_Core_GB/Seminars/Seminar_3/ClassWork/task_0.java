package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.ClassWork;

/*
 * Даны следующие строки, сравнить их с помощью == и метода equals() класса Object
 */

public class task_0 {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // true
        System.out.println(s1.equals(s5)); // true
        System.out.println(s1.equals(s6)); // true
        System.out.println();
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4); // true
        System.err.println(s1 == s5); // false
        System.out.println(s1 == s6); // false
    }
}
