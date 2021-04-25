/*
* Создать список оценок учеников с помощью ArryList, заполнить случайными
* оценками. Найти самую высокую оценку с использованием итератора.
* */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task31 {
    public static void main(String[] args) {
        ArrayList<Integer> noteList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            noteList.add(random.nextInt(10) + 1);
        }
        System.out.println(noteList);

        Iterator<Integer> iterator = noteList.iterator();
        int maxNote = 1;
        while (iterator.hasNext()) {
            int note = iterator.next();
            if (note > maxNote) {
                maxNote = note;
            }
        }
        System.out.println("Самая высокая оценка - " + maxNote);
    }
}
