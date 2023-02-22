/*
 *  Класс Stack в Java – это структура данных, которая следует за LIFO (Last In First Out -> Последний пришел первым вышел).
 *  empty()	 проверяет, пуст ли стек
 *  push()	ставит элемент в верх стека
 *  pop()	удаляет объект из стека
 *  peek()	рассматривает объект стека, не удаляя его
 *  search()  поиск элемента для получения его индекса
 *  iterator() перебирает элементы в стеке сверху вниз(от последнего добавленного до первого добавленного)
 *  listIterator() перебирает противоположно iterator()
 *
 *  stack - является устаревшей конструкцией, технологией и вместо неё сейчас стоит использовать Deque.
 *          Stack можно встретить в java коде написанном до появления Deque, и что бы понимать что такое Stack
 *          это разобрано тут.
 *
 *     Разобрано на примере арифметического выражения в постфиксной форме записи.
 *     Есть еще префиксная форма записи арифметических выражений.
 */

package Java_GB.Lecture.Lecture_4;

import java.util.Stack;

public class stack {

    public static void main(String[] args) {

        // Положили элемент первым - достали последним.
    Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1


        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -

        // var exp = "30 20 - 10 *".split(" "); // (20-30)*10
        // var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3
        var exp = "1 2 3 * 4 * + 10 5 / * 20 -".split(" ");
        // var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop();
                        res = st.pop() / res;
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());



    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}

