/*
 * Создать последовательность случайных чисел, найти и вывести наибольшее из них.
 */

import java.util.Random;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int countNumbers = sc.nextInt();
        int countNumbersMarker = countNumbers;
        Random rand = new Random();
        int [] numbers = new int[countNumbers];
        for (countNumbers = 0; countNumbers < numbers.length; countNumbers++) {
            System.out.println("Введите число, осталось ввести " + "<" + (countNumbersMarker--) + ">");
            numbers[countNumbers] = sc.nextInt();
        }
        int maxNumber = Integer.MIN_VALUE;
        for (countNumbers = 0; countNumbers < numbers.length; countNumbers++) {
            if (numbers[countNumbers] > maxNumber) {
                maxNumber = numbers[countNumbers];
            }
        }
        System.out.println("Максимальное число = " + maxNumber);
    }
}
