package ru.medwedSA.Java_Core_GB.Lectures.Lecture_2;


/*
 *  Что такое API:
    API (Application programming interface) —
    это контракт, который предоставляет программа. «Ко мне можно обращаться так и так,
    я обязуюсь делать то и это».

    Что такое API для нас: строки

    concat(): объединение строк
    valueOf(): преобразует Object в строковое представление (завязан на toString())
    join(): объединяет набор строк в одну с учетом разделителя
    charAt(): получение символа по индексу
    indexOf(): первый индекс вхождения подстроки
    lastIndexOf(): последний индекс вхождения подстроки
    startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
    replace(): замена одной подстроки на другую
    trim(): удаляет начальные и конечные пробелы
    substring(): возвращает подстроку, см.аргументы
    toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
    compareTo(): сравнивает две строки
    equals(): сравнивает строки с учетом регистра
    equalsIgnoreCase(): сравнивает строки без учета регистра
    regionMatches(): сравнивает подстроки в строках

    Простой пример
    Создать строку из 1 млн плюсик(ов). Как?
    String str = "";
    for (int i = 0; i < 1_000_000; i++) {
    str += "+"; }
    // ≈41000 ms

    Простой пример
    Создать строку из 1 млн плюсик(ов). Как?
    StringBuilder sb = new StringBuilder(); for (int i = 0; i < 1_000_000; i++) {
    sb.append("+"); }
    // ≈9 ms

     String vs StringBuilder: // наглядно показано в методе stringVsStringBuilder()

    При поиске вхождений в строке – Выгоднее использовать -> String (является immutable)
    Много изменении или много добавлений в строку – Выгоднее использовать -> StringBuilder (является mutable)
 */

public class stringVsStringBuilder {

    public static void main(String[] args) {

        stringVsStringBuilder(); // печать символов.
        stringArray(); // работа с массивом строк.
    }

    static void stringVsStringBuilder() {
        long s = System.currentTimeMillis();
        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
        System.out.printf("Затрачено время с использованием StringBuilder: " +
                "%s миллисекунд.\n", System.currentTimeMillis() - s);

        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }
        System.out.printf("Затрачено время с использованием String: " +
                "%s миллисекунд.", System.currentTimeMillis() - s);
    }


    static void stringArray() {
        String[] stringData = {"C", "е", "р", "г", "е", "й"}; // массив строк.
        String string = "СЕРГЕЙ КА."; // строка
        System.out.println(string.toLowerCase()); // сергей ка.
        System.out.println(String.join("!", stringData)); // C!е!р!г!е!й
        System.out.println(String.join("", stringData)); // Сергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й")); // Сергей
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й")); // C,е,р,г,е,й
    }
}
