package com.shashikala.practice.observerPattern;

public class Observer {

    private int goldPrice;

    public void updatePrice(int price) {
        this.goldPrice=price;
        displayPrice();
    }

    private void displayPrice() {
        System.out.println("Gold price updated: "+goldPrice);
    }
}
