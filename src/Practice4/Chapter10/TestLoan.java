package Practice4.Chapter10;


import java.util.Scanner;

public class TestLoan {

    public static void main(String[] args) {
//        scanner
        Scanner input = new Scanner(System.in);

//        Enter yearly interest rate
        System.out.println("Enter annual interest rate, for example, 8.25");
        double annualInterestRate =  input.nextDouble();

//        Enter number of years
        System.out.println("Enter number of years as an interger: ");
        int numberOfYears =  input.nextInt();

//        Enter loan amount
        System.out.println("Enter loan amount, for example, 120000.95:" );
        double loanAmount = input.nextDouble();

//        Create Loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

//        display loan date, monthly payment and total payment
        System.out.printf("The loan was created on %s\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());





    }



}
