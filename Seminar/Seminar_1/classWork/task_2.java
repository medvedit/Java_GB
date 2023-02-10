/*
 * Задание №2
Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0],
вывести максимальное количество подряд идущих 1.

 */

package Java_GB.Seminar.Seminar_1.classWork;

public class task_2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0 };

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println("Максимальное идущих подряд чисел " + maxCount);
    }

}
