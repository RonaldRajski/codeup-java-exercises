package PearsonPractice;

import java.util.Scanner;


public class SubtractionQuiz3_3 {
    public static void main(String[] args) {
//        Generate two random single digit numbers
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);

//        2 if number1 < number2, swap the numbers

        if(number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

//        3. Prompt the student to answer the question
        System.out.print("What is " + number1 + " - " +number2 + " ? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

//        4.Grade the answer

        if(number1 - number2 == answer) {
            System.out.println("You are correct");
        }else{
            System.out.println("Your answer is wrong");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
            }

        }

    }


