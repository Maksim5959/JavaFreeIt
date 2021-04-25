package AddHomework.Clothes.Shoes;

public class AdidasShoes implements IShoes{
    @Override
    public void takeOff() {
        System.out.println("Снимаю кроссовки Adidas.");
    }

    @Override
    public void putOn() {
        System.out.println("Надеваю кроссовки Adidas.");
    }
}
