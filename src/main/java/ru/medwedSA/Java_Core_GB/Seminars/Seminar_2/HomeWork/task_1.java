package ru.medwedSA.Java_Core_GB.Seminars.Seminar_2.HomeWork;
/*
    Написать метод, который приводит строку к нормальному виду.
    Строка на вход:
    Добрый день Как дела Все хорошо
    Выход:
    Добрый день. Как дела. Все хорошо.
 */

public class task_1 {
    public static void main(String[] args) {

        System.out.println(removeSpacesAddDotsString());
        System.out.println(removeSpacesAddDotsStringBuilder());

    }

    public static String removeSpacesAddDotsString() {
        String str = "  Добрый день    Как дела          Все хорошо    ";
        str = str.trim() // удалил начальные и конечные пробелы.
                .replaceAll("\\s+", " ") // удаляю лишние пробелы от 1 до последнего элемента в
                                                            // строке полученной после метода .trim.
                .replaceAll("\\s([А-ЯЁ])", ". $1"); // если после пробела заглавная буква,
                                                                     // то ставлю точку.
//        str.concat("\n");
        return str.concat(".\n"); // конкатенация точки в конец предложения.

    }

    public static StringBuilder removeSpacesAddDotsStringBuilder() {
        String str = "  добрый день   Как дела          Все хорошо    ";
        StringBuilder addString = new StringBuilder(str.trim()); // Создаем StringBuilder из str,
                                                                 // с вырезанными пробелами с обоих концов строки .trim
        char start = addString.charAt(0); // Установил значение char start на индекс 0.
        if (Character.isLowerCase(start)) { // Определяет, находится ли указанное значение типа char в
                                                // нижнем регистре (строчной буквой).
            addString.setCharAt(0, Character.toUpperCase(start)); // Если true установить новое значение
            // символа с помощью метода setCharAt(), указав индекс символа и его значение. Вернули указанное значение
            // типа char в верхнем регистре (заглавной буквой) Character.toUpperCase(start)
        }
        for (int i = 1; i < addString.length() - 1; i++) { // проходим по всей длине строки
            if (addString.charAt(i) == ' ' && addString.charAt(i + 1) == ' ') { // если i элемент пустой И элемент
                                                                    // на следующей позиции i + 1 пустое значение то...
                addString.deleteCharAt(i + 1); // удаляем элемент i + 1
                i--; // возврат на предыдущую позицию
            }
            if (addString.charAt(i) == ' ' && Character.isUpperCase(addString.charAt(i + 1))) { // если i элемент
                                                                 // пустой И следующий элемент заглавная буква то...
           // Метод insert() – в Java вставляет символы в данную строку, символ добавляется перед указанным индексом.
                addString.insert(i, '.'); // Ставим точку перед i элементом.
                i++; // переход на следующий элемент.
            }
        }
        addString.append('.'); // добавили точку в конец строки.
        return addString; // вернули StringBuilder, результат работы метода.
    }

}
