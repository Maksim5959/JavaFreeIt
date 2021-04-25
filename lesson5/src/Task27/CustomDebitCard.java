package Task27;

import java.util.Date;

public class CustomDebitCard extends DebitCard {
    private String cardholderName;
    private final String CURRENCY = "BYN";
    private int moneyInAccount;

    public CustomDebitCard(long cardNumber, int cvv, Date validity, String paymentSystem, String cardholderName) {
        super(cardNumber, cvv, validity, paymentSystem);
        this.cardholderName = cardholderName;
    }

    public String getCURRENCY() {
        return CURRENCY;
    }

    public int takeOffMoneyInAccount(int money) {
        int saveMoneyInAccount = moneyInAccount;
        saveMoneyInAccount = saveMoneyInAccount - money;
        if (saveMoneyInAccount >= 0 && saveMoneyInAccount % 10 == 0) {
            this.moneyInAccount = moneyInAccount - money;
            return money;
        } else {
            System.out.println("Недостаточно средств на счете или сумма введена неверно! ");
            money = 0;
            return money;
        }
    }

    public void putMoney(int money) {
        this.moneyInAccount = moneyInAccount + money;
    }

    public void accountBalance() {
        System.out.println("Остаток на счете: " + moneyInAccount + " " + CURRENCY);
    }

    @Override
    public String toString(int password) {
        int passwordSave = 1234;
        if (passwordSave == password) {
            return "CustomCreditCard{" +
                    "cardholderName='" + cardholderName + '\'' +
                    ", CURRENCY='" + CURRENCY + '\'' +
                    ", moneyInAccount=" + moneyInAccount +
                    "} " + super.toString(1234);
        } else {
            return "Пароль введен неверно! ";
        }
    }
}
