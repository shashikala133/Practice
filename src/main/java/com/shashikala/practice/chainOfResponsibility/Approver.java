package com.shashikala.practice.chainOfResponsibility;

public abstract class Approver {

    protected Approver nextApprover;

    public void setNextApprover(Approver approver){
        nextApprover=approver;
    }
    public abstract void approve(int leaves);
}
