/* Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
 * произведение, т.е. факториал числа.
 */

public class Task9 {
    public static void main(String[] args) {
        long factorial = 1;
        int number = (int) (Math.random() * 20);
        int numberOut = number;
        while (number != 0) {
            factorial = factorial * number;
            number--;
        }
        System.out.println("Факториал числа " + numberOut + " = " + factorial);
    }
}
