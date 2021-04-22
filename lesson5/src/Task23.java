/*
* Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
* которых есть параметры, например <p id=”p1”>, и замену их на простые теги
* абзацев <p>.
*/
public class Task23 {
    public static void main(String[] args) {
        String str = "<p> Hello </p> <p align=\"center\"> Java </p>   <p align=\"right\"> World! </p> <p id=\"p1\">***********</p>";
        System.out.println("Исходная строка: ");
        System.out.println(str);
        System.out.println("Cтрока с замененными тегами абзацев: ");
        System.out.println(str.replaceAll("<p\\s.+?>","<p>"));
    }
}
