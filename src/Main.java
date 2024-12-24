import creator.VehicleFactory;
import creator.impl.FourWheelerVehicleFactory;
import creator.impl.TwoWheelerVehicleFactory;
import model.Vehicle;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        VehicleFactory vehicleFactory = new FourWheelerVehicleFactory();
        Vehicle fourWheeler = vehicleFactory.createVehicle();
        fourWheeler.drive();

        VehicleFactory vehicleFactory2 = new TwoWheelerVehicleFactory();
        Vehicle twoWheeler = vehicleFactory2.createVehicle();
        twoWheeler.drive();
    }
}
