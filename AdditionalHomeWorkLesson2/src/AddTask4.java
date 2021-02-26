/*
 * 4) Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */

import java.util.Scanner;

public class AddTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberCount = 3;
        int number;
        int plusNumberCount = 0;
        for (int count = 0; count < 3; count++) {
            System.out.println("Введите ваше число" + " (осталось ввести " + "<" + numberCount-- + "> )" + ":");
            number = sc.nextInt();
            if (number > 0) {
                plusNumberCount++;
            }
        }
        System.out.println("Количество положительных чисел = " + plusNumberCount);
    }
}

