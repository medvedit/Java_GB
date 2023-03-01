package Java_GB.Seminar.Seminar_4.classWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class hashMap {
 
    public static void main(String[] args) {

        // создать рандомный список из 20 элементов и вывести сколько раз повторяется каждый элемент:
        Random random = new Random();
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(20);
            Integer current = hm.get(num);
            hm.put(num, current == null ? 1 : current + 1);

        }
        System.out.println(hm);
        // -------------------------------------------------------------------------------------------

    }

}
