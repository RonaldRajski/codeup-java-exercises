package Practice4.Chapter2;

import java.util.Scanner;

public class ComputeChange2_10 {
    public static void main(String[] args) {



//    create a scanner

    Scanner input =  new Scanner(System.in);

//    receive the amount

        System.out.println("Enter an amount in double.");

        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

//        Find the number of one Dollars

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

//        Find number of quarters

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

//        find number of dimes

        int numberOfDimes = remainingAmount /10;
        remainingAmount = remainingAmount % 10;

//            find number of nickels remaining

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

//        find the number of pennies remaining

        int numberOfPennies = remainingAmount;

//        Display results

        System.out.println("Your amount " + amount + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");

        int x = 3264;

        int y = x % 10;
        x = x / 10;
        System.out.println("x is " + x + " and y is " + y);

        int n = 10000 * 10000 * 10000;
        System.out.println("n is " + n);

}

}
