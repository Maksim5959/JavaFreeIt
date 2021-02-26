/*
 * 6) Даны 2 числа. Вывести большее из них
 */

import java.util.Scanner;

public class AddTask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrNumbers[] = new int[2];
        int numberCount = 2;
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.println("Введите ваше число" + " (осталось ввести " + "<" + numberCount-- + "> )" + ":");
            arrNumbers[i] = sc.nextInt();
        }
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i] > maxNumber) {
                maxNumber = arrNumbers[i];
            }
        }
        System.out.println("Большее число из введенных = " + maxNumber);
    }
}
