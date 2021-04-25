package AddHomework.Robot.Heads;

public class SonyHead implements IHead {
    private final int price;

    public SonyHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
