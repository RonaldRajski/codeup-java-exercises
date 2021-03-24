package Practice4.Chapter5;

import java.util.Scanner;

public class RepeatingAdditionQuiz5_1 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);

//        Create a scanner
        Scanner input = new Scanner(System.in);

        System.out.println("What is " + number1 + " ? ");
        int answer = input.nextInt();


        while (number1 + number2 !=answer){
            System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();

        }



    }


}
