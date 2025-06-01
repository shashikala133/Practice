package com.shashikala.practice.adapter;

public class Main {
    public static void main(String[] args) {
        SmartDevice ac=new AirConditionerAdapter(new AirConditioner());
        SmartDevice coffie=new CoffieMachineAdapter(new CoffieMachine());
        ac.turnOn();
        coffie.turnOn();

        ac.turnOff();
        coffie.turnOff();
    }


}
