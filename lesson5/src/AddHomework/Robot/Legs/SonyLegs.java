package AddHomework.Robot.Legs;

public class SonyLegs implements ILeg {
    private final int prise;

    public SonyLegs(int prise) {
        this.prise = prise;
    }

    @Override
    public void step() {
        System.out.println("Ноги Sony делают шаг вперед.");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
