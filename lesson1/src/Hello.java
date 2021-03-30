/*
 * Задание 1.
 * Набрать пример "Hello, World!" откомпилировать его и запустить.
 * Задание 2.
 * Изменить данный пример так, что бы при запуске программы ваша программа выводила следующее: "Hello, <ваше имя>".
 */

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        System.out.println("Please enter your name: ");
        String yourName = sc.nextLine();
        System.out.println("Hello " + yourName + "!");
    }
}