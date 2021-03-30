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
        int saveBill20 = countBill20, saveBill50 = countBill50, saveBill100 = countBill100;
        int saveWithdraw50 = 0, saveWithdraw100 = 0;
        int saveSumCash = sumCash;
        int balance = countBill20 * 20 + countBill50 * 50 + countBill100 * 100;
        if (sumCash > balance) {
            System.out.println("В банкомате недостаточно средств.");
            return false;
        } else if (sumCash % 10 != 0 || sumCash <= 0 || sumCash < 20) {
            System.out.println("Некорректно введена сумма, в банкомате имеются номиналы 20, 50, 100 BYN.");
            return false;
        } else if (countBill20 == 0 && countBill50 == 0 && (sumCash % 20 == 0 || sumCash % 100 != 0)) {
            System.out.println("Некорректно введена сумма, в банкомате имеются номиналы 100 BYN.");
            return false;
        } else if (countBill20 == 0 && countBill100 == 0 && (sumCash % 20 == 0 || sumCash % 100 != 50)) {
            System.out.println("Некорректно введена сумма, в банкомате имеются номиналы 50 BYN.");
            return false;
        } else if (countBill50 == 0 && countBill100 == 0 && (sumCash % 20 != 0 || sumCash % 20 == 10)) {
            System.out.println("Некорректно введена сумма, в банкомате имеются номиналы 20 BYN.");
            return false;
        } else if (countBill20 == 0 && (sumCash % 20 == 0 || sumCash % 20 == 10) && sumCash % 100 != 0 && sumCash % 50 != 0) {
            System.out.println("Некорректно введена сумма, в банкомате имеются номиналы 50, 100 BYN.");
            return false;
        } else if (countBill50 == 0 && (sumCash % 100 == 50 || sumCash % 20 != 0 )) {
            System.out.println("Некорректно введена сумма, в банкомате имеются номиналы 20, 100 BYN.");
            return false;
        }
        int withdraw100 = sumCash / 100;
        for (; ; ) {
            if (withdraw100 == 0 || countBill100 == 0) {
                break;
            } else if (withdraw100 > countBill100 && (sumCash - withdraw100 * 100 != 30 || sumCash - withdraw100 * 100 > 20)) {
                saveWithdraw100 = countBill100;
                sumCash -= countBill100 * 100;
                countBill100 = 0;
                break;
            } else if ((sumCash - withdraw100 * 100 == 30 || sumCash - withdraw100 * 100 < 20) && sumCash - withdraw100 * 100 != 0) {
                withdraw100--;
            } else {
                saveWithdraw100 = withdraw100;
                sumCash -= withdraw100 * 100;
                countBill100 -= withdraw100;
                break;
            }
        }
        int varCountBill50 = 0;
        int withdraw50 = sumCash / 50;
        for (; ; ) {
            if (withdraw50 == 0 || countBill50 == 0) {
                break;
            }else if ((sumCash - withdraw50 * 50 == 30 || sumCash - withdraw50 * 50 < 20
                    || sumCash - withdraw50 * 50 == 70) && (sumCash - withdraw50 * 50 != 0)) {
                withdraw50--;
            } else if (withdraw50 > countBill50 && (sumCash - withdraw50 * 50 != 30 || sumCash - withdraw50 * 50 > 20
                    || sumCash - withdraw50 * 50 != 70) && (sumCash - countBill50*50) % 20 != 0) {
                withdraw50 = countBill50--;
                varCountBill50++;
            }
            else if (withdraw50 > countBill50 && (sumCash - withdraw50 * 50 != 30 || sumCash - withdraw50 * 50 > 20
                    || sumCash - withdraw50 * 50 != 70)) {
                saveWithdraw50 = countBill50;
                sumCash -= countBill50 * 50;
                countBill50 = 0;
                break;
            } else {
                saveWithdraw50 = withdraw50;
                sumCash -= withdraw50 * 50;
                countBill50 -= withdraw50;
                break;
            }
        }
        int withdraw20 = sumCash / 20;
        if (withdraw20 > countBill20 || sumCash % 20 != 0) {
            System.out.println("Некорректно введена сумма, в банкомате имеются номиналы 20, 50, 100 BYN.");
            countBill20 = saveBill20;
            countBill50 = saveBill50;
            countBill100 = saveBill100;
            sumCash = saveSumCash;
            return false;
        } else if (countBill50 == 0 && countBill100 == 0 && sumCash % 20 != 0) {
            System.out.println("В банкомате недостаточно купюр.Введите другую сумму.");
            countBill20 = saveBill20;
            countBill50 = saveBill50;
            countBill100 = saveBill100;
            sumCash = saveSumCash;
            return false;
        }
        else {
            sumCash -= withdraw20 * 20;
            countBill20 -= withdraw20;
            countBill50 = countBill50 + varCountBill50;
            if (saveWithdraw100 != 0) {
                System.out.println("Выдано " + saveWithdraw100 + " купюр(ы) номиналом 100 BYN");
            }
            if (saveWithdraw50 != 0) {
                System.out.println(("Выдано " + saveWithdraw50 + " купюр(ы) номиналом 50 BYN"));
            }
            if (withdraw20 != 0) {
                System.out.println(("Выдано " + withdraw20 + " купюр(ы) номиналом 20 BYN"));
            }
            return true;
        }
    }
}
