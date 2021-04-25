/*
* Создать иерархию классов, описывающих бытовую технику. Создать несколько
* объектов описанных классов, часть из них включить в розетку.
* Иерархия должна иметь хотя бы три уровня.
*/
package Task26;

public class AppliancesRunner {
    public static void main(String[] args) {
        Fridge fridgeOne = new Fridge("Samsung","F3000",2, 2,true);
        Fridge fridgeTwo = new Fridge("LG", "LGf100",3,3,false);
        fridgeOne.on();
        fridgeTwo.on();
        fridgeOne.off();
        System.out.println(fridgeOne.toString());
        Cooler cooler = new Cooler("Bosh","1313",11,50);
        cooler.on();
        cooler.off();
        cooler.setModel("Cool1313");
        System.out.println(cooler.toString());
        cooler.on();
        fridgeOne.setNoFrost(false);
        System.out.println(fridgeOne.toString());
    }
}
