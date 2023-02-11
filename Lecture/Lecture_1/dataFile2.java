package Java_GB.Lecture.Lecture_1;

import java.io.BufferedReader;
import java.io.FileReader;



public class dataFile2 {
    public static void main(String[] args) throws Exception{ // в этом примере возможная ошибка обработана throws Exception
                                                            // а не try catch как в файле dataFile.java
        BufferedReader br = new BufferedReader(new FileReader("notes3.txt"));
        String str;
        while ((str = br.readLine()) != null){
            System.out.printf("== %s ==\n", str);
        }
        br.close();

    }

}
