package com.shashikala.practice.chainOfResponsibility;

public class Manager extends Approver{
    @Override
    public void approve(int leaves) {
        if(leaves<5){
            System.out.println("leave approved by manager");
        } else if (nextApprover!=null) {
            nextApprover.approve(leaves);
        }
    }
}
