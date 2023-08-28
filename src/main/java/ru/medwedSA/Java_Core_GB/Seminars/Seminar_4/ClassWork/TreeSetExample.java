package ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.ClassWork;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<String> states = new TreeSet<String>();
        /* Если в TreeSet требуется "на выходе" получить отсортированный список, при условии, что в списке хранятся
           не цифры или слова - что все хорошо реализуется самостоятельно в реализации класса TreeSet, а например
           список сотрудников с разными данными для каждого сотрудника. То, в этом случае можно прописать свои
           собственные критерии для сортировки, с помощью implements Comparator<...>
           Пример: Java_Core_GB/Seminars/Seminar_4/ClassWork/Comparator */

        states.add("Germany"); // Добавим в список ряд элементов
        states.add("France"); // Добавим в список ряд элементов
        states.add("Italy"); // Добавим в список ряд элементов
        states.add("Great Britain"); // Добавим в список ряд элементов

        System.out.printf("TreeSet contains %d elements \n", states.size()); // Вывод: TreeSet contains 4 elements

        states.remove("Germany"); // Удаление элемента

        for(String state : states){
            System.out.println(state); // Вывод: France
//                                               Great Britain
//                                               Italy
        }


        /* Так как TreeSet реализует интерфейс NavigableSet, а через него и SortedSet, то мы можем применить к
           структуре дерева различные методы: */

        TreeSet<String> statesSet = new TreeSet<String>();

        // добавим в список ряд элементов
        statesSet.add("Germany");
        statesSet.add("France");
        statesSet.add("Italy");
        statesSet.add("Spain");
        statesSet.add("Great Britain");

        System.out.println(statesSet.first()); // получим первый - самый маленький элемент
        System.out.println(statesSet.last()); // получим последний - самый большой элемент
        SortedSet<String> set = statesSet.subSet("Germany", "Italy"); // получим под набор от одного элемента до другого
        System.out.println(set);
        String greater = statesSet.higher("Germany"); // элемент из набора, который больше текущего
        String lower = statesSet.lower("Germany"); // элемент из набора, который меньше текущего
        NavigableSet<String> navSet = statesSet.descendingSet(); // возвращаем набор в обратном порядке
        SortedSet<String> setLower=statesSet.headSet("Germany"); // возвращаем набор в котором все элементы
                                                                           // меньше текущего
        SortedSet<String> setGreater=statesSet.tailSet("Germany"); // возвращаем набор в котором все
                                                                               // элементы больше текущего
        System.out.println(navSet);
        System.out.println(setLower);
        System.out.println(setGreater);
    }

}
