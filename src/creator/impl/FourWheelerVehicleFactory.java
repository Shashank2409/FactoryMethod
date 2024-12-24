package creator.impl;

import creator.VehicleFactory;
import model.Vehicle;
import model.impl.FourWheeler;

public class FourWheelerVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
