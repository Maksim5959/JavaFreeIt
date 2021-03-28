/*
* В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
* Например, "это однозначное положительное число".
* Достаточно будет определить, является ли число однозначным, "двухзначным или трехзначным и более.
*/
import java.util.Scanner;

public class AddTask1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        long number = sc.nextLong();
        System.out.println("Вы ввели число - " + number);
        String numberStr = "" + number;
        long countNumber = numberStr.length();
        if (number > 0) {
            if (countNumber == 1){
                System.out.println("Вы ввели " + countNumber + "-но значное положительное число. ");
            } else if (countNumber > 1 && countNumber < 5){
                System.out.println("Вы ввели " + countNumber + "-х значное положительное число. ");
            } else if (countNumber ==  7 || countNumber == 8) {
                System.out.println("Вы ввели " + countNumber + "-ми значное положительное число. ");
            } else if (countNumber >  4 && countNumber < 21 && countNumber !=7 && countNumber != 8){
                System.out.println("Вы ввели " + countNumber + "-ти значное положительное число. ");
            }
        }
        if (number < 0) {
            if (countNumber - 1 == 1){
                System.out.println("Вы ввели " + (countNumber - 1) + "-но значное отрицательное число. ");
            } else if (countNumber - 1 > 1 && countNumber - 1 < 5){
                System.out.println("Вы ввели " + (countNumber - 1) + "-х значное отрицательное число. ");
            } else if (countNumber - 1 ==  7 || countNumber - 1 == 8) {
                System.out.println("Вы ввели " + (countNumber - 1) + "-ми значное отрицательное число. ");
            } else if (countNumber - 1 >  4 && countNumber - 1 < 21 && countNumber - 1 !=7 && countNumber - 1 != 8){
                System.out.println("Вы ввели " + (countNumber - 1) + "-ти значное отрицательное число. ");
            }
        }
        if (number == 0) {
            System.out.println("Вы ввели ноль! ");
        }
    }
}
