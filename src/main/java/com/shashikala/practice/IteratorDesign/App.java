package com.shashikala.practice.IteratorDesign;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        ArrayList<String> list= new ArrayList<>();
//        list.addAll(List.of("shashikala","akshata","yashaswini"));
//        Iterator<String> iterator=list.iterator();
//        while (iterator.hasNext()){
//            System.out.println("next element: "+iterator.next());
//        }

        CourseRepository courseRepository=new CourseRepository();
        courseRepository.addCourse(new Course("java"));
        courseRepository.addCourse(new Course("springboot"));
        courseRepository.addCourse(new Course("microservice"));
        Iterator iterator = courseRepository.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }



}
