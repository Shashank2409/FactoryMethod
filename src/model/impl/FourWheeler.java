package model.impl;

import model.Vehicle;

public class FourWheeler implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Four Wheeler Driving");
    }
}
