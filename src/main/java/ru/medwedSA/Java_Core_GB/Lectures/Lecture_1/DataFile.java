package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataFile {
    private static final String addressFileText = "/Users/Medwed_SA/Desktop/Education/Java/project_IntelliJ_IDEA/" +
            "Java_GB/src/main/java/ru/medwedSA/Java_Core_GB/" +
            "Lectures/Lecture_1/text.txt"; // адрес обращения к файлу text.txt
    private static final String addressFileNotes = "/Users/Medwed_SA/Desktop/Education/Java/project_IntelliJ_IDEA/" +
            "Java_GB/src/main/java/ru/medwedSA/Java_Core_GB/" +
            "Lectures/Lecture_1/notes.txt"; // адрес обращения к файлу notes.txt

    public static void main(String[] args) {

        createFileNameTextWriteToFile();
        readDataFileNameText();
        writeDataFileNameNotes();
        readDataFileNameNotes();

    }

    static void createFileNameTextWriteToFile() { // Создание файла. Запись и до запись в файл (true или false).
        // try-with-resources с авто закрытием.
        try (FileWriter fw = new FileWriter(addressFileText, false)) {
                                                                        // false -> Создает файл и перезаписывает.
                                                                        // true -> Создает файл и дописать в файл.
            fw.write("lina 1\n");
            fw.append('2');
            fw.append('\n');
            fw.write("lina 3\n");
            fw.flush(); // Этот метод используется для очистки модуля записи, что означает, что этот метод удалит все
                        // данные, присутствующие внутри модуля записи.
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    static void readDataFileNameText() { // Чтение из файла. Вариант посимвольно.
        try (FileReader fr = new FileReader(addressFileText)) { // try-with-resources с авто закрытием.
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



    static void writeDataFileNameNotes() { // ЗАПИСЫВАНИЕ В ФАЙЛ
        try (FileWriter writer = new FileWriter(addressFileNotes, false)){ // Создание файла по
            // указанному адресу. false -> перезаписать, а true -> дописать в файл.
            // try-with-resources с авто закрытием.
            String text = "Java может, " +
                    "Java может всё что угодно!\nМожет это. Может это\n..." +
                    "Но не может банально вывести на консоль тип переменной..."; // Текст для записи.
            writer.write(text);
            writer.append('\n'); // запись по символам
            writer.append("END\n");
            writer.flush(); // Этот метод используется для очистки модуля записи, что означает, что этот метод
                            // удалит все данные, присутствующие внутри модуля записи.
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Создание и запись файла завершены.");
    }



    private static void readDataFileNameNotes() { // ЧТЕНИЕ ИЗ ФАЙЛА по строковое
        System.out.println("\n\"Начало чтения из файла.\"\n");

        String addressFile = "/Users/Medwed_SA/Desktop/Education/Java/project_IntelliJ_IDEA/Java_GB/src/main/java/" +
                "ru/medwedSA/Java_Core_GB/Lectures/Lecture_1/notes.txt"; // адрес обращения к файлу.

        try (FileReader fr = new FileReader(addressFile); BufferedReader reader = new BufferedReader(fr)){
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
