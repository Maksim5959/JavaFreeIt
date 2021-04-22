/*
 * Создать массив оценок произвольной длины, вывести максимальную и
 * минимальную оценку, её (их) номера.
 */
public class Task14 {

    public static void main(String[] args) {
        int[] rating = {5, 10, 3, 4, 6, 1};
        int maxNumber = Integer.MIN_VALUE;
        int maxIndex = 0;

        int minNumber = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < rating.length; i++) {
            if (rating[i] > maxNumber) {
                maxNumber = rating[i];
                maxIndex = i;
            }
            if (rating[i] < minNumber) {
                minNumber = rating[i];
                minIndex = i;
            }

        }
        System.out.println("Максимальная оценка  " + maxNumber);
        System.out.println("Номер максимальной оценки в списке - " + (maxIndex + 1));
        System.out.println("Минимальная оценка  " + minNumber);
        System.out.println("Номер минимальной оценки в списке - " + (minIndex + 1));
    }
}
