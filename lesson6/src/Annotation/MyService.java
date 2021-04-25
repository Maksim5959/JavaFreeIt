/*
 * Придумать и написать собственную аннотацию @Version, которая будет хранить информацию о версии класса сервиса
 * (поле обязательное) MyService и кодовое название версии (поле не обязательное) - (например номер версии =
 * 7.1, а кодовое название версии = Nougat).
 * Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию,
 * get и set методы, переопределенные методы equals и hashcode, а так же private метод
 * (private thisClassInfo), который будет просто печатать данные о самом классе (данные любые на ваш выбор),
 * в котором он определен.
 * Написать программу, которая будет анализировать присутствие аннотации над классом MyService и если она
 * присутствует - создавать экземпляр этого класса, задавать значения его полям и вызывать метод
 * thisClassInfo (использовать возможности пакета reflection).
 * */

package Annotation;

import java.util.Objects;

@Version(version = 1.0, nameVersion = "MyFirstAnnotation")
public class MyService {

    private String nameProduct;
    private double price;
    private int countProducts;

    public MyService() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCountProducts() {
        return countProducts;
    }

    public void setCountProducts(int countProducts) {
        this.countProducts = countProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return Double.compare(myService.price, price) == 0 && countProducts == myService.countProducts && Objects.equals(nameProduct, myService.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, price, countProducts);
    }

    private void thisClassInfo() {
        System.out.println("MyService{" +
                "nameProduct='" + nameProduct + '\'' +
                ", price=" + price + " BYN" +
                ", countProducts=" + countProducts +
                '}');
    }
}
