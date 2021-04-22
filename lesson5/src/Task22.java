import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
 * записаных по правилам Java, с помощью регулярных выражений и вывести их на
 * страницу.
 */
public class Task22 {
    public static void main(String[] args) {
        String str = "Hello    0x12AF12.,! Java World .,=0x15AD12 0x65AA!! ...\'0x156654";
        System.out.println("Шестнадцатиричные числа в заданной строке: ");
        Pattern pattern = Pattern.compile("0[xX][0-9a-fA-F]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
