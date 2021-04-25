/*
 * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
 * числа.
 */

import java.util.ArrayList;
import java.util.Random;

public class Task30 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numberList.add(random.nextInt(10));
        }
        System.out.println(numberList);

        for (int i = 0; i < numberList.size(); i++) {
            for (int j = i+1; j < numberList.size(); j++) {
                if (numberList.get(i) == numberList.get(j)){
                    numberList.remove(j);
                    j--;
                }
            }
        }
        System.out.println(numberList);
    }
}
