package edu.ccsf.amyf;

public class Main {

    public static void helper(int i) {
        System.out.println("\t\tIn helper! " + i);
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Amy and Sam.");
        for (int i = 0; i < 10; i++) {
            System.out.println("For loop iteration " + i);
            helper(i);
        }
        System.out.println("w00t");
    }
}
