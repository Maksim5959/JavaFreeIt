import java.util.Scanner;

public class AddTask12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте длину таблици перевода дюймов в сантиметры: ");
        int count = sc.nextInt();
        System.out.println("Таблица перевода дюймов в сантиметры (в одном дюйме 2,54 сантиметра): ");
        double translite[][] = new double[count][2];
        int inch = 1;
        double sm = 2.54;
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < count; i++) {
                if (j == 0) {
                    translite[i][j] = inch++;
                } else if (j == 1) {
                    translite[i][j] = sm;
                    sm += 2.54;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print(translite[i][j] + "  --  ");
                } else {
                    double scale = Math.pow(10, 2);
                    double result = Math.ceil(translite[i][j] * scale) / scale;
                    System.out.println(result);
                }
            }
            System.out.println("");
        }
    }
}
