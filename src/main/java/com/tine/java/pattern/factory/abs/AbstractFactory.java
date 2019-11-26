package com.tine.java.pattern.factory.abs;

import com.tine.java.pattern.factory.Bus;
import com.tine.java.pattern.factory.Car;

/**
 * @Author: Administrator
 * @Date: 22:40 2019/11/25
 * @Desc: class desc
 **/
public abstract class AbstractFactory {
    abstract Car createCar();

    abstract Bus createBus();
}
