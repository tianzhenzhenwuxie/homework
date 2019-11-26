package com.tine.java.pattern.factory.simple;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.createCar("AudiCar").getName());
        System.out.println(factory.createCar("BmwCar").getName());
        System.out.println(factory.createCar("BenzCar").getName());
    }
}
