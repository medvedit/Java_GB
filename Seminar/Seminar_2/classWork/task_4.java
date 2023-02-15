/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
 * который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

package Java_GB.Seminar.Seminar_2.classWork;

import java.io.FileWriter;
import java.io.IOException;

public class task_4 {

    public static void main(String[] args) {

        setMyFile();

    }

    public static String get100TEST() {
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            content.append("TEST\n");
        }
        return content.toString();
    }

    public static void setMyFile() {

        try {
            FileWriter writer = new FileWriter(
                    "/Users/Medwed_SA/Desktop/Education/Java/Java_GB/Java_GB/Seminar/Seminar_2/classWork/TEST.txt");
            try {
                writer.write(get100TEST());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
