

//Write a method that computes future investment value at a given interest rate for a specified number of years using the following formula:
//        futureInvestmentValue = investmentAmount x (1 + monthlyInterestRate)numberOfYears x 12
//        Use the following method header:
//public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
//        For example, futureInvestmentValue(10000, 5/1200, 5) returns 12833.59.
//        Write a test program that prompts the user to enter the investment amount (e.g., 1,000) and interest rate (e.g., 4%) and prints a table that displays future value for the years from 1 to 20.
//        Your program’s output should look like the sample shown in the screenshot below.  Green text represents information entered by the user.  Black text is produced by the program.

//Investment amount: 1000
//Annual interest rate: 4
//    Years      Future Value
//        1           1040.74
//        2           1083.14
//        3           1127.27
//        4           1173.20
//        5           1221.00
//        6           1270.74
//        7           1322.51
//        8           1376.40
//        9           1432.47
//        10          1490.83
//        11          1551.57
//        12          1614.78
//        13          1680.57
//        14          1749.04
//        15          1820.30
//        16          1894.46
//        17          1971.65
//        18          2051.97
//        19          2135.58
//        20          2222.58

package Practice4.ProgramingAssignments.ProgrammingAssignment6;

import java.util.Scanner;
public class InvestmentValueMethodRonaldRajski {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double futureInvestment;
        final int MAX_YEARS = 20;

        System.out.print("Investment amount: ");
        double principal = input.nextDouble();

        System.out.print("Annual interest rate:");
        double annualInterest = input.nextDouble();
        double annualInterestRate = annualInterest * .01;

        double monthlyRate = annualInterestRate / 12.0;

        System.out.println("Years\tFuture Value");

        for (int i = 1; i <= MAX_YEARS; i++) {
            futureInvestment = futureInvestmentValue(principal, monthlyRate, i);
            System.out.printf("%d\t%.2f\n",
                    i, futureInvestment);
        }
    }


    public static double futureInvestmentValue(double principal, double monthlyRate, int years) {
        double futureInvestment = principal * Math.pow((1 + monthlyRate), (years * 12));

        return futureInvestment;
    }

}