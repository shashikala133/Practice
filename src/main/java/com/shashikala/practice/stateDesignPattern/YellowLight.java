package com.shashikala.practice.stateDesignPattern;

public class YellowLight implements TrafficLightState{
    @Override
    public void next(TrafficLightContext trafficLightContext) {
        System.out.println("switching from yellow to red");
        trafficLightContext.setNextState(new RedLight());
    }

    @Override
    public String getColour() {
        System.out.println("yellow light");
        return "YELLOW LIGHT";
    }
}
