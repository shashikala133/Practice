package com.shashikala.practice.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private int price=1000;

    private List<Observer> observerList=new ArrayList<>();

    public void setPrice(int price){
        this.price=price;
        notifyAllObserver();
    }

    private void notifyAllObserver() {
        for(Observer observer:observerList){
            observer.updatePrice(price);
        }
    }

    public void add(Observer observer){
        observerList.add(observer);
    }

    public void unsubscribe(Observer observer2) {
        observerList.remove(observer2);
    }
}
