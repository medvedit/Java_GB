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

        System.out.println(fixString());

    }

    public static String fixString() {
        String str = "  Добрый день   Как дела          Все хорошо    ";
        str = str.trim() // удалил начальные и конечные пробелы.
                .replaceAll("\\s+", " ") // удаляю лишние пробелы от 1 до последнего элемента в
                                                                //строке полученной после метода .trim.
                .replaceAll("\\s([А-ЯЁ])", ".$1"); // если после пробела заглавная буква, то ставлю точку.
        return str.concat(".\n"); // конкатенация точки в конец предложения.
    }

}
