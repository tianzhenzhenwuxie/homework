package com.tine.java.pattern.factory.method;

import com.tine.java.pattern.factory.Car;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Factory audiFactory = new AudiFactory();
        Car audi =  audiFactory.createCar();
        System.out.println(audi.getName());

        Factory benzFactory = new BenzFactory();
        Car benz =  benzFactory.createCar();
        System.out.println(benz.getName());

        Factory BMWFactory = new BMWFactory();
        Car bmw =  BMWFactory.createCar();
        System.out.println(bmw.getName());
    }
}
