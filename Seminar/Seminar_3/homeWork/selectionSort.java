/*
 *  Сортировка выбором -> сложность алгоритма O(n^2).
 *  Данная сортировка неустойчива, т.к. одинаковые элементы (с точки зрения той характеристики,
 *  по которой мы сортируем элементы) могут изменить своё положение.
 *  Хороший пример приведён в статье на Википедии:
 *  Покажем, почему данная реализация является неустойчивой.
 *  Рассмотрим следующий массив из элементов, каждый из которых имеет два поля. Сортировка идет по первому полю.
 *  Массив до сортировки:
 *  { (2, a), (2, b), (1, a) }
 *  Уже после первой итерации внешнего цикла будем иметь отсортированную последовательность:
 *  { (1, a), (2, b), (2, a) }
 *  Теперь заметим, что взаимное расположение элементов (2, a) и (2, b) изменилось. Таким образом, рассматриваемая реализация является неустойчивой.
 */

package Java_GB.Seminar.Seminar_3.homeWork;

import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {

        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));

        for (int left = 0; left < array.length; left++) { // ничего сложного, но мудрёно)))
	        int minInd = left;                            // комментировать не стоит, а
	        for (int i = left; i < array.length; i++) {   // стоит включить дебаг  и
		        if (array[i] < array[minInd]) {           // всё станет ясно ))))
			        minInd = i;
		        }
	        }
	        swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));

    }
    private static void swap(int[] array, int ind1, int ind2) { // метод -> меняем местами соседние элементы.
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

}
