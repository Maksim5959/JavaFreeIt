import java.util.Scanner;

/*
* Дано целое число. Если оно является положительным, то прибавить к нему 1.
* Если отрицательным, то вычесть из него 2.
* Если нулевым, то заменить его на 10. Вывести полученное число
*/
public class AddTask3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше число: ");
        int number = sc.nextInt();
        if (number > 0 && number != 0){
            number += 1;
            System.out.println("Полученное число = " + number);
        } else if (number < 0 && number != 0) {
            number -= 2;
            System.out.println("Полученное число = " + number);
        } else if (number == 0) {
            number = 10;
            System.out.println("Полученное число = " + number);
        }

    }
}
