/*Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
 * полностью закрыть круглой картонкой радиусом r.
 */

public class Task7 {
    public static void main(String[] args) {
        int lengthRectangle = 8;
        int widhRectangle = 10;
        int radius = 10;
        // Определяем половину диагонали прямоугольника
        double halfDiagonal = Math.sqrt(Math.pow(lengthRectangle, 2) + Math.pow(widhRectangle, 2)) / 2;
        // Определяем условие задачи.
        if (radius >= halfDiagonal) {
            System.out.println("Отверстие можно полностью закрыть круглой картонкой! ");
        } else {
            System.out.println("Отверстие нельзя полностью закрыть круглой картонкой! ");
        }
    }
}
