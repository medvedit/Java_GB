/*
 *  Присваивание:        =
 *  Арифметические:      *, /, +, -, %, ++, -- (++ инкремент, -- декремент)
 *  Операции сравнения:  <, >, ==, !=, <=, >=
 *  Логические операции: ||, &&, ^, !
 *  Побитовые операции:  <<, >>, &, |, ^
 */
package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

public class LogicalOperationsJava {
    public static void main(String[] args) {
        int a = 123;
        a++; // инкремент.
        System.out.println(a); // 124

        int b = 123;
        System.out.println(b++); // казалось бы добавили инкремент, но получим значение 123 !!! (ПОСТФИКСНЫЙ
                                 // ИНКРЕМЕНТ)
        System.out.println(b); // НО при следующем вызове на печать получаем 124 !!!
                               // т.к. приоритет вызова операции инкремента в строке 17 НИЖЕ ЧЕМ ПРИОРИТЕТ вызова
                               // значения в консоль.
                               // И именно поэтому в строке 17 мы видим вначале вывод БЕЗ ИЗМЕНЕНИЙ, а уже в
                               // строке 19 вызов после инкремента.
        // Если изменить приоритет, то:
        int b1 = 123;
        System.out.println(++b1); // 124 -> операция инкремента приоритетнее операции печати в консоль.
                                  // (ПРЕФИКСНЫЙ ИНКРЕМЕНТ)
        boolean flag1 = 123 >= 345;
        System.out.println(flag1); // false
        boolean flag2 = 123 <= 888;
        System.out.println(flag2); // true
        boolean flag3 = 123 != 99;
        System.out.println(flag3); // true
        boolean flag4 = flag3 ^ flag2;
        System.out.println(flag4); // false

        // || -> конъюнкция
        // && -> дизъюнкция
        // ^ -> разделительная дизъюнкция
        // ! -> инверсия

        int l = 8;
        // 1000 -> двоичный код.
        // l = l << 1; // сдвигаем влево на 1 бит.
        System.out.println(l << 1); // получим в ответе число 16 или,
        // 10000 в двоичном коде.
        int p = 18;
        // 10010 -> двоичный код.
        System.out.println(p >> 1); // 9
        // 1001 в двоичном коде.

        int n = 5;
        int m = 2;
        System.out.println(n | m); // 7 звучит как 5 ИЛИ 2 и считается в двоичном исполнении:
        // 101 -> 5
        // 010 -> 2
        // 111 -> 7
        int g = 6;
        int q = 3;
        System.out.println(g & q); // 2
        // 110 -> 6
        // 011 -> 3
        // 010 -> 2
        int u = 7;
        int z = 4;
        System.out.println(u ^ z); // 3
        // 111 -> 7
        // 100 -> 4
        // 011 -> 3

        String h = "unary"; // длинна 5, индекс 0...4
        boolean y = h.length() >= 4 && h.charAt(3) == 'r'; // true двойной знак && -> быстрая операция. Левую часть
                                                                // смотрит, а правую может и не смотреть.
        boolean c = h.length() >= 4 & h.charAt(4) == 'u'; // false
        System.out.println(y);
        System.out.println(c);

    }
}
