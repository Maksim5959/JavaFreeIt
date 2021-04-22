import java.util.StringTokenizer;

/*
* Имеется строка с текстом. Вывести текст, составленный из последних букв
* всех слов.
*/
public class Task20 {

    public static void main(String[] args) {
        String str = "   Найти в \"строке\" (не) только:; запятые, но    и другие!? знаки препинания. Подсчитать... общее их количество.   ";
        StringTokenizer strTok = new StringTokenizer(str, " .,;:'\"!?)(");
        int count = strTok.countTokens();
        String strWords = "";
        String endWord = "";
        while (strTok.hasMoreTokens()){
            strWords = strTok.nextToken();
            endWord += strWords.charAt(strWords.length()-1);
        }
        System.out.println("Слово из последних букв всех слов заданной строки - " + "\"" + endWord + "\"");
    }
}
