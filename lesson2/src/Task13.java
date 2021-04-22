/*
 * Создать последовательность случайных чисел, найти и вывести наибольшее из них.
 */

import java.util.Random;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[500];

        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }

        System.out.println("Максимальное число = " + maxNumber);
    }
}
