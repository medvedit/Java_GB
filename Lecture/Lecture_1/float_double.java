/*
 * Типы данных в java делятся на две группы: Примитивные -> boolean, int, short, long и т.д. float, double, Char
 *                                           Ссылочные ->  и о них немного позже...
 * Особенность инициализации переменной, тип данных float.
 *
 */
package Java_GB.Lecture.Lecture_1;

public class float_double {
    public static void main(String[] args) {
        float e = 2.7f; //тип float требует к присвоенному значению добавления буквы f. Для float это обязательно!!!
        System.out.println(e); // 2.7 //sys
        double pi = 3.1323d;  // у типа double добавление буквы не обязательно, но можно добавлять d.
        System.out.println(pi); //3.1323 //sys
        String s = "  2";
        System.out.println(s); //   2
        short ch = 12;
        System.out.println(ch); //12
        int i = 12345;
        System.out.println(i); //12345
        char cc = '1';
        System.out.println(Character.isDigit(cc)); // true // -> проверка на число в переменной cc.
        char cc1 = 'a';
        System.out.println(Character.isDigit(cc1)); // false // -> проверка на число в переменной cc1,
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false


    }
}
