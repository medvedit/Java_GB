/*
    Написать метод который приводит строку к нормальному виду
    строка на вход
    Добрый день Как дела Все хорошо
    выход
    Добрый день. Как дела. Все хорошо.
 */

package Java_GB.Seminar.Seminar_2.homeWork;

public class task_1 {
    public static void main(String[] args) {

        fixString();

    }

    static void fixString() {
        String str = "  Добрый день   Как дела Все хорошо    ";
        str = str.trim()
                .replaceAll("\\s+", " ")
                .replaceAll("\\s([А-ЯЁ])", ". $1");
        System.out.print(str.concat(".\n"));
    }

}
