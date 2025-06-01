package com.shashikala.practice.compositeDesignPattern;

public class Music implements SmartComponent{
    @Override
    public void turnOn() {
        System.out.println("turning on music");
    }

    @Override
    public void turnOff() {
        System.out.println("turning off music");
    }
}
