package ru.medwedSA.Java_Core_GB.Lectures.Lecture_3;

/*
 *  Массивы:
    Проблема. Как увеличить размер массива?
    Есть массив из 2 элементов, в конец которого нужно добавить необходимый элемент.
 */

public class ArrayAddElement {
    static int[] AddItem(int[] array, int item) { // Метод увеличивающий начальный массив на 1 позицию в конце массива,
                                                  // + добавляет в новый массив переданное в метод число.
        int length = array.length; // получили длину исходного массива.
        int[] newArray = new int[length + 1]; // создали новый, пустой массив с длиной +1 позиция.
        System.arraycopy(array, 0, newArray, 0, length); // Копирую в массив:
                                                                            // 1) Из какого массива.
                                                                            // 2) С какой позиции копировать.
                                                                            // 3) В какой массив копировать.
                                                                            // 4) С какой позиции начинать вставку
                                                                            //    новых элементов.
                                                                            // 5) Какое количество элементов
                                                                            //    с пункта 2) копируем в новый массив.
        newArray[length] = item; // На последнюю позицию в новом массиве записали переданное в метод число.
        return newArray; // Вернули полученный массив из метода.
    }

    public static void main(String[] args) {
        int[] a = new int[] { 0, 9 }; // Начальный массив.
        for (int i : a) {
            System.out.printf("%d ", i); // Распечатали его в консоль.
        }
        System.out.println(); // Переход на новую строку, для наглядности изменений массивов.

        a = AddItem(a, 2); // Передали в метод массив и число, которое нужно в него добавить.
        for (int j : a) {
            System.out.printf("%d ", j); // Распечатали измененный массив после прохождения через метод AddItem.
        }
        System.out.println(); // Переход на новую строку, для наглядности изменений массивов.

        a = AddItem(a, 3); // Передали в метод массив и число, которое нужно в него добавить.
        for (int j : a) {
            System.out.printf("%d ", j); // Распечатали измененный массив после прохождения через метод AddItem.
        }
    } // Ответ: 0 9 -> Массив был
      //        0 9 2 -> Массив после первого вызова метода AddItem
      //        0 9 2 3 -> Массив после второго вызова метода AddItem
}
