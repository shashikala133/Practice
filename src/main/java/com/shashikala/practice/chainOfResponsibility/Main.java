package com.shashikala.practice.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Approver lead=new Lead();
        Approver manager=new Manager();
        Approver hr=new Hr();
        lead.setNextApprover(manager);
        manager.setNextApprover(hr);
        int leaves=5;
        lead.approve(leaves);
    }
}
