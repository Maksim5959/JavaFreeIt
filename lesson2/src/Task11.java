/* Имеется целое число, определить является ли это число простым, т.е.
 * делится без остатка только на 1 и себя.
 */
public class Task11 {
    public static void main(String[] args) {
        int number = 375112621;
        int division;
        if (number <= 1) {
            System.out.println(number + " - не является простым числом!");
            return;
        }
        for (int i = 2; i < number; i++) {
            division = number % i;
            if (division == 0) {
                System.out.println(number + " - не является простым числом!");
                return;
            }
        }
        System.out.println(number + " - простое число!");
    }
}
