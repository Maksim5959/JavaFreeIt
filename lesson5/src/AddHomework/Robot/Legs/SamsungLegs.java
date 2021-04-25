package AddHomework.Robot.Legs;

public class SamsungLegs implements ILeg {
    private final int prise;

    public SamsungLegs(int prise) {
        this.prise = prise;
    }

    @Override
    public void step() {
        System.out.println("Ноги Samsung делают шаг вперед.");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
