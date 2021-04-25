package AddHomework.Clothes.Shoes;

public class NikeShoes implements IShoes {
    @Override
    public void takeOff() {
        System.out.println("Снимаю кроссовки Nike.");
    }

    @Override
    public void putOn() {
        System.out.println("Надеваю кроссовки Nike.");
    }
}
