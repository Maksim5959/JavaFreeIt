package AddHomework.Clothes.Jackets;

public class NIkeJacket implements IJacket{
    @Override
    public void takeOff() {
        System.out.println("Снимаю куртку Nike.");
    }

    @Override
    public void putOn() {
        System.out.println("Надеваю куртку Nike");
    }
}
