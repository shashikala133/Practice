package com.shashikala.practice.adapter;

public class CoffieMachineAdapter implements SmartDevice{

    private CoffieMachine coffieMachine;

    public CoffieMachineAdapter(CoffieMachine coffieMachine){
        this.coffieMachine=coffieMachine;
    }
    @Override
    public void turnOn() {
      coffieMachine.connectViaZigbee();
      coffieMachine.startCooling();
    }

    @Override
    public void turnOff() {
    coffieMachine.stopCooling();
    coffieMachine.turnOffZigbee();
    }
}
