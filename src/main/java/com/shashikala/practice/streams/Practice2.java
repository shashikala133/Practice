package com.shashikala.practice.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice2 {
    public static void main(String[] args) {
//        Find all palindromes in a list of strings
        List<String> strings= Arrays.asList("amma","madam","apple");
        List<String> collect = strings.stream().filter(s -> isPalindrome(s)).collect(Collectors.toList());
        System.out.println(collect);

//Count how many strings have length equal to their index in the list
        List<String> strings1= Arrays.asList("amma","a","ma","app");
        Long count=IntStream.range(0,strings1.size()).filter(i->strings1.get(i).length()==i).count();
        System.out.println(count);

//Join list of words into a sentence (capitalize first letter)
        String sentence = strings.stream().collect(Collectors.joining(" "));
        String upperCase = sentence.substring(0, 1).toUpperCase() +sentence.substring(1);
        System.out.println(upperCase);

//Remove strings that are substrings of other strings in the list
//
//Find the element that occurs exactly once
        List<Integer> list=Arrays.asList(1,2,3,2,1);
        Integer i = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()==1)
                .findFirst()
                .map(Map.Entry::getKey).get();
        System.out.println(i);
//
//Return a map of first letter to count of strings starting with it
        Map<String, Long> collect1 = strings1.stream().map(s -> s.substring(0, 1)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);
    }

    public static boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while (start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
