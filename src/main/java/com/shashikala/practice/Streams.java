package com.shashikala.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list= List.of(2000,1000,4000,6000,8000);
        Optional<Integer> first = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        if(first.isPresent()){
            System.out.println("second highest: "+first.get());
        }else{
            System.out.println("second highest does not exist");
        }
    }

}
