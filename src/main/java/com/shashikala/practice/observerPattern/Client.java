package com.shashikala.practice.observerPattern;

public class Client {
    public static void main(String[] args) {
        Gold subject=new Gold();
        IObserver observer1=new GoldTrackerApp(subject);
        IObserver observer2=new GoldTrackerApp(subject);
//        subject.add(observer1);
//        subject.add(observer2);
        subject.setPrice(2000);
        subject.unsubscribe(observer2);
        subject.setPrice(3000);

    }
}
