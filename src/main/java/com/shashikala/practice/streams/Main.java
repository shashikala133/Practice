package com.shashikala.practice.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        List<Integer> list1= Arrays.asList(1,2,2,4,4);
        //filter even numbers
        List<Integer> collect = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

//        Uppercase conversion
        List<String> strings= Arrays.asList("apple","banana","cherry","cics");
        String collect1 = strings.stream().map(s -> s.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(collect1);

//        Count strings with length > 3
        long count = strings.stream().filter(s -> s.length() > 3).count();
        System.out.println(count);

//        Square each number
        List<Integer> collect2 = list.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(collect2);

//        Sort strings in reverse order
        List<String> collect3 = strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect3);

//        Find the maximum number
        Integer i = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        list.stream().max(Comparator.naturalOrder());
        System.out.println(i);

//        Get distinct elements
        List<Integer> collect6 = list1.stream().distinct().collect(Collectors.toList());
        System.out.println(collect6);

        Set<Integer> collect4 = list1.stream().collect(Collectors.toSet());
        System.out.println(collect4);

        Set<Integer> seen=new HashSet<>();
        List<Integer> collect5 = list1.stream().filter(n -> seen.add(n)).collect(Collectors.toList());
        System.out.println(collect5);

//        Sum of even numbers
        Integer reduce = list.stream().filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

//        Group by length
        Map<Integer, List<String>> collect7 = strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect7);

//        Find second highest number
        Integer i1 = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i1);

//        Find the first non-repeated character


//        Map of frequency counts
        List<String> list2=Arrays.asList("one","two","one","three");
        Map<String, Long> collect8 = list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect8);

//        FlatMap to extract words
        List<List<String>> one = List.of(
                List.of("one", "two"),
                List.of("three", "four")
        );
        System.out.println( one.stream().flatMap(l->l.stream()).collect(Collectors.joining(",")));

        List<String> sentences = List.of(
                "Java is powerful",
                "Streams are awesome",
                "Practice makes perfect"
        );
        System.out.println(sentences.stream().collect(Collectors.joining(" ")));

//        Partition list into even and odd
        Map<Boolean,List<Integer>> ans=list.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(ans);

        String s="shashikala";
        Character characterLongEntry = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(characterLongEntry);

    }
}
