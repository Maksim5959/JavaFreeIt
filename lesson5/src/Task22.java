import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
* Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
* записаных по правилам Java, с помощью регулярных выражений и вывести их на
* страницу.
*/
public class Task22 {
    public static void main(String[] args) {
        String str = "Hello    0x12AF12.,! Java World .,=0x15AD120x65AA!! ...\'0x156654";
        String [] strSplit = str.split("0[xX]");
        System.out.println("Шестнадцатиричные числа в заданной строке: ");
        for (int i = 0;i < strSplit.length;i++){
            strSplit [i] = "0x" + strSplit [i];
            Pattern pattern = Pattern.compile("0[xX][0-9a-fA-F]+");
            Matcher matcher = pattern.matcher(strSplit [i]);
            if (matcher.find()) {
                System.out.println(strSplit [i].substring(matcher.start(),matcher.end()));
            }
        }
    }
}
