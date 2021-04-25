package AddHomework.Transport.AllTransport;

public abstract class Transport {
    private final int power;
    private final int maxSpeed;
    private final int weight;
    private final String brand;

    public Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    protected int getMaxSpeed() {
        return maxSpeed;
    }

    protected String getBrand() {
        return brand;
    }

    protected String printParams() {
        String print = " Power = " + power + " ls, Max speed = " + maxSpeed + " km/h, Weight = " + weight + " kg, Brand: " + brand;
        return print;
    }

    protected double powerKwt() {
        int power = this.power;
        double powerKwt = power * 0.74;
        return powerKwt;
    }
}
