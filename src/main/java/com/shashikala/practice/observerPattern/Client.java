package com.shashikala.practice.observerPattern;

public class Client {
    public static void main(String[] args) {
        Subject subject=new Subject();
        Observer observer1=new Observer();
        Observer observer2=new Observer();
        subject.add(observer1);
        subject.add(observer2);
        subject.setPrice(2000);
        subject.unsubscribe(observer2);
        subject.setPrice(3000);

    }
}
