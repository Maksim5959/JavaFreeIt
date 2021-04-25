package AddHomework.Robot.Hands;

public class ToshibaHand implements IHand {
    private final int prise;

    public ToshibaHand(int prise) {
        this.prise = prise;
    }

    @Override
    public void upHand() {
        System.out.println("Руки Toshiba подняты вверх.");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
