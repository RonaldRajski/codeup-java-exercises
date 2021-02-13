package PearsonPractice.Chapter2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ComputeLoan2_9 {
    public static void main(String[] args) {
//        Create a scanner
        Scanner input =  new Scanner(System.in);

//        Enter Yearly interest rate
        System.out.println("Enter annual interest rate:");
        double annualInterestRate = input.nextDouble();

//        obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate/1200;

//        Enter number of years
        System.out.println("Enter number of years as an integer:  ");
        int numberOfYears = input.nextInt();

//        enter loan amount
        System.out.println("Enter loan amount: ");
        double loanAmount = input.nextDouble();

//        calculate payment
        double monthlyPayment = loanAmount *monthlyInterestRate/ (1- 1/Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment =  monthlyPayment + numberOfYears * 12;


        System.out.println("The monthly payment is $ " + (int)(monthlyPayment * 100)/100.0);

        System.out.println("The total payment is $ " + (int)(totalPayment * 100)/100.0);




    }


}
