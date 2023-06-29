package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1;

import java.io.BufferedReader;
import java.io.FileReader;

public class DataFile2 {
    public static void main(String[] args) throws Exception{ // в этом примере возможная ошибка обработана throws Exception
                                                            // а не try catch как в файле dataFile.java
        BufferedReader br = new BufferedReader(new FileReader("/Users/" +
                "Medwed_SA/Desktop/Education/Java/project_IntelliJ_IDEA/" +
                "Java_GB/src/main/java/ru/medwedSA/Java_Core_GB/" +
                "Lectures/Lecture_1/notes3.txt"));
        String str;
        while ((str = br.readLine()) != null){
            System.out.printf("== %s ==\n", str);
        }
        br.close();

    }

}
