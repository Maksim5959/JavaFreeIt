/*
 * Задание 4.
 * Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n.
 */

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        while (true) {
            try {
                String number = sc.nextLine();
                int numberInt = Integer.parseInt(number);
                if (number.length() == 4) {
                    System.out.println("Вы ввели число: " + numberInt);
                    String reverseNumber = "";
                    for (int i = 0; i < number.length(); i++) {
                        reverseNumber = number.charAt(i) + reverseNumber;
                    }
                    System.out.println("Число в обратном порядке: " + reverseNumber);
                    break;
                } else {
                    System.out.println("Это не четырехзначное число, попробуйте еще раз: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат, попробуйте еще раз: ");
            }
        }
    }
}