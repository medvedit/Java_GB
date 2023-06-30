package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

/*
    Циклы:
    Цикл — это многократное выполнение одинаковой последовательности действий.
    В java доступны следующие циклы:
        ●  цикл while;
        ●  цикл do while;
        ●  цикл for; и его модификация ● foreach;
 */

public class TypesOfCycles {

    static void lengthNum() { // Цикл с предусловием. Метод считает количество знаков в целом числе.
        int value = 234;
        int count = 0;

        while (value != 0) { // Пока число "существует"
            value /= 10; // убираем последнюю цифру
            count++; // считаем каждый проход цикла
        }
        System.out.println(count); // вывод количества циклов в консоль
    }

    // Цикл с постусловием. Сначала будет что-то делать, а затем что-то проверять.
    static void lengthNum2() {
        int value = 23485;
        int count = 0;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);
    }

    /**
     * continue, break
     * Операторы для управления циклами — continue и break.
     * continue - Выполнение следующей итерации цикла.
     * break - Прерывание текущей итерации цикла.
     * НО ТАМ, ГДЕ МОЖНО ОБОЙТИСЬ БЕЗ continue И break ЛУЧШЕ ОБХОДИТЬСЯ БЕЗ НИХ!!!!
     * НО!!! иногда бывает необходимость.
     */
    static void oddNumber() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Если цикл обнаружил число с остатком от деления равным 0, то сработает
                          // continue
                          // с возвратом в for, иначе число напечатается в консоль и снова возврат в for.
                          // И так пока i < 10
            }
            System.out.println(i);
        }
    }

    static void oddNumber2() {
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                break; // В это случае на первом наеденном не четном числе сработает оператор break и
                       // цикл остановится.
            }
            System.out.println(i);
        }
    }

    static void num() { // Сумма чисел от 1 до 5 в цикле for
        int s = 0;
        for (int i = 1; i <= 5; i++) {
            s += i;
        }
        System.out.println(s);
    }

    static void doubleArray() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*_* ");

            }
            System.out.println();
        }
    }
    // Через цикл for in обращение в цикле идет к элементам массива, а НЕ к ИНДЕКСАМ.
    static void for_in() {

        int[] arr = new int[] { 1, 3, 6, 4, 34, 11 };

        for (int item : arr) { // Паттерн "iter"
            item = 1; // и все значения элементов в массиве изменятся на цифру 1
            System.out.print(item);

        }
        System.out.println();
        // Тут можно поиграться с областью видимости. Циклы for in в разных областях видимость.
        for (int item : arr) {
//             item = 88888; // Раскомментировать и перезапустить код.
            System.out.println(item);
        }
    }

    static String text(int a){
        switch (a) {
            case 1:
                return "Доброе утро";
            case 2:
                return String.format("Добрый день"); // String.format  писать необязательно.
            case 3:
                return String.format("Добрый вечер");
            default:
                return String.format("Что то поло не так...");
        }
    }
    static void text2(int a) {
        String msg = "";
        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
                msg = "Как дела?";
                System.out.println(msg);
                break; // В этом коде break обязателен!
            case 5:
                msg = "Чем занят?";
                System.out.println(msg);
                break; // В этом коде break обязателен!
            case 6:
                msg = "Идем на футбол???";
                System.out.println(msg);
                break; // В этом коде break обязателен!
            default: // Это не обязательная ветка.
                msg = "Разговор не задался...";
                System.out.println(msg);
                break; // В этом коде break обязателен!
        }
    }


    public static void main(String[] args) {

        lengthNum(); // 3
        lengthNum2(); // 5
        oddNumber(); // 1 3 5 7 9
        oddNumber2(); // 1
        num(); // 55
        doubleArray();
        for_in();
        System.out.println(text(2)); // Добрый день
        text2(2); // Как дела?
    }

}
