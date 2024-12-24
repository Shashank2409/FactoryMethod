package creator.impl;

import creator.VehicleFactory;
import model.Vehicle;
import model.impl.TwoWheeler;

public class TwoWheelerVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
