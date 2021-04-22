/*
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summNumber = 0;
        System.out.println("Введите количество чисел для которых нужно рассчитать сумму: ");
        int numberCount = sc.nextInt();
        for (int i = 3; i <= numberCount * 3 ; i += 3) {
                summNumber += i;

        }
        System.out.println("Сумма первых " + numberCount + " чисел, которые делятся на 3 без остатка = " + summNumber);
    }
}
