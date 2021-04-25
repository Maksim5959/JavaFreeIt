package Task27;

import java.util.Date;

public abstract class CreditCard extends BankCards {
    private String paymentSystem;
    private int creditSum;

    public CreditCard(long cardNumber, int cvv, Date validity, String paymentSystem, int creditSum) {
        super(cardNumber, cvv, validity);
        this.creditSum = creditSum;
        this.paymentSystem = paymentSystem;
    }

    @Override
    public String toString(int password) {
        int passwordSave = 1234;
        if (passwordSave == password) {
            return "CreditCard{" +
                    "paymentSystem='" + paymentSystem + '\'' +
                    ", creditSum=" + creditSum +
                    "} " + super.toString(1234);
        } else {
            return "Пароль введен неверно! ";
        }
    }
}
