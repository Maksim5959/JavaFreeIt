package AddHomework.Transport.AllTransport;

public abstract class LandTransport extends Transport {
    private final int countWheels;
    private final double fuelConsumption;

    public LandTransport(int power, int maxSpeed, int weight, int countWheels, double fuelConsumption, String brand) {
        super(power, maxSpeed, weight, brand);
        this.countWheels = countWheels;
        this.fuelConsumption = fuelConsumption;
    }

    protected double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    protected int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    protected String getBrand() {
        return super.getBrand();
    }

    @Override
    protected String printParams() {
        String print = ", Count wheels: " + countWheels + ", Fuel consumption = " + fuelConsumption + " l/100km";
        return super.printParams() + print;
    }
}
