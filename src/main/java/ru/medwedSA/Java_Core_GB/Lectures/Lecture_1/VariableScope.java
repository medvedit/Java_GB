/*
 *  Область видимости переменных:
 */

package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

public class VariableScope {
    public static void main(String[] args) {

        /* У переменных существует понятие «область видимости».
         * Если переменную объявили внутри некоторого блока фигурных скобок { },
         * то снаружи этого блока переменная будет недоступна.
         */

        {
            int i = 123;
            System.out.println(i); //123
        }
        // System.out.println(i); // error: cannot find symbol


        // Но так работать будет норм:
        int f = 123;
        {
            int u = 111;
            int s = f + u;
            System.out.println(s); //234
        }
        int t = 10;
        int y = f + t;
        System.out.println(y); // 133

    }

}

