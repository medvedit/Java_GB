
/*
    Циклы:
    Цикл — это многократное выполнение одинаковой последовательности действий.
    В java доступны следующие циклы:
        ●  цикл while;
        ●  цикл do while;
        ●  цикл for; и его модификация for in

 */
package Java_GB.Lecture.Lecture_1;

public class cycles {

    static void lenghtNum() {
        int value = 234;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
    }

    // Цикл с постусловием. Сначала будет что то делать, а затем что то проверять.
    static void lenghtNum2() {
        int value = 23484;
        int count = 0;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);
    }

    // Циклы
    // continue, break
    // Операторы для управления циклами — continue и break. Выполнение следующей
    // итерации цикла — continue.
    // Прерывание текущей итерации цикла — break.
    // * ближайшего к оператору
    // НО ТАМ, ГДЕ МОЖНО ОБОЙТИСЬ БЕЗ continue И break ЛУЧШЕ ОБХОДИТЬСЯ БЕЗ НИХ!!!!
    // НО!!! иногда бывает необходимость.
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
                break; // В это случае на первом наиденном не четном числе сработает оператор break и
                       // цикл остановится.
            }
            System.out.println(i);
        }
    }

    static void num() { // Сумма чисел
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);
    }

    static void doubleArray() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    // Через цикл for in обращение в цикле идет к элементам массива, а НЕ к ИНДЕКСАМ.
    static void for_in() {

        int[] arr = new int[] { 1, 3, 6, 4, 34, 11 };

        for (int item : arr) {
            item = 1; // и все значения элементов в массиве изменятся на цифру 1
            System.out.println(item);

        }
        // Тут можно поиграться с областью видимости. Циклы for in в разных областях видимость.
        for (int item : arr) {
            // item = 1;
            System.out.println(item);
        }
    }


    public static void main(String[] args) {

        lenghtNum(); // 3
        lenghtNum2(); // 5
        oddNumber(); // 1 3 5 7 9
        oddNumber2(); // 1
        num(); // 55
        doubleArray();
        for_in();

    }

}
