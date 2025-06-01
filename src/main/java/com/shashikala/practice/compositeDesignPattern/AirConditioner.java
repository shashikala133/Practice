package com.shashikala.practice.compositeDesignPattern;

public class AirConditioner implements SmartComponent{
    @Override
    public void turnOn() {
        System.out.println("turning on ac");
    }

    @Override
    public void turnOff() {
        System.out.println("turning off ac");
    }
}
