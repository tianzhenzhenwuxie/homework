package com.tine.java.pattern.factory.method;

import com.tine.java.pattern.factory.BenzCar;
import com.tine.java.pattern.factory.Car;

/**
 * @Author: Administrator
 * @Date: 22:33 2019/11/25
 * @Desc: class desc
 **/
public class BenzFactory implements Factory {

    public Car createCar() {
        return new BenzCar();
    }
}
