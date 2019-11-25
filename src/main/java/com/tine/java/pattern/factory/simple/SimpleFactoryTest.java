package com.tine.java.pattern.factory.simple;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.createCar("Audi").getName());
        System.out.println(factory.createCar("BMW").getName());
        System.out.println(factory.createCar("Benz").getName());
    }
}
