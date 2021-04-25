package AddHomework.Transport.AllTransport;

public class CivilAircraft extends AirTransport {
    int countPassengers;
    boolean businessClass;

    public CivilAircraft(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength, int countPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, wingspan, minRunwayLength, brand);
        this.countPassengers = countPassengers;
        this.businessClass = businessClass;
    }

    public void printParamsAll() {
        String print = ", Business class: " + businessClass + ", Count passengers: " + countPassengers;
        System.out.println(super.printParams() + print + ", Electric power = " + powerKwt() + " kWt.");
    }

    public void countPassengersCheck (int countPassengers) {
        if (countPassengers <= this.countPassengers && countPassengers > 0){
            System.out.println("Пассажиры заняли свои места!");
        } else if (countPassengers > this.countPassengers){
            System.out.println("Вам нужен самолет побольше!");
        } else if (countPassengers == 0) {
            System.out.println("В самолете нет пассажиров!");
        } else {
            System.out.println("Исходное количество пассажиров введено некорректно!");
        }
    }
}
