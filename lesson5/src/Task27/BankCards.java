package Task27;

import java.util.Date;

public abstract class BankCards {
    private long cardNumber;
    private int cvv;
    private Date validity;

    public BankCards(long cardNumber, int cvv, Date validity) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.validity = validity;
    }

    public String toString(int password) {
        int passwordSave = 1234;
        if (passwordSave == password) {
            return "BankCards{" +
                    "cardNumber=" + cardNumber +
                    ", cvv=" + cvv +
                    ", validity=" + validity +
                    '}';
        } else {
            return "Пароль введен неверно! ";
        }
    }
}
