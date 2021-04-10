package Practice4.ProgramingAssignments.ProgrammingAssignment7;


//
//        Write a program that reads in 10 numbers ad displays the number of distinct numbers and the distinct numbers in their input order and separated by exactly one space (i.e., if a number appears multiple times, it is displayed only once).  (Hint:  Read a number and store it in an array if it is new.  If the number is already in the array, ignore it.)  After the input, the array contains the distinct numbers.
//        Your program’s output should look like the sample shown below.  Green text represents information entered by the user.  Black text is produced by the program.
//        Enter 10 numbers: 5 4 0 5 3 4 9 5 0 3
//        The number of distinct integers is 5
//        The distinct integers are 5 4 0 3 9

import java.util.Scanner;

public class DistinctNumbersRonaldRajski {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner (System.in);
        int [] inputList = new int [10];
        int [] distinctArray = new int [10];
        int num;
        int counter = 0;

        //input
        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < inputList.length; i++)
        {
            num = keyboard.nextInt();
            inputList[i] = num;
        }

        //processing
        for (int i = 0; i < inputList.length; i++)
        {
            boolean found = false;
            for (int j = 0; j < counter; j++)
            {
                if (inputList[i] == distinctArray[j])
                {
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                distinctArray[counter++] = inputList[i];
            }
        }
        //output
        System.out.println("The number of distinct numbers is " + counter);
        System.out.print("The distict integers are: ");
        for (int x=0; x<counter; x++)
        {
            System.out.print(distinctArray[x] + " ");
        }
    }
}