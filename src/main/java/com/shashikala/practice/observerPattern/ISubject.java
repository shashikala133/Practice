package com.shashikala.practice.observerPattern;

public interface ISubject {

    public void add(IObserver iObserver);
    public void unsubscribe(IObserver iObserver);
    public void notifyAllObserver();

}
