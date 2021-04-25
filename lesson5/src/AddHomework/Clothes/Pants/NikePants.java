package AddHomework.Clothes.Pants;

public class NikePants implements IPants{
    @Override
    public void takeOff() {
        System.out.println("Снимаю штаны Nike.");
    }

    @Override
    public void putOn() {
        System.out.println("Надеваю штаны Nike.");
    }
}
