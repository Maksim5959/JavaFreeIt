/* Имеется целое число, определить является ли это число простым, т.е.
 * делится без остатка только на 1 и себя.
 */
public class Task11 {
    public static void main(String[] args) {
        int number = 107;
        int division;
        int divisionCount = 0;
        for (int i = 1; i <= number; i++) {
            division = number % i;
            if (division == 0) {
                divisionCount++;
            }
        }
        if (divisionCount == 2 || number == 1) {
            System.out.println(number + " - простое число!");
        } else {
            System.out.println(number + " - не является простым числом!");
        }
    }
}
