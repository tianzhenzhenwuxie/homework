package com.tine.java.pattern.factory.abs;

import com.tine.java.pattern.factory.BenzBus;
import com.tine.java.pattern.factory.BenzCar;
import com.tine.java.pattern.factory.Bus;
import com.tine.java.pattern.factory.Car;

public class BenzFactory extends AbstractFactory {
    Car createCar() {
        return new BenzCar();
    }

    Bus createBus() {
        return new BenzBus();
    }
}
