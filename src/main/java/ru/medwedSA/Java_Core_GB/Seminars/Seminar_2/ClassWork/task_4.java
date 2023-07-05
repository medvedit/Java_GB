package ru.medwedSA.Java_Core_GB.Seminars.Seminar_2.ClassWork;

/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST. И метод,
 * который запишет эту строку в простой текстовый файл. Обработайте исключения.
 */

import java.io.FileWriter;
import java.io.IOException;

public class task_4 {

    private static final String ADDRESS_FILE = "/Users/Medwed_SA/" +
            "Desktop/Education/Java/project_IntelliJ_IDEA/Java_GB/src/main/java/ru/medwedSA/" +
            "Java_Core_GB/Seminars/Seminar_2/ClassWork/TEST.txt";

    public static void main(String[] args) {
        writingToFile();
    }

    public static String get100WordTest() {
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            content.append("TEST\n");
        }
        return content.toString();
    }

    public static void writingToFile() {
        try (FileWriter writer = new FileWriter(ADDRESS_FILE)) {
            writer.write(get100WordTest());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
