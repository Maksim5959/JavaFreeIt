package AddHomework.Clothes.Jackets;

public class ReebokJacket implements IJacket{
    @Override
    public void takeOff() {
        System.out.println("Снимаю куртку Reebok.");
    }

    @Override
    public void putOn() {
        System.out.println("Надеваю куртку Reebok.");
    }
}
