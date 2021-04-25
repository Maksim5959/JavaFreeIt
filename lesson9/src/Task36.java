import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
* должны быть распечатаны отдельно.
* */
public class Task36 {
    public static void main(String[] args) throws Exception {
        System.out.println("Файлы: ");
        printNameFiles(createFile());
        System.out.println("Каталоги: ");
        printNameFolders(createFile());
    }

    public static File createFile() throws Exception {
        File file = new File("C:/ReserveFile/FreeIT/lesson9/");
        return file;
    }

    public static void printNameFiles(File file) {
        if (file.isDirectory()){
            for (File folder: file.listFiles()) {
                if (folder.isFile()){
                    System.out.println(folder.getName());
                }
            }
        }
    }

    public static void printNameFolders(File file) {
        if (file.isDirectory())
            for (File folder : file.listFiles()) {
                if (folder.isDirectory()) {
                    System.out.println(folder.getName());
                }
            }
    }
}
