/*
 * Задание 3.
 * Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
 * А) минут + секунд;
 * Б) часов + минут +секунд;
 * В) дней + часов + минут + секунд;
 * Г) недель + дней + часов + минут + секунд;
 */
public class TimePrinter {

    public static void main(String[] args) {
        int second = 4500;
        int sec = second % 60;
        int minute = (second - sec) / 60;
        int min = minute % 60;
        int hour = (minute - min) / 60;
        int h = hour % 24;
        int days = (hour - h) / 24;
        int d = days % 7;
        int weeks = (days - d) / 7;
        // Вывод данных.
        System.out.println("4500 seconds = " + minute + " minutes, " + sec + " seconds, ");
        System.out.println("4500 seconds = " + hour + " hours, " + min + " minutes, " + sec + " seconds ");
        System.out.println("4500 seconds = " + days + " days, " + h + " hours, " + min + " minutes, " + sec + " seconds ");
        System.out.println("4500 seconds = " + weeks + " weeks, " + d + " days, " + h + " hours, " + min + " minutes, " + sec + " seconds ");
    }
}