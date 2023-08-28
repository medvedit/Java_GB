package ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.HomeWork.PhoneBook;

import java.util.ArrayList;
import java.util.Scanner;

import static ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.HomeWork.PhoneBook.MenuLoop.menuLoop;

public class Actions {

    static Scanner scanner = new Scanner(System.in);

    public static String input() {
        return scanner.next();
    }

    public static void add_number(PhoneBook phoneBook) throws InterruptedException {
        System.out.println("Добавление записи");
        System.out.print("Введите логин:");
        String login = input();
        if (phoneBook.find_phone(login) == null) {
            System.out.println("\nТакого абонента не существует.\n");
            Thread.sleep(2000);
            Menu addingNumberPerson = new Menu();
            addingNumberPerson.add("1", "Создать новую запись для абонента " + login +  " и номер телефона");
            addingNumberPerson.add("Q", "Возврат в главное меню");
            while (true) {
                switch (addingNumberPerson.run()) {
                    case "1" -> {
                        System.out.printf("Создаем новую запись для абонента %s\n", login);
                        Thread.sleep(2000);
                        System.out.print("Введите номер телефона:_ ");
                        String phone = input();
                        phoneBook.add(login, phone);
                        System.out.println("Абонент успешно добавлен.");
                        Thread.sleep(3000);
                        return;
                    }
                    case "Q" -> menuLoop();
                }
            }

        } else {
            System.out.printf("Введите дополнительный номер телефона для абонента %s\n", login);
            System.out.print(":_ ");
            String phone = input();
            phoneBook.add(login, phone);
            System.out.println("Номер успешно добавлен.");
            Thread.sleep(3000);
        }
    }

    /**
     *  Метод поиска логина абонента по введенному в консоль номеру телефона. Метод может вернуть список логинов
     *  абонентов, т.к. не исключено, что у двух разных абонентов будет одинаковый номер телефона, например рабочий.
     *  В случае отсутствия того номера
     */
    public static void find_login(PhoneBook phoneBook) throws InterruptedException {
        System.out.println("Поиск логина по номеру телефона");
        System.out.print("Введите номер:");
        String phone = input();
        if (phoneBook.find_login(phone).isEmpty()) {
            System.out.println("\nТакого номера в телефонной книге нет.");
            Thread.sleep(2000);
        } else {
            if (phoneBook.find_login(phone).size() > 1) {
                System.out.printf("\nНомер принадлежит нескольким абонентам => %s\n", phoneBook.find_login(phone));
                Thread.sleep(2000);
            } else {
                System.out.printf("\nНомер принадлежит абоненту => %s\n", phoneBook.find_login(phone));
                Thread.sleep(2000);
            }
        }
    }

    /**
     *  Вывод списка всех номеров телефона у конкретного пользователя. Имя пользователя вводится в консоль.
     */

    public static void find_phones(PhoneBook phoneBook) throws InterruptedException {
        System.out.println("Поиск номеров по логину");
        System.out.print("Введите логин:");
        String login = input();
        if (phoneBook.find_phone(login) == null) {
            System.out.println("Такого абонента не существует.");
            Thread.sleep(2000);
        } else {
            System.out.printf("У абонента имеются следующие номера телефонов: \n%s\n\n4", phoneBook.find_phone(login));
            Thread.sleep(2000);
        }
    }

    /**
     *  Добавление или изменение номера телефона. Имя абонента, у которого производятся эти действия,
     *  вводится в консоль.
     */
    public static void edit(PhoneBook phoneBook) throws InterruptedException {
        System.out.println("Изменение записи");
        System.out.print("Введите логин:");
        String login = input();
        if (phoneBook.find_phone(login) == null) {
            System.out.println("Такого логина нет...");
            Thread.sleep(2000);
            System.out.println("Выберите новое действие из списка меню: ...");
        } else {
            System.out.println(phoneBook.find_phone(login));
            System.out.print("Введите старый номер телефона:");
            String oldPhone = input();
            System.out.print("Введите новый номер телефона:");
            String newPhone = input();
            phoneBook.replace_phone_from_login(login, newPhone, oldPhone);
            System.out.println(phoneBook.find_phone(login));
        }

    }

    /**
     *  Удаление введенного (в метод) номера телефона.
     *  Метод find_login() вернет список абонентов у которых встречается удаляемый номер.
     *  Метод remove_phone().size() вернет количество абонентов у которых удаляется номер телефона, кроме этого
     *  метод remove_phone() запускает процесс удаления номера телефона из записной книги.
     */
    public static void remove_numbers(PhoneBook phoneBook) throws InterruptedException {
        System.out.println("Удаление номера телефона");
        System.out.print("Введите номер телефона:");
        String phone = input();
        ArrayList<String> logins = phoneBook.find_login(phone); // получил список всех имен по номеру телефона.
        int h = phoneBook.remove_phone(phone).size(); // Запустил метод удаления абонентов и вернул размер списка
                                                      // удаляемых абонентов в из метода.
        if (h != 0){ // если размер не ноль
            if (h > 1) { // если совпадений больше одного, то вывод количества абонентов и их имена.
                System.out.printf("\nНомер удален у %s абонентов => %s\n", h, logins);
                Thread.sleep(2000);
            } else { // абонент один и его имя.
                System.out.printf("\nНомер удален у 1 абонента => %s\n", logins);
                Thread.sleep(2000);
            }
        } else { // иначе абонентов с таким номером телефона нет.
            System.out.printf("\nТакого номера => %s нет в телефонной книге", phone);
            Thread.sleep(2000);
        }
    }


    /**
     * Удаление записи телефонной книги по логину.
     */
    public static void remove_login(PhoneBook phoneBook) throws InterruptedException {
        System.out.println("Удаление записи по логину");
        System.out.print("Введите логин:");
        String login = input();
        String logins = phoneBook.login(login);
        if (logins == null) {
            System.out.printf("\nАбонента %s нет в телефонной книге.\n", login);
            Thread.sleep(2000);
        } else  {
            System.out.printf("\nАбонент %s удален из телефонной книги.\n", logins);
            phoneBook.remove_login(login);
            Thread.sleep(2000);
        }
    }

    /**
     * Вложенное меню Импорта/Экспорта.
     */
    public static void import_export(PhoneBook phoneBook) throws InterruptedException {
        Menu menuExportImport = new Menu();
        menuExportImport.add("1", "Экспорт в JSON");
        menuExportImport.add("2", "Импорт из JSON");
        menuExportImport.add("Q", "Возврат в главное меню");
        while (true) {
            switch (menuExportImport.run()) {
                case "1" -> {
                    ImportExport.phoneBookExport(phoneBook);
                    System.out.println("Телефонная книга обновлена.");
                    Thread.sleep(2000);
                    return;
                }
                case "2" -> {
                    ImportExport.phoneBookImport(phoneBook);
                    return;
                }
                case "Q" -> menuLoop();
            }
            System.out.println();
        }
    }


    /**
     * Вывод всех записей телефонной книги в консоль.
     *
     * @param phoneBook
     */
    public static void view_all(PhoneBook phoneBook) throws InterruptedException {
        System.out.println("Все записи: ");
        phoneBook.print();
        System.out.println();
        Thread.sleep(4000);
    }

}
