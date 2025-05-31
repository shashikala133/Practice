package com.shashikala.practice.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Gold implements ISubject {

    private int price=1000;

    private List<IObserver> observerList=new ArrayList<>();


    public void setPrice(int price){
        this.price=price;
        notifyAllObserver();
    }

    public void notifyAllObserver() {
        for(IObserver Observer :observerList){
            Observer.updatePrice(price);
        }
    }

    public void add(IObserver observer){
        observerList.add(observer);
    }

    public void unsubscribe(IObserver observer2) {
        observerList.remove(observer2);
    }
}
