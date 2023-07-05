package ru.medwedSA.Java_Core_GB.Seminars.Seminar_2.ClassWork;

/*
 *  1) Напишите метод, который вернет содержимое текущей папки в виде массива строк.
 *  2) Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
 *  3) Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в
 *     лог - файл.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task_5 {
    private static final Logger LOGGER = Logger.getLogger(task_5.class.getName());
    private static final String LOG_FILE = "/Users/Medwed_SA/" +
            "Desktop/Education/Java/project_IntelliJ_IDEA/Java_GB/src/main/java/ru/medwedSA/" +
            "Java_Core_GB/Seminars/Seminar_2/ClassWork/log.txt";

    public static void main(String[] args) {

        writingDataToFileAndLoggingExceptions(arrayOfDirectories());

    }

    public static String[] arrayOfDirectories() {
        File dir = new File("/Users/Medwed_SA/" +
                "Desktop/Education/Java/project_IntelliJ_IDEA/Java_GB/src/main/java/ru/medwedSA/" +
                "Java_Core_GB/Seminars/Seminar_2/ClassWork"); // Прочитали содержимое папки classWork.
        return dir.list();
    }

    public static void writingDataToFileAndLoggingExceptions(String[] arr) {

        try (FileWriter writer = new FileWriter("/Users/Medwed_SA/" +
                "Desktop/Education/Java/project_IntelliJ_IDEA/Java_GB/src/main/java/ru/medwedSA/" +
                "Java_Core_GB/Seminars/Seminar_2/ClassWork/finaList.txt")) {
            for (String s : arr) {
                writer.write(s + '\n');
            }
        } catch (IOException e) {
            try {
                FileHandler file = new FileHandler(LOG_FILE, false);
                LOGGER.addHandler(file);
                LOGGER.log(Level.INFO, "Ошибка записи данных в файл..........");
                file.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
//            LOGGER.log(Level.INFO, "Запись лога с уровнем INFO (Информационная)");
//            LOGGER.log(Level.WARNING,"Запись лога с уровнем WARNING (Предупреждение)");
//            LOGGER.log(Level.SEVERE, "Запись лога с уровнем SEVERE (Серьёзная ошибка)");
        }
    }
}