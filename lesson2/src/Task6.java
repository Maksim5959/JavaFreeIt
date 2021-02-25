/*Создайте число. Определите, является ли число трехзначным. Определите, является
 * ли его последняя цифра семеркой. Определите, является ли число четным.
 */

public class Task6 {

    public static void main(String[] args) {
        int number = 457;
        // Определяем является ли число трехзначным.
        if ((number / 100 > 0) && (number / 100 < 10)) {
            System.out.println("Число " + number + " трехзначное! ");
        } else {
            System.out.println("Число " + number + " не является трехзначным! ");
        }
        // Определяем является ли заданное число четным.
        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное! ");
        } else {
            System.out.println("Число " + number + " нечетное! ");
        }
        // Определяем является ли последняя цифра числа семеркой.
        String numbersStr = "" + number;
        int lastNumberIndex = numbersStr.length();
        String lastNumber = "";
        lastNumber = numbersStr.charAt(lastNumberIndex - 1) + lastNumber;
        if (lastNumber.equals("7")) {
            System.out.println("Последняя цифра числа " + number + " семерка! ");
        } else {
            System.out.println("Последняя цифра числа " + number + " = " + lastNumber);
        }
    }
}

