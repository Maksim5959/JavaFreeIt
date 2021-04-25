package AddHomework.Transport.AllTransport;

public class WarPlane extends AirTransport {
    int countRocket;
    boolean ejectionSystem;

    public WarPlane(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength, int countRocket, boolean ejectionSystem) {
        super(power, maxSpeed, weight, wingspan, minRunwayLength, brand);
        this.countRocket = countRocket;
        this.ejectionSystem = ejectionSystem;
    }

    public void printParamsAll() {
        String print = ", Ejection system: " + ejectionSystem + ", Count rocket: " + countRocket;
        System.out.println(super.printParams() + print + ", Electric power = " + powerKwt() + " kWt.");
    }

    public void shot () {
        if (countRocket > 0) {
            System.out.println("Ракета пошла...");
            countRocket--;
        } else if (countRocket == 0) {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void bailout () {
        if (ejectionSystem == true) {
            System.out.println("Катапультирование прошло успешно!");
            ejectionSystem = false;
        } else if (ejectionSystem == false) {
            System.out.println("У вас нет такой системы!");
        }
    }
}
