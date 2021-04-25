package AddHomework.Clothes.Jackets;

public class AdidasJacket implements IJacket {
    @Override
    public void takeOff() {
        System.out.println("Снимаю куртку Adidas.");
    }

    @Override
    public void putOn() {
        System.out.println("Надеваю куртку Adidas");
    }
}
