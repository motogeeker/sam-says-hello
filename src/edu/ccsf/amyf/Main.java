package edu.ccsf.amyf;

import java.util.Scanner;

public class Main {

    public static int calculateHomeworkAverage(int[] scores) {
        if (scores.length == 0) {
            System.out.println("Nopes! Evil! No can hz sciore!");
            return 0;
        }

        int runningTotal = 0;
        for (int i = 0; i < scores.length; i++) {
            int value = scores[i];
            runningTotal = runningTotal + value;
        }
        return runningTotal / scores.length;
    }

    public static boolean checkScenario(int[] inputScores, int expected) {
        int actual = calculateHomeworkAverage(inputScores);
        if (actual == expected) {
            System.out.println("Test passed!");
            return true;
        } else {
            System.out.println("OH NOOOO TEST FAILLED");
            System.out.println("Expected " + expected);
            System.out.println("Got " + actual);
            return false;
        }
    }

    public static void runTests() {
        int numScenariosRun = 0;
        int numScenariosPassed = 0;
        int[] allPerfectScores = {100, 100, 100, 100};
        if (checkScenario(allPerfectScores, 100)) {
            numScenariosPassed++;
            System.out.println("Scenario allPerfectScores passed");
        }
        numScenariosRun++;

        int[] supercluelessScores = {0, 0, 0, 0};
        if (checkScenario(supercluelessScores, 0)) {
            numScenariosPassed++;
            System.out.println("Scenario supercluelessScores passed");
        }
        numScenariosRun++;

        int[] allFifty = {50, 50, 50, 50};
        if (checkScenario(allFifty, 50)) {
            numScenariosPassed++;
            System.out.println("Scenario allFifty passed");
        }
        numScenariosRun++;


        int[] nonezo = {};
        if (checkScenario(nonezo, 0)) {
            numScenariosPassed++;
            System.out.println("Scenario nonzeo passed");
        }
        numScenariosRun++;


        System.out.println(numScenariosPassed + " passes out of " + numScenariosRun + " runs");
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        runTests();

//        System.out.println("This program will compute your homework average value. How many assignments do you have?");
//        int numAssignments = keyboard.nextInt();
//            if (numAssignments == 0 ) {
//                System.out.println("Since you have 0 homework assignments this program wll not work for you.");
//            } else {
//                int [] scores = new int[numAssignments];
//                for (int assignmentIndex = 0; assignmentIndex < numAssignments; assignmentIndex++) {
//                    System.out.println("Enter a homework assignment value");
//                    int hwValue = keyboard.nextInt();
//                    scores[assignmentIndex] = hwValue;
//                }
//
//                int average = calculateHomeworkAverage(scores);
//                System.out.println("Your homework percentage is %" + average);
//            }
    }
}
