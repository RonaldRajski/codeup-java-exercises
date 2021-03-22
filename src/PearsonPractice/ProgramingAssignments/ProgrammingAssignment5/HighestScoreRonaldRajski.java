package PearsonPractice.ProgramingAssignments.ProgrammingAssignment5;

/*
(Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.
*/


//Ronald Rajski
//        COSC 1336
//        Instructor: Dr. Doerschuk
//        Programming Assignment 5
//        Due:  March 22, 2021
//Write a program that prompts the user to enter the number of students and each student’s name and score and finally displays the student with the highest score and the student with the second highest score.  Use the next() method in the Scanner class to read a name, rather than using the nextLine() method.  Assume that the number of students is at least 2
//        Your program’s output should look like that shown in the sample run shown below.  Green text represents information entered by the user.  Black text is produced by the program.
//        Enter the number of students: 5
//        Enter a student name: Jones
//        Enter a student score: 89
//        Enter a student name: Smith
//        Enter a student score: 45
//        Enter a student name: Anderson
//        Enter a student score: 97
//        Enter a student name: Washington
//        Enter a student score: 87
//        Enter a student name: Tran
//        Enter a student score: 98
//        Top two students:
//        Tran's score is 98.0
//        Anderson's score is 97.0


import java.util.Scanner;

public class HighestScoreRonaldRajski {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("     Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int score, 					// Holds students' score
                highest = 0, 			// Highest score
                secondHigest = 0;	// Second highest score
        String name = "", 		// Holds students' name
                student1 = "", 	// Highest scoring student name
                student2 = "";	// Second highest scoring student name

        // Prompt the user to enter each students' name and score
//        System.out.println("Enter each students' name and score:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("     Enter a student name: ");
            name = input.next();
            System.out.print("     Enter a student score: ");
            score = input.nextInt();

            if (i == 0) {
                // Make the first student the highest scoring student so far
                highest = score;
                student1 = name;
            }
            else if (i == 1 && score > highest) {
                // Second student entered scored
                // higher than first student
                secondHigest = highest;
                highest = score;
                student2 = student1;
                student1 = name;
            }
            else if (i == 1) {
                // Second student entered scored
                // lower than first student
                secondHigest = score;
                student2 = name;
            }
            else if (i > 1 && score > highest && score > secondHigest) {
                // Last student entered has the highest score
                secondHigest = highest;
                student2 = student1;
                highest = score;
                student1 = name;
            }
            else if (i > 1 && score > secondHigest) {
                // Last student entered has the second highest score
                student2 = name;
                secondHigest = score;
            }
        }

        // Display the student with the hightest score
        // and the student with the second-hightest score.
        System.out.println("     "+student1 + "'s score is " + highest +
                        "\n     "+ student2+"'s score is " + secondHigest);

//        Tran's score is 98.0
//        Anderson's score is 97.0
    }
}
