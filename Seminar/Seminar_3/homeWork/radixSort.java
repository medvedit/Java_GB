/*
 *  Поразрядная сортировка (Radix Sort)
 *  Его вычислительная сложность O(k * n), где k количество проходов по массиву.
 *  Если n достаточно велико, а k наоборот очень мало, то данный алгоритм выигрывает у O(n * Log n).
 *  Почитать можно тут -> https://ru.wikibrief.org/wiki/Radix_sort
 */

package Java_GB.Seminar.Seminar_3.homeWork;

import java.util.Arrays;

public class radixSort {

    public static void main(String[] args) {

        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n = arr.length;

        // Function Call
        radixSortMethod(arr, n);
        print(arr, n);

    }
    static void print(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    static void radixSortMethod(int arr[], int n)
    {
        // Найдите максимальное число, чтобы узнать количество цифр.
        int m = getMax(arr, n);

        // Делаем сортировку подсчетом для каждой цифры. Обратите внимание, что
        // вместо числа цифр передается exp.
        // exp равно 10^i, где i — текущая цифра
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // конечный массив.
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Сохранить количество вхождений в count[].
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Изменяем count[i] так, чтобы count[i] теперь содержал
        // фактическая позиция этой цифры в output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Формируем конечный массив.
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Копируем конечный массив в arr[], так что теперь arr[]
        // содержит отсортированные числа в соответствии с текущими.
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

}
