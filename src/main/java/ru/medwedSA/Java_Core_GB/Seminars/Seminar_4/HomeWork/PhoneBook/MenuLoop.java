package ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.HomeWork.PhoneBook;

import static ru.medwedSA.Java_Core_GB.Seminars.Seminar_4.HomeWork.PhoneBook.MainApp.phoneBook;

public class MenuLoop {

    protected static void menuLoop() throws InterruptedException {
        // главное меню
        Menu menu = new Menu();
        menu.add("1", "Вывод всех записей");
        menu.add("2", "Добавление дополнительного номера телефона к существующему абоненту");
        menu.add("3", "Поиск логина по номеру");
        menu.add("4", "Поиск номера(ов) по логину");
        menu.add("5", "Изменить/Добавить номер телефона по логину.");
        menu.add("6", "Удаление заданного номера (поиск номера у всех абонентов)");
        menu.add("7", "Удаление записи по логину");
        menu.add("8", "Импорт/Экспорт");
        menu.add("Q", "Выход");
        while (true) {
            switch (menu.run()) {
/*  Код закомментированный тут, рабочий и привычен для меня. Но IDEA предложила более компактный вариант его
        написания, что и представлено ниже..
                  case "1":
                      Actions.view_all(phoneBook);
                      break;
                  case "2":
                      Actions.add_number(phoneBook);
                      break;
                  case "3":
                      Actions.find_login(phoneBook);
                      break;
                  case "4":
                      Actions.find_phones(phoneBook);
                      break;
                  case "5":
                      Actions.edit(phoneBook);
                      break;
                  case "6":
                      Actions.remove_numbers(phoneBook);
                      break;
                  case "7":
                      Actions.remove_login(phoneBook);
                      break;
                  case "8":
                      Actions.import_export(phoneBook);
                      break;
                  case "Q":
                      System.out.println("Удачи!");
                    return;                                           */
                case "1" -> Actions.view_all(phoneBook);
                case "2" -> Actions.add_number(phoneBook);
                case "3" -> Actions.find_login(phoneBook);
                case "4" -> Actions.find_phones(phoneBook);
                case "5" -> Actions.edit(phoneBook);
                case "6" -> Actions.remove_numbers(phoneBook);
                case "7" -> Actions.remove_login(phoneBook);
                case "8" -> Actions.import_export(phoneBook);
                case "Q" -> {
                    System.out.println("Удачи!");
                    return;
                }
            }
            System.out.println();
        }
    }
}
