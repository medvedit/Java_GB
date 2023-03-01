/*
 * Задача:
 * Учитывая два целочисленных массива num1 и num2,
 * верните максимальную длину подмассива, который появляется в обоих массивах.

Example 1:
Input: num1 = [1,2,3,2,1], num2 = [3,2,1,4,7]

Output: 3
Explanation: Повторяющийся подмассив с максимальной длиной равен [3,2,1].

Example 2:
Input: num1 = [0,0,0,0,0], num2 = [0,0,0,0,0]

Output: 5
Explanation: Повторяющийся подмассив с максимальной длиной равен [0,0,0,0,0].
 */

package Java_GB.Seminar.Seminar_5.homeWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class compareTwoArrays {

    public static void main(String[] args) {
        // int[] a = new int[] { 1, 2, 3, 2, 1 };
        // int[] b = new int[] { 3, 2, 1, 4, 7 };

        int[] a = new int[] { 0, 0, 0, 0, 0 };
        int[] b = new int[] { 0, 0, 0, 0, 0, 0 };

        // int[] a = new int[] { 3,6,5,1,5,6,8,7,9,7,4 };
        // int[] b = new int[] { 3,6,4,7,4,9,8,7,9,7,4 };

        // int[] a = new int[] { 6, 8, 7, 9, 7, 4 };
        // int[] b = new int[] { 9, 8, 7, 9, 7, 4 };

        findLengthThroughSet(a, b);

    }

    // метод решения через HashSat
    public static void findLengthThroughSet(int[] num1, int[] num2) {
        Set<List<Integer>> set = new HashSet<>();
        int maxLength = 0;
        for (int i = 0; i < num1.length; i++) {
            for (int j = i + 1; j < num1.length + 1; j++) {
                List<Integer> sub = new ArrayList<>();
                for (int k = i; k < j; k++) {
                    sub.add(num1[k]);
                }
                set.add(sub);
            }
        }
        // System.err.println(set);
        for (int i = 0; i < num2.length; i++) {
            for (int j = i + 1; j < num2.length + 1; j++) {
                List<Integer> sub = new ArrayList<>();
                for (int k = i; k < j; k++) {
                    sub.add(num2[k]);
                }
                if (set.contains(sub)) {
                    maxLength = Math.max(maxLength, sub.size());
                }
            }
        }System.out.println(maxLength);
    }
}
