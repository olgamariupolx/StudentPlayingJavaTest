package com.javacourse.se.lesson15;

public class Constructor {
            public void foo() {
            Baby baby1 = new Baby("Ivan", 3, 10, 120);
            Baby baby2 = new Baby("Basil", 4, 12, 128);
            Baby baby3 = new Baby("Oleg", 5, 10, 130);
            Baby baby4 = new Baby("Yana", 6, 15, 135);
            Baby baby5 = new Baby("Zlata", 3, 15, 120);

           System.out.println((baby1.age + baby2.age + baby3.age + baby4.age + baby5.age)/5);
        }

    }

