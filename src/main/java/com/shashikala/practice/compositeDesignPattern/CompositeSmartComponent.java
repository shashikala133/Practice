package com.shashikala.practice.compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeSmartComponent implements SmartComponent{

    List<SmartComponent> smartComponents=new ArrayList<>();

    public void add(SmartComponent smartComponent){
        smartComponents.add(smartComponent);
    }

    public void remove(SmartComponent smartComponent){
        smartComponents.remove(smartComponent);
    }
    @Override
    public void turnOn() {
       for(SmartComponent smartComponent:smartComponents){
           smartComponent.turnOn();
       }
    }

    @Override
    public void turnOff() {
       for (SmartComponent smartComponent:smartComponents){
           smartComponent.turnOff();
       }
    }
}
