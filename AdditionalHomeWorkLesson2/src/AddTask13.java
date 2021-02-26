/*
 * 13)Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */
public class AddTask13 {
    public static void main(String[] args) {
        System.out.println("Все четные числа от 2-х до 100 включительно: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
        }
    }
}
