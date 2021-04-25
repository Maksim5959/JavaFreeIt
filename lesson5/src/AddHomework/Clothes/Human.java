package AddHomework.Clothes;

import AddHomework.Clothes.Jackets.IJacket;
import AddHomework.Clothes.Pants.IPants;
import AddHomework.Clothes.Shoes.IShoes;

public class Human implements IHuman{
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human (IJacket jacket,IPants pants,IShoes shoes,String name) {
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
        this.name = name;
    }

    @Override
    public void takeOffClothes() {
        System.out.println(name + ":");
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }

    @Override
    public void putOnClothes() {
        System.out.println(name + ":");
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }
}
