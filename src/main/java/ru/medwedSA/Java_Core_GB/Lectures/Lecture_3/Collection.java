package ru.medwedSA.Java_Core_GB.Lectures.Lecture_3;

/*
    ArrayList - «Удобный массив».
    Способ создания:
    ArrayList list = new ArrayList();

    Иерархия коллекций:
    List – пронумерованный набор элементов.
    Пользователь этого интерфейса имеет точный контроль над тем,
    где в списке вставляется каждый элемент.
    Пользователь может обращаться к элементам по их целочисленному индексу (позиции в списке) и искать элементы в списке.
    URL -> https://docs.oracle.com/javase/8/docs/api/java/util/List.html
    ArrayList, LinkedList (Vector, Stack – устаревшие)

    Коллекции.
    Функционал:
    add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
    get(pos) – возвращает элемент из списка по указанной позиции
    indexOf(item) – первое вхождение или -1
    lastIndexOf(item) – последнее вхождение или -1
    remove(pos) – удаление элемента на указанной позиции и его возвращение
    set(int pos, T item) – помещает значение item элементу, который находится на позиции pos
    void sort(Comparator) – сортирует набор данных по правилу
    subList(int start, int end) – получение набора данных от позиции start до end
    clear() – очистка списка
    toString() – «конвертация» списка в строку
    Arrays.asList – преобразует массив в список
    containsAll(col) – проверяет включение всех элементов из col
    removeAll(col) – удаляет элементы, имеющиеся в col
    retainAll(col) – оставляет элементы, имеющиеся в col
    toArray() – конвертация списка в массив Object’ов
    toArray(type array) – конвертация списка в массив type
    List.copyOf(col) – возвращает копию списка на основе имеющегося
    List.of(item1, item2,...) – возвращает неизменяемый список
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {

    public static void main(String[] args) {

        arrayListObjectAndInteger();

        arrayList();
        arrayList1();
        arrayList2();
        arrayList3();
    }

    private static void arrayListObjectAndInteger() {
        ArrayList<Object> list = new ArrayList<>(); // Пример с "сырым типом", когда явно не указали какие объекты
                                                    // могут храниться в коллекции. При этом условии в объект list можно
                                                    // класть как строки, так и целые числа. Если при объявлении
                                                    // ArrayList list явно указать тип <Integer>, то добавление строк
                                                    // в list не скомпилируется!
        list.add(234 + " = Integer");
        list.add(" + String line ...");
        list.add(" + Added a value to an existing one.");

        for (Object o : list) {
            System.out.print(o);
        }
        System.out.println();

        List<Integer> listInt = new ArrayList<>(); // Пример с указанным типом. Явно указано обобщение <Integer>.
                                                   // И в этом случае возможна работа только с типом Integer.
        listInt.add(1);
        listInt.add(123);
//        listInt.add("string line"); // добавление строки в коллекцию целых чисел НЕ ВОЗМОЖНО!
        for (Integer o : listInt) {
            System.out.println(o);
        }
        System.out.println("\n");
    }

//     Разные способы создания:
//     ArrayList<Integer> list1 = new ArrayList<Integer>(); // создание коллекции хранящей ТОЛЬКО Integer.
//     ArrayList<Integer> list2 = new ArrayList<>(); // можно не указывать второй раз <Integer>.
//     ArrayList<Integer> list3 = new ArrayList<>(10); // изначально в новом массиве храниться 10 элементов.
//     ArrayList<Integer> list4 = new ArrayList<>(list3); // создали коллекцию на основе предыдущей.

    public static void arrayList() {
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = {day, month, year};
        List<Integer> d = Arrays.asList(date);
//        List<Integer> d = new ArrayList<>(List.of(date));
//        d.add(4);
//        d.set(3, 333);
//        date[2] = 8;

        System.out.println(d); // [29, 9, 1990]
        System.out.println(getType(d));

        System.out.println("\n");
    }

    public static void arrayList1() {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = {day, month, year};
        List<StringBuilder> d = Arrays.asList(date);

        System.out.println(d); // [29, 9, 1990]
        date[1] = new StringBuilder("09");
        System.out.println(d); // [29, 09, 1990]

        System.out.println("\n");
    }

    public static void arrayList2() {

        // Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list1);
        // list1.remove(1); // java.lang.UnsupportedOperationException -> в этом случае при желании
                            // удалить элемент получим ошибку, тк использован метод создания массива List.of
        List<Character> list2 = new ArrayList<>(List.copyOf(list1));
        list2.remove(1);
        System.out.println(list2);

        System.out.println("\n");
    }

    public static void arrayList3() {
//        Character value = null;
        List<Character> list1 = new ArrayList<Character>();
        list1.add('S');
        list1.add('e');
        list1.add('r');
        System.out.println(list1);
        list1.remove(1); // в этом случае удаление возможно.
        System.out.println(list1);
        List<Character> list2 = new ArrayList<>(List.copyOf(list1));
        list2.add(1, 't');
        System.out.println(list2);

        System.out.println("\n");
    }

    private static boolean getType(Object obj) { // Метод выводит -> класс + имя класса.
        System.out.println(obj.getClass().getName());
        return false;
    }
}
