package com.tine.java.pattern.factory.simple;

import com.tine.java.pattern.factory.Audi;
import com.tine.java.pattern.factory.BMW;
import com.tine.java.pattern.factory.Benz;
import com.tine.java.pattern.factory.Car;

public class SimpleFactory {
    public Car createCar(String type){
        if("Audi".equalsIgnoreCase(type)){
            return new Audi();
        }else if("BMW".equalsIgnoreCase(type)){
            return new BMW();
        }else if("Benz".equalsIgnoreCase(type)){
            return new Benz();
        }else{
            return null;
        }
    }
}
