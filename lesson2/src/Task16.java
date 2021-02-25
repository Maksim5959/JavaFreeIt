/* Определите сумму элементов одномерного массива, расположенных между
 * минимальным и максимальным значениями.
 */

import java.util.Random;

public class Task16 {

    public static void main(String[] args) {
        // Задаем масив случайных чисел
        Random rand = new Random();
        int numbersArr[] = new int[10];
        int i;
        for (i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = rand.nextInt(10) + 0;
            System.out.println(numbersArr[i]);
        }
        int minIndex = 0;
        int minNumber = Integer.MAX_VALUE;
        for (i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] < minNumber) {
                minNumber = numbersArr[i];
                minIndex = i;
            }
        }
        int maxNumber = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] > maxNumber) {
                maxNumber = numbersArr[i];
                maxIndex = i;
            }
        }
        int sum = 0;
        if (minIndex < maxIndex) {
            for (i = minIndex; i <= maxIndex; i++) {
                sum += numbersArr[i];
            }
            System.out.println(sum);
        }
        if (minIndex > maxIndex) {
            for (i = maxIndex; i <= minIndex; i++) {
                sum += numbersArr[i];
            }
            System.out.println("Сумма элементов массива между минимальным и максимальным элементами включительно = " + sum);
        }
    }
}
