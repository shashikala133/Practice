package com.shashikala.practice.IteratorDesign;

public class CourseIterator implements Iterator{
    private Course[] courses;

    private int position=0;

    public CourseIterator(Course[] course){
        this.courses=course;
    }
    @Override
    public boolean hasNext() {
        return position<courses.length && courses[position]!=null;
    }

    @Override
    public Object next() {
        return courses[position++];
    }
}
