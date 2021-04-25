package AddHomework.Robot.Hands;

public class SonyHand implements IHand {
    private final int prise;

    public SonyHand(int prise) {
        this.prise = prise;
    }

    @Override
    public void upHand() {
        System.out.println("Руки Sony подняты вверх.");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
