package com.shashikala.practice.stateDesignPattern;

public interface TrafficLightState {

     void next(TrafficLightContext trafficLightContext);
    String getColour();

}
