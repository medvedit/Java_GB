package ru.medwedSA.Java_Core_GB.Lectures.Lecture_1.Task;

/*
 * Задачи для самоконтроля:
 * 1. Задана натуральная степень k. Сформировать случайным образом список коэффициентов (значения от 0 до 100)
 *    многочлена многочлен степени k.
 *    *Пример: к=2 => 2*x2 + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
 * __________________________________________________________________________________________________________
 * 2. Даны два файла, в каждом из которых находится запись многочлена.
 *    Сформировать файл содержащий сумму многочленов.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TaskAboutSergeiKamyanetsky {

    private static final String AddressFile = "/Users/Medwed_SA/Desktop/Education/Java/project_IntelliJ_IDEA/" +
            "Java_GB/src/main/java/ru/medwedSA/Java_Core_GB/Lectures/Lecture_1/Task/file33.txt";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральную степень k = ");
        int k = scanner.nextInt();
        List<Integer> coefficient = createMn(k);
        writeToFile(createStr(coefficient));
    }

    public static void writeToFile(String st) {
        try {
            FileWriter fileWriter = new FileWriter(AddressFile, true);
            fileWriter.write(st);
            fileWriter.append('\n');
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int rnd() {
        Random random = new Random();
        return random.nextInt(101);
    }

    public static List<Integer> createMn(int k) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i <= k; i++) {
            lst.add(rnd());
        }
        return lst;
    }

    public static String createStr(List<Integer> sp) {
        List<Integer> list = new ArrayList<>(sp);
        StringBuilder sb = new StringBuilder();
        if (list.size() < 1) {
            sb.append("x = 0");
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (i != list.size() - 1 && list.get(i) != 0 && i != list.size() - 2) {
                    sb.append(list.get(i)).append("x^").append(list.size() - i - 1);
                    if (list.get(i + 1) != 0) {
                        sb.append(" + ");
                    }
                } else if (i == list.size() - 2 && list.get(i) != 0) {
                    sb.append(list.get(i)).append("x");
                    if (list.get(i + 1) != 0) {
                        sb.append(" + ");
                    }
                } else if (i == list.size() - 1 && list.get(i) != 0) {
                    sb.append(list.get(i)).append(" = 0");
                } else if (i == list.size() - 1 && list.get(i) == 0) {
                    sb.append(" = 0");
                }
            }
        }
        return sb.toString();
    }
}


