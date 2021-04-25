package Task27;

import java.util.Date;

public abstract class DebitCard extends BankCards {
    private String paymentSystem;

    public DebitCard(long cardNumber, int cvv, Date validity, String paymentSystem) {
        super(cardNumber, cvv, validity);
        this.paymentSystem = paymentSystem;
    }

    @Override
    public String toString(int password) {
        int passwordSave = 1234;
        if (passwordSave == password) {
            return "CreditCard{" +
                    "paymentSystem='" + paymentSystem + '\'' +
                    "} " + super.toString(1234);
        } else {
            return "Пароль введен неверно! ";
        }
    }
}
