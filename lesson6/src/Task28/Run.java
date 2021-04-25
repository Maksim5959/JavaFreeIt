/*
 * Написать класс, который умеет хранить в себе массив любых типов данных (int, long
 * etc.). Реализовать метод get(int index), который возвращает любой элемент
 * массива по индексу.
 * */
package Task28;

public class Run {
    public static void main(String[] args) {
        Double[] doubles = {15.5, 13.8, 18.4, 20.20, 25.15};
        Integer[] integers = {15, 20, 25, 30, 35, 40};
        Object[] item = {1, 2, 3, "Hello", '!', true, 12.5};
        ArrayBox arrayBoxOne = new ArrayBox(doubles);
        ArrayBox arrayBoxTwo = new ArrayBox(item);
        ArrayBox arrayBoxThree = new ArrayBox(integers);

        System.out.println(arrayBoxOne + "; " + arrayBoxTwo + "; " + arrayBoxThree);

        System.out.println(arrayBoxOne.get(3));
        System.out.println(arrayBoxTwo.get(3));
        System.out.println(arrayBoxThree.get(3));
    }
}