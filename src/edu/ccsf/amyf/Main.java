package edu.ccsf.amyf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double average = 0;

        System.out.println("This program will compute your homework average value. How many assignments do you have?");
        int numAssignments = keyboard.nextInt();
            if (numAssignments == 0 ) {
                System.out.println("Since you have 0 homework assignments this program wll not work for you.");
            }
            else {
                int runningTotal = 0;
                for (int assignmentIndex = 0; assignmentIndex < numAssignments; assignmentIndex++) {
                    System.out.println("Enter a homework assignment value");
                    int hwValue = keyboard.nextInt();
                    runningTotal = runningTotal + hwValue;
                    average = (runningTotal / numAssignments)*10;
                }
            }
        System.out.println("Your homework percentage is %" + average);
    }
}
