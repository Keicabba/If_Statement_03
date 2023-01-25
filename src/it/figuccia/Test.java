package it.figuccia;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // personal addition from here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String setName = (scanner.nextLine());
        int setAge = 0;

        //to elude not int input error
        int attempt = 0;
        boolean isValid = false;
        while (!isValid && attempt < 5) {
            System.out.print("Enter age: ");
            String ageInput = scanner.nextLine();
            try {
                setAge = (Integer.parseInt(ageInput));
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid age value. Please enter a valid number.");
                attempt++;
                if (attempt == 5) {
                    System.out.println("Too many attempt, exiting...");
                    return;
                }
            }
        }
        Student student = new Student(setName, setAge);
        // personal addition up to here

        // Student student = new Student("Pincopalla", 25);
        student.guessingAge();
    }
}
