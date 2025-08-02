package com.shashikala.practice.Thread;

import java.util.List;
import java.util.concurrent.*;

public class Task {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Thread t1=new Thread(new TaskOfThread());
//        t1.start();

        ExecutorService executorService= Executors.newFixedThreadPool(1);
        //whenever task completes this will return value
        Future<String> submit = executorService.submit(new TaskOfThread());
        System.out.println(submit.get());
        System.out.println("main is running "+Thread.currentThread().getName());
        //callable returns data and also it can throw exception
    }

    static class TaskOfThread implements Callable<String>{

        @Override
        public String call() throws Exception {
            System.out.println("Runnable is running..."+Thread.currentThread().getName());
            return "success";
        }
    }

//    static class TaskOfThread implements Runnable{
//
//        @Override
//        public void run() {
//            System.out.println("Runnable is running..."+Thread.currentThread().getName());
//        }
//    }



}
