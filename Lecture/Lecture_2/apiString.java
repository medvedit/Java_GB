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
    Создать строку из 1 млн плюсиков. Как?
    String str = "";
    for (int i = 0; i < 1_000_000; i++) {
    str += "+"; }
    // ≈41000 ms

    Простой пример
    Создать строку из 1 млн плюсиков. Как?
    StringBuilder sb = new StringBuilder(); for (int i = 0; i < 1_000_000; i++) {
    sb.append("+"); }
    // ≈9 ms

     String vs StringBuilder:

    Много изменений – String
    Много преобразований – StringBuilder


 */

package Java_GB.Lecture.Lecture_2;

public class apiString {

    public static void main(String[] args) {

        // sealSymbol(); // печать символов.
        stringArray(); // работа с массивом строк.

    }
    static void sealSymbol(){
        var s = System.currentTimeMillis();
        // String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            // str += "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
        // System.out.println(str);
        // System.out.
    }
    static void stringArray(){
        String[] name = { "C", "е", "р", "г", "е", "й" }; // массив строк.
        String sk = "СЕРГЕЙ КА."; // строка
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("!", name)); // C!е!р!г!е!й
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й")); // Сергей
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й")); // C,е,р,г,е,й
    }


}
