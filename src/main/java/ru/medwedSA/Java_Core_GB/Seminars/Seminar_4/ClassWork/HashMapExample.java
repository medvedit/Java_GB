/**
 *  О HashMap читаем тут -> https://habr.com/ru/articles/421179/
 *                       -> https://habr.com/ru/search/?q=HashMap&target_type=posts&order=relevance
 *  HashMap - это ассоциативный массив. Если вкратце, то ассоциативный массив это структура данных которая хранит
 *  пары ключ-значения.
 *  Сложность доступа к элементам в HashMap O(1). Т.е. доступ моментальный.
 *  Но иногда при формировании HashMap случаются коллизии. Коллизия - Может случиться так, что у двух разных ключей
 *  окажется одинаковый хэш. Или хэш будет разным, но по формуле позиция для обоих хэшей будет одинаковой. Тогда
 *  значения обоих ключей окажутся записаны в одну «корзинку».  Именно из-за коллизий для хранения значений
 *  используется связанный список LinkedList. В случае коллизий сложность выпростает O(n) - относительно сложности
 *  LinkedList.
 *  Статья разрешение коллизий - ></https://neerc.ifmo.ru/wiki/index.php?title=Разрешение_коллизий>
 */

package ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.ClassWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class HashMapExample {
 
    public static void main(String[] args) {

//        HashMapWrappedInSet();
//        HashMapExample_1();
        HashMapNumberOfRepeatValue();
    }


    private static void HashMapWrappedInSet() {
        Map<Integer, String> hm = new HashMap<>();

        hm.put(2, "Васька");
        hm.put(4, "Рыжик");
        hm.put(7, "Барсик");
        hm.put(1, "Тишка");
        hm.put(3, "Хвостик");

        /* У HashMap, в ее стандартной реализации нет iterator, но можно поместить созданную HashMap hm в Set,
           во множество и  перебрать с помощью обычной коллекции. */
        Set<Map.Entry<Integer, String>> hmIter = hm.entrySet(); // Обернули в Set.

        for (Map.Entry<Integer, String> me : hmIter) { // Вывод в консоль.
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }


    private static void HashMapExample_1() {

        /* Стандартное создание HashMap с условием, что ключом будет целое число, а значением строковый элемент. По
           умолчанию количество бакетов - ячеек для хранения ключей 16. При заполнении 75% памяти отведенного под
           бакеты, их размер автоматически увеличится в 1,5 раза. То, в какой бакет сохранится ключ -
           Вычисление индекса для хранения пары key, value: ХешКод ключа делим на 16 без остатка.
           index(бакета) = HashCod % (n - 1) , где n количество бакетов. */

        Map<Integer, String> hm = new HashMap<>();

        hm.put(3, "Васька");
        hm.put(4, "Рыжик");
        hm.put(7, "Барсик");
        hm.put(1, "Тишка");
        hm.put(3, "Васька_1");
        /* Ключ в HashMap может быть только уникальным. Если в процессе формирования HashMap случится повтор ранне
           сохраненного ключа, то ключ продублироваться не сможет, а значение по ключу перезапишется на последнее
           добавленное. Значение "Васька" перезаписалось на "Васька_1". В случае с Integer ключами, при выводе,
           они сортируются. */

        System.out.println(hm); // {1=Тишка, 3=Васька_1, 4=Рыжик, 7=Барсик}
    }


    private static void HashMapNumberOfRepeatValue() {
        /* Создать список из 100 элементов. К каждому элементу положить целочисленное значение в Random
           диапазоне от 0 до 20. Вывести сколько раз повторяется каждое значение в списке. */
        Random random = new Random();
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(20);
            Integer current = hm.get(num);
            hm.put(num, current == null ? 1 : current + 1);
        }
        System.out.println("\n" + hm);
    }
}
