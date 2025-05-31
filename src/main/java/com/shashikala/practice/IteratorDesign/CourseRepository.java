package com.shashikala.practice.IteratorDesign;

public class CourseRepository {

    Course[] courses=new Course[10];
    int index=0;

    public void addCourse(Course course){
      courses[index]=course;
      index++;
    }

    public Iterator createIterator(){
        return new CourseIterator();
    }

    private class CourseIterator implements Iterator{
        private int position=0;
        @Override
        public boolean hasNext() {
            return position<courses.length && courses[position]!=null;
        }

        @Override
        public Object next() {
            return courses[position++];
        }
    }
}
