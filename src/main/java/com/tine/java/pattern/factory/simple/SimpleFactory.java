package com.tine.java.pattern.factory.simple;

import com.tine.java.pattern.factory.AudiCar;
import com.tine.java.pattern.factory.BmwCar;
import com.tine.java.pattern.factory.BenzCar;
import com.tine.java.pattern.factory.Car;

public class SimpleFactory {
    public Car createCar(String type){
        if("AudiCar".equalsIgnoreCase(type)){
            return new AudiCar();
        }else if("BmwCar".equalsIgnoreCase(type)){
            return new BmwCar();
        }else if("BenzCar".equalsIgnoreCase(type)){
            return new BenzCar();
        }else{
            return null;
        }
    }
}
