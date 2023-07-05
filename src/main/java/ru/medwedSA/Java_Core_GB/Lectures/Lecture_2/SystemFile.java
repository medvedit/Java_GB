package ru.medwedSA.Java_Core_GB.Lectures.Lecture_2;

/*
    Для работы нужно:
    File <имя> = new File(<полный путь к файлу>);
    File f1 = new File("file.txt");
    File f2 = new File("/Users/sk/vscode/java_projects/file.txt");

    Работа с файловой системой:

    isHidden():          возвращает истину, если каталог или файл является скрытым
    length():            возвращает размер файла в байтах
    lastModified():      возвращает время последнего изменения файла или каталога
    list():              возвращает массив файлов и подкаталогов, которые находятся в каталоге
    listFiles():         возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
    mkdir():             создает новый каталог
    renameTo(File dest): переименовывает файл или каталог
    length():            возвращает размер файла в байтах
    lastModified():      возвращает время последнего изменения файла или каталога
    list():              возвращает массив файлов и подкаталогов, которые находятся в каталоге
    listFiles():         возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
    mkdir():             создает новый каталог
    renameTo(File dest): переименовывает файл или каталог
 */

import java.io.File;
import java.io.FileWriter;

public class SystemFile {

    private static final String USER_DIR = "user.dir";
    private static final String ADDRESS_FILE_TXT = "/files/file.txt";
    public static void main(String[] args) {

        fileWork();
        fileWork2();
        fileWork3();
        fileWork4();
        fileWork5(); // метод создающий в рабочем проекте папку files
    }

    static void fileWork() {
        String pathProject = System.getProperty(USER_DIR);
        String pathFile = pathProject.concat(ADDRESS_FILE_TXT);

        File f1 = new File(ADDRESS_FILE_TXT);
        File f2 = new File("/Users/Medwed_SA/Desktop/Education/Java/project_IntelliJ_IDEA/Java_GB/src/main/java/ru/medwedSA/Java_Core_GB/Lectures/Lecture_2/file.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());

        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());
        System.out.println(pathFile);
    }

    /*
     * Работа с файловой системой. Файлы. Ошибки:
     *
     * try {
     * Код, в котором может появиться ошибка
     * } catch (Exception e) {
     * Обработка, если ошибка случилась
     * }
     * finally {
     * Код, который выполнится в любом случае
     * }
     */
    static void fileWork2() { // НО если есть возможность избавиться от написания блока rey catch
                              // то, необходимо это делать.
        try {
            String pathProject = System.getProperty(USER_DIR);
            String pathFile = pathProject.concat(ADDRESS_FILE_TXT);
            File f3 = new File(pathFile);
            System.out.println("try");
            System.out.println(f3);
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }

    static void fileWork3() {
        try {
            String pathProject = System.getProperty(USER_DIR);
            String pathFile = pathProject.concat(ADDRESS_FILE_TXT);
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }

    static void fileWork4() {
        // Работа с файловой системой. Файлы. Ошибки
        String line = "empty";
        try {
            String pathProject = System.getProperty(USER_DIR);
            String pathFile = pathProject.concat(ADDRESS_FILE_TXT);
            File file = new File(pathFile);

            if (file.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("new Line_1");

                //#region lineSeparator
                // A string containing "\r\n" for non-Unix
                // platforms, or a string containing
                // "\n" for Unix platforms.
                fileWriter.append(System.lineSeparator());
                //#endregion

                fileWriter.write("new Line_2");
                fileWriter.append('\n');
                fileWriter.append("new Line_3");
                fileWriter.append('\n');
                fileWriter.flush();
                fileWriter.close();
                // BufferedReader bufReader = new BufferedReader(new FileReader(file));
                // line = bufReader.readLine();
                // bufReader.close();
            }
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            System.out.println(line);
        }
    }

    static void fileWork5() {
        // Работа с файловой системой. Каталоги
        String pathProject = System.getProperty(USER_DIR);
        String pathDir = pathProject.concat("/files");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath());
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fName : dir.list()) {
            System.out.println(fName);
        }
    }

}
