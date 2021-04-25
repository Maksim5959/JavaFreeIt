package AddHomework.Transport.AllTransport;

public abstract class AirTransport extends Transport {
    private final int wingspan;
    private final int minRunwayLength;

    public AirTransport(int power, int maxSpeed, int weight, int wingspan, int minRunwayLength, String brand) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    @Override
    protected String printParams() {
        String print = ", Wingspan = " + wingspan + " m, Minimal runway length = " + minRunwayLength + " km";
        return super.printParams() + print;
    }
}
