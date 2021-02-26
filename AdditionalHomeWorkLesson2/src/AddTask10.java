/*
 * 10)Вычислить: 1+2+4+8+...+256
 */
public class AddTask10 {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        for (number = 1; number <= 256; number = number * 2) {
            sum = sum + number;
        }
        System.out.println("Ваша сумма = " + sum);
    }
}