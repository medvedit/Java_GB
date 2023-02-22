/*
         Выходные данные:

==============Add====================
--- Add  Добавить элементы ( 6kk )
LinkedList: 2264 ms
ArrayList: 493 ms
ArrayList -> Быстрее !!!

==============Insert=================
--- Insert  Вставьте элементы в начало (100k)
LinkedList: 132 ms
ArrayList: 2742 ms
LinkedList -> Быстрее !!!

--- Insert  Вставить элементы в середину (60k)
LinkedList: 4110 ms
ArrayList: 494 ms
ArrayList -> Быстрее !!!

==============Remove=================
---  Remove  Удалить элементы из начала ( 100k )
LinkedList: 2 ms
ArrayList: 3220 ms
LinkedList -> Быстрее !!!

--- Remove  Удалить элементы из середины ( 100k )
LinkedList: 7519 ms
ArrayList: 1544 ms
ArrayList -> Быстрее !!!

--- Remove  Удалить элементы с конца ( 1kk )
LinkedList: 37 ms
ArrayList: 8 ms
ArrayList -> Быстрее !!!

==============Get====================
--- Get  Получить элементы из начала ( 4kk )
LinkedList: 25 ms
ArrayList: 7 ms
ArrayList -> Быстрее !!!

--- Get  Получить элементы из середины ( 40k )
LinkedList: 2320 ms
ArrayList: 0 ms
ArrayList -> Быстрее !!!

--- Get  Получить элементы с конца ( 3kk )
LinkedList: 23 ms
ArrayList: 5 ms
ArrayList -> Быстрее !!!

==============Set====================
--- Set  Установить элементы в начале ( 1kk )
LinkedList: 342 ms
ArrayList: 12 ms
ArrayList -> Быстрее !!!

--- Set  Установить элементы посередине ( 50k )
LinkedList: 3734 ms
ArrayList: 1 ms
ArrayList -> Быстрее !!!

--- Set  Установить элементы в конце ( 3kk )
LinkedList: 40 ms
ArrayList: 267 ms
LinkedList -> Быстрее !!!

==============Finish=================
 */

package Java_GB.Lecture.Lecture_4;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;


public class timingLinkedListAndArrayList {

    public static void main(String[] args) {

        //операция .add .insert. remove. get .set с начала середины, и конца списка
        //k - кол-во операций
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int value = 123456;
        System.out.println("--- Add  Добавить элементы ( 6kk )");


        Date startAddLinkedTime = new Date();
        for(int k = 0; k < 6_000_000; k++) { // k - кол-во операций.
            linkedList.add(value); // операция .add .insert. remove. get .set с начала середины, и конца списка.
                                   // тест провести на все варианты, и принять решение о использовании.
        }
        Date finishAddLinkedTime = new Date();
        long addLinkedTime = finishAddLinkedTime.getTime() - startAddLinkedTime.getTime();
        System.out.printf("LinkedList: %d ms%n",addLinkedTime);


        Date startAddArrayTime = new Date();
        for(int k = 0; k < 6_000_000; k++) { // k - кол-во операций.
            arrayList.add(value); // операция .add .insert. remove. get .set с начала середины, и конца списка.
                                  // тест провести на все варианты, и принять решение о использовании.
        }
        Date finishAddArrayTime = new Date();
        long addArrayTime = finishAddArrayTime.getTime() - startAddArrayTime.getTime();
        System.out.printf("ArrayList: %d ms%n",addArrayTime);

        if(addLinkedTime < addArrayTime){
            System.out.println("LinkedList -> Быстрее !!!");
        }
        else{
            System.out.println("ArrayList -> Быстрее !!!");
        }



    }


}
