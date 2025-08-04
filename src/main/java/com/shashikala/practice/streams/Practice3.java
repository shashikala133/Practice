package com.shashikala.practice.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice3 {
    public static void main(String[] args) {
//        Filter even numbers from a list of integers
        //List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //numbers.stream().filter(n->n%2==0).forEach(System.out::println);

//        Convert all strings in a list to uppercase
//        List<String> strings = Arrays.asList("java", "stream", "practice", "lambda");
//        strings.stream().map(s->s.toUpperCase()).forEach(System.out::println);

//        Count how many strings have a length greater than 5
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "strawberry", "pear");
//        long count = strings.stream().filter(s -> s.length() > 5).count();
//        System.out.println(count);

//        . Find the max or min value in a list of integers
//        List<Integer> numbers = Arrays.asList(23, 99, 5, 78, 2, 100, 45);
//        Integer i = numbers.stream().max((a, b) -> a - b).get();
//        System.out.println(i);

//        Remove null or empty strings from a list
//        List<String> strings = Arrays.asList("hello", "", null, "world", "  ", "java");
//        strings.stream().filter(s->s!=null && !s.isEmpty() && !s.isBlank()).forEach(System.out::println);

//        Find duplicate elements in a list of strings
//        List<String> strings = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date");
//        Set<String> seen=new HashSet<>();
//        strings.stream().filter(s->!seen.add(s)).forEach(System.out::println);

//        Flatten a list of lists of integers into a single list
//        List<List<Integer>> nested = Arrays.asList(
//                Arrays.asList(1, 2),
//                Arrays.asList(3, 4),
//                Arrays.asList(5)
//        );
//        List<Integer> collect = nested.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
//        System.out.println(collect);

//        Group strings by their first character
//        List<String> strings = Arrays.asList("apple", "ant", "banana", "bat", "cat", "car");
//        Map<String, List<String>> collect = strings.stream().collect(Collectors.groupingBy(s -> s.substring(0, 1)));
//        System.out.println(collect);

//        Find the second-highest number in a list
//        List<Integer> numbers = Arrays.asList(20, 35, 50, 70, 60);
//        Integer i = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//        System.out.println(i);

//Sort a list of people by age descending, then name ascending
//        List<Person> people = Arrays.asList(
//                new Person("Alice", 30),
//                new Person("Bob", 25),
//                new Person("Charlie", 30),
//                new Person("David", 20)
//        );
//        List<Person> collect = people.stream().sorted(
//                Comparator.comparing(Person::getAge, Comparator.reverseOrder()).thenComparing(
//                        Person::getName
//                )).collect(Collectors.toList());
//        System.out.println(collect);
//
//         Calculate the sum and average of a list of integers
//        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
//        numbers.stream().mapToInt(Integer::intValue).average();
//        numbers.stream().mapToInt(Integer::intValue).sum();

//        Count frequency of each word in a list
//        List<String> words = Arrays.asList("apple", "banana", "apple", "apple", "banana", "cherry");
//        Map<String, Long> collect = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);

//        Partition numbers into even and odd
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(s -> s % 2 == 0));
//        System.out.println(collect);

//        Get a list of distinct characters from a list of strings
//        List<String> strings = Arrays.asList("java", "code", "stream");
//        List<Character> collect = strings.stream().flatMap(s -> s.chars().mapToObj(c -> (char) c)).distinct().collect(Collectors.toList());
//        System.out.println(collect);

//        Find the most frequent character in a string
//        String input = "banana";
//        Character c1 = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
//                .findFirst().map(Map.Entry::getKey).get();
//        System.out.println(c1);

//        Implement pagination using streams (get page X with Y elements)
//        List<String> strings = Arrays.asList("one", "two", "three", "four", "five", "six", "seven");
//        int page = 2, size = 3;
//        List<String> collect = strings.stream().skip((page - 1) * size).limit(size).collect(Collectors.toList());
//        System.out.println(collect);

//        Count how many strings have a length equal to their index
//        List<String> strings = Arrays.asList("a", "bb", "ccc", "dd", "eeeee");
//        long count = IntStream.range(0, strings.size()).filter(i -> strings.get(i).length() == i).count();
//        System.out.println(count);

//        Find common elements between two lists of integers
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
//        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);
//
//        List<Integer> collect = list1.stream().filter(list -> list2.contains(list)).collect(Collectors.toList());
//        System.out.println(collect);

//        Get top 3 most frequent elements in a list
//        List<String> words = Arrays.asList("a", "b", "c", "a", "b", "a", "c", "c", "d","e","i","i","i");
//        List<Map.Entry<String, Long>> collect = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet().stream()
//                .sorted(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder()))
//                .limit(3)
//                .collect(Collectors.toList());
//        System.out.println(collect);

//        Return a frequency map of each character in a sentence (ignore spaces)
        String sentence = "Hello world";
        Map<Character, Long> collect = sentence.chars().mapToObj(c -> (char) c)
                .filter(c->c!=' ')
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect);

        List<String> strings = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date");
        Integer collect1 = strings.stream().collect(Collectors.mapping(String::length, Collectors.summingInt(Integer::intValue)));
        System.out.println(collect1);

        List<Integer> collect2 = strings.stream().collect(Collectors.mapping(String::length, Collectors.toList()));
        Integer i = collect2.stream().reduce((a, b) -> a + b).get();
        System.out.println(i);
    // if in case you have product as a list<Product> inside Order and you want get product related details
        // then use flatMap(order->order.getProduct().stream()).collect(Collectors.mapping(Product::getName(),Collectors.toList());


    }
}
