package com.javacourse.se.arrays;

import java.util.ArrayList;

public class ClassArraylist {
    public static void createListAndTestRemovingStatic () {

        ArrayList<String> lesson = new ArrayList<>();
        lesson.add("Math");
        lesson.add("Biology");
        lesson.add("English");
        lesson.add("Geography");
        lesson.add("History");
        lesson.remove(2);
        System.out.println("Out of static method: " + lesson);


    }
    public  void createListAndTestRemoving () {

        ArrayList<String> lesson = new ArrayList<>();
        lesson.add("Math");
        lesson.add("Biology");
        lesson.add("English");
        lesson.add("Geography");
        lesson.add("History");
        lesson.remove(2);
        lesson.set(1,"Art");
        System.out.println("Out of method: " + lesson);




    }


}
