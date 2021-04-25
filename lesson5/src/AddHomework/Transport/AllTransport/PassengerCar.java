package AddHomework.Transport.AllTransport;

public class PassengerCar extends LandTransport {
    String bodyType;
    int countPassengers;

    public PassengerCar(int power, int maxSpeed, int weight, String brand, int countWheels, double fuelConsumption, String bodyType, int countPassengers) {
        super(power, maxSpeed, weight, countWheels, fuelConsumption, brand);
        this.bodyType = bodyType;
        this.countPassengers = countPassengers;
    }

    public void printParamsAll() {
        String print = ", Body type: " + bodyType + ", Count passengers: " + countPassengers;
        System.out.println(super.printParams() + print + ", Electric power = " + powerKwt() + " kWt.");
    }

    @Override
    protected double getFuelConsumption() {
        return super.getFuelConsumption();
    }

    @Override
    protected int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    protected String getBrand() {
        return super.getBrand();
    }

    public void runInfoCar (double timeHours) {
//      S = V * t
        double distance = getMaxSpeed() * timeHours;
        System.out.println("За время " + timeHours + " часа, автомобиль " + getBrand() + " двигаясь с максимальной скоростью "
                + getMaxSpeed() + " км/ч проедет " + distance + " км  и израсходует " + fuelConsumption(distance) + " литров топлива");
    }

    private double fuelConsumption (double distance) {
        double fuelConsumption = getFuelConsumption() * distance * 0.01;
        return fuelConsumption;
    }


}
