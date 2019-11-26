package com.tine.java.pattern.factory.method;

import com.tine.java.pattern.factory.AudiCar;
import com.tine.java.pattern.factory.Car;

/**
 * @Author: Administrator
 * @Date: 22:32 2019/11/25
 * @Desc: class desc
 **/
public class AudiFactory implements Factory {

    public Car createCar() {
        return new AudiCar();
    }
}
