/*
 * Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
 * банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
 * 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
 * снимающую деньги. На вход передается сумма денег. На выход – булевское
 * значение (операция удалась или нет). При снятии денег функция должна
 * рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
 * конструктор с тремя параметрами – количеством купюр.
 */
package Task25;

public class CashMachineRunner {
    public static void main(String[] args) {
        CashMachine belarusbank = new CashMachine(20, 20, 20);
        belarusbank.addMoney20(1);
        belarusbank.addMoney50(1);
        belarusbank.addMoney100(1);
        System.out.println("Остаток средств в банкомате: " + belarusbank.checkBalance() + "\n");
        if (belarusbank.withdrawMoney(3570)) {
            System.out.println("Операция прошла успешно. Заберите ваши деньги.\n");
        }
        System.out.println("Остаток средств в банкомате: " + belarusbank.checkBalance() + "\n");
        belarusbank.addMoney20(10);
        System.out.println("Остаток средств в банкомате: " + belarusbank.checkBalance() + "\n");
        belarusbank.withdrawMoney(200);
        if (belarusbank.withdrawMoney(450)) {
            System.out.println("Операция прошла успешно. Заберите ваши деньги.\n");
        }
        System.out.println("Остаток средств в банкомате: " + belarusbank.checkBalance() + "\n");
    }
}
