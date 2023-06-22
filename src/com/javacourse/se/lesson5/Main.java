package com.javacourse.se.lesson5;

import com.javacourse.se.arrays.ClassArraylist;
import com.javacourse.se.arrays.ClassHashMap;
import com.javacourse.se.arrays.ClassHashSet;
import com.javacourse.se.arrays.ClassTreeMap;
import com.javacourse.se.lesson19.Person;
import com.javacourse.se.lesson19.Sex;
import com.javacourse.se.lesson19.Student;


public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 22, Sex.MALE);
        Student student2 = new Student("Ivan", 37, Sex.MALE);
        Student student3 = new Student("Dariya", 25, Sex.FEMALE);
        Student student4 = new Student("Evgeniy", 22, Sex.MALE);
        Student student5 = new Student("Igor", 35, Sex.MALE);
        Student student6 = new Student("Mariya", 25, Sex.FEMALE);
        Student student7 = new Student("Yana", 21, Sex.FEMALE);
        Student student8 = new Student("Lesya", 30, Sex.FEMALE);

        Person person = new Person("Leonid");
        Student students[] = new Student[8];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        students[5] = student6;
        students[6] = student7;
        students[7] = student8;


        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + " " + "(" + students[i].getSex() + ")" + " " + "is" + " " + students[i].getAge());
        }

        System.out.println();


        for (int i = 0; i < students.length; i++) {
            if (students[i].getSex() == Sex.MALE) {
                System.out.print(students[i].getName() + " ");
            }

        }
        System.out.println();

        for (int i = 0; i < students.length; i++) {
            if (students[i].getSex() == Sex.FEMALE) {
                System.out.print(students[i].getName() + " ");
            }

        }
        System.out.println();
        System.out.println();
        System.out.print(student1.getName() + "," + " where are you? ");
        student1.whereAmI();

        System.out.print(person.getName() + "," + " where are you? ");
        person.whereAmI();

        System.out.println();

        boolean rez = student1.equals(student2);
        System.out.println(rez);
        System.out.println(student1.getSex() == student2.getSex());

        ClassArraylist objectOfClassArrayList = new ClassArraylist();
        objectOfClassArrayList.createListAndTestRemoving();
        ClassArraylist.createListAndTestRemovingStatic();

        ClassHashSet objectOfClassHashSet = new ClassHashSet();
        objectOfClassHashSet.hashSetOperations();

        ClassHashMap objectOfClassHashMap = new ClassHashMap();
        objectOfClassHashMap.hashMapIterations();

        ClassTreeMap objectOfClassTreeMap = new ClassTreeMap();
        objectOfClassTreeMap.treeMapSorting();



    }

}

