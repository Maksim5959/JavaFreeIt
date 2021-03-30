/*
* 9)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
* Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
*/

public class AddTask9 {
    public static void main(String[] args) {
        int cellsAmoeba = 2;
        for (int i = 0; i < 24; i++) {
            if (i == 3){
                cellsAmoeba = 2;
                System.out.println("Через " + i + " часа(ов) " + " мы имеем " + cellsAmoeba + " амеб(ы).");
            } else if (i % 3 == 0 && i != 3 && i != 0){
                cellsAmoeba *= 2;
                System.out.println("Через " + i + " часа(ов) " + " мы имеем " + cellsAmoeba + " амеб(ы).");
            }
        }
    }
}
