package com.tine.java.pattern.factory.abs;

import com.tine.java.pattern.factory.AudiBus;
import com.tine.java.pattern.factory.AudiCar;
import com.tine.java.pattern.factory.Bus;
import com.tine.java.pattern.factory.Car;

public class AudiFactory extends AbstractFactory {
    Car createCar() {
        return new AudiCar();
    }

    Bus createBus() {
        return new AudiBus();
    }
}
