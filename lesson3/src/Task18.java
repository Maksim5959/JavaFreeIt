/*
* Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
* общее их количество.
*/
public class Task18 {

    public static void main(String[] args) {
        String str = "Найти в \"строке\" (не) только:; запятые, но    и другие!? знаки препинания. Подсчитать общее их количество.";
        String punctStr;
        int countPunctuation = 0;
        boolean punct;
        for (int i = 0;i < str.length();i++) {
           punctStr = "" + str.charAt(i);
           punct = punctStr.matches("\\p{Punct}");
               if (punct){
                   countPunctuation++;
               }
        }
        System.out.println("В заданном предложении " + countPunctuation + " знака(ов) препинания.");
    }
}
