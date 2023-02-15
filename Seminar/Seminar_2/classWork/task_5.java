/*
 *  Напишите метод, который вернет содержимое текущей папки в виде массива строк.
 *  Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
 *  Обработайте ошибки с помощью try-catch конструкции.
 *  В случае возникновения исключения, оно должно записаться в лог - файл.
 *
 */

package Java_GB.Seminar.Seminar_2.classWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task_5 {
    public static void main(String[] args) {
        getMyListFiles();
        // логфоджей и логфоджей 2


    }
    public static void getMyListFiles() {
        File dir = new File("/Users/Medwed_SA/Desktop/Education/Java/Java_GB/Java_GB/Seminar/Seminar_2/classWork"); // Прочитали содержимое папки.
        StringBuilder listFiles = new StringBuilder();
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                listFiles.append(item.getName() + '\n');
            }
        }
        try {
            FileWriter writer = new FileWriter("/Users/Medwed_SA/Desktop/Education/Java/Java_GB/Java_GB/Seminar/Seminar_2/classWork/finalist.txt"); // положили в файл
            try {
                writer.write(listFiles.toString());
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
