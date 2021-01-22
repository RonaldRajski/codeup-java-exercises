import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("\nThe value of pi is approximately %.2f.%n", pi);


//        1.Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        int answer;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        answer = scan.nextInt();
        System.out.printf("The number is %d", +answer);


////        What happens if you input something that is not an integer?
////        Throws an exception in main error
//
////        2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//
//        String string1, string2, string3;
////            Prompt
//
        System.out.println("Enter 3 words: ");

        String string1 = scan.next();
        String string2 = scan.next();
        String string3 = scan.next();
//
//        System.out.printf("\n The words are \"%s\", \"%s\" and \"%s\".\n", string1, string2, string3);
//
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
//
//
//
////
////                What happens if you enter less than 3 words?
////                    breaks the code throws it into a loop
////                What happens if you enter more than 3 words?
////                Does not recognize the 4th word.
//
////       3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        System.out.println();
        scan.nextLine();//        clears input
        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();
        System.out.println("Here is your sentence: ");
        System.out.println(sentence);

//        4

        System.out.println("Please enter the lenght of your classroom");
        double length = Double.parseDouble(scan.nextLine());
        System.out.println("Please enter the width of your classroom");
        double width = Double.parseDouble(scan.nextLine());

        System.out.printf("Area of classroom: %.1f ft^2%n", length * width);
        System.out.printf("Perimeter of classroom: %.1f ft%n", (2* length + 2 * width));



    }
}






