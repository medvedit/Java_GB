package ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.HomeWork.PhoneBook;

import static ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.HomeWork.PhoneBook.ImportExport.phoneBookImport;
import static ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.HomeWork.PhoneBook.MenuLoop.menuLoop;

public class MainApp {

    public static PhoneBook phoneBook;

    public static void main(String[] args) throws InterruptedException {
        phoneBook = new PhoneBook();
        phoneBookImport(phoneBook); // если есть файл phoneBook.json, то подгрузим из него данные.
        menuLoop();
    }
}
