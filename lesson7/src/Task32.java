import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
* Имеется текст. Следует составить для него частотный словарь.
* */
public class Task32 {
    public static void main(String[] args) {
        String text = "Существуют две основные трактовки понятия «текст»: имманентная (расширенная, философски нагруженная) и репрезентативная (более частная). " +
                "Имманентный подход подразумевает отношение к тексту как к автономной реальности, нацеленность на выявление его внутренней структуры. " +
                "Репрезентативный — рассмотрение текста как особой формы представления информации о внешней тексту действительности. " +
                "В лингвистике термин «текст» используется в широком значении, включая и образцы устной речи. " +
                "Восприятие текста изучается в рамках лингвистики текста и психолингвистики. ";

        StringTokenizer stringTokenizer = new StringTokenizer(text.toLowerCase());
        ArrayList<String> wordList = new ArrayList<>();

        while (stringTokenizer.hasMoreTokens()) {
            wordList.add(stringTokenizer.nextToken(" ,!.?/\\}{)(*&^%$#@><\":;'«»—"));
        }

        HashMap<String,Integer> wordsHashMap = new HashMap<>();

        for (String word: wordList) {
            if (wordsHashMap.containsKey(word)) {
                int countWord = wordsHashMap.get(word);
                wordsHashMap.put(word,++countWord);
            }else {
                wordsHashMap.put(word,1);
            }
        }

        for (String word:wordsHashMap.keySet()) {
            System.out.println("Слово " + "\"" + word + "\"" + " встречается в заданном тексте " + wordsHashMap.get(word) + " раз(а).");
        }
    }
}
