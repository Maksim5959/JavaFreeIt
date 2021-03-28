/*
* Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
* Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника.
* Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
* Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/
import java.util.Scanner;

public class AddTask2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину первой стороны треугольника: ");
        int oneSideTriangle = sc.nextInt();
        System.out.println("Введите длину второй стороны треугольника: ");
        int twoSideTriangle = sc.nextInt();
        System.out.println("Введите длину третьей стороны треугольника: ");
        int threeSideTriangle = sc.nextInt();
        int sumOneTwo = oneSideTriangle + twoSideTriangle;
        int sumOneThree = oneSideTriangle + threeSideTriangle;
        int sumTwoThree = twoSideTriangle + threeSideTriangle;
        if (oneSideTriangle < sumTwoThree && twoSideTriangle < sumOneThree && threeSideTriangle < sumOneTwo) {
            System.out.println("Заданный треугольник существует. ");
        } else {
            System.out.println("Заданный треугольник не существует. ");
        }
    }
}
