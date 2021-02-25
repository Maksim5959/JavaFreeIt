/*
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел, для которых необходимо вычислить сумму: ");
        int n = sc.nextInt();
        int numberCount = 0;
        int summNumber = 0;
        for (; ; ) {
            System.out.println("Введите целое число: ");
            int number = sc.nextInt();
            if (number % 3 == 0 && number != 0) {
                summNumber += number;
                numberCount++;
            }
            if (numberCount == n) {
                break;
            }
        }
        System.out.println("Сумма первых " + n + " чисел, которые делятся на 3 без остатка = " + summNumber);
    }
}
