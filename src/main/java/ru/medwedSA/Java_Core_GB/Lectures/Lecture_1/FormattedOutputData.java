package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

/*
 * Форматированный вывод данных.
 * Плейсхолдеры.
 */

public class FormattedOutputData {
    public static void main(String[] args) {

        // Конкатенация строк (сцепление) — это операция объединения строк. Для этой цели используется знак "+".
        // Пример ниже, больше для форматированного вывода, а не для подорожания))))
        // т.к. при этом решении было создано пять строк, что дает большую просадку
        // выполнения кода. И лучше для таких целей использовать StringBuilder
        // почитать тут -> (https://metanit.com/java/tutorial/7.3.php)
        int a = 3;
        int b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);

        // Использование format:
        int f = 3;
        int g = 6;
        int s = f + g;
        String rez = String.format("%d + %d = %d", f, g, s); // Для использования в дальнейшем по коду форматированного вывода
                                                                    // занесли его в переменную rez через String.format.
        System.out.printf("%d + %d = %d%n",f ,g ,s); // только для вывода достаточно printf.
                // Подробнее о спецификаторах формата
                // можно почитать тут -> (https://javarush.com/groups/posts/1412-formatiruem-vihvod-chisel-v-java)
        System.out.println(rez);


        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500 
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00


    }

}
