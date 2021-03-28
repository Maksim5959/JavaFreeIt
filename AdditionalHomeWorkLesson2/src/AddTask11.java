import java.util.Scanner;

/*
* 11)Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
*/
public class AddTask11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое требуется умножить: ");
        int number = sc.nextInt();
        System.out.println("На сколько умножить ваше число: ");
        int count = sc.nextInt();
        int multiply = 0;
        for (int i = 1;i <= count;i++){
            multiply += number;
        }
        System.out.println("Результат = " + multiply);
    }
}
