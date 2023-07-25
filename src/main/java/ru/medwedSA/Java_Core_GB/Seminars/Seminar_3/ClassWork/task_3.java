package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.ClassWork;

/*
 * Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
 * что на index 0 позиции каждого внутреннего списка содержится название жанра,
 * а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.

 */

import java.util.ArrayList;
import java.util.List;

public class task_3 {
    public static void main(String[] args) {

        ArrayList<String> textList = new ArrayList<>(); // создали пустой список, дали имя textList.


        List<ArrayList<String>> textArrList = new ArrayList<>(); // список textList вложили во-внутрь
                                                                // созданного списка textArrList.

        textList.add("Басни");              // Заголовок, элемент 0, название жанра.
        textList.add("Мартышка и очки");    // далее перечисление книг.
        textList.add("Ворона и Лисица");    // и все это добавлено в первый созданный список...
        textList.add("Лебедь, Рак и Щука"); // ...

        textArrList.add(textList); // Перенесли всю "колонку столбца" во внутренний список. Получили список списков.
        // System.out.println(textArrList); // тут можно это увидеть.

        for (List<String> item : textArrList) { // обращаемся к внутреннему списку, и

            if (item.get(0).equals("Басни")){ // если элемент на позиции 0 равен "Басни", то
                System.out.println(item); // выведи весь список.
            }

        }

    }

}
