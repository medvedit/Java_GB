/*
 *  Итератор
    Получение итератора с целью более гибкой работы с данными
    Интерфейс Iterator<E>. Итератор коллекцией.
    Iterator занимает место Enumeration в Java Collections Framework.
    Итераторы отличаются от перечислений двумя способами:
    Итераторы позволяют вызывающей стороне удалять элементы из базовой коллекции во время итерации с четко определенной семантикой.

    Iterator<E>    URL -> https://metanit.com/java/tutorial/5.10.php
    hasNext() - пока есть следующий объект, вернет значение true.
    next() - покажи следующий.
    remove() - И метод remove() удаляет текущий элемент, который был получен последним вызовом next().

    ListIterator<E>   URL -> https://metanit.com/java/tutorial/5.10.php
    boolean hasPrevious() - возвращает true, если в коллекции имеется предыдущий элемент, иначе возвращает false
    E previous() - возвращает текущий элемент и переходит к предыдущему, если такого нет, то генерируется исключение NoSuchElementException
    int nextIndex() - возвращает индекс следующего элемента. Если такого нет, то возвращается размер списка
    int previousIndex() - возвращает индекс предыдущего элемента. Если такого нет, то возвращается число -1
    void remove() - удаляет текущий элемент из списка. Таким образом, этот метод должен быть вызван после методов next() или previous(), иначе будет сгенерировано исключение IlligalStateException
    void set(E obj) - присваивает текущему элементу, выбранному вызовом методов next() или previous(), ссылку на объект obj
    E next() - возвращает текущий элемент и переходит к следующему, если такого нет, то генерируется исключение NoSuchElementException
    void add(E obj) - вставляет объект obj перед элементом, который должен быть возвращен следующим вызовом next()
    boolean hasNext() - возвращает true, если в коллекции имеется следующий элемент, иначе возвращает false
 */

package Java_GB.Lecture.Lecture_3;

import java.util.*;


public class iterator {

    public static void main(String[] args) {
        iteratorList();
        iteratorList1();
    }

    public static void iteratorList(){

        List<Integer> mayList = List.of(1, 12, 123, 1234, 12345); // создали коллекцию.

        for (Integer item : mayList) { //цикл foreach
            System.out.println(item);
        }
        Iterator<Integer> coll = mayList.iterator(); // создали объект Iterator для работы с ним,
                               //реализации интерфейса iterator -> https://metanit.com/java/tutorial/5.10.php
        System.out.println();
        while(coll.hasNext()){
            System.out.println(coll.next());
            // coll.next();
            // coll.remove();
        }
    }
    public static void iteratorList1(){
        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        ListIterator<String> listIter = states.listIterator();

        while(listIter.hasNext()){
            // int index = listIter.nextIndex();
            // String item = listIter.next();
            // System.out.println("Элемент " + item + " находится на позиции " + index);
            System.out.println(listIter.next());
        }
        System.out.println();
        // сейчас текущий элемент - Испания
        // изменим значение этого элемента
        listIter.set("Португалия");
        // пройдемся по элементам в обратном порядке
        while(listIter.hasPrevious()){
            System.out.println(listIter.previous());
        }
        while (listIter.hasNext()) {
            int index = listIter.nextIndex();
            String item = listIter.next();

            System.out.println("Элемент " + item + " находится на позиции " + index);
        }

    }

}
