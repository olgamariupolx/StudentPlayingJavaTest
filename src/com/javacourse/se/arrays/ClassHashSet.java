package com.javacourse.se.arrays;

import java.util.HashSet;

public class ClassHashSet {
    public void hashSetOperations(){
        HashSet <Integer> age = new HashSet<>();
        age.add(21);
        age.add(23);
        age.add(20);
        age.add(19);
        age.add(29);
        age.add(24);
        age.add(84);
        age.add(25);
        age.add(26);
        age.add(34);

        if (age.contains(39)){
        System.out.println("That's right");
    } else {
        System.out.println("Oh, no");
    }

        age.remove(84);

        System.out.println(age);

        age.remove(0);

        System.out.println(age);
}

}


