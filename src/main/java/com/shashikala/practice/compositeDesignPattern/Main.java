package com.shashikala.practice.compositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        CompositeSmartComponent room1=new CompositeSmartComponent();
        room1.add(new AirConditioner());
        room1.add(new Music());

        CompositeSmartComponent room2=new CompositeSmartComponent();
        room2.add(new Music());
        room2.add(new AirConditioner());

        CompositeSmartComponent floor=new CompositeSmartComponent();
        floor.add(room1);
        floor.add(room2);

        CompositeSmartComponent house=new CompositeSmartComponent();
        house.add(floor);

        house.turnOn();
        house.turnOff();
    }
}
