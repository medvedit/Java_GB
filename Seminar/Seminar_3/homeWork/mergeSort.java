/*
 *  Cортировка слиянием (merge sort)
 *  Сложность данного алгоритма — логарифмическая. Записывается как O(n log n).
 */

package Java_GB.Seminar.Seminar_3.homeWork;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class mergeSort {

    public static void main(String[] args) {

        List<Integer> array = myNumbers();
        System.out.println(array);
        System.out.println(mergeSortMethod(array));

    }
    public static ArrayList<Integer> myNumbers(){ // метод создания списка Random.
        ArrayList<Integer> numberList = new ArrayList<>(); // создали новы список для заполнения.
        Random random = new Random();

        for (int i = 0; i < 16; i++) { // прошли в цикле, создавая список из 11 элементов.
            numberList.add(random.nextInt(0, 100)); // range от 0 до 99
        }
        return numberList; // возврат в main заполненного списка.
    }
    public static List<Integer> mergeSortMethod(List<Integer> mass) {
        if(mass.size() < 2) {
            // базовый случай выхода из рекурсии, когда массив имеет 0 или 1 элемент
            return mass;
        }
        else{
            int delimiter = mass.get(0);
            // число, относительно которого разделяем массивы

            List<Integer> left = new ArrayList<>();
            // левая сторона - числа меньше delimiter

            List<Integer> right = new ArrayList<>();
            // правая сторона - числа больше delimiter

            for (int i = 1; i < mass.size(); i++) {
                if (mass.get(i) < delimiter) {
                    left.add(mass.get(i));
                } else {
                    right.add(mass.get(i));
                }
            }
            return mergerArray(mergeSortMethod(left), delimiter, mergeSortMethod(right));
            // вызываем mergeSortMethod у новых массивов

        }
    }
    private static List<Integer> mergerArray(List<Integer> left, int del, List<Integer> right) {
        left.add(del);
        left.addAll(right);
        return left;
    }

}
