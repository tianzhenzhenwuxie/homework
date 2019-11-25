package com.tine.java.pattern.factory.method;

import com.tine.java.pattern.factory.BMW;
import com.tine.java.pattern.factory.Car;

/**
 * @Author: Administrator
 * @Date: 22:34 2019/11/25
 * @Desc: class desc
 **/
public class BMWFactory implements Factory {

    public Car createCar() {
        return new BMW();
    }
}
