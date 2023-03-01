/*
 * Задача 1:
 *  Реализовать телефонный справочник
    HashMap<Login, Список телефонов>
    - добавлять телефон
    - удалять телефон
    - находить по логину телефон/список телефонов
 */

package Java_GB.Seminar.Seminar_4.homeWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class phoneBook {

    public static void main(String[] args) throws IOException {

        menu();

    }

    public static void menu() {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();
        String userChoice = "";
        Boolean run = true;
        while (run) {
            ClearConsole();
            System.out.println("Введите номер действия:");
            System.out.println("1 - Вывод всех контактов");
            System.out.println("2 - Поиск контакта по логину");
            System.out.println("3 - Добавление контакта / телефона к контакту");
            System.out.println("4 - Отредактировать контакт (удалить телефон)");
            System.out.println("5 - Сохранить книгу на диск в txt файл");
            System.out.println("6 - Загрузить книгу из txt файла");
            System.out.println("7 - Очистить телефонную книгу в памяти устройства");
            System.out.println("0 - Выход");
            System.out.println();
            System.out.print("Введите номер действия: ");
            userChoice = getUserInput();

            if (userChoice.equals("1")) { // вывод всех контактов
                showAll(phoneBook);
                System.out.println("Нажмите Enter, чтобы вернуться в меню");
                System.console().readLine();

            } else if (userChoice.equals("2")) { // поиск контакта по логину
                findContact(phoneBook);
                System.out.println("Нажмите Enter, чтобы вернуться в меню");
                System.console().readLine();

            } else if (userChoice.equals("3")) { // добавление контакта/номера к контакту
                addPhoneNumber(phoneBook);
                System.out.println("Нажмите Enter, чтобы вернуться в меню");
                System.console().readLine();

            } else if (userChoice.equals("4")) { // отредактировать контакт (удалить телефон)
                editContact(phoneBook);
                System.out.println("Нажмите Enter, чтобы вернуться в меню");
                System.console().readLine();

            } else if (userChoice.equals("5")) { // сохранить в txt
                saveToTxtFile(phoneBook);
                System.out.println("Нажмите Enter, чтобы вернуться в меню");
                System.console().readLine();

            } else if (userChoice.equals("6")) { // чтение из txt файла
                phoneBook = readFromTxtFile();
                System.out.println("Нажмите Enter, чтобы вернуться в меню");
                System.console().readLine();

            } else if (userChoice.equals("7")) { // удаление книги из памяти устройства
                phoneBook = clearPhoneBook();
                System.out.println("Нажмите Enter, чтобы вернуться в меню");
                System.console().readLine();

            } else if (userChoice.equals("0")) { // выход
                run = false;
                System.out.println("Работа закончена");

            } else {
                ClearConsole();
                System.out.println("Нет такого пункта меню..");
                System.out.println("Нажмите Enter, чтобы вернуться в меню");
                System.console().readLine();
            }

        }
    }

    public static void findContact(HashMap<String, ArrayList<String>> map) {
        ClearConsole();
        System.out.print("Введите логин контакта: ");
        String name = getUserInput();
        if (map.get(name) == null) {
            System.out.println("Такого контакта в книге нет");
            ;
        } else {
            System.out.printf("На контакт записаны %d номер(а):\n", map.get(name).size());
            for (int i = 0; i < map.get(name).size(); i++) {
                System.out.println((i + 1) + ".: " + map.get(name).get(i));
            }
        }
    }

    public static Map<String, ArrayList<String>> editContact(HashMap<String, ArrayList<String>> data) {
        ClearConsole();
        System.out.print("Какой контакт надо отредактировать: ");
        String name = getUserInput();
        // int count = 0;
        if (data.get(name) == null) {
            System.out.println("Такого контакта в книге нет");
            ;
        } else {
            System.out.printf("На контакт записаны %d номер(а):\n", data.get(name).size());
            for (int i = 0; i < data.get(name).size(); i++) {
                System.out.println((i + 1) + ". " + data.get(name).get(i));
            }
            System.out.print("Введите номер записи, которую нужно удалить: ");
            try {
                int indexToDel = Integer.parseInt(getUserInput()) - 1;
                String removedTel = data.get(name).remove(indexToDel);
                System.out.println("Телефон " + removedTel + " удален");
            } catch (Exception e) {
                System.out.println("Ошибка записи: " + e);
                System.out.println("Введите пункт");
            }

        }

        return data;
    }

    public static void showAll(HashMap<String, ArrayList<String>> data) {
        ClearConsole();
        if (data.isEmpty()) {
            System.out.println("Справочник пуст.\n");
        } else {
            data.entrySet().forEach(record -> {
                System.out.println(record.getKey() + ":");
                for (int i = 0; i < record.getValue().size(); i++) {
                    System.out.println((i + 1) + ". " + record.getValue().get(i));
                }
            });

        }
    }

    public static void saveToTxtFile(HashMap<String, ArrayList<String>> data) {
        ClearConsole();
        StringBuilder str = new StringBuilder();
        try (BufferedWriter br = new BufferedWriter(new FileWriter("/Users/Medwed_SA/Desktop/Education/Java/Java_GB/Java_GB/Seminar/Seminar_4/homeWork/phones.txt"))) {
            data.entrySet().forEach(record -> {
                str.append(record.getKey() + ":");
                for (int i = 0; i < record.getValue().size(); i++) {
                    str.append(record.getValue().get(i));
                    if (i < record.getValue().size() - 1) {
                        str.append(",");
                    } else {
                        str.append("\n");
                    }
                }
            });
            br.write(str.toString());
            System.out.println("Книга сохранена в файле phones.txt\n");
        } catch (Exception e) {
            System.out.println("Ошибка записи: " + e);
        }
    }

    public static HashMap<String, ArrayList<String>> readFromTxtFile() {
        ClearConsole();
        HashMap<String, ArrayList<String>> resultData = new HashMap<String, ArrayList<String>>();

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/Medwed_SA/Desktop/Education/Java/Java_GB/Java_GB/Seminar/Seminar_4/homeWork/phones.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] splitted = line.split(":");
                resultData.put(splitted[0], new ArrayList<String>(Arrays.asList(splitted[1].split(","))));
            }
            System.out.println("Справочник загружен.\n");
        } catch (Exception e) {
            System.out.println("Ошибка записи: " + e);
        }
        return resultData;
    }

    public static Map<String, ArrayList<String>> addPhoneNumber(HashMap<String, ArrayList<String>> newEntry) {
        ClearConsole();
        System.out.print("Введите логин контакта: ");
        String name = getUserInput();
        if (newEntry.get(name) == null) {
            newEntry.put(name, new ArrayList<String>());
        } else {
            System.out.println("Такой логин уже есть.\n");
        }

        System.out.print("Введите телефон для добавления: ");

        String tel = getUserInput();
        newEntry.get(name).add(tel);
        System.out.printf("Номер телефона добавлен к контакту %s\n", name);
        return newEntry;

    }

    public static HashMap<String, ArrayList<String>> clearPhoneBook() {
        ClearConsole();
        HashMap<String, ArrayList<String>> newPhoneBook = new HashMap<String, ArrayList<String>>();
        System.out.println("Книга из памяти устройства удалена.\nНачните создание новой книги или загрузите из файла txt.\n");
        return newPhoneBook;
    }

    public static void ClearConsole() {
        try {
            String operatingSystem = System.getProperty("os.name");

            if (operatingSystem.contains("macOS")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String getUserInput() {

        String result = System.console().readLine();
        return result;
    }

}