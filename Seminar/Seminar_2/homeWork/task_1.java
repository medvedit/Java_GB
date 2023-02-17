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
        System.out.println(delSpaceAddDot("  Добрый день   Как дела          Все хорошо    "));

    }

    public static String fixString() {
        String str = "  Добрый день    Как дела          Все хорошо    ";
        str = str.trim() // удалил начальные и конечные пробелы.
                .replaceAll("\\s+", " ") // удаляю лишние пробелы от 1 до последнего элемента в
                                                            // строке полученной после метода .trim.
                .replaceAll("\\s([А-ЯЁ])", ".$1"); // если после пробела заглавная буква, то ставлю точку.
        return str.concat(".\n"); // конкатенация точки в конец предложения.

    }

    static String delSpaceAddDot(String str) {
        StringBuilder addString = new StringBuilder(str.trim()); // сформировали новую строку,
                                                                 // с вырезанными пробелами с обоих концов строки .trim
        char start = addString.charAt(0); // установил значение char zero на индекс 0.
        if (Character.isLowerCase(start)) { // определяет, находится ли указанное значение типа char в нижнем регистре
                                            // (строчной буквой).
            addString.setCharAt(0, Character.toUpperCase(start)); // если true установить новое значение символа с
                                                                  // помощью метода setCharAt(),
                                                                  // указав индекс символа и его значение.
                                                                  // вернули указанное значение типа char в верхнем регистре
                                                                  // (заглавной буквой) Character.toUpperCase(zero)
        }
        for (int i = 1; i < addString.length() - 1; i++) { // проходим по всей длине строки
            if (addString.charAt(i) == ' ' && addString.charAt(i + 1) == ' ') { // если i элемент пустой И элемент
                                                                                // на следующей позиции i + 1 пустое значение то,
                addString.deleteCharAt(i + 1); // удаляем элемент i + 1
                i--; // возврат на предыдущую позицию
            }
            if (addString.charAt(i) == ' ' && Character.isUpperCase(addString.charAt(i + 1))) { // если i элемент пустой И
                                                                                              // следующий элемент заглавная буква то,
                addString.insert(i, '.'); // Метод insert() – в Java вставляет символы в данную строку буфера (StringBuffer).
                                          // Подстрока добавляется перед указанным индексом. Ставим точку перед i элементом.
                i++; // переход на следующий элемент.
            }
        }
        addString.append('.'); // добавили точку в конец строки.
        return str = addString.toString(); // вернули из StringBuilder в String.
    }

}
