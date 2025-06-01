package com.shashikala.practice.compleatableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class CompleatableFutureDemo {

    public String getName(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "selenium express";
    }

    public static void main(String[] args) throws InterruptedException {
        CompleatableFutureDemo compleatableFutureDemo=new CompleatableFutureDemo();

        CompletableFuture.supplyAsync(()->compleatableFutureDemo.getName()).thenAccept(s-> System.out.println(s));
        //get or join blocking the main thread
        System.out.println("done");
        Thread.sleep(30000);
    }
}
