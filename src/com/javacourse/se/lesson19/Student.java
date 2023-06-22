
package com.javacourse.se.lesson19;

public class Student extends Person {

    public Student(String name, Integer age, Sex sex) {
        super(name, age, sex);
    }

    public void whereAmI() {
        System.out.println("I`m at university.");
    }
}



