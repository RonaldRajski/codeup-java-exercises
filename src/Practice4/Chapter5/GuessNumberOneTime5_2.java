package Practice4.Chapter5;

import java.util.Scanner;

public class GuessNumberOneTime5_2 {
    public static void main(String[] args) {
//        Generate a randon number to be guessed
        int number =(int)(Math.random()*101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 100.");

//        Prompt the user to guess the number
        System.out.println("\nEnter your guess: ");
        int guess = input.nextInt();

        if(guess ==  number) {
            System.out.println("Yes, the number is " + number);
        }
        else if(guess > number){
            System.out.println("Your guess is to high.");
        }
        else {
            System.out.println("Your guess is to low");
        }


    }


}
