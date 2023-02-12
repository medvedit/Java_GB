/*
 * Вывести все простые числа от 1 до 1000
 */

package Java_GB.Seminar.Seminar_1.homeWork;

public class task_2 {
    public static void main(String[] args) {
        
        isPrime();

    }
    static void isPrime(){
        System.out.printf("%d %d ", 2, 3);
        for (int n = 2; n <= 1_000; n++) {
            boolean numPrime = true;
            double numTemp = Math.sqrt(n) + 2;
            int r = 2;
            while (r <= numTemp && numPrime) {
                if (n % r == 0)
                    numPrime = false;
                r++;
            }
            System.out.print(numPrime ? (n + " ") : "");
        }
    }

}
