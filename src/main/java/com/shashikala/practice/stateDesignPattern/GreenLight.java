package com.shashikala.practice.stateDesignPattern;

public class GreenLight implements TrafficLightState {
    @Override
    public void next(TrafficLightContext trafficLightContext) {
        System.out.println("switching from green to yellow");
        trafficLightContext.setNextState(new YellowLight());
    }

    @Override
    public String getColour() {
        System.out.println("green light");
        return "GREEN LIGHT";
    }
}
