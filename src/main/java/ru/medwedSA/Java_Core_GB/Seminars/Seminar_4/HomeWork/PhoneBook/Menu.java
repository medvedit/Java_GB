package ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.HomeWork.PhoneBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.HomeWork.PhoneBook.MainApp.phoneBook;

public class Menu {

    HashMap<String, String> menu_list;

    public Menu() {
        this.clean();
    }

    /**
     * Добавление пунктов меню
     *
     * @param a           - пункт меню
     * @param description - описание
     */
    public void add(String a, String description) {
        menu_list.put(a, description);
    }

    /**
     * Очистка пунктов меню
     */
    public void clean() {
        menu_list = new HashMap<>();
    }

    /**
     * Вывод меню в консоль
     */
    public void print() {
        ArrayList<String> menu_items = new ArrayList<String>(menu_list.keySet());
        Collections.sort(menu_items);
        System.out.printf("Количество записей в телефонной книге => %d\n" ,phoneBook.phoneBookSize(phoneBook.book));
        System.out.println("Выберите действие");
        for (String a : menu_items) {
            System.out.printf("%4s - %s\n", a, menu_list.get(a));
        }

    }

    /**
     * Основной цикл меню. Вывод списка пунктов в консоль, ожидание ответа пользователя, проверка ответа.
     *
     * @return - возврат выбранного значения меню (String)
     */
    public String run() {
        String key;
        while (true) {
            this.print();
            System.out.print(" :_ ");
            key = Actions.input();
            System.out.println();
            if (menu_list.get(key) != null) {
                // сработал пункт меню
                return key;
            }
        }
    }

}
