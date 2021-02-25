/*Создать массив, заполнить его случайными элементами, распечатать,
 * перевернуть, и снова распечатать (при переворачивании нежелательно создавать
 * еще один массив).
 */

import java.util.Random;

public class Task15 {

    public static void main(String[] args) {
        int numbersArray[] = new int[11];
        Random rand = new Random();
        int i;
        System.out.println("Исходный массив: ");
        for (i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = rand.nextInt(10) + 0;
            System.out.println(numbersArray[i]);
        }
        int reverse = 0;
        int length = numbersArray.length;
        int j = numbersArray.length;
        for (i = 0; i < numbersArray.length / 2; i++) {
            reverse = numbersArray[length - i - 1];
            numbersArray[length - i - 1] = numbersArray[i];
            numbersArray[i] = reverse;
        }
        System.out.println("Перевернутый массив: ");
        for (i = 0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }
    }
}
