package AddHomework.Transport;

import AddHomework.Transport.AllTransport.CivilAircraft;
import AddHomework.Transport.AllTransport.FreightCar;
import AddHomework.Transport.AllTransport.PassengerCar;
import AddHomework.Transport.AllTransport.WarPlane;

public class TransportRunner {
    public static void main(String[] args) {
        WarPlane stels = new WarPlane(200, 2000, 2, "Stels", 15, 15, 15, true);
        PassengerCar pasCar = new PassengerCar(50,531,2,"Lada Priora",4,6,"sedan",15);
        FreightCar truck = new FreightCar(200,150,20,"Scania",6,15,20);
        CivilAircraft boeing = new CivilAircraft(200,700,16,"Boeing",20,6,200,true);
        stels.printParamsAll();
        stels.bailout();
        stels.bailout();
        stels.shot();
        pasCar.printParamsAll();
        pasCar.runInfoCar(15);
        truck.printParamsAll();
        truck.checkCargoWeight(21);
        boeing.printParamsAll();
        boeing.countPassengersCheck(200);
    }
}
