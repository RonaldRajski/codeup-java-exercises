import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.format("\nThe value of pi is approximately %f.\n", pi);

//        1.Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        int i = 0;
        while (i !=-1){
            System.out.print("Enter an integer: ");
            i = scanner.nextInt();
            System.out.println("\nThe number is " + i + ".\n");

        }

//        What happens if you input something that is not an integer?
//        Throws an exception in main error

//        2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        String string1, string2, string3;
//            Prompt

        System.out.println("Enter 3 words: ");

        string1 = scanner.next();
        string2 = scanner.next();
        string3 = scanner.next();

        System.out.printf("\n The words are \"%s\", \"%s\" and \"%s\".\n", string1, string2, string3);



//
//                What happens if you enter less than 3 words?
//                    breaks the code throws it into a loop
//                What happens if you enter more than 3 words?
//                Does not recognize the 4th word.





    }
}




//        Exploring the Scanner class

//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

//        What happens if you input something that is not an integer?


