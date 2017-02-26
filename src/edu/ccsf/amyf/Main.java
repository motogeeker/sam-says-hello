package edu.ccsf.amyf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program will compute your homework average value. How many assignments do you have?");
            int numAssignments = keyboard.nextInt();
            if (numAssignments == 0 ) {
                System.out.println("Since you have 0 homework assignments this program wll not work for you.");
            }
            else {
                System.out.println("What is the value of your first homework assignment?");
            }
                for (int assignmentIndex = 0; assignmentIndex< numAssignments; assignmentIndex++) {

                    }
        System.out.println("w00t");
    }
}
