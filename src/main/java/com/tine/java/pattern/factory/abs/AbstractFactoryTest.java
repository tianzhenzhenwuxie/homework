package com.tine.java.pattern.factory.abs;

/**
 * @Author: Administrator
 * @Date: 22:39 2019/11/25
 * @Desc: class desc
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory = new AudiFactory();
        System.out.println(factory.createBus().getName());
        System.out.println(factory.createCar().getName());

        AbstractFactory factory2 = new BenzFactory();
        System.out.println(factory2.createBus().getName());
        System.out.println(factory2.createCar().getName());
    }
}
