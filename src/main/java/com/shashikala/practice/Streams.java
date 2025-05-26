package com.shashikala.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.StreamSupport.stream;


public class Streams {
    public static void main(String[] args) {
        List<Integer> list= List.of(2000,1000,4000,6000,8000);
        Optional<Integer> first = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        if(first.isPresent()){
            System.out.println("second highest: "+first.get());
        }else{
            System.out.println("second highest does not exist");
        }
        //count second most frequent word in a list
        List<String> words = List.of("apple","apple","banana","apple","orange","banana");
        Map<String,Long> ans=words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(ans);

        Optional<Map.Entry<String, Long>> first1 = ans.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue()
                .reversed()).skip(1).findFirst();
        System.out.println(first1.get());
    }

}
