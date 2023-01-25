package it.figuccia;

import java.util.Random;

public class Student {
    private String name;
    private int age;

    public Student(String studentName, int studentAge) {
        this.name = studentName;
        this.age = studentAge;
    }

    public void guessingAge() {
        Random rand = new Random();
        int randomAge = rand.nextInt(35);

        System.out.println("I generated the random number " + randomAge + " for student " + name);

        if (randomAge == age) {
            System.out.println("The random age is equal to the student's age");
        } else if (randomAge > age) {
            System.out.println("The random age is greater than the student's age");
        } else {
            System.out.println("The random age is lower than the student's age");
        }
    }
}
