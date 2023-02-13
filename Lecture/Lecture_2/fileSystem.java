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

package Java_GB.Lecture.Lecture_2;

import java.io.File;
import java.io.FileWriter;

public class fileSystem {

    public static void main(String[] args) {

        fileWork();
        fileWork2();
        fileWork3();
        fileWork4();
        fileWork5();

    }

    static void fileWork() {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());

        System.out.println(pathFile);
        File f1 = new File("file.txt");
        File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
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
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
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
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
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
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);

            if (file.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("new line");

                //#region lineSeparator
                // A string containing "\r\n" for non-Unix
                // platforms, or a string containing
                // "\n" for Unix platforms.
                fileWriter.append(System.lineSeparator());
                //#endregion

                fileWriter.write("new line");
                fileWriter.append("new line");
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
        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/files");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath());
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fname : dir.list()) {
            System.out.println(fname);
        }
    }

}
