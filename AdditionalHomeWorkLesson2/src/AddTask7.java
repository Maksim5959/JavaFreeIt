/*
 * 7)  В переменную записываете количество программистов.
 * В зависимости от количества программистов необходимо вывести правильно окончание.
 * Например: • 2 программиста • 1 программист • 10 программистов • и т.д.
 */

import java.util.Scanner;

public class AddTask7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество программистов: ");
        int developersCount = sc.nextInt();
        int endCount = developersCount % 10;
        int twoEndCount = developersCount % 100;
        if (twoEndCount > 10 && twoEndCount < 20) {
            System.out.println(developersCount + " программистов ");
        } else {
            switch (endCount) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(developersCount + " програмистов ");
                    break;
                case 1:
                    System.out.println(developersCount + " программист ");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(developersCount + " программиста ");
                    break;
            }
        }
    }
}
