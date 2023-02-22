/*
    LinkedList -> Представляет собой двусвязный список.

    Список – гибкая структура данных, позволяющая легко менять свой размер.
    Элементы доступны для вставки или удаления в любой позиции.

    Список -> абстрактная структура данных. Это такая структура данных,
    для которой известно, что на текущем этапе и что на следующем этапе.

    Мотивация.
    LinkedList нужен для небольшого количества элементов,
    в которых операции добавления\удаления встречаются чаще операций чтения.

 */

package Java_GB.Lecture.Lecture_4;

import java.util.LinkedList;

public class linkedList_1 {

    public static void main(String[] args) {

        System.out.println(outLinkedListInteger());
        System.out.println(outLinkedListString());

    }

    public static LinkedList<Integer> outLinkedListInteger() {

        LinkedList<Integer> linList = new LinkedList<Integer>();

        linList.add(1);
        linList.add(2);
        linList.add(3);
        linList.add(8);
        linList.add(5);
        linList.add(2, 10); // добавление по index
        linList.remove(1); // удаление по index ... Все работает, как и для простого list
        return linList;
    }

    public static LinkedList<String> outLinkedListString() {

        String str1 = new String("Hello World!");
        String str2 = new String("My name is Earl");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Moscow");

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(str3);
        earlBio.add(str4);
        return earlBio;
    }

}