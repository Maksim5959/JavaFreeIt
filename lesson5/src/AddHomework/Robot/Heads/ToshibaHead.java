package AddHomework.Robot.Heads;

public class ToshibaHead implements IHead {
    private final int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
