package AddHomework.Clothes.Pants;

public class AdidasPants implements IPants{
    @Override
    public void takeOff() {
        System.out.println("Снимаю штаны Adidas.");
    }

    @Override
    public void putOn() {
        System.out.println("Надеваю штаны Adidas.");
    }
}
