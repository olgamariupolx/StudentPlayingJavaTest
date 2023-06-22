package com.javacourse.se.lesson19;

public class Person {
    private String name;
    private Integer age;
    private Sex sex;

    public Person(String name, Integer age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public void whereAmI() {
        System.out.println("I`m at home.");
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Person)) return false;

        Person p = (Person) obj;
        return this.name.equals(p.name) && this.age.equals(p.age);
        
    }



}
