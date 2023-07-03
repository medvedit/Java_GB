package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataFile2 {
    /**
     * Это решение схоже с решением из класса DataFile, в методе readDataFileNameNotes() Так же происходит считывание
     * данных построчно из файла и вывод каждой строки в консоль. Но тут использован цикл while, по-этому принудительное
     * закрытие соединения с файлом, кроме этого исключение не обработано, а просто проброшено.
     * Правильнее, короче в написании использовать код с try-with-resources.
     */
    public static void main(String[] args) throws IOException { // в этом примере возможная ошибка обработана throws IOException
                                                            // а не try catch как в файле dataFile.java
        BufferedReader br = new BufferedReader(new FileReader("/Users/Medwed_SA/Desktop/Education/" +
                "Java/project_IntelliJ_IDEA/Java_GB/src/main/java/ru/medwedSA/" +
                "Java_Core_GB/Lectures/Lecture_1/notes.txt"));
        String str;
        while ((str = br.readLine()) != null){ // пока br.readLine() не пуст, пока есть что читать...
            System.out.printf("== %s ==\n", str);
        }
        br.close(); // закрытие соединения с файлом.

    }

}
