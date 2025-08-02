package com.shashikala.practice.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Practice1 {
    public static void main(String[] args) {
//        1. Find all strings that start with a vowel
        String[] lists={"apple", "banana", "orange", "grape", "umbrella", "kiwi","ananas"};
        System.out.println(Arrays.stream(lists).filter(s->s.startsWith("a") || s.startsWith("e") || s.startsWith("i")
                || s.startsWith("o") || s.startsWith("u")).collect(Collectors.toList()));

//        2. Find the longest string
        String[] list1={"car", "motorcycle", "truck", "bicycle"};
        String s2 = Arrays.stream(list1).max(Comparator.comparing(String::length)).get();
        System.out.println(s2);
        String s = Arrays.stream(list1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).get();
        System.out.println(s);

//        3. Count the number of null or empty strings
        String[] list2={"java", null, "", "stream", " "};
        long count=Arrays.stream(list2).filter(str-> str==null || str.isEmpty()).count();
        System.out.println(count);

//        Remove nulls and trim whitespace
        String[] list3={" apple ", null, "banana", " cherry ", ""};
        System.out.println(Arrays.stream(list3).filter(s1 -> s1!=null && s1!="").
                map(s1 -> s1.trim()).collect(Collectors.toList()));

       // 5. Find common elements in two lists
        int[] list4={1, 2, 3, 4, 5};
        int[] list5={3, 4, 5, 6, 7};
        List<Integer> collect = Arrays.stream(list4).filter(element -> Arrays.stream(list5)
                .anyMatch(e -> e == element)).boxed().collect(Collectors.toList());
        System.out.println(collect);

//                List<Integer> list4 = asList(1, 2, 3, 4, 5);
//        List<Integer> list5 = asList(1, 3, 5, 7, 9);
//        List<Integer> collect = list4.stream().filter(list -> list5.contains(list)).collect(Collectors.toList());
//        System.out.println(collect);

//        6. Check if all elements are even
      //  int[] list6={2, 4, 6, 8, 10};
        int[] list6={1, 2, 4};
        System.out.println( Arrays.stream(list6).allMatch(e->e%2==0));

//        7. Group words by their starting character
        Map<String, List<String>> collect1 = Arrays.stream(lists).collect(Collectors.groupingBy(str -> str.substring(0, 1)));
        System.out.println(collect1);

//        8. Top N frequent elements
        String[] strings={"java", "python", "java", "c++", "python", "java"};
        List<String> collect2 = Arrays.stream(strings).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .limit(2).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect2);

//        9. Character frequency in a sentence
//Input: "Hello world"
//Expected Output: {h=1, e=1, l=3, o=2, w=1, r=1, d=1} (case-insensitive, skip space)

        String s1="Hello world";
        Map<Character, Long> collect3 = s1.chars().mapToObj(c -> (char) c).filter(str -> str != ' ').collect(Collectors.groupingBy(Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()));
        System.out.println(collect3);

//        10. Flatten and deduplicate a list of lists
//Input: [[1, 2], [2, 3], [4]]
//Expected Output: [1, 2, 3, 4]

        List<List<Integer>> lists1 = List.of(
                List.of(1, 2),
                List.of(2, 3),
                List.of(4)
        );
        List<Integer> collect4 = lists1.stream().flatMap(list -> list.stream()).distinct().collect(Collectors.toList());
        System.out.println(collect4);

//        Sort people by age descending, then name ascending
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Alice", 30));
        personList.add(new Person("Bob", 25));
        personList.add(new Person("Charlie", 30));
        personList.add(new Person("David", 20));

        List<Person> collect5 = personList.stream().sorted(
                Comparator.comparing(Person::getAge,Comparator.reverseOrder())
                        .thenComparing(Person::getName)
        ).collect(Collectors.toList());
        System.out.println(collect5);

        double average = personList.stream().mapToInt(Person::getAge).average().orElse(0);
        List<String> collect6 = personList.stream().filter(p -> p.getAge() > average).map(Person::getName).collect(Collectors.toList());
        System.out.println(collect6);

//        14. Find duplicate elements in a list
//Input: ["apple", "banana", "apple", "cherry", "banana", "date"]
//Expected Output: ["apple", "banana"]

        List<String> stringList=Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date");
        Set<String> seen=new HashSet<>();
        List<String> collect7 = stringList.stream().filter(element -> !seen.add(element)).collect(Collectors.toList());
        System.out.println(collect7);

//        15. Most frequent character in a string
//        Input: "banana"
        String string="banana";
        Map.Entry<Character, Long> characterLongEntry = string.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder())).
                findFirst().get();
        System.out.println(characterLongEntry);
    }
}
