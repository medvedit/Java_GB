package Java_GB.Seminar.Seminar_4.classWork;

import java.util.*;

public class arrayList {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<>();

        states.add("Франция");
        states.add("Франция");
        states.add("Германия");
        states.add("Португалия");
        states.add("Перу");

        System.out.println(states); //[Франция, Франция, Германия, Португалия, Перу]

        for (int i = 0; i < states.size(); i++) {
            if(states.get(i).equalsIgnoreCase("Франция")){
                states.remove(i);
                // i--; // если поставить итератор на шаг назад, то удалим всю встречающуюся Францию,
                // иначе удаляется Франция с первого индекса,
                // далее происходит сдвиг массива на освободившееся позиции (Франция с индекса 1
                // передвинулась на индекс 0 и весь массив следом, на индекс назад),
                // далее срабатывает итератор i++ в цикле for и поэтому ту Францию,
                // которая в начальном массиве была на индексе 1 цикл for пропустит.
            }
        }
        System.out.println(states); // [Франция, Германия, Португалия, Перу]



        ArrayList<String> states_1 = new ArrayList<>();

        states_1.add("Франция");
        states_1.add("Франция");
        states_1.add("Германия");
        states_1.add("Португалия");
        states_1.add("Канада");

        System.out.println(states_1); //[Франция, Франция, Германия, Португалия, Канада]

        Iterator<String> iterStates = states_1.iterator(); // создал итератор

        // states_1.removeIf(s -> s.equalsIgnoreCase("Франция")); // эта строка замещает создание Iterator и
                                                                  // весь цикл while

        while(iterStates.hasNext()){ // пока есть следующий элемент
            if(iterStates.next().equalsIgnoreCase("Франция")){ // если элемент == "Франция"
                iterStates.remove(); // то удалить его
            }

        }
        System.out.println(states_1); // вывод обработанного массива


    }

}
