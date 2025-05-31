package com.shashikala.practice.observerPattern;

public class GoldTrackerApp implements IObserver {

    private int goldPrice;

    private Gold gold;

    public GoldTrackerApp(Gold gold) {
        this.gold = gold;
        gold.add(this);
    }

    @Override
    public void updatePrice(int price) {
        this.goldPrice=price;
        displayPrice();
    }

    private void displayPrice() {
        System.out.println("Gold price updated: "+goldPrice);
    }
}
