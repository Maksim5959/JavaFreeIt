import java.util.StringTokenizer;

/*
* Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
* учесть, что слова могут разделяться несколькими пробелами, в начале и конце
* текста также могут быть пробелы, но могут и отсутствовать.
*/
public class Task19 {

    public static void main(String[] args) {
        String str = "   Найти в \"строке\" (не) только:; запятые, но    и другие!? знаки препинания. Подсчитать... общее их количество.   ";
        StringTokenizer strTok = new StringTokenizer(str, " .,;:'\"!?)(");
        int count = strTok.countTokens();
        System.out.println("Количество слов в заданной строке - " + count);
    }
}
