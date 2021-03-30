/*
 * Задание 5. Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?
 */

import java.util.Scanner;

public class CheckNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int checkNumbers = 0;
        int stop = 0;
        System.out.println("Введите четырехзначное число: ");
        while (checkNumbers == 0) {
            if (stop == 16) {
                System.out.println("В заданном числе нет одинаковых цифр! ");
                break;
            }
            try {
                String number = sc.nextLine();
                int numberInt = Integer.parseInt(number);
                if (number.length() == 4) {
                    System.out.println("Вы ввели число: " + numberInt);
                    for (int i = 0; i < number.length() && checkNumbers == 0; i++) {
                        for (int k = 0; k < number.length(); k++) {
                            if (number.charAt(i) == number.charAt(k) && i != k) {
                                System.out.println("В заданном числе есть одинаковые цифры! ");
                                checkNumbers++;
                                break;
                            } else {
                                stop++;
                            }
                        }
                    }
                } else {
                    System.out.println("Это не четырехзначное число, попробуйте еще раз: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат, попробуйте еще раз: ");
            }
        }
    }
}
