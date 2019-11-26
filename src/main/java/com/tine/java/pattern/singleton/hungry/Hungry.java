package com.tine.java.pattern.singleton.hungry;

public class Hungry {
    private Hungry(){};
    public static final Hungry hungry = new Hungry();
    public Hungry getInstance(){
        return hungry;
    }
}
