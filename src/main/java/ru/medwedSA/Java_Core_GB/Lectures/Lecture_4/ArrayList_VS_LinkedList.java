/**
*************************************************************************************
*  Замеры времени печатаются в консоль для списков без запуска в потоках и с
*  использованием потоков. Сохраненные замеры, в комментариях ниже, указаны
*  для списков без использования потоков.
*
*  * Использовал выполнение замеров на скорость выполнения определенных действий
*    со списками, с использованием потоков, только для своего любопытства.
*************************************************************************************
         До начала всех замеров списки уже сформированы определенной,
   одинаковой длинны (константа SIZE) и заполнены единицами (константа VALUE).

     Итак, замеры затраченного времени на выполнение следующих операций:
   (в выводе времени: до запятой миллисекунды, после запятой наносекунды)

============== Заполнить список ==================
--- Добавить элементы (30kk)
ArrayList: 7945,152830 ms
LinkedList: 38927,335630 ms
ArrayList -> Быстрее в 4,900 раза!!!

============== Add =================
--- Add  Вставьте элементы в начало (30kk)
ArrayList: 588,027330 ms
LinkedList: 0,420070 ms
LinkedList -> Быстрее в 1399,832 раза!!!

--- Add  Вставить элементы в середину (6kk)
ArrayList: 18,545280 ms
LinkedList: 132,999070 ms
ArrayList -> Быстрее в 7,172 раза!!!

--- Add  Вставить элементы в конец (6kk)
ArrayList: 1,777590 ms
LinkedList: 0,577100 ms
LinkedList -> Быстрее в 3,080 раза!!!

============== Remove ================
---  Remove  Удалить элемент из начала ( 6kk )
ArrayList: 38,669930 ms
LinkedList: 0,303510 ms
LinkedList -> Быстрее в 127,409 раза!!!

--- Remove  Удалить элементы из середины ( 6kk )
ArrayList: 77,082600 ms
LinkedList: 254,611940 ms
ArrayList -> Быстрее в 3,303 раза!!!

--- Remove  Удалить элементы с конца ( 6kk )
ArrayList: 0,439800 ms
LinkedList: 0,944830 ms
ArrayList -> Быстрее в 2,148 раза!!!

============== Get ===================
--- Get  Получить элементы из начала ( 6kk )
ArrayList: 0,152140 ms
LinkedList: 0,331250 ms
ArrayList -> Быстрее в 2,177 раза!!!

--- Get  Получить элементы из середины ( 6kk )
ArrayList: 0,132350 ms
LinkedList: 253,817130 ms
ArrayList -> Быстрее в 1917,772 раза!!!

--- Get  Получить элементы с конца ( 6kk )
ArrayList: 0,173270 ms
LinkedList: 0,645350 ms
ArrayList -> Быстрее в 3,725 раза!!!

============== Set ===================
--- Set  Установить элементы в начале ( 10kk )
ArrayList: 0,552070 ms
LinkedList: 0,278510 ms
LinkedList -> Быстрее в 1,982 раза!!!

--- Set  Установить элементы посередине ( 10kk )
ArrayList: 0,819860 ms
LinkedList: 210,979290 ms
ArrayList -> Быстрее в 257,336 раза!!!

--- Set  Установить элементы в конце ( 10kk )
ArrayList: 0,759060 ms
LinkedList: 0,317160 ms
LinkedList -> Быстрее в 2,393 раза!!!

=====================================                                    =====================================
                                     ==============Finish================
=====================================                                    =====================================
 */

package ru.medwedSA.Java_Core_GB.Lectures.Lecture_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayList_VS_LinkedList {

    private final static int SIZE = 10_000_000; // Размер списка.
    private final static int INDEX = SIZE - 1; // Тат можно менять значение index(а) для работы
                                               // методов add, remove, set, get.
    private final static int VALUE = 1; // То, какими значениями заполнить списки при их формировании.
    private static long res1; // Сохраняет затраченное время выполнения метода insertInMiddle для arrThread.
    private static long res2; // Сохраняет затраченное время выполнения метода insertInMiddle для linThread.

    public static void main(String[] args) throws InterruptedException {


        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("""
                \n--- Работа с ArrayList и LinkedList без использования проков.
                --- Размеры списков и количество итераций задано в константах.
                --- Затраченное время и разницу в затраченном времени - всё перед вашими глазами..
                """);

        initList(arrayList); // Создание списка в замер времени выполнения не включено.
        long startAddArrayTime = System.nanoTime();
//        arrayList.add(INSERT, 1234);
//        arrayList.remove(INSERT);
//        arrayList.get(INSERT);
        arrayList.set(INDEX, 1234);
        long arrayListTime = System.nanoTime() - startAddArrayTime;
        System.out.printf("ArrayList: %.6f ms%n", (double) arrayListTime / 100_000); // Деление результата на 100_000
                                                                // дает возможность отделить миллисекунды от наносекунд.

        initList(linkedList); // Создание списка в замер времени выполнения не включено.
        long startAddLinkedTime = System.nanoTime();
//        linkedList.add(INSERT, 1234);
//        linkedList.remove(INSERT);
//        linkedList.get(INSERT);
        linkedList.set(INDEX, 1234);
        long linkedListTime = System.nanoTime() - startAddLinkedTime;
        System.out.printf("LinkedList: %.6f ms%n", (double) linkedListTime / 100_000); // Деление результата на 100_000
                                                                // дает возможность отделить миллисекунды от наносекунд.

        if (linkedListTime < arrayListTime) {
            double count = (double) arrayListTime / linkedListTime;
            System.out.printf("LinkedList -> Быстрее в %.3f раза!!!\n\n", count);
        } else {
            double count = (double) linkedListTime / arrayListTime;
            System.out.printf("ArrayList -> Быстрее в %.3f раза!!!\n\n", count);
        }



    /* Работа со списками ArrayList и LinkedList с реализацией запуска этих списков в отдельных потоках. */

        List<Integer> arrayListThread = new ArrayList<>();
        List<Integer> linkedListThread = new LinkedList<>();

        System.out.println("""
                \n--- Работа с ArrayList и LinkedList с использованием проков.
                --- Размеры списков и количество итераций задано в константах.
                --- Затраченное время и разницу в затраченном времени - всё перед вашими глазами..
                """);

        Thread arrThread = new Thread(() -> {
            initList(arrayListThread);
            res1 = insertInMiddle(arrayListThread); // Метод возвращает затраченное потоком время.
        });

        Thread linThread = new Thread(() -> {
            initList(linkedListThread);
            res2 = insertInMiddle(linkedListThread); // Метод возвращает затраченное потоком время.
        });

        arrThread.start(); // Поток - старт.
        linThread.start(); // Поток - старт.
        arrThread.join(); // Поток - ожидает завершения выполнения работы другим потоком. И только после этого
                          // возвращает получение во время работы значение res1 записывая его в константу.
        linThread.join(); // Поток - ожидает завершения выполнения работы другим потоком. И только после этого
                          // возвращает получение во время работы значение res2 записывая его в константу.

        /* Сравнение результатов и вывод разницы в выполнении относительно затраченного времени. */
        if (res1 < res2) {
            System.out.printf("ArrayList -> Быстрее в %.3f раза!!!\n\n", (double) res2 / res1);
        }
        if (res1 > res2) {
            System.out.printf("LinkedList -> Быстрее в %.3f раза!!!\n\n", (double) res1 / res2);
        }
    }

    private static void initList(List list) { // Метод заполнения списка.
        for (int i = 0; i < SIZE; i++) {
            list.add(VALUE); // VALUE - заданная константа.
        }

    }

    private static long insertInMiddle(List list) { // Замеры выполнения добавления, удаления и т.д. для потоков.
                                                    // Без учёта формирования самого списка.
        long startTime = System.nanoTime();
//        list.add(INSERT, 1234);
//        list.remove(INSERT);
//        list.get(INSERT);
        list.set(INDEX, 1234);
        long resultTime = System.nanoTime() - startTime;
        System.out.printf("%s: %.6f ms%n", list.getClass(), (double) resultTime / 100_000);

        return resultTime; // Вернет в метод запуска потока - результат затраченного времени на выполнения метода.
    }
}
