package Practice4.ProgramingAssignments.ProgrammingAssignment2;

import java.util.Scanner;

public class InvestmentValueRonaldRajski {

    //Ronald Rajski
//COSC 1336
//        Instructor: Dr. Doerschuk
//        Programming Assignment 2
//        Due:  2/17/2021

//    Write a program that reads in an investment amount, annual interest rate, and number of years and
//    displays the future investment value using the following formula:
//    futureInvestmentValue = investmentAmount x (1 + monthlyInterestRate)numberOfYears x 12
//    Your program’s output should look like the sample shown below. Green text represents information
//    entered by the user. Black text is produced by the program.
//    Enter the investment amount, for example 120000.95: 1200.00
//    Enter annual interest rate, for example 8.25: 5.00
//    Enter number of years as an integer, for example 5: 15
//    Future value is $2536.44

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Prompt the user to enter the investment amount,
//         annual interest rate and number of years.
        System.out.println("Enter the investment amount, for example 120000.95:  ");
        double amount = input.nextDouble();

        System.out.println("Enter annual interest rate, for example 8.25:");

        double monthlyInterestRate = input.nextDouble();

        monthlyInterestRate /=1200;

        System.out.println("Enter number of years as an integer, for example 5: ");
        int years = input.nextInt();

//        calculate investment value

        double futureInvestmentValue =  amount * Math.pow(1 + monthlyInterestRate, years * 12);

//        Display the result

  double one = futureInvestmentValue;

        System.out.println("Future Value is $ " + String.format("$%.2f", one).replace("$0.", "$."));

    }

}
