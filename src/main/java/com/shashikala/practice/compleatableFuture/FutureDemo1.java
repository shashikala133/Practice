package com.shashikala.practice.compleatableFuture;

import java.util.concurrent.*;

public class FutureDemo1 {

    public String getFirstName(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "selenium";
    }

    public String getLastName(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "express";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start=System.currentTimeMillis();
        FutureDemo1 futureDemo1=new FutureDemo1();

        Callable<String> firstName=new Callable<String>() {
            @Override
            public String call() throws Exception {
                String firstName = futureDemo1.getFirstName();
                return firstName;
            }
        };

        Callable<String> lastName=new Callable<String>() {
            @Override
            public String call() throws Exception {
                String lastName = futureDemo1.getLastName();
                return lastName;
            }
        };
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        Future<String> firstNameFuture = executorService.submit(firstName);
        Future<String> lastNameFuture = executorService.submit(lastName);

        String firstNameFinal = firstNameFuture.get();
        String lastNameFinal = lastNameFuture.get();

        //this will take 4s since both are independent we can introduce parallel prog
        System.out.println(firstNameFinal+" "+lastNameFinal);
        System.out.println("total time: "+ (System.currentTimeMillis()-start));
    }
}
