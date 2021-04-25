package AddHomework.Clothes.Pants;

public class ReebokPants implements IPants{
    @Override
    public void takeOff() {
        System.out.println("Снимаю штаны Reebok.");
    }

    @Override
    public void putOn() {
        System.out.println("Надеваю штаны Reebok.");
    }
}
