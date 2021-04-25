/*
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными
 * оценками. Удалить неудовлетворительные оценки из списка.
 */

import java.util.ArrayList;
import java.util.Random;

public class Task29 {
    public static void main(String[] args) {

        ArrayList<Integer> noteList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            noteList.add(random.nextInt(10) + 1);
        }
        System.out.println(noteList);

        for (int i = 0; i < noteList.size(); i++) {
            if (noteList.get(i) < 4) {
                noteList.remove(i);
                i--;
            }
        }
        System.out.println(noteList);
    }
}
