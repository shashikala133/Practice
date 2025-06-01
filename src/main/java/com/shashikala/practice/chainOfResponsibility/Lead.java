package com.shashikala.practice.chainOfResponsibility;

public class Lead extends Approver{
    @Override
    public void approve(int leaves) {
        if(leaves<2){
            System.out.println("leave approved by lead");
        } else if (nextApprover!=null) {
            nextApprover.approve(leaves);
        }
    }
}
