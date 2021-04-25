/*
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task33 {

    public static void main(String[] args) throws Exception {
        System.out.println("Количество слов в тексте -- " + countWords(readFile(createFile())));
        System.out.println("Количество знаков препинания в тексте -- " + countPunctuation(readFile(createFile())));
    }

    public static File createFile() throws Exception {
        File file = new File("C:/ReserveFile/FreeIT/lesson9", "file.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Пример чтения текстового фала и вывода его на экран. Следует обратить внимание, " +
                "что в данном примере используется класс FileReader, поэтому он будет работать корректно и с русским текстом.");
        fileWriter.close();
        return file;
    }

    public static String readFile(File file) throws Exception {
        FileReader fileInputStream = new FileReader("file.txt");
        String str = "";
        int res = fileInputStream.read();
        while (res != -1) {
            str += (char) res;
            res = fileInputStream.read();
        }
        fileInputStream.close();
        return str;
    }

    public static int countWords(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, " .,><?/!@#$%^&*()_+-\"");
        return stringTokenizer.countTokens();
    }

    public static int countPunctuation(String str) {
        int count = 0;
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
