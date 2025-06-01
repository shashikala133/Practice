package com.shashikala.practice.stateDesignPattern;

public class RedLight implements TrafficLightState{
    @Override
    public void next(TrafficLightContext trafficLightContext) {
        System.out.println("switching from red to green");
        trafficLightContext.setNextState(new GreenLight());
    }

    @Override
    public String getColour() {
        System.out.println("red light");
        return "RED LIGHT";
    }
}
