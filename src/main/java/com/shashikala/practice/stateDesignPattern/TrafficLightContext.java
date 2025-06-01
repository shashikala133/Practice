package com.shashikala.practice.stateDesignPattern;

public class TrafficLightContext {

    private TrafficLightState currentState;

    public TrafficLightContext(){
        this.currentState=new RedLight();
    }

    public void setNextState(TrafficLightState state){
        this.currentState=state;
    }


    public void next() {
        currentState.next(this);
    }

    public String getColour() {
        return currentState.getColour();
    }
}
