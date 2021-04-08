
//        Write a program that prompts the user to enter a decimal number between 0 and 15 and displays its corresponding binary value.
//        Your program’s output should look like that shown in the 2 sample runs shown below.  Green text represents information entered by the user.  Black text is produced by the program.
//        Enter a decimal number between 0 and 15: 12
//        The binary number for 12 is 1100
//
//        Enter a decimal number between 0 and 15: 5
//        The binary number for 5 is 0101

package Practice4.ProgramingAssignments.ProgrammingAssignment4;

import java.util.Scanner;

public class DecimalToBinaryRonaldRajski {

    public static void main (String[]args){
            // Create Scanner
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter a decimal integer
            System.out.print("Enter a decimial number between 0 and 15: ");
            int decimal = input.nextInt();
            String binary = "";    // Holds the binary value
            for (int i = decimal; i > 0; i /= 2) {
                binary = (i % 2) + binary;
            }

            // Display the corresponding binary value of the decimal integer
            System.out.println("The binary number for " + decimal + " is: " + binary);
            }
    }


