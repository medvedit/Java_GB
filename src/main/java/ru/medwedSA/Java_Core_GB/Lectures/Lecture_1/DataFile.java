package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataFile {
    public static void main(String[] args) {

        dataIn();
        dataOutStr();
        readWriteData();

    }

    // Создание файла. Запись и до запись в файл.
    static void dataIn() {
        try (FileWriter fw = new FileWriter("/Users/" +
                "Medwed_SA/Desktop/Education/Java/project_IntelliJ_IDEA/" +
                "Java_GB/src/main/java/ru/medwedSA/Java_Core_GB/" +
                "Lectures/Lecture_1/text.txt", false)) { // false -> Создает файл и перезаписывает.
                                                                 // true -> Создает файл и до записывает в файл.
            fw.write("lina 1\n");
            fw.append('2');
            fw.append('\n');
            fw.write("lina 3\n");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    // Чтение из файла. Вариант посимвольно.
    static void dataOutStr() {
        try (FileReader fr = new FileReader("/Users/" +
                "Medwed_SA/Desktop/Education/Java/project_IntelliJ_IDEA/" +
                "Java_GB/src/main/java/ru/medwedSA/Java_Core_GB/" +
                "Lectures/Lecture_1/text.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                char ch = (char) c;
                if (ch == '\n') {
                    System.out.println(ch);
                } else {
                    System.out.println(ch);

                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }

    static void readWriteData() {
        // ЗАПИСЫВАНИЕ В ФАЙЛ
        try (FileWriter writer = new FileWriter("/Users/" +
                "Medwed_SA/Desktop/Education/Java/project_IntelliJ_IDEA/" +
                "Java_GB/src/main/java/ru/medwedSA/Java_Core_GB/" +
                "Lectures/Lecture_1/notes3.txt", false)){ // Создание файла в директории проекта
          // в параметр append в строке выше добавить true, чтоб ДО-записывать, а не ПЕРЕ-записывать файл.
          // Запись всей строки или переменной -
            String text = "Java может, " +
                    "Java может всё что угодно!\nМожет это. Может это\n..." +
                    "Но не может банально вывести на консоль тип переменной...";
            writer.write(text);
            // запись по символам -
            writer.append('\n');
            writer.append("END\n");

            writer.flush(); // Закрытие потока FileWriter, вероятно... Несмотря на то, что мы находимся в
                            // try-with-resources с авто закрытием.
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Создание и запись файла завершены");



        // ЧТЕНИЕ ИЗ ФАЙЛА по строковое
        System.out.println("\n\"Чтение из файла\"\n");

        try (FileReader fr = new FileReader("/Users/" +
                "Medwed_SA/Desktop/Education/Java/project_IntelliJ_IDEA/" +
                "Java_GB/src/main/java/ru/medwedSA/Java_Core_GB/" +
                "Lectures/Lecture_1/notes3.txt"); BufferedReader reader = new BufferedReader(fr)){
        // создаем объект FileReader для файла notes3.txt. И создаем BufferedReader с
        // существующего FileReader для построчного считывания
            String line = reader.readLine(); // считаем сначала первую строку

            int count = 0; // счётчик считывания для наглядности, для себя делаю.
            while (line != null) {
                System.out.printf("Считывание в цикле #%d: ", ++count); // Вывод счетчика.
                System.out.println(line); // Считываем и выводим на печать остальные строки в цикле.
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
