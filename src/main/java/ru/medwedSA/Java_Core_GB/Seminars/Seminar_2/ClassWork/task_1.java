package ru.medwedSA.Java_Core_GB.Seminars.Seminar_2.ClassWork;

/**
 * Задание №1
 * Дано четное число N (>0) и символы с1 и с2.
 * Написать метод, который сформирует строку длины N.
 * Строка длины N  состоит из чередующихся символов с1 и с2, начиная с с1
 */

public class task_1 {

    public static void main(String[] args) {

        createStringBuilderFromSymbols(90_000, 'a', 'b');
        createStringBuilderFromSymbols2(7, 'r', 'e');
        createStringFromSymbols(90_000, 's', 'k');

    }

    public static void createStringBuilderFromSymbols(int n, char c1, char c2) {
        long start = System.currentTimeMillis();
        StringBuilder SBResult = new StringBuilder();
        for (int i = 0; i < n/2; i++) { // Делим на 2, т.к. за один проход добавляем два символа.
            SBResult.append(c1);
            SBResult.append(c2);
        }
//        System.out.println(SBResult); // Вывод в консоль всех символов сформированной строки. НЕ СТОИТ!
        System.out.printf("Затрачено время при использовании StringBuilder -> %s миллисекунд\n",
                System.currentTimeMillis() - start);
    }

    public static void createStringBuilderFromSymbols2(int n, char c1, char c2) {
        long start = System.currentTimeMillis();
        StringBuilder SBResult = new StringBuilder();
        if (n / 2 == 0) {
            for (int i = 0; i < n; i++) {
                SBResult.append(i / 2 == 0 ? c1 : c2);
            }
//            System.out.println(SBResult); // Вывод в консоль всех символов сформированной строки. НЕ СТОИТ!
            System.out.printf("Затрачено время при использовании StringBuilder -> %s миллисекунд\n",
                    System.currentTimeMillis() - start);
        }
        System.out.println("По условию задания n == чётное число.");
    }

    public static void createStringFromSymbols(int n, char c1, char c2) {
        long start = System.currentTimeMillis();
        String StrResult = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                StrResult += c1;
            else
                StrResult += c2;
        }
//        System.out.println(StrResult); // Вывод в консоль всех символов сформированной строки. НЕ СТОИТ!
        System.out.printf("Затрачено время при использовании String -> %s миллисекунд",
                System.currentTimeMillis() - start);
    }

}
