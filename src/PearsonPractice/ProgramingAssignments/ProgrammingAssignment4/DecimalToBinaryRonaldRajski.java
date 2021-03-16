package PearsonPractice.ProgramingAssignments.ProgrammingAssignment4;

import java.util.Scanner;

public class DecimalToBinaryRonaldRajski {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a decimal integer
        System.out.print("Enter a decimial number between 0 and 15: ");
        int decimal = input.nextInt();

        // Convert the decimal number to a binary number
        String binary = "";	// Holds the binary value
        for (int i = decimal; i > 0; i /= 2) {
            binary = (i % 2) + binary;
        }

        // Display the corresponding binary value of the decimal integer
        System.out.println(
                "The binary number for " + decimal + " is: " + binary);
    }
}





