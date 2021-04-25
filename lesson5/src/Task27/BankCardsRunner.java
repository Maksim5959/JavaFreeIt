/*
 * Создать иерархию классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */
package Task27;

import Task25.CashMachine;

import java.util.GregorianCalendar;

public class BankCardsRunner {
    public static void main(String[] args) {
        CashMachine vtbBank = new CashMachine(100, 100, 100);
        GregorianCalendar calendar = new GregorianCalendar(2023, 01, 23);
        CustomCreditCard vtbCard = new CustomCreditCard(1111222233, 735, calendar.getTime(), "Mastercard", 2000, "Ivan Ivanov");
        vtbBank.withdrawMoney(vtbCard.takeOffMoneyInAccount(1510));
        vtbCard.accountBalance();
        vtbCard.putMoney(5000);
        vtbCard.accountBalance();
        vtbBank.withdrawMoney(vtbCard.takeOffMoneyInAccount(4500));
        vtbCard.accountBalance();
        System.out.println(vtbCard.toString(1234));
        System.out.println("*********************************************");
        CashMachine priorbank = new CashMachine(100, 100, 100);
        CustomDebitCard priorbankCard = new CustomDebitCard(1111222233, 256, calendar.getTime(), "Visa", "John Doe");
        priorbankCard.putMoney(5000);
        priorbank.withdrawMoney(priorbankCard.takeOffMoneyInAccount(1510));
        priorbankCard.accountBalance();
        priorbank.withdrawMoney(priorbankCard.takeOffMoneyInAccount(3470));
        priorbankCard.accountBalance();
        System.out.println(priorbankCard.toString(1234));
    }
}
