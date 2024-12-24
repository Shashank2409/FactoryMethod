package model.impl;

import model.Vehicle;

public class TwoWheeler implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Two Wheeler Driving");
    }
}
