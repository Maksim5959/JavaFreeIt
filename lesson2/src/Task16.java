/* Определите сумму элементов одномерного массива, расположенных между
 * минимальным и максимальным значениями.
 */

import java.util.Arrays;
import java.util.Random;

public class Task16 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbersArr = new int[10];
        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(numbersArr));

        int maxNumber = Integer.MIN_VALUE;
        int maxIndex = 0;
        int minNumber = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] > maxNumber) {
                maxNumber = numbersArr[i];
                maxIndex = i;
            }
            if (numbersArr[i] < minNumber) {
                minNumber = numbersArr[i];
                minIndex = i;
            }

        }

        int sum = 0;

        if (minIndex < maxIndex) {
            for (int i = minIndex; i <= maxIndex; i++) {
                sum += numbersArr[i];
            }
        } else if (minIndex > maxIndex) {
            for (int i = maxIndex; i <= minIndex; i++) {
                sum += numbersArr[i];
            }
        }

        System.out.println("Сумма элементов массива между минимальным и максимальным элементами включительно = " + sum);
    }
}
