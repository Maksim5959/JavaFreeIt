package AddHomework.Robot.Legs;

public class ToshibaLegs implements ILeg {
    private final int prise;

    public ToshibaLegs(int prise) {
        this.prise = prise;
    }

    @Override
    public void step() {
        System.out.println("Ноги Toshiba делают шаг вперед.");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
