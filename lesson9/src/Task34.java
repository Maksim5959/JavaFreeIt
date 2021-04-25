/*
 * Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
 * распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
 * распечатать.
 * */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task34 {
    public static void main(String[] args) throws Exception {
        System.out.println("Сумма чисел в файле = " + searchNumber(readFile(createFile())));
    }

    public static File createFile() throws Exception {
        File file = new File("C:/ReserveFile/FreeIT/lesson9", "file2.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Пример 1чтения 1 текстового  2файла 1 и вывода 6его на 1 экран. 17 Следует 26обратить внимание, " +
                "что в данном примере используется класс FileReader, поэтому он будет работать корректно и с русским текстом.");
        fileWriter.close();
        return file;
    }

    public static String readFile(File file) throws Exception {
        FileReader fileInputStream = new FileReader("file2.txt");
        String str = "";
        int res = fileInputStream.read();
        while (res != -1) {
            str += (char) res;
            res = fileInputStream.read();
        }
        fileInputStream.close();
        return str;
    }

    public static int searchNumber(String str) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            sum += Integer.parseInt(str.substring(matcher.start(), matcher.end()));
        }
        return sum;
    }
}
