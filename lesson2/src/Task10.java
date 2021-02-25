/*
 * Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */

public class Task10 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * (16 - 10) + 10);
        int randomNumberOut = randomNumber;
        long factorialNumber = 1;
        while (randomNumber != 0) {
            factorialNumber *= randomNumber;
            randomNumber--;
        }
        System.out.println("Факториал числа " + randomNumberOut + " = " + factorialNumber);
    }
}
