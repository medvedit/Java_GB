/*
 *  Сортировка Шелла или Сортировка расческой — алгоритм сортировки, являющийся усовершенствованным вариантом
 *  сортировки пузырьком.
 *
 *  Идея метода Шелла состоит в сравнении элементов, стоящих не только рядом, но
 *  и на определённом расстоянии друг от друга.
 *  Иными словами — это сортировка пузырьком с предварительными «грубыми» проходами.
 *  Википедия -> https://ru.wikipedia.org/wiki/Сортировка_Шелла
 *  Затраты памяти: О(n) всего, O(1) дополнительно
 *  Лучшее время: O(n log2 n)
 *  Среднее время: зависит от выбранных шагов
 *  Структура данных: Массив
 *  Худшее время: O(n2)
 */

package ru.medwedSA.Java_Core_GB.Seminars.Seminar_3.HomeWork;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = randomArray();
        System.out.println(Arrays.toString(array));
        int[] arraySort = shellSort(array);
        System.out.println(Arrays.toString(arraySort));
    }

    public static int[] shellSort(int[] array){

        int gap = array.length; // Изначально задано, что геп между двумя сравниваемыми числами будет
                                // равен длине массива.
        while (gap >= 1) { // Цикл запустится пока true
            for (int right = 0; right < array.length; right++) { // Стандартное начало с первого элемента.
                                                                 // Смещаем правый указатель...
                for (int left = right - gap; left >= 0; left -= gap) { // Пока не сможем найти зазор между right и
                                                                       // left равному или большему gap.
                    if (array[left] > array[left + gap]) { // Если условие if верно, то...
                        swap(array, left, left + gap); // Меняем элементы местами и возвращаемся во
                                                                  // внутренний цикл for.
                    }
                }
            }
            // Первый цикл for закончил свою работу, дошли до конца массива. Будем уменьшать геп, зазор.
            if (gap > 1) { // Если гпе больше 1, то
                gap = gap * 10 / 13;  // Геп уменьшаем по оптимальной формуле. https://ru.wikipedia.org/wiki/
            } else { // иначе..
                gap = 0; // Геп присваиваем 0 и выходим из сортировки. Цикл while не запустится.
            }
        }
        return array; // По завершении сортировки вернется отсортированный массив.
    }

    private static void swap(int[] array, int left, int right) { // метод -> меняем местами соседние элементы.
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }

    public static int[] randomArray(){
        Random random = new Random();
        int[] numArray = new int[21];
        for (int i = 0; i < numArray.length ; i++) {
            numArray[i] = 1 + random.nextInt(100);
        }
        return numArray;
    }
}
