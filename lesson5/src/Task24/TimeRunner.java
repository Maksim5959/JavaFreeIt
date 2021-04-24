/*
* Создать класс и объекты описывающие промежуток времени. Сам промежуток
* в классе должен задаваться тремя свойствами: секундами, минутами, часами.
* Сделать методы для получения полного количества секунд в объекте, сравнения
* двух объектов (метод должен работать аналогично compareTo в строках). Создать
* два конструктора: получающий общее количество секунд, и часы, минуты и секунды
* по отдельности. Сделать метод для вывода данных.
*/

package Task24;

public class TimeRunner {
    public static void main(String[] args) {
        TimeInterval timeRunnerOne = new TimeInterval(789765);
        System.out.println("Первый отрезок времени: " + timeRunnerOne.printTime());
        TimeInterval timeRunnerTwo = new TimeInterval(11,12354,4565);
        System.out.println("Второй отрезок времени: " + timeRunnerTwo.printTime());
        System.out.println("Сумма секунд первого отрезка равна: " + timeRunnerOne.secondSum());
        System.out.println("Сумма секунд второго отрезка равна: " + timeRunnerTwo.secondSum());
        System.out.println(timeRunnerTwo.compareTime(timeRunnerOne));
    }
}
