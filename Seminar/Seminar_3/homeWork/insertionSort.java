/*
 *  Сортировка вставками -> сложность алгоритма O(n^2).
 *  В чём отличие от сортировки выбором? Данная сортировка является "устойчивой".
 *  Это значит, что одинаковые элементы не изменят свой порядок. Одинаковые с точки зрения характеристики,
 *  по которой мы сортируем.
 */

package Java_GB.Seminar.Seminar_3.homeWork;

import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {

        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
	        int value = array[left]; // Вытаскиваем значение элемента
	        int i = left - 1; // Перемещаемся по элементам, которые перед вытащенным элементом

	        for (; i >= 0; i--) {
		        if (value < array[i]) { // Если вытащили значение меньшее — передвигаем больший элемент дальше
			        array[i + 1] = array[i];
		        } else {
			        break; // Если вытащенный элемент больше — останавливаемся
		        }
	        }
	        array[i + 1] = value; // В освободившееся место вставляем вытащенное значение
        }
        System.out.println(Arrays.toString(array));

    }

}
