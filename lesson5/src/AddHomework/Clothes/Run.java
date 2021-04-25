package AddHomework.Clothes;

import AddHomework.Clothes.Jackets.AdidasJacket;
import AddHomework.Clothes.Jackets.IJacket;
import AddHomework.Clothes.Jackets.NIkeJacket;
import AddHomework.Clothes.Jackets.ReebokJacket;
import AddHomework.Clothes.Pants.AdidasPants;
import AddHomework.Clothes.Pants.IPants;
import AddHomework.Clothes.Pants.NikePants;
import AddHomework.Clothes.Pants.ReebokPants;
import AddHomework.Clothes.Shoes.AdidasShoes;
import AddHomework.Clothes.Shoes.IShoes;
import AddHomework.Clothes.Shoes.NikeShoes;
import AddHomework.Clothes.Shoes.ReebokShoes;

/*
* По аналогии с первым задание делаем след. задание.
* Интерфейсы:
* - Куртка
* - Штаны
* - Обувь
* в каждом интерфейсе есть 2 метода (надеть и снять)
* Делаем несколько реализации каждого интерфейса.
* Создаём класс человек:
* У человека поля:
* -имя
* -куртка
* -штаны
* -обувь
* У человека есть 2 метода:
* - одеться(вызываются методы надеть у всех вещей)
* - раздеться (вызываются методы снять у всех вещей)
*/
public class Run {
    public static void main(String[] args) {
        IJacket nikeJacket = new NIkeJacket();
        IJacket adidasJacket = new AdidasJacket();
        IJacket reebokJacket = new ReebokJacket();

        IPants nikePants = new NikePants();
        IPants adidasPants = new AdidasPants();
        IPants reebokPants = new ReebokPants();

        IShoes nikeShoes = new NikeShoes();
        IShoes adidasShoes = new AdidasShoes();
        IShoes reebokShoes = new ReebokShoes();

        Human nik = new Human(nikeJacket,adidasPants,reebokShoes,"Nik");
        Human mike = new Human(adidasJacket,reebokPants,nikeShoes,"Mike");
        Human koliya = new Human(reebokJacket,nikePants,adidasShoes,"Koliya");

        nik.putOnClothes();
        mike.putOnClothes();
        koliya.putOnClothes();

        nik.takeOffClothes();
        mike.takeOffClothes();
        koliya.takeOffClothes();
    }
}
