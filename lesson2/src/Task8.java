/*
 * Имеется целое число (задать с помощью Random rand = new Random(); int x =
 * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
 * нему слово «рублей» в правильном падеже.
 */

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int money = Math.abs(rand.nextInt());
        if (money % 10 == 1 && money % 100 != 11) {
            System.out.println(money + " рубль");
        } else if (money % 10 >= 2 && money % 10 <= 4 && (money % 100 < 10 || money % 100 >= 20)) {
            System.out.println(money + " рубля");
        } else {
            System.out.println(money + " рублей");
        }
    }
}
