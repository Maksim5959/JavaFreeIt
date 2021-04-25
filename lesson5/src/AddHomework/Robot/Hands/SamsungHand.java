package AddHomework.Robot.Hands;

public class SamsungHand implements IHand {
    private final int prise;

    public SamsungHand(int prise) {
        this.prise = prise;
    }

    @Override
    public void upHand() {
        System.out.println("Руки Samsung подняты вверх.");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
