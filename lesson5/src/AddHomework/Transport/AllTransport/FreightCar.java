package AddHomework.Transport.AllTransport;

public class FreightCar extends LandTransport {
    int liftingCapacity;

    public FreightCar(int power, int maxSpeed, int weight, String brand, int countWheels, int fuelConsumption, int liftingCapacity) {
        super(power, maxSpeed, weight, countWheels, fuelConsumption, brand);
        this.liftingCapacity = liftingCapacity;
    }

    public void printParamsAll() {
        String print = ", Lifting capacity = " + liftingCapacity + " t";
        System.out.println(super.printParams() + print + ", Electric power = " + powerKwt() + " kWt.");
    }

    public void checkCargoWeight (double cargoWeightTon) {
        if (cargoWeightTon <= liftingCapacity && cargoWeightTon > 0) {
            System.out.println("Грузовик загружен!");
        } else if (cargoWeightTon > liftingCapacity){
            System.out.println("Вам нужен грузовик побольше!");
        } else if (cargoWeightTon == 0) {
            System.out.println("Грузовик пуст!");
        } else {
            System.out.println("Некоректно введен исходный вес груза, введите число больше нуля!");
        }
    }
}
