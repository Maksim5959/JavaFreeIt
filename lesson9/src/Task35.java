/*
 * Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
 * распечатать числа и их среднее арифметическое.
 * */

import java.io.*;
import java.util.Random;

public class Task35 {
    public static void main(String[] args) throws Exception {
        createFile();
        writeFile();
        readFile();
    }

    public static void createFile() throws Exception {
        File file = new File("C:/ReserveFile/FreeIT/lesson9", "file3.txt");
    }

    public static void writeFile() {
        Random random = new Random();
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("file3.txt")));
            for (int i = 0; i < 20; i++) {
                dataOutputStream.writeInt(random.nextInt(100));
            }
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {
        DataInputStream dataInputStream;
        double average = 0;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("file3.txt")));
            int sum = 0;
            while (dataInputStream.available() > 0) {
                int number = dataInputStream.readInt();
                sum += number;
                System.out.print("[" + number + "] ");
            }
            System.out.println();
            average = sum / 20.0;
            System.out.println("Среднее арифметическое: " + average);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
