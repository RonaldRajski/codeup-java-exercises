package PearsonPractice.ProgramingAssignments.ProgrammingAssignment3;

import java.util.Random;
import java.util.Scanner;

public class LotteryRonaldRajski {


        public static void main(String[] args) {
            int lottery = (int)(Math.random()*1000);

//Prompt the user to enter a guess
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your lottery pick(three digits): ");
            int guess = input.nextInt();

//        get digits from lottery
            int lotteryDigit1 = lottery/10;
            int lotteryDigit2 = lottery / 100 % 10;
            int lotteryDigit3 = lottery %10;

//        get digits from guess
            int guessDigit1 = guess/10;
            int guessDigit2 = guess / 100 % 10;
            int guessDigit3 = guess % 10;

            System.out.println("The lottery number is " + lottery);

//        Check the guess
            if(guess == lottery)
                System.out.println("Exact match, you win $10,000");

            else if(guessDigit1 == lotteryDigit2
                    && guessDigit2 == lotteryDigit3
                    && guessDigit3 == lotteryDigit1
                    || guessDigit2 == lotteryDigit1
                    && guessDigit3 == lotteryDigit2
                    && guessDigit1 == lotteryDigit3)
                System.out.println("You matched two numbers, and won $3,000!");




            else if(guessDigit1 == lotteryDigit1
                    || guessDigit1 == lotteryDigit2
                    || guessDigit2 == lotteryDigit3

                    || guessDigit2 == lotteryDigit1
                    || guessDigit2 == lotteryDigit2
                    || guessDigit2 == lotteryDigit3

                    || guessDigit3 == lotteryDigit1
                    || guessDigit3 == lotteryDigit2
                    || guessDigit3 == lotteryDigit3)
                System.out.println("You matched one number and won $1000!");
            else
                System.out.println("Sorry no match");

        }
    }










