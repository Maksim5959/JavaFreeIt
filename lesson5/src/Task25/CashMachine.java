package Task25;

public class CashMachine {
    private int countBill20;
    private int countBill50;
    private int countBill100;

    public CashMachine(int countBill20, int countBill50, int countBill100) {
        this.countBill20 = countBill20;
        this.countBill50 = countBill50;
        this.countBill100 = countBill100;
    }

    public void addMoney20(int countBill20) {
        this.countBill20 += countBill20;
    }

    public void addMoney50(int countBill50) {
        this.countBill50 += countBill50;
    }

    public void addMoney100(int countBill100) {
        this.countBill100 += countBill100;
    }

    public String checkBalance() {
        return countBill20 * 20 + countBill50 * 50 + countBill100 * 100 + " BYN";
    }

    public boolean withdrawMoney(int sumCash) {
        boolean cashOut = false;
        int withdraw100 = 0, withdraw50 = 0, withdraw20 = 0;

        while (sumCash != 0) {

            for (int i = countBill100; i > 0; i--) {
                if (sumCash - (i * 100) == 0
                        || (sumCash - (i * 100) > 0 && sumCash - (i * 100) >= 20
                        && sumCash - (i * 100) != 30)) {
                    sumCash -= i * 100;
                    withdraw100 = i;
                    cashOut = true;
                    break;
                }
            }
            for (int i = countBill50; i > 0; i--) {
                if (sumCash - (i * 50) == 0
                        || (sumCash - (i * 50) > 0 && sumCash - (i * 50) >= 20
                        && sumCash - (i * 50) != 30
                        && (sumCash - (i * 50))  % 20 == 0))  {
                    sumCash -= i * 50;
                    withdraw50 = i;
                    cashOut = true;
                    break;
                }
            }
            for (int i = countBill20; i > 0; i--) {
                if (sumCash % 20 == 0 && sumCash != 0 && sumCash - i * 20 == 0) {
                    sumCash -= i * 20;
                    withdraw20 = i;
                    cashOut = true;
                    break;
                }
            }

            if (sumCash != 0) {
                cashOut = false;
                System.out.println("Не дам!");
                break;
            } else {
                System.out.println("Выдано соток: " + withdraw100 + " Выдано пятихатов: " + withdraw50 + " Выдано дваценов " + withdraw20);
            }
        }
        countBill100 -= withdraw100;
        countBill50 -= withdraw50;
        countBill20 -= withdraw20;
        return cashOut;
    }
}
