package ru.medwedSA.Java_Core_GB.Seminars.Seminar_1.HomeWork;

/*
 * Вывести все простые числа от 1 до 1000
 */

public class task_2 {
    public static void main(String[] args) {
        primeNumbers();
    }

    static void primeNumbers(){
        System.out.printf("%d %d ", 2, 3);
        for (int i = 2; i <= 1_000; i++) {
            boolean primeNun = true;
            double tempNum = Math.sqrt(i) + 2;
            int r = 2;
            while (r <= tempNum && primeNun) {
                if (i % r == 0)
                    primeNun = false;
                r++;
            }
            System.out.print(primeNun ? (i + " ") : "");
        }
    }
}
