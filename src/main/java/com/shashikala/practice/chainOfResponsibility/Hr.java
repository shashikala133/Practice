package com.shashikala.practice.chainOfResponsibility;

public class Hr extends Approver{
    @Override
    public void approve(int leaves) {
        System.out.println("need to talk");
    }
}
