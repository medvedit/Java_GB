/*
     LinkedList -> методы:

 *   add() добавление
 *   remove() удаление по индексу, по object
 *   indexOf(Object element) метод возвращает индекс или позицию первого вхождения элемента в списке
 *   clear() очистка списка
 *   contains() содержится ли элемент в списке
 *   set() вставка элемента с заменой
 *   size() возвращает размер или количество элементов, присутствующих в LinkedList
 *   addFirst() добавления элемента в начало
 *   addLast() добавления элемента в конец списка
 *   peekFirst() возвращают первый элемент списка. Возвращают null, если список пуст
 *   peekLast() возвращают последний элемент списка. Возвращают null, если список пуст
 *   pollFirst() возвращают первый элемент списка и удаляют его из списка. Возвращают null, если список пуст
 *   pollLast() возвращают последний элемент списка и удаляют его из списка. Возвращают null, если список пуст
 *   toArray() возвращает массив из элементов списка (пример в файле Car.java)

 */

package ru.medwedSA.Java_Core_GB.Lectures.Lecture_4;

import java.util.LinkedList;

public class LinkedList_2 {

    public static void main(String[] args) {

        // добавление по index
        String str1 = "Hello World!";
        String str2 = "My name is Earl";
        String str3 = "I love Java";
        // String str4 = new String("I live in Moscow"); // строка не использовалась в коде

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add(str1);
        linkedList.add(str3);
        linkedList.add(1, str2); // добавили на index 1

        System.out.println(linkedList); // [Hello World!, My name is Earl, I love Java]



        // удаление по index LinkedList списка
        String str1_1 = "Hello World!";
        String str2_1 = "My name is Earl";
        String str3_1 = "I love Java";
        // String str4_1 = new String("I live in Moscow"); // строка не использовалась в коде

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add(str1_1);
        linkedList1.add(str3_1);
        linkedList1.add(1, str2_1); // добавили на index 1

        linkedList1.remove(1); // удалили с index 1

        System.out.println(linkedList1); // [Hello World!, I love Java]


        // добавления элемента в начало/конец списка
        LinkedList<String> cars = new LinkedList<>();

        String ferrari = "Ferrari 360 Spider";
        String bugatti = "Bugatti Verona";
        String Lamborghini = "Lamborghini Diablo";
        String ford = "Ford Mondeo";
        String fiat = "Fiat Ducato";

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(Lamborghini);
        System.out.println(cars); // [Ferrari 360 Spider, Bugatti Verona, Lamborghini Diablo]

        cars.addFirst(ford);
        cars.addLast(fiat);
        System.out.println(cars); // [Ford Mondeo, Ferrari 360 Spider, Bugatti Verona, Lamborghini Diablo, Fiat Ducato]


        // возвращают первый/последний элемент списка
        LinkedList<String> cars_1 = new LinkedList<>();
        String ferrari_1 = "Ferrari 360 Spider";
        String bugatti_1 = "Bugatti Verona";
        String Lamborghini_1 = "Lamborghini Diablo";

        cars_1.add(ferrari_1);
        cars_1.add(bugatti_1);
        cars_1.add(Lamborghini_1);
        System.out.println(cars_1); // [Ferrari 360 Spider, Bugatti Verona, Lamborghini Diablo]
        System.out.println(cars_1.peekFirst()); // Ferrari 360 Spider
        System.out.println(cars_1.peekLast()); // Lamborghini Diablo

        // удаление первого и последнего элемента в списке и вывод "Что осталось в списке"
        LinkedList<String> cars_2 = new LinkedList<>();
        String ferrari_2 = "Ferrari 360 Spider";
        String bugatti_2ferrari_2 = "Bugatti Verona";
        String Lamborghini_2ferrari_2 = "Lamborghini Diablo";

        cars_2.add(ferrari_2);
        cars_2.add(bugatti_2ferrari_2);
        cars_2.add(Lamborghini_2ferrari_2);
        System.out.println(cars_2.pollFirst()); // Ferrari 360 Spider
        System.out.println(cars_2.pollLast()); // Lamborghini Diablo

        System.out.print("В списке cars_2 осталось -> ");
        System.out.println(cars_2); // [Bugatti Verona]


    }
    /*  Теперь мы знаем, как устроен LinkedList и чем он отличается от ArrayList.
        В чем же заключаются выгоды от использования LinkedList?

        Прежде всего, в работе с серединой списка.
        Вставка и удаление в середину LinkedList устроены гораздо проще, чем в ArrayList.
        Мы просто переопределяем ссылки соседних элементов, а ненужный элемент “выпадает” из цепочки ссылок.

        В то время как в ArrayList мы:
        проверяем, хватает ли места (при вставке)
        если не хватает — создаем новый массив и копируем туда данные (при вставке)
        удаляем/вставляем элемент,
        и сдвигаем все остальные элементы вправо/влево (в зависимости от типа операции).
        Причем сложность этого процесса сильно зависит от размера списка.
        Одно дело — скопировать/сдвинуть 10 элементов, и совсем другое — сделать то же самое с
        миллионом элементов.
        То есть, если в твоей программе чаще происходят операции вставки/удаления с серединой списка,
        LinkedList должен быть быстрее, чем ArrayList.
    */

}