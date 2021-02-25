/* Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
 * таким образом:
 */

import java.util.Random;

public class Task17 {

    public static void main(String[] args) {
        Random rand = new Random();
        int oneNumber = 1;
        int nullNumber = 0;
        int countArr = rand.nextInt(10) + 15;
        int butterfly[][] = new int[countArr][countArr];
        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly.length; j++) {
                if (i <= j && (butterfly.length - i - 1) >= j) {
                    butterfly[i][j] = oneNumber;
                } else {
                    butterfly[i][j] = nullNumber;
                }
            }
        }
        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly.length; j++) {
                if (i >= j && (butterfly.length - i - 1) <= j) {
                    butterfly[i][j] = oneNumber;
                } else if (butterfly[i][j] != oneNumber) {
                    butterfly[i][j] = nullNumber;
                }
            }
        }
        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly.length; j++) {
                System.out.print(butterfly[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
