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
        switch (money % 10) {
            case 1:
                System.out.println(money + " рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(money + " рубля");
                break;
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(money + " рублей");
                break;
        }
    }
}
