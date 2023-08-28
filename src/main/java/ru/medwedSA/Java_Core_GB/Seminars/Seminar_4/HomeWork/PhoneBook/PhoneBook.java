package ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.HomeWork.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class PhoneBook {

    HashMap<String, HashSet<String>> book;

    public PhoneBook() {
        this.reset();

    }

    /**
     * Добавить телефонный номер в книгу
     *
     * @param login - логин (уникальный)
     * @param phone - номер телефона для добавления
     */
    public void add(String login, String phone) {
        HashSet<String> phones;
        if (book.get(login) != null) {
            phones = book.get(login);
        } else {
            phones = new HashSet<>();
        }
        phones.add(phone);
        book.put(login, phones);
    }

    /**
     * Получить логин по номеру телефона
     *
     * @param phone (String) - номер телефона для поиска логина
     * @return (String) - найденный логин, либо null
     */
    public ArrayList<String> find_login(String phone) {
        HashSet<String> phones;
        ArrayList<String> logins = new ArrayList<>();
        for (String login : book.keySet()) {
            phones = book.get(login);
            if (phones.contains(phone)) {
                logins.add(login);
            }
        }
        return logins;
    }

    /**
     * Получить список номеров телефонов по введенному логину
     *
     * @param login - логин для получения списка телефонов
     * @return - список телефонов с разделителем \n
     */
    public  ArrayList<String> find_phone(String login) {
        if (book.get(login) == null) {
            return null;
        }
        return new ArrayList<>(book.get(login));
    }

    /**
     * Удаление номера из всей книги (сквозной поиск)
     *
     * @param phone - номер для удаления
     */
    public ArrayList<String> remove_phone(String phone) {
        ArrayList<String> logins = this.find_login(phone);
        if (!(logins.isEmpty())) {
            for (String login : logins) {
                book.get(login).remove(phone);
            }
        }
//        this.clean(); // После активации метода => Если запись не содержит номеров, то запись удаляется.
        return logins;
    }


    /**
     * Удаление записи по логину
     *
     * @param login - удаляемый логин
     */
    public void remove_login(String login) {
        book.remove(login);
    }

    /**
     * Замена старого номера на новый
     *
     * @param login     - выбранный логин
     * @param new_phone - новый номер
     * @param old_phone - старый (удаляемый)
     */
    public void replace_phone_from_login(String login, String new_phone, String old_phone) {
        HashSet<String> phones = book.get(login);
        if (phones != null) {
            phones.remove(old_phone);
            phones.add(new_phone);
            book.put(login, phones);
        }
    }

    /**
     * Очистка книги от пустых записей (не содержащих номеров)
     */
    private void clean() {
        for (String login : book.keySet()) {
            if (book.get(login).isEmpty()) {
                this.remove_login(login);
            }
        }
    }

    /**
     * Печать всей телефонной книги.
     */
    public void print() {
        int n = 1; // Порядковый номер записи в книге.
        for (String login : book.keySet()) {
            System.out.printf("%d. %s: ", n, login);
            System.out.println(this.find_phone(login));
            n++;
        }
    }

    /**
     *
     * @param login       Входящий логин для поиска совпадений по логину в телефонной книге.
     * @return logins     Найденный логин или null
     */
    public String login(String login) {
        String logins = null;
        for (String item : book.keySet()) {
            if(item.equals(login)) {
                logins = item;
            }
        }
        return logins;
    }

    /**
     * Возвращает JSON всей тел.книги
     */
    public String get_json() {
        StringBuilder json = new StringBuilder("{\n");
        for (String login : book.keySet()) {
            json.append(String.format("\"%s\":{\"phone\":[", login));
            for (String phone : this.find_phone(login)) {
                json.append(String.format("\"%s\",", phone));
            }
            json.deleteCharAt(json.length() - 1);
            json.append("]},\n");
        }
        json.deleteCharAt(json.length() - 2);
        json.append("}");
        return json.toString();
    }

    /**
     * Получить количество всех login в книге
     *
     * @param book
     * @return
     */
    public int phoneBookSize(HashMap<String, HashSet<String>> book) {
        TreeSet<String> bookSize = new TreeSet<>(book.keySet());
//        System.out.println(bookSize); // Если тут раскомментировать, то в консоли, над выводом всего меню,
        // над выводом количества всех записей - будет напечатаны все имена абонентов из телефонной книги.
        return bookSize.size();
    }

    /**
     * Очистка всей книги от данных
     */
    public void reset() {
        book = new HashMap<>();
    }

}
